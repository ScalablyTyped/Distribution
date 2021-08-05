package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPair extends StObject {
  
  var privateKey: PrivateKey
  
  var publicKey: PublicKey
}
object KeyPair {
  
  inline def apply(privateKey: PrivateKey, publicKey: PublicKey): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
  
  extension [Self <: KeyPair](x: Self) {
    
    inline def setPrivateKey(value: PrivateKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
