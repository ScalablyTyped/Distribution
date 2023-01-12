package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
trait KeyPair extends StObject {
  
  var privateKey: Handle
  
  var publicKey: Handle
}
object KeyPair {
  
  inline def apply(privateKey: Handle, publicKey: Handle): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
    
    inline def setPrivateKey(value: Handle): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: Handle): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
