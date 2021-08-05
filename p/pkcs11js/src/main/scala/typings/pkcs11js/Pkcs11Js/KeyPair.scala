package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPair extends StObject {
  
  var privateKey: Handle
  
  var publicKey: Handle
}
object KeyPair {
  
  inline def apply(privateKey: Handle, publicKey: Handle): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
  
  extension [Self <: KeyPair](x: Self) {
    
    inline def setPrivateKey(value: Handle): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: Handle): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
