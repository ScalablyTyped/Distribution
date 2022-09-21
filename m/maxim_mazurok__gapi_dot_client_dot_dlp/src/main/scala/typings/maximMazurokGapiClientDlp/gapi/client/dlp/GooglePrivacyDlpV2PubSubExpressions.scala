package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2PubSubExpressions extends StObject {
  
  /** Conditions to apply to the expression. */
  var conditions: js.UndefOr[js.Array[GooglePrivacyDlpV2PubSubCondition]] = js.undefined
  
  /** The operator to apply to the collection of conditions. */
  var logicalOperator: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2PubSubExpressions {
  
  inline def apply(): GooglePrivacyDlpV2PubSubExpressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2PubSubExpressions]
  }
  
  extension [Self <: GooglePrivacyDlpV2PubSubExpressions](x: Self) {
    
    inline def setConditions(value: js.Array[GooglePrivacyDlpV2PubSubCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: GooglePrivacyDlpV2PubSubCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "logicalOperator", js.undefined)
  }
}
