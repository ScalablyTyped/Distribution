package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlEntryKey extends js.Object {
  val HasConcreteUserOrGroupID: Boolean
  val IsGroup: Boolean
  val IsPseudoUser: Boolean
  var PseudoUserID: IIndirectPropertyID
  val UserOrGroupID: Double
  def Clone(): IAccessControlEntryKey
  def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs
  def ResetResolvedPseudoUserOrGroupIDs(): Unit
  def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit
}

object IAccessControlEntryKey {
  @scala.inline
  def apply(
    Clone: () => IAccessControlEntryKey,
    GetResolvedPseudoUserOrGroupIDs: () => IUserOrUserGroupIDs,
    HasConcreteUserOrGroupID: Boolean,
    IsGroup: Boolean,
    IsPseudoUser: Boolean,
    PseudoUserID: IIndirectPropertyID,
    ResetResolvedPseudoUserOrGroupIDs: () => Unit,
    SetUserOrGroupID: (Double, Boolean) => Unit,
    UserOrGroupID: Double
  ): IAccessControlEntryKey = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), GetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(GetResolvedPseudoUserOrGroupIDs), HasConcreteUserOrGroupID = HasConcreteUserOrGroupID.asInstanceOf[js.Any], IsGroup = IsGroup.asInstanceOf[js.Any], IsPseudoUser = IsPseudoUser.asInstanceOf[js.Any], PseudoUserID = PseudoUserID.asInstanceOf[js.Any], ResetResolvedPseudoUserOrGroupIDs = js.Any.fromFunction0(ResetResolvedPseudoUserOrGroupIDs), SetUserOrGroupID = js.Any.fromFunction2(SetUserOrGroupID), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlEntryKey]
  }
}

