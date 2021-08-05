package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2StoredInfoType extends StObject {
  
  /** Current version of the stored info type. */
  var currentVersion: js.UndefOr[GooglePrivacyDlpV2StoredInfoTypeVersion] = js.undefined
  
  /** Resource name. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Pending versions of the stored info type. Empty if no versions are pending. */
  var pendingVersions: js.UndefOr[js.Array[GooglePrivacyDlpV2StoredInfoTypeVersion]] = js.undefined
}
object GooglePrivacyDlpV2StoredInfoType {
  
  inline def apply(): GooglePrivacyDlpV2StoredInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2StoredInfoType]
  }
  
  extension [Self <: GooglePrivacyDlpV2StoredInfoType](x: Self) {
    
    inline def setCurrentVersion(value: GooglePrivacyDlpV2StoredInfoTypeVersion): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPendingVersions(value: js.Array[GooglePrivacyDlpV2StoredInfoTypeVersion]): Self = StObject.set(x, "pendingVersions", value.asInstanceOf[js.Any])
    
    inline def setPendingVersionsUndefined: Self = StObject.set(x, "pendingVersions", js.undefined)
    
    inline def setPendingVersionsVarargs(value: GooglePrivacyDlpV2StoredInfoTypeVersion*): Self = StObject.set(x, "pendingVersions", js.Array(value :_*))
  }
}
