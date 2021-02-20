package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPairKeyObjectResult extends StObject {
  
  var privateKey: KeyObject = js.native
  
  var publicKey: KeyObject = js.native
}
object KeyPairKeyObjectResult {
  
  @scala.inline
  def apply(privateKey: KeyObject, publicKey: KeyObject): KeyPairKeyObjectResult = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairKeyObjectResult]
  }
  
  @scala.inline
  implicit class KeyPairKeyObjectResultMutableBuilder[Self <: KeyPairKeyObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: KeyObject): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: KeyObject): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
