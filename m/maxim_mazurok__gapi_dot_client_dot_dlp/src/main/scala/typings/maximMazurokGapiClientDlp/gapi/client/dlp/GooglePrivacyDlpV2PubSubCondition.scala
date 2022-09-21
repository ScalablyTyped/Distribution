package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2PubSubCondition extends StObject {
  
  /** The minimum data risk score that triggers the condition. */
  var minimumRiskScore: js.UndefOr[String] = js.undefined
  
  /** The minimum sensitivity level that triggers the condition. */
  var minimumSensitivityScore: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2PubSubCondition {
  
  inline def apply(): GooglePrivacyDlpV2PubSubCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PubSubCondition]
  }
  
  extension [Self <: GooglePrivacyDlpV2PubSubCondition](x: Self) {
    
    inline def setMinimumRiskScore(value: String): Self = StObject.set(x, "minimumRiskScore", value.asInstanceOf[js.Any])
    
    inline def setMinimumRiskScoreUndefined: Self = StObject.set(x, "minimumRiskScore", js.undefined)
    
    inline def setMinimumSensitivityScore(value: String): Self = StObject.set(x, "minimumSensitivityScore", value.asInstanceOf[js.Any])
    
    inline def setMinimumSensitivityScoreUndefined: Self = StObject.set(x, "minimumSensitivityScore", js.undefined)
  }
}
