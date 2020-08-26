package typings.mfiles

import typings.mfiles.MFiles.MFFileDataStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultProperties extends js.Object {
  var DisplayName: String = js.native
  var EncryptionOfFileDataAtRest: Boolean = js.native
  var ExtendedMetadataDrivenPermissions: Boolean = js.native
  var FileDataConnectionString: String = js.native
  var FileDataStorageType: MFFileDataStorage = js.native
  var FullTextSearchLanguage: String = js.native
  var Icon: js.Array[Double] = js.native
  var MainDataFolder: String = js.native
  var SQLDatabase: ISQLDatabase = js.native
  var SeparateLocationForFileData: IAdditionalFolders = js.native
  var VaultGUID: String = js.native
  def Clone(): IVaultProperties = js.native
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisplayName = DisplayName.asInstanceOf[js.Any], EncryptionOfFileDataAtRest = EncryptionOfFileDataAtRest.asInstanceOf[js.Any], ExtendedMetadataDrivenPermissions = ExtendedMetadataDrivenPermissions.asInstanceOf[js.Any], FileDataConnectionString = FileDataConnectionString.asInstanceOf[js.Any], FileDataStorageType = FileDataStorageType.asInstanceOf[js.Any], FullTextSearchLanguage = FullTextSearchLanguage.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], MainDataFolder = MainDataFolder.asInstanceOf[js.Any], SQLDatabase = SQLDatabase.asInstanceOf[js.Any], SeparateLocationForFileData = SeparateLocationForFileData.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVaultProperties]
  }
  @scala.inline
  implicit class IVaultPropertiesOps[Self <: IVaultProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClone(value: () => IVaultProperties): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayName(value: String): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionOfFileDataAtRest(value: Boolean): Self = this.set("EncryptionOfFileDataAtRest", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendedMetadataDrivenPermissions(value: Boolean): Self = this.set("ExtendedMetadataDrivenPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileDataConnectionString(value: String): Self = this.set("FileDataConnectionString", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileDataStorageType(value: MFFileDataStorage): Self = this.set("FileDataStorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTextSearchLanguage(value: String): Self = this.set("FullTextSearchLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconVarargs(value: Double*): Self = this.set("Icon", js.Array(value :_*))
    @scala.inline
    def setIcon(value: js.Array[Double]): Self = this.set("Icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainDataFolder(value: String): Self = this.set("MainDataFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setSQLDatabase(value: ISQLDatabase): Self = this.set("SQLDatabase", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeparateLocationForFileData(value: IAdditionalFolders): Self = this.set("SeparateLocationForFileData", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultGUID(value: String): Self = this.set("VaultGUID", value.asInstanceOf[js.Any])
  }
  
}

