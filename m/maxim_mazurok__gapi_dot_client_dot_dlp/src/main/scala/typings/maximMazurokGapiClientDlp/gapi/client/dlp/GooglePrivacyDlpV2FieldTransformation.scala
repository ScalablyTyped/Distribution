package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2FieldTransformation extends StObject {
  
  /**
    * Only apply the transformation if the condition evaluates to true for the given `RecordCondition`. The conditions are allowed to reference fields that are not used in the actual
    * transformation. Example Use Cases: - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range. - Redact a field
    * if the date of birth field is greater than 85.
    */
  var condition: js.UndefOr[GooglePrivacyDlpV2RecordCondition] = js.undefined
  
  /** Required. Input field(s) to apply the transformation to. */
  var fields: js.UndefOr[js.Array[GooglePrivacyDlpV2FieldId]] = js.undefined
  
  /** Treat the contents of the field as free text, and selectively transform content that matches an `InfoType`. */
  var infoTypeTransformations: js.UndefOr[GooglePrivacyDlpV2InfoTypeTransformations] = js.undefined
  
  /** Apply the transformation to the entire field. */
  var primitiveTransformation: js.UndefOr[GooglePrivacyDlpV2PrimitiveTransformation] = js.undefined
}
object GooglePrivacyDlpV2FieldTransformation {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2FieldTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2FieldTransformation]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2FieldTransformationMutableBuilder[Self <: GooglePrivacyDlpV2FieldTransformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: GooglePrivacyDlpV2RecordCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[GooglePrivacyDlpV2FieldId]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: GooglePrivacyDlpV2FieldId*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setInfoTypeTransformations(value: GooglePrivacyDlpV2InfoTypeTransformations): Self = StObject.set(x, "infoTypeTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeTransformationsUndefined: Self = StObject.set(x, "infoTypeTransformations", js.undefined)
    
    @scala.inline
    def setPrimitiveTransformation(value: GooglePrivacyDlpV2PrimitiveTransformation): Self = StObject.set(x, "primitiveTransformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveTransformationUndefined: Self = StObject.set(x, "primitiveTransformation", js.undefined)
  }
}
