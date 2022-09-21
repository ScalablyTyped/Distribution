package typings.mfiles

import typings.mfiles.MFiles.MFFileDataStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultProperties extends StObject {
  
  def Clone(): IVaultProperties
  
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
}
object IVaultProperties {
  
  inline def apply(
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
  
  extension [Self <: IVaultProperties](x: Self) {
    
    inline def setClone(value: () => IVaultProperties): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setEncryptionOfFileDataAtRest(value: Boolean): Self = StObject.set(x, "EncryptionOfFileDataAtRest", value.asInstanceOf[js.Any])
    
    inline def setExtendedMetadataDrivenPermissions(value: Boolean): Self = StObject.set(x, "ExtendedMetadataDrivenPermissions", value.asInstanceOf[js.Any])
    
    inline def setFileDataConnectionString(value: String): Self = StObject.set(x, "FileDataConnectionString", value.asInstanceOf[js.Any])
    
    inline def setFileDataStorageType(value: MFFileDataStorage): Self = StObject.set(x, "FileDataStorageType", value.asInstanceOf[js.Any])
    
    inline def setFullTextSearchLanguage(value: String): Self = StObject.set(x, "FullTextSearchLanguage", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: js.Array[Double]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconVarargs(value: Double*): Self = StObject.set(x, "Icon", js.Array(value*))
    
    inline def setMainDataFolder(value: String): Self = StObject.set(x, "MainDataFolder", value.asInstanceOf[js.Any])
    
    inline def setSQLDatabase(value: ISQLDatabase): Self = StObject.set(x, "SQLDatabase", value.asInstanceOf[js.Any])
    
    inline def setSeparateLocationForFileData(value: IAdditionalFolders): Self = StObject.set(x, "SeparateLocationForFileData", value.asInstanceOf[js.Any])
    
    inline def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
  }
}
