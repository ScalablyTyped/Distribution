package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
class VaultAutomaticMetadataOperations ()
  extends mfilesLib.IVaultAutomaticMetadataOperations {
  /* CompleteClass */
  override def GetAutomaticMetadataForObject(ObjVer: mfilesLib.IObjVer): mfilesLib.IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFile(UploadSessionID: scala.Double): mfilesLib.IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFiles(IIDs: mfilesLib.IIDs): mfilesLib.IAutomaticMetadataResult = js.native
}

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
object VaultAutomaticMetadataOperations
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultAutomaticMetadataOperations]

