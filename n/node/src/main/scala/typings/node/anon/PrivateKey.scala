package typings.node.anon

import typings.node.cryptoMod.KeyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivateKey extends StObject {
  
  var privateKey: KeyObject = js.native
  
  var publicKey: KeyObject = js.native
}
object PrivateKey {
  
  @scala.inline
  def apply(privateKey: KeyObject, publicKey: KeyObject): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  @scala.inline
  implicit class PrivateKeyMutableBuilder[Self <: PrivateKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: KeyObject): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: KeyObject): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
