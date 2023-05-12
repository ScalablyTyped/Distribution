package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskServicePrincipalActivity extends StObject {
  
  /**
    * Details of the detected risk. Note: Details for this property are only available for Workload Identities Premium
    * customers. Events in tenants without this license will be returned hidden. The possible values are: none, hidden,
    * adminConfirmedServicePrincipalCompromised, adminDismissedAllRiskForServicePrincipal. Note that you must use the Prefer:
    * include-unknown-enum-members request header to get the following value(s) in this evolvable enum:
    * adminConfirmedServicePrincipalCompromised , adminDismissedAllRiskForServicePrincipal.
    */
  var detail: js.UndefOr[NullableOption[RiskDetail]] = js.undefined
  
  var riskEventTypes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object RiskServicePrincipalActivity {
  
  inline def apply(): RiskServicePrincipalActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskServicePrincipalActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskServicePrincipalActivity] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: NullableOption[RiskDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setRiskEventTypes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "riskEventTypes", value.asInstanceOf[js.Any])
    
    inline def setRiskEventTypesNull: Self = StObject.set(x, "riskEventTypes", null)
    
    inline def setRiskEventTypesUndefined: Self = StObject.set(x, "riskEventTypes", js.undefined)
    
    inline def setRiskEventTypesVarargs(value: String*): Self = StObject.set(x, "riskEventTypes", js.Array(value*))
  }
}
