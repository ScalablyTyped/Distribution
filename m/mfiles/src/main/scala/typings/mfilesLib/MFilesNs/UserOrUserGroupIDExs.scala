package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserOrUserGroupIDExs")
@js.native
class UserOrUserGroupIDExs ()
  extends mfilesLib.IUserOrUserGroupIDExs {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, UserOrUserGroupIDEx: mfilesLib.IUserOrUserGroupIDEx): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IUserOrUserGroupIDExs = js.native
  /* CompleteClass */
  override def GetUserOrUserGroupIDEx(UserOrGroupID: scala.Double, UserOrGroupType: MFUserOrUserGroupType): mfilesLib.IUserOrUserGroupIDEx = js.native
  /* CompleteClass */
  override def GetUserOrUserGroupIDExIndex(UserOrGroupID: scala.Double, UserOrGroupType: MFUserOrUserGroupType): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IUserOrUserGroupIDEx = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.UserOrUserGroupIDExs")
@js.native
object UserOrUserGroupIDExs
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IUserOrUserGroupIDExs]

