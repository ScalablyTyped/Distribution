package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, UserOrUserGroupID: IUserOrUserGroupID): scala.Unit
  def Clone(): IUserOrUserGroupIDs
  def GetUserOrUserGroupID(UserOrGroupID: scala.Double, UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType): IUserOrUserGroupID
  def GetUserOrUserGroupIDIndex(UserOrGroupID: scala.Double, UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType): scala.Double
  def Item(Index: scala.Double): IUserOrUserGroupID
  def Remove(Index: scala.Double): scala.Unit
}

object IUserOrUserGroupIDs {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IUserOrUserGroupID, scala.Unit],
    Clone: js.Function0[IUserOrUserGroupIDs],
    Count: scala.Double,
    GetUserOrUserGroupID: js.Function2[scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType, IUserOrUserGroupID],
    GetUserOrUserGroupIDIndex: js.Function2[scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType, scala.Double],
    Item: js.Function1[scala.Double, IUserOrUserGroupID],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): IUserOrUserGroupIDs = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, GetUserOrUserGroupID = GetUserOrUserGroupID, GetUserOrUserGroupIDIndex = GetUserOrUserGroupIDIndex, Item = Item, Remove = Remove)
  
    __obj.asInstanceOf[IUserOrUserGroupIDs]
  }
}

