package typings.phonegapPluginPush.PhonegapPluginPush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _EventResponse extends js.Object
object _EventResponse {
  
  @scala.inline
  def RegistrationEventResponse(registrationId: String): _EventResponse = {
    val __obj = js.Dynamic.literal(registrationId = registrationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EventResponse]
  }
  
  @scala.inline
  def NotificationEventResponse(
    additionalData: NotificationEventAdditionalData,
    count: String,
    image: String,
    message: String,
    sound: String
  ): _EventResponse = {
    val __obj = js.Dynamic.literal(additionalData = additionalData.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sound = sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EventResponse]
  }
}
