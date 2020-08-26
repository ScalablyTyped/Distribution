package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.BinaryBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKeyBinaryBuffer extends js.Object {
  var privateKey: BinaryBuffer = js.native
}

object PrivateKeyBinaryBuffer {
  @scala.inline
  def apply(privateKey: BinaryBuffer): PrivateKeyBinaryBuffer = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyBinaryBuffer]
  }
  @scala.inline
  implicit class PrivateKeyBinaryBufferOps[Self <: PrivateKeyBinaryBuffer] (val x: Self) extends AnyVal {
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
    def setPrivateKey(value: BinaryBuffer): Self = this.set("privateKey", value.asInstanceOf[js.Any])
  }
  
}

