package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2ImageRedactionConfig extends StObject {
  
  /**
    * Only one per info_type should be provided per request. If not specified, and redact_all_text is false, the DLP API will redact all text that it matches against all info_types that
    * are found, but not specified in another ImageRedactionConfig.
    */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.undefined
  
  /** If true, all text found in the image, regardless whether it matches an info_type, is redacted. Only one should be provided. */
  var redactAllText: js.UndefOr[Boolean] = js.undefined
  
  /** The color to use when redacting content from an image. If not specified, the default is black. */
  var redactionColor: js.UndefOr[GooglePrivacyDlpV2Color] = js.undefined
}
object GooglePrivacyDlpV2ImageRedactionConfig {
  
  inline def apply(): GooglePrivacyDlpV2ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ImageRedactionConfig]
  }
  
  extension [Self <: GooglePrivacyDlpV2ImageRedactionConfig](x: Self) {
    
    inline def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    inline def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    inline def setRedactAllText(value: Boolean): Self = StObject.set(x, "redactAllText", value.asInstanceOf[js.Any])
    
    inline def setRedactAllTextUndefined: Self = StObject.set(x, "redactAllText", js.undefined)
    
    inline def setRedactionColor(value: GooglePrivacyDlpV2Color): Self = StObject.set(x, "redactionColor", value.asInstanceOf[js.Any])
    
    inline def setRedactionColorUndefined: Self = StObject.set(x, "redactionColor", js.undefined)
  }
}
