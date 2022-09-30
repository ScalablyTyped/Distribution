package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICertificateSet extends StObject {
  
  var certificates: js.Array[CertificateSetItem]
}
object ICertificateSet {
  
  inline def apply(certificates: js.Array[CertificateSetItem]): ICertificateSet = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICertificateSet]
  }
  
  extension [Self <: ICertificateSet](x: Self) {
    
    inline def setCertificates(value: js.Array[CertificateSetItem]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: CertificateSetItem*): Self = StObject.set(x, "certificates", js.Array(value*))
  }
}
