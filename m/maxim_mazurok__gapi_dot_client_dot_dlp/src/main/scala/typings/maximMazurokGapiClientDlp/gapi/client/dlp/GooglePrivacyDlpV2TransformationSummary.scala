package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2TransformationSummary extends js.Object {
  
  /** Set if the transformation was limited to a specific FieldId. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.native
  
  /** The field transformation that was applied. If multiple field transformations are requested for a single field, this list will contain all of them; otherwise, only one is supplied. */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldTransformation]] = js.native
  
  /** Set if the transformation was limited to a specific InfoType. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2InfoType] = js.native
  
  /** The specific suppression option these stats apply to. */
  var recordSuppress: js.UndefOr[GooglePrivacyDlpV2RecordSuppression] = js.native
  
  /** Collection of all transformations that took place or had an error. */
  var results: js.UndefOr[js.Array[GooglePrivacyDlpV2SummaryResult]] = js.native
  
  /** The specific transformation these stats apply to. */
  var transformation: js.UndefOr[GooglePrivacyDlpV2PrimitiveTransformation] = js.native
  
  /** Total size in bytes that were transformed in some way. */
  var transformedBytes: js.UndefOr[String] = js.native
}
object GooglePrivacyDlpV2TransformationSummary {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2TransformationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2TransformationSummary]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2TransformationSummaryOps[Self <: GooglePrivacyDlpV2TransformationSummary] (val x: Self) extends AnyVal {
    
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
    def setField(value: GooglePrivacyDlpV2FieldId): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    
    @scala.inline
    def setFieldTransformationsVarargs(value: GooglePrivacyDlpV2FieldTransformation*): Self = this.set("fieldTransformations", js.Array(value :_*))
    
    @scala.inline
    def setFieldTransformations(value: js.Array[GooglePrivacyDlpV2FieldTransformation]): Self = this.set("fieldTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldTransformations: Self = this.set("fieldTransformations", js.undefined)
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = this.set("infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoType: Self = this.set("infoType", js.undefined)
    
    @scala.inline
    def setRecordSuppress(value: GooglePrivacyDlpV2RecordSuppression): Self = this.set("recordSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordSuppress: Self = this.set("recordSuppress", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GooglePrivacyDlpV2SummaryResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[GooglePrivacyDlpV2SummaryResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    
    @scala.inline
    def setTransformation(value: GooglePrivacyDlpV2PrimitiveTransformation): Self = this.set("transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformation: Self = this.set("transformation", js.undefined)
    
    @scala.inline
    def setTransformedBytes(value: String): Self = this.set("transformedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformedBytes: Self = this.set("transformedBytes", js.undefined)
  }
}
