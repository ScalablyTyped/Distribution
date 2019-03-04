package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignPrivateKeyInput extends PrivateKeyInput {
  var padding: js.UndefOr[scala.Double] = js.undefined
  var saltLength: js.UndefOr[scala.Double] = js.undefined
}

object SignPrivateKeyInput {
  @scala.inline
  def apply(
    key: java.lang.String | nodeLib.Buffer,
    format: KeyFormat = null,
    padding: scala.Int | scala.Double = null,
    passphrase: java.lang.String | nodeLib.Buffer = null,
    saltLength: scala.Int | scala.Double = null,
    `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1 = null
  ): SignPrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignPrivateKeyInput]
  }
}

