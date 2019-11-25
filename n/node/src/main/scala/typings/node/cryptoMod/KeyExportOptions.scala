package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyExportOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: js.UndefOr[java.lang.String] = js.undefined
  var format: T
  var passphrase: js.UndefOr[java.lang.String | Buffer] = js.undefined
  var `type`: pkcs1 | spki | pkcs8 | sec1
}

object KeyExportOptions {
  @scala.inline
  def apply[T /* <: KeyFormat */](
    format: T,
    `type`: pkcs1 | spki | pkcs8 | sec1,
    cipher: java.lang.String = null,
    passphrase: java.lang.String | Buffer = null
  ): KeyExportOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyExportOptions[T]]
  }
}

