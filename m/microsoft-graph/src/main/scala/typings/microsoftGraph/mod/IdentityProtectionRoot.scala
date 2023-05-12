package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityProtectionRoot extends StObject {
  
  // Risk detection in Azure AD Identity Protection and the associated information about the detection.
  var riskDetections: js.UndefOr[NullableOption[js.Array[RiskDetection]]] = js.undefined
  
  // Azure AD service principals that are at risk.
  var riskyServicePrincipals: js.UndefOr[NullableOption[js.Array[RiskyServicePrincipal]]] = js.undefined
  
  // Users that are flagged as at-risk by Azure AD Identity Protection.
  var riskyUsers: js.UndefOr[NullableOption[js.Array[RiskyUser]]] = js.undefined
  
  // Represents information about detected at-risk service principals in an Azure AD tenant.
  var servicePrincipalRiskDetections: js.UndefOr[NullableOption[js.Array[ServicePrincipalRiskDetection]]] = js.undefined
}
object IdentityProtectionRoot {
  
  inline def apply(): IdentityProtectionRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityProtectionRoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityProtectionRoot] (val x: Self) extends AnyVal {
    
    inline def setRiskDetections(value: NullableOption[js.Array[RiskDetection]]): Self = StObject.set(x, "riskDetections", value.asInstanceOf[js.Any])
    
    inline def setRiskDetectionsNull: Self = StObject.set(x, "riskDetections", null)
    
    inline def setRiskDetectionsUndefined: Self = StObject.set(x, "riskDetections", js.undefined)
    
    inline def setRiskDetectionsVarargs(value: RiskDetection*): Self = StObject.set(x, "riskDetections", js.Array(value*))
    
    inline def setRiskyServicePrincipals(value: NullableOption[js.Array[RiskyServicePrincipal]]): Self = StObject.set(x, "riskyServicePrincipals", value.asInstanceOf[js.Any])
    
    inline def setRiskyServicePrincipalsNull: Self = StObject.set(x, "riskyServicePrincipals", null)
    
    inline def setRiskyServicePrincipalsUndefined: Self = StObject.set(x, "riskyServicePrincipals", js.undefined)
    
    inline def setRiskyServicePrincipalsVarargs(value: RiskyServicePrincipal*): Self = StObject.set(x, "riskyServicePrincipals", js.Array(value*))
    
    inline def setRiskyUsers(value: NullableOption[js.Array[RiskyUser]]): Self = StObject.set(x, "riskyUsers", value.asInstanceOf[js.Any])
    
    inline def setRiskyUsersNull: Self = StObject.set(x, "riskyUsers", null)
    
    inline def setRiskyUsersUndefined: Self = StObject.set(x, "riskyUsers", js.undefined)
    
    inline def setRiskyUsersVarargs(value: RiskyUser*): Self = StObject.set(x, "riskyUsers", js.Array(value*))
    
    inline def setServicePrincipalRiskDetections(value: NullableOption[js.Array[ServicePrincipalRiskDetection]]): Self = StObject.set(x, "servicePrincipalRiskDetections", value.asInstanceOf[js.Any])
    
    inline def setServicePrincipalRiskDetectionsNull: Self = StObject.set(x, "servicePrincipalRiskDetections", null)
    
    inline def setServicePrincipalRiskDetectionsUndefined: Self = StObject.set(x, "servicePrincipalRiskDetections", js.undefined)
    
    inline def setServicePrincipalRiskDetectionsVarargs(value: ServicePrincipalRiskDetection*): Self = StObject.set(x, "servicePrincipalRiskDetections", js.Array(value*))
  }
}
