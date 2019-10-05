package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IKeyNamePairs
import typings.mfiles.ILoginAccount
import typings.mfiles.ILoginAccounts
import typings.mfiles.IUserAccount
import typings.mfiles.IUserAccounts
import typings.mfiles.IVaultUserOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultUserOperations")
@js.native
class VaultUserOperations () extends IVaultUserOperations {
  /* CompleteClass */
  override def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount = js.native
  /* CompleteClass */
  override def AddUserAccount(User: IUserAccount): IUserAccount = js.native
  /* CompleteClass */
  override def GetLoginAccountOfUser(UserID: Double): ILoginAccount = js.native
  /* CompleteClass */
  override def GetLoginAccounts(): ILoginAccounts = js.native
  /* CompleteClass */
  override def GetUserAccount(UserID: Double): IUserAccount = js.native
  /* CompleteClass */
  override def GetUserAccounts(): IUserAccounts = js.native
  /* CompleteClass */
  override def GetUserIDByGUID(UserGUID: String): Double = js.native
  /* CompleteClass */
  override def GetUserList(): IKeyNamePairs = js.native
  /* CompleteClass */
  override def ModifyUserAccount(User: IUserAccount): Unit = js.native
  /* CompleteClass */
  override def RemoveUserAccount(UserID: Double): Unit = js.native
}

@JSGlobal("MFiles.VaultUserOperations")
@js.native
object VaultUserOperations extends Instantiable0[IVaultUserOperations]

