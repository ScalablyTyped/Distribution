package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateRevocationListVerifyParams extends StObject {
  
  var issuerCertificate: js.UndefOr[Certificate] = js.undefined
  
  var publicKeyInfo: js.UndefOr[PublicKeyInfo] = js.undefined
}
object CertificateRevocationListVerifyParams {
  
  inline def apply(): CertificateRevocationListVerifyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRevocationListVerifyParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateRevocationListVerifyParams] (val x: Self) extends AnyVal {
    
    inline def setIssuerCertificate(value: Certificate): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
    
    inline def setIssuerCertificateUndefined: Self = StObject.set(x, "issuerCertificate", js.undefined)
    
    inline def setPublicKeyInfo(value: PublicKeyInfo): Self = StObject.set(x, "publicKeyInfo", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyInfoUndefined: Self = StObject.set(x, "publicKeyInfo", js.undefined)
  }
}
