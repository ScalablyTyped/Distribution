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

