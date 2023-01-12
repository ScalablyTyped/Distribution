package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowNotificationParameters extends StObject {
  
  var message: String
  
  var notificationType: NotificationTypes
}
object ShowNotificationParameters {
  
  inline def apply(message: String, notificationType: NotificationTypes): ShowNotificationParameters = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], notificationType = notificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowNotificationParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowNotificationParameters] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNotificationType(value: NotificationTypes): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
  }
}
