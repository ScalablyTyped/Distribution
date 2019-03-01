package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var message: openpgpLib.openpgpMod.messageNs.Message
  var publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]
  var signature: js.UndefOr[Signature] = js.undefined
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.messageNs.Message,
    publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key],
    date: stdLib.Date = null,
    signature: Signature = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
}

