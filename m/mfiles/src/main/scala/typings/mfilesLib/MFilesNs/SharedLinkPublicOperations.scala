package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SharedLinkPublicOperations")
@js.native
class SharedLinkPublicOperations ()
  extends mfilesLib.ISharedLinkPublicOperations {
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_Begin(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: mfilesLib.INamedValues): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_Begin_32bit(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: mfilesLib.INamedValues): mfilesLib.IFileDownloadSession = js.native
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_ReadBlock(
    VaultGUID: java.lang.String,
    AccessKey: java.lang.String,
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double
  ): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def DownloadSharedFileInBlocks_ReadBlock_32bit(
    VaultGUID: java.lang.String,
    AccessKey: java.lang.String,
    DownloadID: scala.Double,
    BlockSize: scala.Double,
    Offset: scala.Double
  ): js.Array[scala.Double] = js.native
  /* CompleteClass */
  override def GetSharedLinkInfo(VaultGUID: java.lang.String, AccessKey: java.lang.String, AdditionalData: mfilesLib.INamedValues): mfilesLib.ISharedFileInfo = js.native
}

@JSGlobal("MFiles.SharedLinkPublicOperations")
@js.native
object SharedLinkPublicOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ISharedLinkPublicOperations]

