package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKeyBuffer extends js.Object {
  var privateKey: typings.node.Buffer = js.native
  var publicKey: typings.node.Buffer = js.native
}

object PrivateKeyBuffer {
  @scala.inline
  def apply(privateKey: typings.node.Buffer, publicKey: typings.node.Buffer): PrivateKeyBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyBuffer]
  }
  @scala.inline
  implicit class PrivateKeyBufferOps[Self <: PrivateKeyBuffer] (val x: Self) extends AnyVal {
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
    def setPrivateKey(value: typings.node.Buffer): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: typings.node.Buffer): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

