package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponent extends js.Object {
  var AccessControlEntries: IAccessControlEntryContainer
  var CanDeactivate: Boolean
  val CurrentUserBinding: Double
  val HasCurrentUser: Boolean
  val HasCurrentUserBinding: Boolean
  val HasNamedACLLink: Boolean
  val HasPseudoUsers: Boolean
  var IsActive: Boolean
  val NamedACLLink: Double
  def Clone(): IAccessControlListComponent
  def GetACEByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryData
  def GetACEKeyByUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): IAccessControlEntryKey
  def ResetCurrentUserBinding(): Unit
  def ResetNamedACLLink(): Unit
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
    val __obj = js.Dynamic.literal(AccessControlEntries = AccessControlEntries, CanDeactivate = CanDeactivate, Clone = js.Any.fromFunction0(Clone), CurrentUserBinding = CurrentUserBinding, GetACEByUserOrGroupID = js.Any.fromFunction2(GetACEByUserOrGroupID), GetACEKeyByUserOrGroupID = js.Any.fromFunction2(GetACEKeyByUserOrGroupID), HasCurrentUser = HasCurrentUser, HasCurrentUserBinding = HasCurrentUserBinding, HasNamedACLLink = HasNamedACLLink, HasPseudoUsers = HasPseudoUsers, IsActive = IsActive, NamedACLLink = NamedACLLink, ResetCurrentUserBinding = js.Any.fromFunction0(ResetCurrentUserBinding), ResetNamedACLLink = js.Any.fromFunction0(ResetNamedACLLink))
  
    __obj.asInstanceOf[IAccessControlListComponent]
  }
}

