package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ServerLoginAccountOperations")
@js.native
class ServerLoginAccountOperations ()
  extends mfilesLib.IServerLoginAccountOperations {
  /* CompleteClass */
  override def AddLoginAccount(LoginAccount: mfilesLib.ILoginAccount, Password: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def ForceLogout(AccountNames: mfilesLib.IStrings): scala.Unit = js.native
  /* CompleteClass */
  override def GetLoginAccount(AccountName: java.lang.String): mfilesLib.ILoginAccount = js.native
  /* CompleteClass */
  override def GetLoginAccounts(): mfilesLib.ILoginAccounts = js.native
  /* CompleteClass */
  override def GetLoginAccountsWithSessions(): mfilesLib.ILoginAccounts = js.native
  /* CompleteClass */
  override def GetPersonalInformationFromDomain(AccountName: java.lang.String): mfilesLib.ILoginAccountPersonalInformation = js.native
  /* CompleteClass */
  override def ModifyLoginAccount(LoginAccount: mfilesLib.ILoginAccount): scala.Unit = js.native
  /* CompleteClass */
  override def RemoveLoginAccount(AccountName: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def UpdateLoginPassword(AccountName: java.lang.String, NewPassword: java.lang.String): scala.Unit = js.native
}

