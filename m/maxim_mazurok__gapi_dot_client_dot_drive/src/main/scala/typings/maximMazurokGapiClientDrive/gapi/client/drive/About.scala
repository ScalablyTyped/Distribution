package typings.maximMazurokGapiClientDrive.gapi.client.drive

import typings.maximMazurokGapiClientDrive.anon.BackgroundImageLink
import typings.maximMazurokGapiClientDrive.anon.Limit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait About extends StObject {
  
  /** Whether the user has installed the requesting app. */
  var appInstalled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the user can create shared drives. */
  var canCreateDrives: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated - use canCreateDrives instead. */
  var canCreateTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /** A list of themes that are supported for shared drives. */
  var driveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.undefined
  
  /** A map of source MIME type to possible targets for all supported exports. */
  var exportFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: std.Array<string>} */ js.Any
  ] = js.undefined
  
  /** The currently supported folder colors as RGB hex strings. */
  var folderColorPalette: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A map of source MIME type to possible targets for all supported imports. */
  var importFormats: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: std.Array<string>} */ js.Any
  ] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "drive#about". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** A map of maximum import sizes by MIME type, in bytes. */
  var maxImportSizes: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The maximum upload size in bytes. */
  var maxUploadSize: js.UndefOr[String] = js.undefined
  
  /** The user's storage quota limits and usage. All fields are measured in bytes. */
  var storageQuota: js.UndefOr[Limit] = js.undefined
  
  /** Deprecated - use driveThemes instead. */
  var teamDriveThemes: js.UndefOr[js.Array[BackgroundImageLink]] = js.undefined
  
  /** The authenticated user. */
  var user: js.UndefOr[User] = js.undefined
}
object About {
  
  inline def apply(): About = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[About]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: About] (val x: Self) extends AnyVal {
    
    inline def setAppInstalled(value: Boolean): Self = StObject.set(x, "appInstalled", value.asInstanceOf[js.Any])
    
    inline def setAppInstalledUndefined: Self = StObject.set(x, "appInstalled", js.undefined)
    
    inline def setCanCreateDrives(value: Boolean): Self = StObject.set(x, "canCreateDrives", value.asInstanceOf[js.Any])
    
    inline def setCanCreateDrivesUndefined: Self = StObject.set(x, "canCreateDrives", js.undefined)
    
    inline def setCanCreateTeamDrives(value: Boolean): Self = StObject.set(x, "canCreateTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setCanCreateTeamDrivesUndefined: Self = StObject.set(x, "canCreateTeamDrives", js.undefined)
    
    inline def setDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "driveThemes", value.asInstanceOf[js.Any])
    
    inline def setDriveThemesUndefined: Self = StObject.set(x, "driveThemes", js.undefined)
    
    inline def setDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "driveThemes", js.Array(value*))
    
    inline def setExportFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: std.Array<string>} */ js.Any
    ): Self = StObject.set(x, "exportFormats", value.asInstanceOf[js.Any])
    
    inline def setExportFormatsUndefined: Self = StObject.set(x, "exportFormats", js.undefined)
    
    inline def setFolderColorPalette(value: js.Array[String]): Self = StObject.set(x, "folderColorPalette", value.asInstanceOf[js.Any])
    
    inline def setFolderColorPaletteUndefined: Self = StObject.set(x, "folderColorPalette", js.undefined)
    
    inline def setFolderColorPaletteVarargs(value: String*): Self = StObject.set(x, "folderColorPalette", js.Array(value*))
    
    inline def setImportFormats(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: std.Array<string>} */ js.Any
    ): Self = StObject.set(x, "importFormats", value.asInstanceOf[js.Any])
    
    inline def setImportFormatsUndefined: Self = StObject.set(x, "importFormats", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaxImportSizes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "maxImportSizes", value.asInstanceOf[js.Any])
    
    inline def setMaxImportSizesUndefined: Self = StObject.set(x, "maxImportSizes", js.undefined)
    
    inline def setMaxUploadSize(value: String): Self = StObject.set(x, "maxUploadSize", value.asInstanceOf[js.Any])
    
    inline def setMaxUploadSizeUndefined: Self = StObject.set(x, "maxUploadSize", js.undefined)
    
    inline def setStorageQuota(value: Limit): Self = StObject.set(x, "storageQuota", value.asInstanceOf[js.Any])
    
    inline def setStorageQuotaUndefined: Self = StObject.set(x, "storageQuota", js.undefined)
    
    inline def setTeamDriveThemes(value: js.Array[BackgroundImageLink]): Self = StObject.set(x, "teamDriveThemes", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveThemesUndefined: Self = StObject.set(x, "teamDriveThemes", js.undefined)
    
    inline def setTeamDriveThemesVarargs(value: BackgroundImageLink*): Self = StObject.set(x, "teamDriveThemes", js.Array(value*))
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
