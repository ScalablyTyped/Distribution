package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPairKeyObjectResult extends StObject {
  
  var privateKey: KeyObject
  
  var publicKey: KeyObject
}
object KeyPairKeyObjectResult {
  
  inline def apply(privateKey: KeyObject, publicKey: KeyObject): KeyPairKeyObjectResult = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairKeyObjectResult]
  }
  
  extension [Self <: KeyPairKeyObjectResult](x: Self) {
    
    inline def setPrivateKey(value: KeyObject): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: KeyObject): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
