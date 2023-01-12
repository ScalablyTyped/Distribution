package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateChainValidationEngineParameters extends StObject {
  
  var certs: js.UndefOr[js.Array[Certificate]] = js.undefined
  
  var checkDate: js.UndefOr[js.Date] = js.undefined
  
  var crls: js.UndefOr[js.Array[CertificateRevocationList]] = js.undefined
  
  var findIssuer: js.UndefOr[FindIssuerCallback] = js.undefined
  
  var findOrigin: js.UndefOr[FindOriginCallback] = js.undefined
  
  var ocsps: js.UndefOr[js.Array[BasicOCSPResponse]] = js.undefined
  
  var trustedCerts: js.UndefOr[js.Array[Certificate]] = js.undefined
}
object CertificateChainValidationEngineParameters {
  
  inline def apply(): CertificateChainValidationEngineParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateChainValidationEngineParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateChainValidationEngineParameters] (val x: Self) extends AnyVal {
    
    inline def setCerts(value: js.Array[Certificate]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCertsVarargs(value: Certificate*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setCheckDate(value: js.Date): Self = StObject.set(x, "checkDate", value.asInstanceOf[js.Any])
    
    inline def setCheckDateUndefined: Self = StObject.set(x, "checkDate", js.undefined)
    
    inline def setCrls(value: js.Array[CertificateRevocationList]): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
    
    inline def setCrlsVarargs(value: CertificateRevocationList*): Self = StObject.set(x, "crls", js.Array(value*))
    
    inline def setFindIssuer(
      value: (/* certificate */ Certificate, /* validationEngine */ CertificateChainValidationEngine, /* crypto */ js.UndefOr[ICryptoEngine]) => js.Promise[js.Array[Certificate]]
    ): Self = StObject.set(x, "findIssuer", js.Any.fromFunction3(value))
    
    inline def setFindIssuerUndefined: Self = StObject.set(x, "findIssuer", js.undefined)
    
    inline def setFindOrigin(
      value: (/* certificate */ Certificate, /* validationEngine */ CertificateChainValidationEngine) => String
    ): Self = StObject.set(x, "findOrigin", js.Any.fromFunction2(value))
    
    inline def setFindOriginUndefined: Self = StObject.set(x, "findOrigin", js.undefined)
    
    inline def setOcsps(value: js.Array[BasicOCSPResponse]): Self = StObject.set(x, "ocsps", value.asInstanceOf[js.Any])
    
    inline def setOcspsUndefined: Self = StObject.set(x, "ocsps", js.undefined)
    
    inline def setOcspsVarargs(value: BasicOCSPResponse*): Self = StObject.set(x, "ocsps", js.Array(value*))
    
    inline def setTrustedCerts(value: js.Array[Certificate]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
    
    inline def setTrustedCertsUndefined: Self = StObject.set(x, "trustedCerts", js.undefined)
    
    inline def setTrustedCertsVarargs(value: Certificate*): Self = StObject.set(x, "trustedCerts", js.Array(value*))
  }
}
