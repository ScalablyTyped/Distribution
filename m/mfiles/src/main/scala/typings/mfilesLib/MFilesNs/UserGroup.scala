package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.UserGroup")
@js.native
class UserGroup ()
  extends mfilesLib.IUserGroup {
  /* CompleteClass */
  override var ID: scala.Double = js.native
  /* CompleteClass */
  override var Members: mfilesLib.IIDs = js.native
  /* CompleteClass */
  override var Name: java.lang.String = js.native
  /* CompleteClass */
  override val Predefined: scala.Boolean = js.native
  /* CompleteClass */
  override def AddMember(ID: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IUserGroup = js.native
  /* CompleteClass */
  override def CloneFrom(UserGroup: mfilesLib.IUserGroup): scala.Unit = js.native
  /* CompleteClass */
  override def RemoveMember(ID: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.UserGroup")
@js.native
object UserGroup
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IUserGroup]

