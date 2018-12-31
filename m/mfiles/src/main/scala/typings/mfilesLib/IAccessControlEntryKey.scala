package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryKey extends js.Object {
  val HasConcreteUserOrGroupID: scala.Boolean
  val IsGroup: scala.Boolean
  val IsPseudoUser: scala.Boolean
  var PseudoUserID: IIndirectPropertyID
  val UserOrGroupID: scala.Double
  def Clone(): IAccessControlEntryKey
  def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs
  def ResetResolvedPseudoUserOrGroupIDs(): scala.Unit
  def SetUserOrGroupID(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): scala.Unit
}

