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
    Add: js.Function2[scala.Double, IUserOrUserGroupIDEx, scala.Unit],
    Clone: js.Function0[IUserOrUserGroupIDExs],
    Count: scala.Double,
    GetUserOrUserGroupIDEx: js.Function2[scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType, IUserOrUserGroupIDEx],
    GetUserOrUserGroupIDExIndex: js.Function2[scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType, scala.Double],
    Item: js.Function1[scala.Double, IUserOrUserGroupIDEx],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetUserOrUserGroupIDEx")(GetUserOrUserGroupIDEx)
    __obj.updateDynamic("GetUserOrUserGroupIDExIndex")(GetUserOrUserGroupIDExIndex)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
}

