package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedKeyType extends StObject {
  
  /** Represents an allowed Elliptic Curve key type. */
  var ellipticCurve: js.UndefOr[EcKeyType] = js.undefined
  
  /** Represents an allowed RSA key type. */
  var rsa: js.UndefOr[RsaKeyType] = js.undefined
}
object AllowedKeyType {
  
  inline def apply(): AllowedKeyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedKeyType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedKeyType] (val x: Self) extends AnyVal {
    
    inline def setEllipticCurve(value: EcKeyType): Self = StObject.set(x, "ellipticCurve", value.asInstanceOf[js.Any])
    
    inline def setEllipticCurveUndefined: Self = StObject.set(x, "ellipticCurve", js.undefined)
    
    inline def setRsa(value: RsaKeyType): Self = StObject.set(x, "rsa", value.asInstanceOf[js.Any])
    
    inline def setRsaUndefined: Self = StObject.set(x, "rsa", js.undefined)
  }
}
