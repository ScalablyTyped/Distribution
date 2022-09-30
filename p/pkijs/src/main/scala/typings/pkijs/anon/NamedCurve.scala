package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedCurve extends StObject {
  
  var namedCurve: js.UndefOr[String] = js.undefined
  
  var privateKey: js.UndefOr[String] = js.undefined
  
  var publicKey: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object NamedCurve {
  
  inline def apply(): NamedCurve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedCurve]
  }
  
  extension [Self <: NamedCurve](x: Self) {
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setNamedCurveUndefined: Self = StObject.set(x, "namedCurve", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
