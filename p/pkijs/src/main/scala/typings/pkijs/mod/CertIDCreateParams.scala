package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertIDCreateParams extends StObject {
  
  var hashAlgorithm: String
  
  var issuerCertificate: Certificate
}
object CertIDCreateParams {
  
  inline def apply(hashAlgorithm: String, issuerCertificate: Certificate): CertIDCreateParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertIDCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertIDCreateParams] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: String): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setIssuerCertificate(value: Certificate): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
  }
}
