package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponent extends js.Object {
  var AccessControlEntries: IAccessControlEntryContainer
  var CanDeactivate: scala.Boolean
  val CurrentUserBinding: scala.Double
  val HasCurrentUser: scala.Boolean
  val HasCurrentUserBinding: scala.Boolean
  val HasNamedACLLink: scala.Boolean
  val HasPseudoUsers: scala.Boolean
  var IsActive: scala.Boolean
  val NamedACLLink: scala.Double
  def Clone(): IAccessControlListComponent
  def GetACEByUserOrGroupID(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): IAccessControlEntryData
  def GetACEKeyByUserOrGroupID(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): IAccessControlEntryKey
  def ResetCurrentUserBinding(): scala.Unit
  def ResetNamedACLLink(): scala.Unit
}

object IAccessControlListComponent {
  @scala.inline
  def apply(
    AccessControlEntries: IAccessControlEntryContainer,
    CanDeactivate: scala.Boolean,
    Clone: () => IAccessControlListComponent,
    CurrentUserBinding: scala.Double,
    GetACEByUserOrGroupID: (scala.Double, scala.Boolean) => IAccessControlEntryData,
    GetACEKeyByUserOrGroupID: (scala.Double, scala.Boolean) => IAccessControlEntryKey,
    HasCurrentUser: scala.Boolean,
    HasCurrentUserBinding: scala.Boolean,
    HasNamedACLLink: scala.Boolean,
    HasPseudoUsers: scala.Boolean,
    IsActive: scala.Boolean,
    NamedACLLink: scala.Double,
    ResetCurrentUserBinding: () => scala.Unit,
    ResetNamedACLLink: () => scala.Unit
  ): IAccessControlListComponent = {
    val __obj = js.Dynamic.literal(AccessControlEntries = AccessControlEntries, CanDeactivate = CanDeactivate, Clone = js.Any.fromFunction0(Clone), CurrentUserBinding = CurrentUserBinding, GetACEByUserOrGroupID = js.Any.fromFunction2(GetACEByUserOrGroupID), GetACEKeyByUserOrGroupID = js.Any.fromFunction2(GetACEKeyByUserOrGroupID), HasCurrentUser = HasCurrentUser, HasCurrentUserBinding = HasCurrentUserBinding, HasNamedACLLink = HasNamedACLLink, HasPseudoUsers = HasPseudoUsers, IsActive = IsActive, NamedACLLink = NamedACLLink, ResetCurrentUserBinding = js.Any.fromFunction0(ResetCurrentUserBinding), ResetNamedACLLink = js.Any.fromFunction0(ResetNamedACLLink))
  
    __obj.asInstanceOf[IAccessControlListComponent]
  }
}

