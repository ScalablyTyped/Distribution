package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOtherCertificateFormat extends StObject {
  
  var otherCert: Any
  
  var otherCertFormat: String
}
object IOtherCertificateFormat {
  
  inline def apply(otherCert: Any, otherCertFormat: String): IOtherCertificateFormat = {
    val __obj = js.Dynamic.literal(otherCert = otherCert.asInstanceOf[js.Any], otherCertFormat = otherCertFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOtherCertificateFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOtherCertificateFormat] (val x: Self) extends AnyVal {
    
    inline def setOtherCert(value: Any): Self = StObject.set(x, "otherCert", value.asInstanceOf[js.Any])
    
    inline def setOtherCertFormat(value: String): Self = StObject.set(x, "otherCertFormat", value.asInstanceOf[js.Any])
  }
}
