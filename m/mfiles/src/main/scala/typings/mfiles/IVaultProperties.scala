package typings.mfiles

import typings.mfiles.MFiles.MFFileDataStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultProperties extends js.Object {
  var DisplayName: String
  var EncryptionOfFileDataAtRest: Boolean
  var ExtendedMetadataDrivenPermissions: Boolean
  var FileDataConnectionString: String
  var FileDataStorageType: MFFileDataStorage
  var FullTextSearchLanguage: String
  var Icon: js.Array[Double]
  var MainDataFolder: String
  var SQLDatabase: ISQLDatabase
  var SeparateLocationForFileData: IAdditionalFolders
  var VaultGUID: String
  def Clone(): IVaultProperties
}

object IVaultProperties {
  @scala.inline
  def apply(
    Clone: () => IVaultProperties,
    DisplayName: String,
    EncryptionOfFileDataAtRest: Boolean,
    ExtendedMetadataDrivenPermissions: Boolean,
    FileDataConnectionString: String,
    FileDataStorageType: MFFileDataStorage,
    FullTextSearchLanguage: String,
    Icon: js.Array[Double],
    MainDataFolder: String,
    SQLDatabase: ISQLDatabase,
    SeparateLocationForFileData: IAdditionalFolders,
    VaultGUID: String
  ): IVaultProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisplayName = DisplayName, EncryptionOfFileDataAtRest = EncryptionOfFileDataAtRest, ExtendedMetadataDrivenPermissions = ExtendedMetadataDrivenPermissions, FileDataConnectionString = FileDataConnectionString, FileDataStorageType = FileDataStorageType, FullTextSearchLanguage = FullTextSearchLanguage, Icon = Icon, MainDataFolder = MainDataFolder, SQLDatabase = SQLDatabase, SeparateLocationForFileData = SeparateLocationForFileData, VaultGUID = VaultGUID)
  
    __obj.asInstanceOf[IVaultProperties]
  }
}

