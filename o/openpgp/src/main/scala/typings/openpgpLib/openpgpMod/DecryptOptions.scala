package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptOptions extends js.Object {
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var message: openpgpLib.openpgpMod.messageNs.Message
  var passwords: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var privateKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]] = js.undefined
  var publicKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]] = js.undefined
  var sessionKeys: js.UndefOr[SessionKey | js.Array[SessionKey]] = js.undefined
  var signature: js.UndefOr[Signature] = js.undefined
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
}

object DecryptOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.messageNs.Message,
    date: stdLib.Date = null,
    format: java.lang.String = null,
    passwords: java.lang.String | js.Array[java.lang.String] = null,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key] = null,
    publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key] = null,
    sessionKeys: SessionKey | js.Array[SessionKey] = null,
    signature: Signature = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null
  ): DecryptOptions = {
    val __obj = js.Dynamic.literal(message = message)
    if (date != null) __obj.updateDynamic("date")(date)
    if (format != null) __obj.updateDynamic("format")(format)
    if (passwords != null) __obj.updateDynamic("passwords")(passwords.asInstanceOf[js.Any])
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (sessionKeys != null) __obj.updateDynamic("sessionKeys")(sessionKeys.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptOptions]
  }
}

