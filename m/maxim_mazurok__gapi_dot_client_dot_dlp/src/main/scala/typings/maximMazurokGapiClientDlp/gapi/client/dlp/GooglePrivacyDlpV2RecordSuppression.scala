package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2RecordSuppression extends StObject {
  
  /** A condition that when it evaluates to true will result in the record being evaluated to be suppressed from the transformed content. */
  var condition: js.UndefOr[GooglePrivacyDlpV2RecordCondition] = js.undefined
}
object GooglePrivacyDlpV2RecordSuppression {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2RecordSuppression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2RecordSuppression]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2RecordSuppressionMutableBuilder[Self <: GooglePrivacyDlpV2RecordSuppression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCondition(value: GooglePrivacyDlpV2RecordCondition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
  }
}
