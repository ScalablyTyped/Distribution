package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateStatus extends StObject {
  
  var isForCertificate: Boolean
  
  /**
    * 0 = good, 1 = revoked, 2 = unknown
    */
  var status: Double
}
object CertificateStatus {
  
  inline def apply(isForCertificate: Boolean, status: Double): CertificateStatus = {
    val __obj = js.Dynamic.literal(isForCertificate = isForCertificate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateStatus]
  }
  
  extension [Self <: CertificateStatus](x: Self) {
    
    inline def setIsForCertificate(value: Boolean): Self = StObject.set(x, "isForCertificate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
