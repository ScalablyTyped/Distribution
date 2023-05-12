package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X509CertificateAuthenticationModeConfiguration extends StObject {
  
  /**
    * Rules are configured in addition to the authentication mode to bind a specific x509CertificateRuleType to an
    * x509CertificateAuthenticationMode. For example, bind the policyOID with identifier 1.32.132.343 to
    * x509CertificateMultiFactor authentication mode.
    */
  var rules: js.UndefOr[NullableOption[js.Array[X509CertificateRule]]] = js.undefined
  
  /**
    * The type of strong authentication mode. The possible values are: x509CertificateSingleFactor,
    * x509CertificateMultiFactor, unknownFutureValue.
    */
  var x509CertificateAuthenticationDefaultMode: js.UndefOr[NullableOption[X509CertificateAuthenticationMode]] = js.undefined
}
object X509CertificateAuthenticationModeConfiguration {
  
  inline def apply(): X509CertificateAuthenticationModeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X509CertificateAuthenticationModeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X509CertificateAuthenticationModeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setRules(value: NullableOption[js.Array[X509CertificateRule]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesNull: Self = StObject.set(x, "rules", null)
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: X509CertificateRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setX509CertificateAuthenticationDefaultMode(value: NullableOption[X509CertificateAuthenticationMode]): Self = StObject.set(x, "x509CertificateAuthenticationDefaultMode", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateAuthenticationDefaultModeNull: Self = StObject.set(x, "x509CertificateAuthenticationDefaultMode", null)
    
    inline def setX509CertificateAuthenticationDefaultModeUndefined: Self = StObject.set(x, "x509CertificateAuthenticationDefaultMode", js.undefined)
  }
}
