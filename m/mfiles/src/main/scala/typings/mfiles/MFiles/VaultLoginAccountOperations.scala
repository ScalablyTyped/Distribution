package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.ILoginAccount
import typings.mfiles.ILoginAccountPersonalInformation
import typings.mfiles.ILoginAccounts
import typings.mfiles.IStrings
import typings.mfiles.IVaultLoginAccountOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultLoginAccountOperations")
@js.native
class VaultLoginAccountOperations () extends IVaultLoginAccountOperations {
  /* CompleteClass */
  override def AddLoginAccount(LoginAccount: ILoginAccount, Password: String): Unit = js.native
  /* CompleteClass */
  override def ForceLogout(AccountNames: IStrings): Unit = js.native
  /* CompleteClass */
  override def GetLoginAccount(AccountName: String): ILoginAccount = js.native
  /* CompleteClass */
  override def GetLoginAccounts(): ILoginAccounts = js.native
  /* CompleteClass */
  override def GetLoginAccountsWithSessions(): ILoginAccounts = js.native
  /* CompleteClass */
  override def GetPersonalInformationFromDomain(AccountName: String): ILoginAccountPersonalInformation = js.native
  /* CompleteClass */
  override def ModifyLoginAccount(LoginAccount: ILoginAccount): Unit = js.native
  /* CompleteClass */
  override def RemoveLoginAccount(AccountName: String): Unit = js.native
  /* CompleteClass */
  override def UpdateLoginPassword(AccountName: String, NewPassword: String): Unit = js.native
}

@JSGlobal("MFiles.VaultLoginAccountOperations")
@js.native
object VaultLoginAccountOperations extends Instantiable0[IVaultLoginAccountOperations]

