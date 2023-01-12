package typings.pkijs.anon

import typings.std.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EcdhPrivateKey extends StObject {
  
  var ecdhPrivateKey: CryptoKey
}
object EcdhPrivateKey {
  
  inline def apply(ecdhPrivateKey: CryptoKey): EcdhPrivateKey = {
    val __obj = js.Dynamic.literal(ecdhPrivateKey = ecdhPrivateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcdhPrivateKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EcdhPrivateKey] (val x: Self) extends AnyVal {
    
    inline def setEcdhPrivateKey(value: CryptoKey): Self = StObject.set(x, "ecdhPrivateKey", value.asInstanceOf[js.Any])
  }
}
