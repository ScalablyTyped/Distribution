package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RecordLocation extends StObject {
  
  /** Field id of the field containing the finding. */
  var fieldId: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
  
  /** Key of the finding. */
  var recordKey: js.UndefOr[GooglePrivacyDlpV2RecordKey] = js.undefined
  
  /** Location within a `ContentItem.Table`. */
  var tableLocation: js.UndefOr[GooglePrivacyDlpV2TableLocation] = js.undefined
}
object GooglePrivacyDlpV2RecordLocation {
  
  inline def apply(): GooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordLocation]
  }
  
  extension [Self <: GooglePrivacyDlpV2RecordLocation](x: Self) {
    
    inline def setFieldId(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    inline def setRecordKey(value: GooglePrivacyDlpV2RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyUndefined: Self = StObject.set(x, "recordKey", js.undefined)
    
    inline def setTableLocation(value: GooglePrivacyDlpV2TableLocation): Self = StObject.set(x, "tableLocation", value.asInstanceOf[js.Any])
    
    inline def setTableLocationUndefined: Self = StObject.set(x, "tableLocation", js.undefined)
  }
}
