package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IActionSendNotification extends js.Object {
  
  def Clone(): IActionSendNotification = js.native
  
  var Message: String = js.native
  
  var RecipientsEx: IUserOrUserGroupIDExs = js.native
  
  var Subject: String = js.native
}
object IActionSendNotification {
  
  @scala.inline
  def apply(
    Clone: () => IActionSendNotification,
    Message: String,
    RecipientsEx: IUserOrUserGroupIDExs,
    Subject: String
  ): IActionSendNotification = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Message = Message.asInstanceOf[js.Any], RecipientsEx = RecipientsEx.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSendNotification]
  }
  
  @scala.inline
  implicit class IActionSendNotificationOps[Self <: IActionSendNotification] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IActionSendNotification): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsEx(value: IUserOrUserGroupIDExs): Self = this.set("RecipientsEx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("Subject", value.asInstanceOf[js.Any])
  }
}
