package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccessControlListComponent extends js.Object {
  var AccessControlEntries: IAccessControlEntryContainer = js.native
  var CanDeactivate: Boolean = js.native
  val CurrentUserBinding: Double = js.native
  val HasCurrentUser: Boolean = js.native
  val HasCurrentUserBinding: Boolean = js.native
  val HasNamedACLLink: Boolean = js.native
  val HasPseudoUsers: Boolean = js.native
  var IsActive: Boolean = js.native
  val NamedACLLink: Double = js.native
  def Clone(): IAccessControlListComponent = js.native
  def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData = js.native
  def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey = js.native
  def ResetCurrentUserBinding(): Unit = js.native
  def ResetNamedACLLink(): Unit = js.native
}

object IAccessControlListComponent {
  @scala.inline
  def apply(
    AccessControlEntries: IAccessControlEntryContainer,
    CanDeactivate: Boolean,
    Clone: () => IAccessControlListComponent,
    CurrentUserBinding: Double,
    GetACEByUserOrGroupID: (Double, Boolean) => IAccessControlEntryData,
    GetACEKeyByUserOrGroupID: (Double, Boolean) => IAccessControlEntryKey,
    HasCurrentUser: Boolean,
    HasCurrentUserBinding: Boolean,
    HasNamedACLLink: Boolean,
    HasPseudoUsers: Boolean,
    IsActive: Boolean,
    NamedACLLink: Double,
    ResetCurrentUserBinding: () => Unit,
    ResetNamedACLLink: () => Unit
  ): IAccessControlListComponent = {
    val __obj = js.Dynamic.literal(AccessControlEntries = AccessControlEntries.asInstanceOf[js.Any], CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CurrentUserBinding = CurrentUserBinding.asInstanceOf[js.Any], GetACEByUserOrGroupID = js.Any.fromFunction2(GetACEByUserOrGroupID), GetACEKeyByUserOrGroupID = js.Any.fromFunction2(GetACEKeyByUserOrGroupID), HasCurrentUser = HasCurrentUser.asInstanceOf[js.Any], HasCurrentUserBinding = HasCurrentUserBinding.asInstanceOf[js.Any], HasNamedACLLink = HasNamedACLLink.asInstanceOf[js.Any], HasPseudoUsers = HasPseudoUsers.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], NamedACLLink = NamedACLLink.asInstanceOf[js.Any], ResetCurrentUserBinding = js.Any.fromFunction0(ResetCurrentUserBinding), ResetNamedACLLink = js.Any.fromFunction0(ResetNamedACLLink))
    __obj.asInstanceOf[IAccessControlListComponent]
  }
  @scala.inline
  implicit class IAccessControlListComponentOps[Self <: IAccessControlListComponent] (val x: Self) extends AnyVal {
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
    def setAccessControlEntries(value: IAccessControlEntryContainer): Self = this.set("AccessControlEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanDeactivate(value: Boolean): Self = this.set("CanDeactivate", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IAccessControlListComponent): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCurrentUserBinding(value: Double): Self = this.set("CurrentUserBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetACEByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryData): Self = this.set("GetACEByUserOrGroupID", js.Any.fromFunction2(value))
    @scala.inline
    def setGetACEKeyByUserOrGroupID(value: (Double, Boolean) => IAccessControlEntryKey): Self = this.set("GetACEKeyByUserOrGroupID", js.Any.fromFunction2(value))
    @scala.inline
    def setHasCurrentUser(value: Boolean): Self = this.set("HasCurrentUser", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasCurrentUserBinding(value: Boolean): Self = this.set("HasCurrentUserBinding", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasNamedACLLink(value: Boolean): Self = this.set("HasNamedACLLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasPseudoUsers(value: Boolean): Self = this.set("HasPseudoUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("IsActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamedACLLink(value: Double): Self = this.set("NamedACLLink", value.asInstanceOf[js.Any])
    @scala.inline
    def setResetCurrentUserBinding(value: () => Unit): Self = this.set("ResetCurrentUserBinding", js.Any.fromFunction0(value))
    @scala.inline
    def setResetNamedACLLink(value: () => Unit): Self = this.set("ResetNamedACLLink", js.Any.fromFunction0(value))
  }
  
}

