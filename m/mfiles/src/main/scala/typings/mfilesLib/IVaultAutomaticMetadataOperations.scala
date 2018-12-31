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

