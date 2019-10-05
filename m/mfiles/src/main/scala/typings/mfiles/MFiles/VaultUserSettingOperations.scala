package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IUserOrUserGroupIDs
import typings.mfiles.IVaultUserSettingOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultUserSettingOperations")
@js.native
class VaultUserSettingOperations () extends IVaultUserSettingOperations {
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

@JSGlobal("MFiles.VaultUserSettingOperations")
@js.native
object VaultUserSettingOperations extends Instantiable0[IVaultUserSettingOperations]

