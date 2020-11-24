package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPairKeyObjectResult extends js.Object {
  
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
  implicit class KeyPairKeyObjectResultOps[Self <: KeyPairKeyObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrivateKey(value: KeyObject): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: KeyObject): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
}
