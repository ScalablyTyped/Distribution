package typings.openpgp.anon

import typings.openpgp.mod.UserID
import typings.openpgp.mod.cleartext.CleartextMessage
import typings.openpgp.openpgpBooleans.`false`
import typings.openpgp.openpgpBooleans.`true`
import typings.openpgp.openpgpStrings.node
import typings.openpgp.openpgpStrings.web
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.SignOptions & {  armor ? :true,   detached ? :false} */
trait SignOptionsarmortruedetac extends js.Object {
  /**
    * (optional) if the return value should be ascii armored or the message object
    */
  var armor: js.UndefOr[Boolean with `true`] = js.undefined
  /**
    * (optional) override the creation date of the signature
    */
  var date: js.UndefOr[Date] = js.undefined
  /**
    * (optional) if the return value should contain a detached signature
    */
  var detached: js.UndefOr[Boolean with `false`] = js.undefined
  /**
    *  (optional) array of user IDs to sign with, one per key in `privateKeys`, e.g. [ { name:'Steve Sender', email:'steve@openpgp.org' }]
    */
  var fromUserIds: js.UndefOr[js.Array[UserID]] = js.undefined
  /**
    * (cleartext) message to be signed
    */
  var message: CleartextMessage | typings.openpgp.mod.message.Message
  /**
    * array of keys or single key with decrypted secret key data to sign cleartext
    */
  var privateKeys: typings.openpgp.mod.key.Key | js.Array[_]
  /**
    * (optional) whether to return data as a stream. Defaults to the type of stream `message` was created from, if any.
    */
  var streaming: js.UndefOr[web | node | `false`] = js.undefined
}

object SignOptionsarmortruedetac {
  @scala.inline
  def apply(
    message: CleartextMessage | typings.openpgp.mod.message.Message,
    privateKeys: typings.openpgp.mod.key.Key | js.Array[_],
    armor: js.UndefOr[Boolean with `true`] = js.undefined,
    date: Date = null,
    detached: js.UndefOr[Boolean with `false`] = js.undefined,
    fromUserIds: js.Array[UserID] = null,
    streaming: web | node | `false` = null
  ): SignOptionsarmortruedetac = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], privateKeys = privateKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(armor)) __obj.updateDynamic("armor")(armor.get.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.get.asInstanceOf[js.Any])
    if (fromUserIds != null) __obj.updateDynamic("fromUserIds")(fromUserIds.asInstanceOf[js.Any])
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptionsarmortruedetac]
  }
}

