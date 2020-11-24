package typings.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegistrationEventResponse extends _EventResponse {
  
  /**
  		 * The registration ID provided by the 3rd party remote push service.
  		 */
  var registrationId: String = js.native
}
object RegistrationEventResponse {
  
  @scala.inline
  def apply(registrationId: String): RegistrationEventResponse = {
    val __obj = js.Dynamic.literal(registrationId = registrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistrationEventResponse]
  }
  
  @scala.inline
  implicit class RegistrationEventResponseOps[Self <: RegistrationEventResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRegistrationId(value: String): Self = this.set("registrationId", value.asInstanceOf[js.Any])
  }
}
