package typings.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAutomaticMetadataResult
import typings.mfiles.IIDs
import typings.mfiles.IObjVer
import typings.mfiles.IVaultAutomaticMetadataOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
class VaultAutomaticMetadataOperations () extends IVaultAutomaticMetadataOperations {
  /* CompleteClass */
  override def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult = js.native
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult = js.native
}

@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
object VaultAutomaticMetadataOperations extends Instantiable0[IVaultAutomaticMetadataOperations]

