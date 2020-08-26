package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUserOrUserGroupIDs extends js.Object {
  val Count: Double = js.native
  def Add(Index: Double, UserOrUserGroupID: IUserOrUserGroupID): Unit = js.native
  def Clone(): IUserOrUserGroupIDs = js.native
  def GetUserOrUserGroupID(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = js.native
  def GetUserOrUserGroupIDIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  def Item(Index: Double): IUserOrUserGroupID = js.native
  def Remove(Index: Double): Unit = js.native
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
  @scala.inline
  implicit class IUserOrUserGroupIDsOps[Self <: IUserOrUserGroupIDs] (val x: Self) extends AnyVal {
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
    def setAdd(value: (Double, IUserOrUserGroupID) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    @scala.inline
    def setClone(value: () => IUserOrUserGroupIDs): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetUserOrUserGroupID(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupID): Self = this.set("GetUserOrUserGroupID", js.Any.fromFunction2(value))
    @scala.inline
    def setGetUserOrUserGroupIDIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = this.set("GetUserOrUserGroupIDIndex", js.Any.fromFunction2(value))
    @scala.inline
    def setItem(value: Double => IUserOrUserGroupID): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
  
}

