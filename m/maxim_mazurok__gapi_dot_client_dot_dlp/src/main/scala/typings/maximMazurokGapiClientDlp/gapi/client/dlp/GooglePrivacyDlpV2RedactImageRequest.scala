package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RedactImageRequest extends StObject {
  
  /** The content must be PNG, JPEG, SVG or BMP. */
  var byteItem: js.UndefOr[GooglePrivacyDlpV2ByteContentItem] = js.undefined
  
  /** The configuration for specifying what content to redact from images. */
  var imageRedactionConfigs: js.UndefOr[js.Array[GooglePrivacyDlpV2ImageRedactionConfig]] = js.undefined
  
  /** Whether the response should include findings along with the redacted image. */
  var includeFindings: js.UndefOr[Boolean] = js.undefined
  
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2InspectConfig] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var locationId: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2RedactImageRequest {
  
  inline def apply(): GooglePrivacyDlpV2RedactImageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RedactImageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2RedactImageRequest] (val x: Self) extends AnyVal {
    
    inline def setByteItem(value: GooglePrivacyDlpV2ByteContentItem): Self = StObject.set(x, "byteItem", value.asInstanceOf[js.Any])
    
    inline def setByteItemUndefined: Self = StObject.set(x, "byteItem", js.undefined)
    
    inline def setImageRedactionConfigs(value: js.Array[GooglePrivacyDlpV2ImageRedactionConfig]): Self = StObject.set(x, "imageRedactionConfigs", value.asInstanceOf[js.Any])
    
    inline def setImageRedactionConfigsUndefined: Self = StObject.set(x, "imageRedactionConfigs", js.undefined)
    
    inline def setImageRedactionConfigsVarargs(value: GooglePrivacyDlpV2ImageRedactionConfig*): Self = StObject.set(x, "imageRedactionConfigs", js.Array(value*))
    
    inline def setIncludeFindings(value: Boolean): Self = StObject.set(x, "includeFindings", value.asInstanceOf[js.Any])
    
    inline def setIncludeFindingsUndefined: Self = StObject.set(x, "includeFindings", js.undefined)
    
    inline def setInspectConfig(value: GooglePrivacyDlpV2InspectConfig): Self = StObject.set(x, "inspectConfig", value.asInstanceOf[js.Any])
    
    inline def setInspectConfigUndefined: Self = StObject.set(x, "inspectConfig", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
