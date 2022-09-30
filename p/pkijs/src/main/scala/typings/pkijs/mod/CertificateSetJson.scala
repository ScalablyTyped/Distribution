package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateSetJson extends StObject {
  
  var certificates: js.Array[CertificateSetItemJson]
}
object CertificateSetJson {
  
  inline def apply(certificates: js.Array[CertificateSetItemJson]): CertificateSetJson = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSetJson]
  }
  
  extension [Self <: CertificateSetJson](x: Self) {
    
    inline def setCertificates(value: js.Array[CertificateSetItemJson]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: CertificateSetItemJson*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
