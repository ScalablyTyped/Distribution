package typings.phonegapDashPluginDashPush.PhonegapPluginPushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationEventResponse extends _EventResponse {
  /**
  		 * The registration ID provided by the 3rd party remote push service.
  		 */
  var registrationId: String
}

object RegistrationEventResponse {
  @scala.inline
  def apply(registrationId: String): RegistrationEventResponse = {
    val __obj = js.Dynamic.literal(registrationId = registrationId)
  
    __obj.asInstanceOf[RegistrationEventResponse]
  }
}

