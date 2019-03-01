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

object IVaultProperties {
  @scala.inline
  def apply(
    Clone: js.Function0[IVaultProperties],
    DisplayName: java.lang.String,
    EncryptionOfFileDataAtRest: scala.Boolean,
    ExtendedMetadataDrivenPermissions: scala.Boolean,
    FileDataConnectionString: java.lang.String,
    FileDataStorageType: mfilesLib.MFilesNs.MFFileDataStorage,
    FullTextSearchLanguage: java.lang.String,
    Icon: js.Array[scala.Double],
    MainDataFolder: java.lang.String,
    SQLDatabase: ISQLDatabase,
    SeparateLocationForFileData: IAdditionalFolders,
    VaultGUID: java.lang.String
  ): IVaultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("EncryptionOfFileDataAtRest")(EncryptionOfFileDataAtRest)
    __obj.updateDynamic("ExtendedMetadataDrivenPermissions")(ExtendedMetadataDrivenPermissions)
    __obj.updateDynamic("FileDataConnectionString")(FileDataConnectionString)
    __obj.updateDynamic("FileDataStorageType")(FileDataStorageType)
    __obj.updateDynamic("FullTextSearchLanguage")(FullTextSearchLanguage)
    __obj.updateDynamic("Icon")(Icon)
    __obj.updateDynamic("MainDataFolder")(MainDataFolder)
    __obj.updateDynamic("SQLDatabase")(SQLDatabase)
    __obj.updateDynamic("SeparateLocationForFileData")(SeparateLocationForFileData)
    __obj.updateDynamic("VaultGUID")(VaultGUID)
    __obj.asInstanceOf[IVaultProperties]
  }
}

