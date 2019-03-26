package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultSharedLinkOperations")
@js.native
class VaultSharedLinkOperations ()
  extends mfilesLib.IVaultSharedLinkOperations {
  /* CompleteClass */
  override def CreateSharedLink(SharedLinkCreationInfo: mfilesLib.ISharedLinkInfo): mfilesLib.ISharedLinkInfo = js.native
  /* CompleteClass */
  override def DeleteSharedLink(AccessKey: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def GetSharedLink(AccessKey: java.lang.String): mfilesLib.ISharedLinkInfo = js.native
  /* CompleteClass */
  override def GetSharedLinks(CreatedByUser: scala.Double): mfilesLib.ISharedLinkInfos = js.native
  /* CompleteClass */
  override def GetSharedLinksByObject(ObjID: mfilesLib.IObjID): mfilesLib.ISharedLinkInfos = js.native
}

