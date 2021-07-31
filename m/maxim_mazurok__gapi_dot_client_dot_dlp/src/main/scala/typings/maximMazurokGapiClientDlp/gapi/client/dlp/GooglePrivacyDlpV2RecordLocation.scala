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
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordLocation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RecordLocationMutableBuilder[Self <: GooglePrivacyDlpV2RecordLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldId(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    @scala.inline
    def setRecordKey(value: GooglePrivacyDlpV2RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordKeyUndefined: Self = StObject.set(x, "recordKey", js.undefined)
    
    @scala.inline
    def setTableLocation(value: GooglePrivacyDlpV2TableLocation): Self = StObject.set(x, "tableLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableLocationUndefined: Self = StObject.set(x, "tableLocation", js.undefined)
  }
}
