package typings.mfiles.global.MFiles

import typings.mfiles.IUserOrUserGroupIDs
import typings.mfiles.IVaultUserSettingOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultUserSettingOperations")
@js.native
class VaultUserSettingOperations ()
  extends StObject
     with IVaultUserSettingOperations {
  
  /* CompleteClass */
  override def ChangeVaultLanguage(Language: Double): Unit = js.native
  
  /* CompleteClass */
  override def GetSubstituteUsers(): IUserOrUserGroupIDs = js.native
  
  /* CompleteClass */
  override def GetVaultLanguage(): Double = js.native
  
  /* CompleteClass */
  override def GetVaultLanguageCode(): String = js.native
  
  /* CompleteClass */
  override def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): Unit = js.native
}
