package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2TransformationSummary extends StObject {
  
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
  implicit class GooglePrivacyDlpV2TransformationSummaryMutableBuilder[Self <: GooglePrivacyDlpV2TransformationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformations(value: js.Array[GooglePrivacyDlpV2FieldTransformation]): Self = StObject.set(x, "fieldTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformationsUndefined: Self = StObject.set(x, "fieldTransformations", js.undefined)
    
    @scala.inline
    def setFieldTransformationsVarargs(value: GooglePrivacyDlpV2FieldTransformation*): Self = StObject.set(x, "fieldTransformations", js.Array(value :_*))
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setInfoType(value: GooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setRecordSuppress(value: GooglePrivacyDlpV2RecordSuppression): Self = StObject.set(x, "recordSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordSuppressUndefined: Self = StObject.set(x, "recordSuppress", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[GooglePrivacyDlpV2SummaryResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: GooglePrivacyDlpV2SummaryResult*): Self = StObject.set(x, "results", js.Array(value :_*))
    
    @scala.inline
    def setTransformation(value: GooglePrivacyDlpV2PrimitiveTransformation): Self = StObject.set(x, "transformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformationUndefined: Self = StObject.set(x, "transformation", js.undefined)
    
    @scala.inline
    def setTransformedBytes(value: String): Self = StObject.set(x, "transformedBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformedBytesUndefined: Self = StObject.set(x, "transformedBytes", js.undefined)
  }
}
