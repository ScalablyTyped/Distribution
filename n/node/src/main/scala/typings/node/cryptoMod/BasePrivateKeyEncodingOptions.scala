package typings.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePrivateKeyEncodingOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: js.UndefOr[java.lang.String] = js.undefined
  var format: T
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
}

object BasePrivateKeyEncodingOptions {
  @scala.inline
  def apply[T /* <: KeyFormat */](format: T, cipher: java.lang.String = null, passphrase: java.lang.String = null): BasePrivateKeyEncodingOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[BasePrivateKeyEncodingOptions[T]]
  }
}

