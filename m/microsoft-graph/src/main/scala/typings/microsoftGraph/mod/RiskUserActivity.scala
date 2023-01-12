package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskUserActivity extends StObject {
  
  /**
    * Details of the detected risk. Possible values are: none, adminGeneratedTemporaryPassword,
    * userPerformedSecuredPasswordChange, userPerformedSecuredPasswordReset, adminConfirmedSigninSafe, aiConfirmedSigninSafe,
    * userPassedMFADrivenByRiskBasedPolicy, adminDismissedAllRiskForUser, adminConfirmedSigninCompromised, hidden,
    * adminConfirmedUserCompromised, unknownFutureValue.
    */
  var detail: js.UndefOr[NullableOption[RiskDetail]] = js.undefined
  
  // The type of risk event detected.
  var riskEventTypes: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object RiskUserActivity {
  
  inline def apply(): RiskUserActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskUserActivity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskUserActivity] (val x: Self) extends AnyVal {
    
    inline def setDetail(value: NullableOption[RiskDetail]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setRiskEventTypes(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "riskEventTypes", value.asInstanceOf[js.Any])
    
    inline def setRiskEventTypesNull: Self = StObject.set(x, "riskEventTypes", null)
    
    inline def setRiskEventTypesUndefined: Self = StObject.set(x, "riskEventTypes", js.undefined)
    
    inline def setRiskEventTypesVarargs(value: String*): Self = StObject.set(x, "riskEventTypes", js.Array(value*))
  }
}
