package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePrivateKeyEncodingOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: java.lang.String
  var format: T
  var passphrase: java.lang.String
}

object BasePrivateKeyEncodingOptions {
  @scala.inline
  def apply[T /* <: KeyFormat */](cipher: java.lang.String, format: T, passphrase: java.lang.String): BasePrivateKeyEncodingOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cipher")(cipher)
    __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.updateDynamic("passphrase")(passphrase)
    __obj.asInstanceOf[BasePrivateKeyEncodingOptions[T]]
  }
}

