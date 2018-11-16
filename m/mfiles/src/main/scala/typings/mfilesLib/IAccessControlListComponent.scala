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

