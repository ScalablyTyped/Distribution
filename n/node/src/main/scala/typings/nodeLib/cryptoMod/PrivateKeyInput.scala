package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyInput extends js.Object {
  var format: js.UndefOr[KeyFormat] = js.undefined
  var key: java.lang.String | nodeLib.Buffer
  var passphrase: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var `type`: js.UndefOr[
    nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1
  ] = js.undefined
}

object PrivateKeyInput {
  @scala.inline
  def apply(
    key: java.lang.String | nodeLib.Buffer,
    format: KeyFormat = null,
    passphrase: java.lang.String | nodeLib.Buffer = null,
    `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1 = null
  ): PrivateKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInput]
  }
}

