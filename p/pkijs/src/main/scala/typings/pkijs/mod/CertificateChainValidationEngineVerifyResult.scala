package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateChainValidationEngineVerifyResult extends StObject {
  
  var authConstrPolicies: js.UndefOr[js.Array[String]] = js.undefined
  
  var certificatePath: js.UndefOr[js.Array[Certificate]] = js.undefined
  
  var explicitPolicyIndicator: js.UndefOr[Boolean] = js.undefined
  
  var policyMappings: js.UndefOr[js.Array[String]] = js.undefined
  
  var result: Boolean
  
  var resultCode: Double
  
  var resultMessage: String
  
  var userConstrPolicies: js.UndefOr[js.Array[String]] = js.undefined
}
object CertificateChainValidationEngineVerifyResult {
  
  inline def apply(result: Boolean, resultCode: Double, resultMessage: String): CertificateChainValidationEngineVerifyResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], resultCode = resultCode.asInstanceOf[js.Any], resultMessage = resultMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateChainValidationEngineVerifyResult]
  }
  
  extension [Self <: CertificateChainValidationEngineVerifyResult](x: Self) {
    
    inline def setAuthConstrPolicies(value: js.Array[String]): Self = StObject.set(x, "authConstrPolicies", value.asInstanceOf[js.Any])
    
    inline def setAuthConstrPoliciesUndefined: Self = StObject.set(x, "authConstrPolicies", js.undefined)
    
    inline def setAuthConstrPoliciesVarargs(value: String*): Self = StObject.set(x, "authConstrPolicies", js.Array(value*))
    
    inline def setCertificatePath(value: js.Array[Certificate]): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathUndefined: Self = StObject.set(x, "certificatePath", js.undefined)
    
    inline def setCertificatePathVarargs(value: Certificate*): Self = StObject.set(x, "certificatePath", js.Array(value*))
    
    inline def setExplicitPolicyIndicator(value: Boolean): Self = StObject.set(x, "explicitPolicyIndicator", value.asInstanceOf[js.Any])
    
    inline def setExplicitPolicyIndicatorUndefined: Self = StObject.set(x, "explicitPolicyIndicator", js.undefined)
    
    inline def setPolicyMappings(value: js.Array[String]): Self = StObject.set(x, "policyMappings", value.asInstanceOf[js.Any])
    
    inline def setPolicyMappingsUndefined: Self = StObject.set(x, "policyMappings", js.undefined)
    
    inline def setPolicyMappingsVarargs(value: String*): Self = StObject.set(x, "policyMappings", js.Array(value*))
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultCode(value: Double): Self = StObject.set(x, "resultCode", value.asInstanceOf[js.Any])
    
    inline def setResultMessage(value: String): Self = StObject.set(x, "resultMessage", value.asInstanceOf[js.Any])
    
    inline def setUserConstrPolicies(value: js.Array[String]): Self = StObject.set(x, "userConstrPolicies", value.asInstanceOf[js.Any])
    
    inline def setUserConstrPoliciesUndefined: Self = StObject.set(x, "userConstrPolicies", js.undefined)
    
    inline def setUserConstrPoliciesVarargs(value: String*): Self = StObject.set(x, "userConstrPolicies", js.Array(value*))
  }
}
