package typings.mfiles

import typings.mfiles.MFiles.MFFileDataStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultProperties extends StObject {
  
  def Clone(): IVaultProperties = js.native
  
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
  implicit class IVaultPropertiesMutableBuilder[Self <: IVaultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IVaultProperties): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionOfFileDataAtRest(value: Boolean): Self = StObject.set(x, "EncryptionOfFileDataAtRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedMetadataDrivenPermissions(value: Boolean): Self = StObject.set(x, "ExtendedMetadataDrivenPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDataConnectionString(value: String): Self = StObject.set(x, "FileDataConnectionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileDataStorageType(value: MFFileDataStorage): Self = StObject.set(x, "FileDataStorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTextSearchLanguage(value: String): Self = StObject.set(x, "FullTextSearchLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: js.Array[Double]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconVarargs(value: Double*): Self = StObject.set(x, "Icon", js.Array(value :_*))
    
    @scala.inline
    def setMainDataFolder(value: String): Self = StObject.set(x, "MainDataFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSQLDatabase(value: ISQLDatabase): Self = StObject.set(x, "SQLDatabase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparateLocationForFileData(value: IAdditionalFolders): Self = StObject.set(x, "SeparateLocationForFileData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
  }
}
