package typings.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GooglePrivacyDlpV2Expressions extends StObject {
  
  /** Conditions to apply to the expression. */
  var conditions: js.UndefOr[GooglePrivacyDlpV2Conditions] = js.undefined
  
  /** The operator to apply to the result of conditions. Default and currently only supported value is `AND`. */
  var logicalOperator: js.UndefOr[String] = js.undefined
}
object GooglePrivacyDlpV2Expressions {
  
  inline def apply(): GooglePrivacyDlpV2Expressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Expressions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GooglePrivacyDlpV2Expressions] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: GooglePrivacyDlpV2Conditions): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "logicalOperator", js.undefined)
  }
}
