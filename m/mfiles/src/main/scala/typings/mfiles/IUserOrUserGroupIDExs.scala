package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDExs extends js.Object {
  val Count: Double
  def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit
  def Clone(): IUserOrUserGroupIDExs
  def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double
  def Item(Index: Double): IUserOrUserGroupIDEx
  def Remove(Index: Double): Unit
}

object IUserOrUserGroupIDExs {
  @scala.inline
  def apply(
    Add: (Double, IUserOrUserGroupIDEx) => Unit,
    Clone: () => IUserOrUserGroupIDExs,
    Count: Double,
    GetUserOrUserGroupIDEx: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx,
    GetUserOrUserGroupIDExIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupIDEx,
    Remove: Double => Unit
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupIDEx = js.Any.fromFunction2(GetUserOrUserGroupIDEx), GetUserOrUserGroupIDExIndex = js.Any.fromFunction2(GetUserOrUserGroupIDExIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
}

