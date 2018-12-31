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

