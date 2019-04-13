package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultProperties")
@js.native
class VaultProperties ()
  extends mfilesLib.IVaultProperties {
  /* CompleteClass */
  override var DisplayName: java.lang.String = js.native
  /* CompleteClass */
  override var EncryptionOfFileDataAtRest: scala.Boolean = js.native
  /* CompleteClass */
  override var ExtendedMetadataDrivenPermissions: scala.Boolean = js.native
  /* CompleteClass */
  override var FileDataConnectionString: java.lang.String = js.native
  /* CompleteClass */
  override var FileDataStorageType: MFFileDataStorage = js.native
  /* CompleteClass */
  override var FullTextSearchLanguage: java.lang.String = js.native
  /* CompleteClass */
  override var Icon: js.Array[scala.Double] = js.native
  /* CompleteClass */
  override var MainDataFolder: java.lang.String = js.native
  /* CompleteClass */
  override var SQLDatabase: mfilesLib.ISQLDatabase = js.native
  /* CompleteClass */
  override var SeparateLocationForFileData: mfilesLib.IAdditionalFolders = js.native
  /* CompleteClass */
  override var VaultGUID: java.lang.String = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IVaultProperties = js.native
}

@JSGlobal("MFiles.VaultProperties")
@js.native
object VaultProperties
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IVaultProperties]

