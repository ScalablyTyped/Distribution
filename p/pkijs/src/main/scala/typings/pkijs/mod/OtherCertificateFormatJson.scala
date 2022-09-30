package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherCertificateFormatJson
  extends StObject
     with CertificateSetItemJson {
  
  var otherCert: js.UndefOr[Any] = js.undefined
  
  var otherCertFormat: String
}
object OtherCertificateFormatJson {
  
  inline def apply(otherCertFormat: String): OtherCertificateFormatJson = {
    val __obj = js.Dynamic.literal(otherCertFormat = otherCertFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherCertificateFormatJson]
  }
  
  extension [Self <: OtherCertificateFormatJson](x: Self) {
    
    inline def setOtherCert(value: Any): Self = StObject.set(x, "otherCert", value.asInstanceOf[js.Any])
    
    inline def setOtherCertFormat(value: String): Self = StObject.set(x, "otherCertFormat", value.asInstanceOf[js.Any])
    
    inline def setOtherCertUndefined: Self = StObject.set(x, "otherCert", js.undefined)
  }
}
