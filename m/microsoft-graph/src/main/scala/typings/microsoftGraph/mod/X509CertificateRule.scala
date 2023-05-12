package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateRule extends StObject {
  
  // The identifier of the X.509 certificate. Required.
  var identifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The type of strong authentication mode. The possible values are: x509CertificateSingleFactor,
    * x509CertificateMultiFactor, unknownFutureValue. Required.
    */
  var x509CertificateAuthenticationMode: js.UndefOr[NullableOption[X509CertificateAuthenticationMode]] = js.undefined
  
  /**
    * The type of the X.509 certificate mode configuration rule. The possible values are: issuerSubject, policyOID,
    * unknownFutureValue. Required.
    */
  var x509CertificateRuleType: js.UndefOr[NullableOption[X509CertificateRuleType]] = js.undefined
}
object X509CertificateRule {
  
  inline def apply(): X509CertificateRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509CertificateRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CertificateRule] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: NullableOption[String]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setX509CertificateAuthenticationMode(value: NullableOption[X509CertificateAuthenticationMode]): Self = StObject.set(x, "x509CertificateAuthenticationMode", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateAuthenticationModeNull: Self = StObject.set(x, "x509CertificateAuthenticationMode", null)
    
    inline def setX509CertificateAuthenticationModeUndefined: Self = StObject.set(x, "x509CertificateAuthenticationMode", js.undefined)
    
    inline def setX509CertificateRuleType(value: NullableOption[X509CertificateRuleType]): Self = StObject.set(x, "x509CertificateRuleType", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateRuleTypeNull: Self = StObject.set(x, "x509CertificateRuleType", null)
    
    inline def setX509CertificateRuleTypeUndefined: Self = StObject.set(x, "x509CertificateRuleType", js.undefined)
  }
}
