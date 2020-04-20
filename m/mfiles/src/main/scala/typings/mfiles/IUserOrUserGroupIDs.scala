package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDs extends js.Object {
  val Count: Double
  def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit
  def Clone(): IUserOrUserGroupIDs
  def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID
  def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  def Item(Index: Double): IUserOrUserGroupID
  def Remove(Index: Double): Unit
}

object IUserOrUserGroupIDs {
  @scala.inline
  def apply(
    Add: (Double, IUserOrUserGroupID) => Unit,
    Clone: () => IUserOrUserGroupIDs,
    Count: Double,
    GetUserOrUserGroupID: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID,
    GetUserOrUserGroupIDIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupID,
    Remove: Double => Unit
  ): IUserOrUserGroupIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupID = js.Any.fromFunction2(GetUserOrUserGroupID), GetUserOrUserGroupIDIndex = js.Any.fromFunction2(GetUserOrUserGroupIDIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IUserOrUserGroupIDs]
  }
}

