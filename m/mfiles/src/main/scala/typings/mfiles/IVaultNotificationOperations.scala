package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultNotificationOperations extends StObject {
  
  def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit
}
object IVaultNotificationOperations {
  
  inline def apply(SendCustomNotification: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Unit): IVaultNotificationOperations = {
    val __obj = js.Dynamic.literal(SendCustomNotification = js.Any.fromFunction6(SendCustomNotification))
    __obj.asInstanceOf[IVaultNotificationOperations]
  }
  
  extension [Self <: IVaultNotificationOperations](x: Self) {
    
    inline def setSendCustomNotification(value: (IUserOrUserGroupIDs, Boolean, IStrings, Boolean, String, String) => Unit): Self = StObject.set(x, "SendCustomNotification", js.Any.fromFunction6(value))
  }
}
