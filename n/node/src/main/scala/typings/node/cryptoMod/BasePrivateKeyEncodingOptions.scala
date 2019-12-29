package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePrivateKeyEncodingOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: js.UndefOr[String] = js.undefined
  var format: T
  var passphrase: js.UndefOr[String] = js.undefined
}

object BasePrivateKeyEncodingOptions {
  @scala.inline
  def apply[T /* <: KeyFormat */](format: T, cipher: String = null, passphrase: String = null): BasePrivateKeyEncodingOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePrivateKeyEncodingOptions[T]]
  }
}

