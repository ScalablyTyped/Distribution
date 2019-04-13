package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlEntryKey")
@js.native
class AccessControlEntryKey ()
  extends mfilesLib.IAccessControlEntryKey {
  /* CompleteClass */
  override val HasConcreteUserOrGroupID: scala.Boolean = js.native
  /* CompleteClass */
  override val IsGroup: scala.Boolean = js.native
  /* CompleteClass */
  override val IsPseudoUser: scala.Boolean = js.native
  /* CompleteClass */
  override var PseudoUserID: mfilesLib.IIndirectPropertyID = js.native
  /* CompleteClass */
  override val UserOrGroupID: scala.Double = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAccessControlEntryKey = js.native
  /* CompleteClass */
  override def GetResolvedPseudoUserOrGroupIDs(): mfilesLib.IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override def ResetResolvedPseudoUserOrGroupIDs(): scala.Unit = js.native
  /* CompleteClass */
  override def SetUserOrGroupID(UserOrGroupID: scala.Double, IsGroup: scala.Boolean): scala.Unit = js.native
}

@JSGlobal("MFiles.AccessControlEntryKey")
@js.native
object AccessControlEntryKey
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IAccessControlEntryKey]

