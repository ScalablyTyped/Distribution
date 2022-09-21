package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2VersionDescription extends StObject {
  
  /** Description of the version. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Name of the version */
  var version: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2VersionDescription {
  
  inline def apply(): GooglePrivacyDlpV2VersionDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2VersionDescription]
  }
  
  extension [Self <: GooglePrivacyDlpV2VersionDescription](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
