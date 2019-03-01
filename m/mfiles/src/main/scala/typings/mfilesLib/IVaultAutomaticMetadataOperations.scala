package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultAutomaticMetadataOperations extends js.Object {
  def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult
  def GetAutomaticMetadataForTemporaryFile(UploadSessionID: scala.Double): IAutomaticMetadataResult
  def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult
}

object IVaultAutomaticMetadataOperations {
  @scala.inline
  def apply(
    GetAutomaticMetadataForObject: js.Function1[IObjVer, IAutomaticMetadataResult],
    GetAutomaticMetadataForTemporaryFile: js.Function1[scala.Double, IAutomaticMetadataResult],
    GetAutomaticMetadataForTemporaryFiles: js.Function1[IIDs, IAutomaticMetadataResult]
  ): IVaultAutomaticMetadataOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetAutomaticMetadataForObject")(GetAutomaticMetadataForObject)
    __obj.updateDynamic("GetAutomaticMetadataForTemporaryFile")(GetAutomaticMetadataForTemporaryFile)
    __obj.updateDynamic("GetAutomaticMetadataForTemporaryFiles")(GetAutomaticMetadataForTemporaryFiles)
    __obj.asInstanceOf[IVaultAutomaticMetadataOperations]
  }
}

