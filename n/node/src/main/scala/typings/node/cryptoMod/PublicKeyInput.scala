package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyInput extends js.Object {
  var format: js.UndefOr[KeyFormat] = js.native
  var key: String | Buffer = js.native
  var `type`: js.UndefOr[pkcs1 | spki] = js.native
}

object PublicKeyInput {
  @scala.inline
  def apply(key: String | Buffer): PublicKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInput]
  }
  @scala.inline
  implicit class PublicKeyInputOps[Self <: PublicKeyInput] (val x: Self) extends AnyVal {
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
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: KeyFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setType(value: pkcs1 | spki): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

