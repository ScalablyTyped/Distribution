package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserOrUserGroupIDs")
@js.native
class UserOrUserGroupIDs ()
  extends mfilesLib.IUserOrUserGroupIDs {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, UserOrUserGroupID: mfilesLib.IUserOrUserGroupID): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override def GetUserOrUserGroupID(UserOrGroupID: scala.Double, UserOrGroupType: MFUserOrUserGroupType): mfilesLib.IUserOrUserGroupID = js.native
  /* CompleteClass */
  override def GetUserOrUserGroupIDIndex(UserOrGroupID: scala.Double, UserOrGroupType: MFUserOrUserGroupType): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IUserOrUserGroupID = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.UserOrUserGroupIDs")
@js.native
object UserOrUserGroupIDs
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IUserOrUserGroupIDs]

