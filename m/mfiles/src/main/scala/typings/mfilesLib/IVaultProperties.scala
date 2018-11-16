package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IVaultProperties extends js.Object {
  var DisplayName: java.lang.String
  var EncryptionOfFileDataAtRest: scala.Boolean
  var ExtendedMetadataDrivenPermissions: scala.Boolean
  var FileDataConnectionString: java.lang.String
  var FileDataStorageType: mfilesLib.MFilesNs.MFFileDataStorage
  var FullTextSearchLanguage: java.lang.String
  var Icon: js.Array[scala.Double]
  var MainDataFolder: java.lang.String
  var SQLDatabase: ISQLDatabase
  var SeparateLocationForFileData: IAdditionalFolders
  var VaultGUID: java.lang.String
  def Clone(): IVaultProperties
}

