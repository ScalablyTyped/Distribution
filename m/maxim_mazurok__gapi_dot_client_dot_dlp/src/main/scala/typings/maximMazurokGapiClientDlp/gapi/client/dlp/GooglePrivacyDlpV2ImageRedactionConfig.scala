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
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2ImageRedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2ImageRedactionConfig]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ImageRedactionConfigMutableBuilder[Self <: GooglePrivacyDlpV2ImageRedactionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setRedactAllText(value: Boolean): Self = StObject.set(x, "redactAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactAllTextUndefined: Self = StObject.set(x, "redactAllText", js.undefined)
    
    @scala.inline
    def setRedactionColor(value: GooglePrivacyDlpV2Color): Self = StObject.set(x, "redactionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedactionColorUndefined: Self = StObject.set(x, "redactionColor", js.undefined)
  }
}
