package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyInput extends js.Object {
  var format: js.UndefOr[KeyFormat] = js.undefined
  var key: java.lang.String | nodeLib.Buffer
  var `type`: js.UndefOr[nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki] = js.undefined
}

object PublicKeyInput {
  @scala.inline
  def apply(
    key: java.lang.String | nodeLib.Buffer,
    format: KeyFormat = null,
    `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki = null
  ): PublicKeyInput = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInput]
  }
}

