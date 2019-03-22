package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  /**
    * (optional) use the given date for verification instead of the current time
    */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * (cleartext) message object with signatures
    */
  var message: openpgpLib.openpgpMod.cleartextNs.CleartextMessage | openpgpLib.openpgpMod.messageNs.Message
  /**
    * array of publicKeys or single key, to verify signatures
    */
  var publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[_]
  /**
    * (optional) detached signature for verification
    */
  var signature: js.UndefOr[openpgpLib.openpgpMod.signatureNs.Signature] = js.undefined
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.cleartextNs.CleartextMessage | openpgpLib.openpgpMod.messageNs.Message,
    publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[_],
    date: stdLib.Date = null,
    signature: openpgpLib.openpgpMod.signatureNs.Signature = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], publicKeys = publicKeys.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
}

