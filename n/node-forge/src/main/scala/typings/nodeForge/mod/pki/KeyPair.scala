package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPair extends StObject {
  
  var privateKey: PrivateKey = js.native
  
  var publicKey: PublicKey = js.native
}
object KeyPair {
  
  @scala.inline
  def apply(privateKey: PrivateKey, publicKey: PublicKey): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPair]
  }
  
  @scala.inline
  implicit class KeyPairMutableBuilder[Self <: KeyPair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: PrivateKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: PublicKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
