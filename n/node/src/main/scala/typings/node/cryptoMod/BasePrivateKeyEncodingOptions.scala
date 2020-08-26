package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasePrivateKeyEncodingOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: js.UndefOr[String] = js.native
  var format: T = js.native
  var passphrase: js.UndefOr[String] = js.native
}

object BasePrivateKeyEncodingOptions {
  @scala.inline
  def apply[/* <: typings.node.cryptoMod.KeyFormat */ T](format: T): BasePrivateKeyEncodingOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePrivateKeyEncodingOptions[T]]
  }
  @scala.inline
  implicit class BasePrivateKeyEncodingOptionsOps[Self <: BasePrivateKeyEncodingOptions[_], /* <: typings.node.cryptoMod.KeyFormat */ T] (val x: Self with BasePrivateKeyEncodingOptions[T]) extends AnyVal {
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
    def setFormat(value: T): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

