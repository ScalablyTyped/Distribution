package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RecordLocation extends js.Object {
  
  /** Field id of the field containing the finding. */
  var fieldId: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /** Key of the finding. */
  var recordKey: js.UndefOr[GooglePrivacyDlpV2RecordKey] = js.native
  
  /** Location within a `ContentItem.Table`. */
  var tableLocation: js.UndefOr[GooglePrivacyDlpV2TableLocation] = js.native
}
object GooglePrivacyDlpV2RecordLocation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RecordLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordLocation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RecordLocationOps[Self <: GooglePrivacyDlpV2RecordLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldId(value: GooglePrivacyDlpV2FieldId): Self = this.set("fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldId: Self = this.set("fieldId", js.undefined)
    
    @scala.inline
    def setRecordKey(value: GooglePrivacyDlpV2RecordKey): Self = this.set("recordKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordKey: Self = this.set("recordKey", js.undefined)
    
    @scala.inline
    def setTableLocation(value: GooglePrivacyDlpV2TableLocation): Self = this.set("tableLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableLocation: Self = this.set("tableLocation", js.undefined)
  }
}
