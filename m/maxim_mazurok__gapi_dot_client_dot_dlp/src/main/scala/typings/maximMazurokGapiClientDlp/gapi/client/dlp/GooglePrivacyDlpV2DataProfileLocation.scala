package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2DataProfileLocation extends StObject {
  
  /** The ID of the Folder within an organization to scan. */
  var folderId: js.UndefOr[String] = js.undefined
  
  /** The ID of an organization to scan. */
  var organizationId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2DataProfileLocation {
  
  inline def apply(): GooglePrivacyDlpV2DataProfileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2DataProfileLocation]
  }
  
  extension [Self <: GooglePrivacyDlpV2DataProfileLocation](x: Self) {
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "organizationId", js.undefined)
  }
}
