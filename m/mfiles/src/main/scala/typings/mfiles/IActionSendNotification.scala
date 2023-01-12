package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionSendNotification extends StObject {
  
  def Clone(): IActionSendNotification
  
  var Message: String
  
  var RecipientsEx: IUserOrUserGroupIDExs
  
  var Subject: String
}
object IActionSendNotification {
  
  inline def apply(
    Clone: () => IActionSendNotification,
    Message: String,
    RecipientsEx: IUserOrUserGroupIDExs,
    Subject: String
  ): IActionSendNotification = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Message = Message.asInstanceOf[js.Any], RecipientsEx = RecipientsEx.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSendNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IActionSendNotification] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IActionSendNotification): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setRecipientsEx(value: IUserOrUserGroupIDExs): Self = StObject.set(x, "RecipientsEx", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
  }
}
