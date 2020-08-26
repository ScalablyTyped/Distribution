package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKey extends js.Object {
  var privateKey: NativeBuffer = js.native
  var publicKey: NativeBuffer = js.native
}

object PrivateKey {
  @scala.inline
  def apply(privateKey: NativeBuffer, publicKey: NativeBuffer): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  @scala.inline
  implicit class PrivateKeyOps[Self <: PrivateKey] (val x: Self) extends AnyVal {
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
    def setPrivateKey(value: NativeBuffer): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: NativeBuffer): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

