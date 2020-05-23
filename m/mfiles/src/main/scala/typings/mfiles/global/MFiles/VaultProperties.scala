package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAdditionalFolders
import typings.mfiles.ISQLDatabase
import typings.mfiles.IVaultProperties
import typings.mfiles.MFiles.MFFileDataStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultProperties")
@js.native
class VaultProperties () extends IVaultProperties {
  /* CompleteClass */
  override var DisplayName: String = js.native
  /* CompleteClass */
  override var EncryptionOfFileDataAtRest: Boolean = js.native
  /* CompleteClass */
  override var ExtendedMetadataDrivenPermissions: Boolean = js.native
  /* CompleteClass */
  override var FileDataConnectionString: String = js.native
  /* CompleteClass */
  override var FileDataStorageType: MFFileDataStorage = js.native
  /* CompleteClass */
  override var FullTextSearchLanguage: String = js.native
  /* CompleteClass */
  override var Icon: js.Array[Double] = js.native
  /* CompleteClass */
  override var MainDataFolder: String = js.native
  /* CompleteClass */
  override var SQLDatabase: ISQLDatabase = js.native
  /* CompleteClass */
  override var SeparateLocationForFileData: IAdditionalFolders = js.native
  /* CompleteClass */
  override var VaultGUID: String = js.native
  /* CompleteClass */
  override def Clone(): IVaultProperties = js.native
}

@JSGlobal("MFiles.VaultProperties")
@js.native
object VaultProperties extends Instantiable0[IVaultProperties]

