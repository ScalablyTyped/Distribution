package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  /**
    * (cleartext) message to be signed
    */
  var message: openpgpLib.openpgpMod.cleartextNs.CleartextMessage | openpgpLib.openpgpMod.messageNs.Message
  /**
    * array of keys or single key with decrypted secret key data to sign cleartext
    */
  var privateKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[_]
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.cleartextNs.CleartextMessage | openpgpLib.openpgpMod.messageNs.Message,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[_],
    armor: js.UndefOr[scala.Boolean] = js.undefined,
    date: stdLib.Date = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    fromUserIds: js.Array[UserID] = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(armor)) __obj.updateDynamic("armor")(armor)
    if (date != null) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (fromUserIds != null) __obj.updateDynamic("fromUserIds")(fromUserIds)
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
}

