package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultAutomaticMetadataOperations extends js.Object {
  def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult
  def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult
  def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult
}

object IVaultAutomaticMetadataOperations {
  @scala.inline
  def apply(
    GetAutomaticMetadataForObject: IObjVer => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFile: Double => IAutomaticMetadataResult,
    GetAutomaticMetadataForTemporaryFiles: IIDs => IAutomaticMetadataResult
  ): IVaultAutomaticMetadataOperations = {
    val __obj = js.Dynamic.literal(GetAutomaticMetadataForObject = js.Any.fromFunction1(GetAutomaticMetadataForObject), GetAutomaticMetadataForTemporaryFile = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFile), GetAutomaticMetadataForTemporaryFiles = js.Any.fromFunction1(GetAutomaticMetadataForTemporaryFiles))
  
    __obj.asInstanceOf[IVaultAutomaticMetadataOperations]
  }
}

