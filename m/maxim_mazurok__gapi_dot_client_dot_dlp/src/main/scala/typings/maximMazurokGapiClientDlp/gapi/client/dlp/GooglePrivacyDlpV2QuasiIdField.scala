package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2QuasiIdField extends StObject {
  
  /** A auxiliary field. */
  var customTag: js.UndefOr[String] = js.undefined
  
  /** Identifies the column. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
}
object GooglePrivacyDlpV2QuasiIdField {
  
  inline def apply(): GooglePrivacyDlpV2QuasiIdField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2QuasiIdField]
  }
  
  extension [Self <: GooglePrivacyDlpV2QuasiIdField](x: Self) {
    
    inline def setCustomTag(value: String): Self = StObject.set(x, "customTag", value.asInstanceOf[js.Any])
    
    inline def setCustomTagUndefined: Self = StObject.set(x, "customTag", js.undefined)
    
    inline def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
