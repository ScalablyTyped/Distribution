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

object IAccessControlEntryKey {
  @scala.inline
  def apply(
    Clone: () => IAccessControlEntryKey,
    GetResolvedPseudoUserOrGroupIDs: () => IUserOrUserGroupIDs,
    HasConcreteUserOrGroupID: scala.Boolean,
    IsGroup: scala.Boolean,
    IsPseudoUser: scala.Boolean,
    PseudoUserID: IIndirectPropertyID,
    ResetResolvedPseudoUserOrGroupIDs: () => scala.Unit,
    SetUserOrGroupID: (scala.Double, scala.Boolean) => scala.Unit,
    UserOrGroupID: scala.Double
  ): IAccessControlEntryKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(GetResolvedPseudoUserOrGroupIDs), HasConcreteUserOrGroupID = HasConcreteUserOrGroupID, IsGroup = IsGroup, IsPseudoUser = IsPseudoUser, PseudoUserID = PseudoUserID, ResetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(ResetResolvedPseudoUserOrGroupIDs), SetUserOrGroupID = js.Any.fromFunction2(SetUserOrGroupID), UserOrGroupID = UserOrGroupID)
  
    __obj.asInstanceOf[IAccessControlEntryKey]
  }
}

