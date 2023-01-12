package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherCert extends StObject {
  
  var otherCert: js.UndefOr[String] = js.undefined
  
  var otherCertFormat: js.UndefOr[String] = js.undefined
}
object OtherCert {
  
  inline def apply(): OtherCert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherCert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OtherCert] (val x: Self) extends AnyVal {
    
    inline def setOtherCert(value: String): Self = StObject.set(x, "otherCert", value.asInstanceOf[js.Any])
    
    inline def setOtherCertFormat(value: String): Self = StObject.set(x, "otherCertFormat", value.asInstanceOf[js.Any])
    
    inline def setOtherCertFormatUndefined: Self = StObject.set(x, "otherCertFormat", js.undefined)
    
    inline def setOtherCertUndefined: Self = StObject.set(x, "otherCert", js.undefined)
  }
}
