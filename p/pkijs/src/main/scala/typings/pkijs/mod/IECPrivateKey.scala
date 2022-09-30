package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IECPrivateKey extends StObject {
  
  var namedCurve: js.UndefOr[String] = js.undefined
  
  var privateKey: OctetString
  
  var publicKey: js.UndefOr[ECPublicKey] = js.undefined
  
  var version: Double
}
object IECPrivateKey {
  
  inline def apply(privateKey: OctetString, version: Double): IECPrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IECPrivateKey]
  }
  
  extension [Self <: IECPrivateKey](x: Self) {
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
    
    inline def setNamedCurveUndefined: Self = StObject.set(x, "namedCurve", js.undefined)
    
    inline def setPrivateKey(value: OctetString): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: ECPublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
