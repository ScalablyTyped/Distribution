package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Condition extends StObject {
  
  /** Required. Field within the record this condition is evaluated against. */
  var field: js.UndefOr[GooglePrivacyDlpV2FieldId] = js.undefined
  
  /** Required. Operator used to compare the field or infoType to the value. */
  var operator: js.UndefOr[String] = js.undefined
  
  /** Value to compare against. [Mandatory, except for `EXISTS` tests.] */
  var value: js.UndefOr[GooglePrivacyDlpV2Value] = js.undefined
}
object GooglePrivacyDlpV2Condition {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Condition]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2ConditionMutableBuilder[Self <: GooglePrivacyDlpV2Condition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: GooglePrivacyDlpV2FieldId): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setValue(value: GooglePrivacyDlpV2Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
