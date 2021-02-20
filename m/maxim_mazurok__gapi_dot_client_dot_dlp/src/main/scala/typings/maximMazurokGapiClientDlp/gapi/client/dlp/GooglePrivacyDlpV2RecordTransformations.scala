package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2RecordTransformations extends StObject {
  
  /** Transform the record by applying various field transformations. */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldTransformation]] = js.native
  
  /** Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output. */
  var recordSuppressions: js.UndefOr[js.Array[GooglePrivacyDlpV2RecordSuppression]] = js.native
}
object GooglePrivacyDlpV2RecordTransformations {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RecordTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordTransformations]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RecordTransformationsMutableBuilder[Self <: GooglePrivacyDlpV2RecordTransformations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldTransformations(value: js.Array[GooglePrivacyDlpV2FieldTransformation]): Self = StObject.set(x, "fieldTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTransformationsUndefined: Self = StObject.set(x, "fieldTransformations", js.undefined)
    
    @scala.inline
    def setFieldTransformationsVarargs(value: GooglePrivacyDlpV2FieldTransformation*): Self = StObject.set(x, "fieldTransformations", js.Array(value :_*))
    
    @scala.inline
    def setRecordSuppressions(value: js.Array[GooglePrivacyDlpV2RecordSuppression]): Self = StObject.set(x, "recordSuppressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordSuppressionsUndefined: Self = StObject.set(x, "recordSuppressions", js.undefined)
    
    @scala.inline
    def setRecordSuppressionsVarargs(value: GooglePrivacyDlpV2RecordSuppression*): Self = StObject.set(x, "recordSuppressions", js.Array(value :_*))
  }
}
