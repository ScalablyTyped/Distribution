package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDExs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): scala.Unit
  def Clone(): IUserOrUserGroupIDExs
  def GetUserOrUserGroupIDEx(UserOrGroupID: scala.Double, UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType): IUserOrUserGroupIDEx
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: scala.Double, UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType): scala.Double
  def Item(Index: scala.Double): IUserOrUserGroupIDEx
  def Remove(Index: scala.Double): scala.Unit
}

object IUserOrUserGroupIDExs {
  @scala.inline
  def apply(
    Add: (scala.Double, IUserOrUserGroupIDEx) => scala.Unit,
    Clone: () => IUserOrUserGroupIDExs,
    Count: scala.Double,
    GetUserOrUserGroupIDEx: (scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType) => IUserOrUserGroupIDEx,
    GetUserOrUserGroupIDExIndex: (scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType) => scala.Double,
    Item: scala.Double => IUserOrUserGroupIDEx,
    Remove: scala.Double => scala.Unit
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, GetUserOrUserGroupIDEx = js.Any.fromFunction2(GetUserOrUserGroupIDEx), GetUserOrUserGroupIDExIndex = js.Any.fromFunction2(GetUserOrUserGroupIDExIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
}

