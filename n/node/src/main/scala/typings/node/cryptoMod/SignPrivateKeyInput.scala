package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignPrivateKeyInput
  extends PrivateKeyInput
     with SigningOptions

object SignPrivateKeyInput {
  @scala.inline
  def apply(
    key: String | Buffer,
    format: KeyFormat = null,
    padding: js.UndefOr[Double] = js.undefined,
    passphrase: String | Buffer = null,
    saltLength: js.UndefOr[Double] = js.undefined,
    `type`: pkcs1 | pkcs8 | sec1 = null
  ): SignPrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (!js.isUndefined(saltLength)) __obj.updateDynamic("saltLength")(saltLength.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignPrivateKeyInput]
  }
}

