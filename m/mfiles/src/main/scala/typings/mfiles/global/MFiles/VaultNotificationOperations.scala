package typings.mfiles.global.MFiles

import typings.mfiles.IStrings
import typings.mfiles.IUserOrUserGroupIDs
import typings.mfiles.IVaultNotificationOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultNotificationOperations")
@js.native
class VaultNotificationOperations ()
  extends StObject
     with IVaultNotificationOperations {
  
  /* CompleteClass */
  override def SendCustomNotification(
    UserOrUserGroupIDs: IUserOrUserGroupIDs,
    IncludeSubstituteUsers: Boolean,
    ExternalRecipients: IStrings,
    SendWithServerEmailIdentity: Boolean,
    Subject: String,
    Body: String
  ): Unit = js.native
}
