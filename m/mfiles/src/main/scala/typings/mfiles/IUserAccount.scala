package typings.mfiles

import typings.mfiles.MFiles.MFUserAccountVaultRole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserAccount extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var Enabled: Boolean = js.native
  var ID: Double = js.native
  var InternalUser: Boolean = js.native
  var LoginName: String = js.native
  var VaultLanguage: Double = js.native
  var VaultRoles: MFUserAccountVaultRole = js.native
  def AddVaultRoles(VaultRolesToAdd: MFUserAccountVaultRole): Unit = js.native
  def Clone(): IUserAccount = js.native
  def CloneFrom(UserAccount: IUserAccount): Unit = js.native
  def RemoveVaultRoles(VaultRolesToRemove: MFUserAccountVaultRole): Unit = js.native
}

object IUserAccount {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    AddVaultRoles: MFUserAccountVaultRole => Unit,
    Clone: () => IUserAccount,
    CloneFrom: IUserAccount => Unit,
    Enabled: Boolean,
    ID: Double,
    InternalUser: Boolean,
    LoginName: String,
    RemoveVaultRoles: MFUserAccountVaultRole => Unit,
    VaultLanguage: Double,
    VaultRoles: MFUserAccountVaultRole
  ): IUserAccount = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], AddVaultRoles = js.Any.fromFunction1(AddVaultRoles), Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Enabled = Enabled.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], InternalUser = InternalUser.asInstanceOf[js.Any], LoginName = LoginName.asInstanceOf[js.Any], RemoveVaultRoles = js.Any.fromFunction1(RemoveVaultRoles), VaultLanguage = VaultLanguage.asInstanceOf[js.Any], VaultRoles = VaultRoles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserAccount]
  }
  @scala.inline
  implicit class IUserAccountOps[Self <: IUserAccount] (val x: Self) extends AnyVal {
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
    def setAccessControlList(value: IAccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddVaultRoles(value: MFUserAccountVaultRole => Unit): Self = this.set("AddVaultRoles", js.Any.fromFunction1(value))
    @scala.inline
    def setClone(value: () => IUserAccount): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: IUserAccount => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalUser(value: Boolean): Self = this.set("InternalUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoginName(value: String): Self = this.set("LoginName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveVaultRoles(value: MFUserAccountVaultRole => Unit): Self = this.set("RemoveVaultRoles", js.Any.fromFunction1(value))
    @scala.inline
    def setVaultLanguage(value: Double): Self = this.set("VaultLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultRoles(value: MFUserAccountVaultRole): Self = this.set("VaultRoles", value.asInstanceOf[js.Any])
  }
  
}

