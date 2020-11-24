package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultNotificationOperations extends js.Object {
  
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit = js.native
}
object IVaultNotificationOperations {
  
  @scala.inline
  def apply(SendCustomNotification: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Unit): IVaultNotificationOperations = {
    val __obj = js.Dynamic.literal(SendCustomNotification = js.Any.fromFunction6(SendCustomNotification))
    __obj.asInstanceOf[IVaultNotificationOperations]
  }
  
  @scala.inline
  implicit class IVaultNotificationOperationsOps[Self <: IVaultNotificationOperations] (val x: Self) extends AnyVal {
    
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
    def setSendCustomNotification(value: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Unit): Self = this.set("SendCustomNotification", js.Any.fromFunction6(value))
  }
}
