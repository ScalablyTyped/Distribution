package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultUserOperations extends js.Object {
  def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount = js.native
  def AddUserAccount(User: IUserAccount): IUserAccount = js.native
  def GetLoginAccountOfUser(UserID: Double): ILoginAccount = js.native
  def GetLoginAccounts(): ILoginAccounts = js.native
  def GetUserAccount(UserID: Double): IUserAccount = js.native
  def GetUserAccounts(): IUserAccounts = js.native
  def GetUserIDByGUID(UserGUID: String): Double = js.native
  def GetUserList(): IKeyNamePairs = js.native
  def ModifyUserAccount(User: IUserAccount): Unit = js.native
  def RemoveUserAccount(UserID: Double): Unit = js.native
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
  @scala.inline
  implicit class IVaultUserOperationsOps[Self <: IVaultUserOperations] (val x: Self) extends AnyVal {
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
    def setAddOrUndeleteUserAccount(value: IUserAccount => IUserAccount): Self = this.set("AddOrUndeleteUserAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setAddUserAccount(value: IUserAccount => IUserAccount): Self = this.set("AddUserAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLoginAccountOfUser(value: Double => ILoginAccount): Self = this.set("GetLoginAccountOfUser", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLoginAccounts(value: () => ILoginAccounts): Self = this.set("GetLoginAccounts", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserAccount(value: Double => IUserAccount): Self = this.set("GetUserAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setGetUserAccounts(value: () => IUserAccounts): Self = this.set("GetUserAccounts", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUserIDByGUID(value: String => Double): Self = this.set("GetUserIDByGUID", js.Any.fromFunction1(value))
    @scala.inline
    def setGetUserList(value: () => IKeyNamePairs): Self = this.set("GetUserList", js.Any.fromFunction0(value))
    @scala.inline
    def setModifyUserAccount(value: IUserAccount => Unit): Self = this.set("ModifyUserAccount", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveUserAccount(value: Double => Unit): Self = this.set("RemoveUserAccount", js.Any.fromFunction1(value))
  }
  
}

