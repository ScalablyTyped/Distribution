package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultUserOperations extends js.Object {
  def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount
  def AddUserAccount(User: IUserAccount): IUserAccount
  def GetLoginAccountOfUser(UserID: Double): ILoginAccount
  def GetLoginAccounts(): ILoginAccounts
  def GetUserAccount(UserID: Double): IUserAccount
  def GetUserAccounts(): IUserAccounts
  def GetUserIDByGUID(UserGUID: String): Double
  def GetUserList(): IKeyNamePairs
  def ModifyUserAccount(User: IUserAccount): Unit
  def RemoveUserAccount(UserID: Double): Unit
}

object IVaultUserOperations {
  @scala.inline
  def apply(
    AddOrUndeleteUserAccount: IUserAccount => IUserAccount,
    AddUserAccount: IUserAccount => IUserAccount,
    GetLoginAccountOfUser: Double => ILoginAccount,
    GetLoginAccounts: () => ILoginAccounts,
    GetUserAccount: Double => IUserAccount,
    GetUserAccounts: () => IUserAccounts,
    GetUserIDByGUID: String => Double,
    GetUserList: () => IKeyNamePairs,
    ModifyUserAccount: IUserAccount => Unit,
    RemoveUserAccount: Double => Unit
  ): IVaultUserOperations = {
    val __obj = js.Dynamic.literal(AddOrUndeleteUserAccount = js.Any.fromFunction1(AddOrUndeleteUserAccount), AddUserAccount = js.Any.fromFunction1(AddUserAccount), GetLoginAccountOfUser = js.Any.fromFunction1(GetLoginAccountOfUser), GetLoginAccounts = js.Any.fromFunction0(GetLoginAccounts), GetUserAccount = js.Any.fromFunction1(GetUserAccount), GetUserAccounts = js.Any.fromFunction0(GetUserAccounts), GetUserIDByGUID = js.Any.fromFunction1(GetUserIDByGUID), GetUserList = js.Any.fromFunction0(GetUserList), ModifyUserAccount = js.Any.fromFunction1(ModifyUserAccount), RemoveUserAccount = js.Any.fromFunction1(RemoveUserAccount))
  
    __obj.asInstanceOf[IVaultUserOperations]
  }
}

