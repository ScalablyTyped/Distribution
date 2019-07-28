package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyInput extends js.Object {
  var format: js.UndefOr[KeyFormat] = js.undefined
  var key: java.lang.String | Buffer
  var passphrase: js.UndefOr[java.lang.String | Buffer] = js.undefined
  var `type`: js.UndefOr[pkcs1 | pkcs8 | sec1] = js.undefined
}

object PrivateKeyInput {
  @scala.inline
  def apply(
    key: java.lang.String | Buffer,
    format: KeyFormat = null,
    passphrase: java.lang.String | Buffer = null,
    `type`: pkcs1 | pkcs8 | sec1 = null
  ): PrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInput]
  }
}

