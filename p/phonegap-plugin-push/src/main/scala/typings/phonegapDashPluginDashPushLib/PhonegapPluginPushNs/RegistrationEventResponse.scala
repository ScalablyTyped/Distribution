package typings
package phonegapDashPluginDashPushLib.PhonegapPluginPushNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationEventResponse extends _EventResponse {
  /**
  		 * The registration ID provided by the 3rd party remote push service.
  		 */
  var registrationId: java.lang.String
}

object RegistrationEventResponse {
  @scala.inline
  def apply(registrationId: java.lang.String): RegistrationEventResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registrationId")(registrationId)
    __obj.asInstanceOf[RegistrationEventResponse]
  }
}

