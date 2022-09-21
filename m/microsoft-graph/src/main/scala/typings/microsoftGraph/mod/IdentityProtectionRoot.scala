package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProtectionRoot extends StObject {
  
  // Risk detection in Azure AD Identity Protection and the associated information about the detection.
  var riskDetections: js.UndefOr[NullableOption[js.Array[RiskDetection]]] = js.undefined
  
  // Users that are flagged as at-risk by Azure AD Identity Protection.
  var riskyUsers: js.UndefOr[NullableOption[js.Array[RiskyUser]]] = js.undefined
}
object IdentityProtectionRoot {
  
  inline def apply(): IdentityProtectionRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProtectionRoot]
  }
  
  extension [Self <: IdentityProtectionRoot](x: Self) {
    
    inline def setRiskDetections(value: NullableOption[js.Array[RiskDetection]]): Self = StObject.set(x, "riskDetections", value.asInstanceOf[js.Any])
    
    inline def setRiskDetectionsNull: Self = StObject.set(x, "riskDetections", null)
    
    inline def setRiskDetectionsUndefined: Self = StObject.set(x, "riskDetections", js.undefined)
    
    inline def setRiskDetectionsVarargs(value: RiskDetection*): Self = StObject.set(x, "riskDetections", js.Array(value*))
    
    inline def setRiskyUsers(value: NullableOption[js.Array[RiskyUser]]): Self = StObject.set(x, "riskyUsers", value.asInstanceOf[js.Any])
    
    inline def setRiskyUsersNull: Self = StObject.set(x, "riskyUsers", null)
    
    inline def setRiskyUsersUndefined: Self = StObject.set(x, "riskyUsers", js.undefined)
    
    inline def setRiskyUsersVarargs(value: RiskyUser*): Self = StObject.set(x, "riskyUsers", js.Array(value*))
  }
}
