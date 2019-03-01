package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptOptions extends js.Object {
  var armor: js.UndefOr[scala.Boolean] = js.undefined
  var compression: js.UndefOr[openpgpLib.openpgpMod.enumsNs.compression] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var fromUserId: js.UndefOr[UserId] = js.undefined
  var message: openpgpLib.openpgpMod.messageNs.Message
  var passwords: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var privateKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]] = js.undefined
  var publicKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]] = js.undefined
  var returnSessionKey: js.UndefOr[scala.Boolean] = js.undefined
  var sessionKey: js.UndefOr[SessionKey] = js.undefined
  var signature: js.UndefOr[Signature] = js.undefined
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
  var toUserId: js.UndefOr[UserId] = js.undefined
  var wildcard: js.UndefOr[scala.Boolean] = js.undefined
}

object EncryptOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.messageNs.Message,
    armor: js.UndefOr[scala.Boolean] = js.undefined,
    compression: openpgpLib.openpgpMod.enumsNs.compression = null,
    date: stdLib.Date = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    fromUserId: UserId = null,
    passwords: java.lang.String | js.Array[java.lang.String] = null,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key] = null,
    publicKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key] = null,
    returnSessionKey: js.UndefOr[scala.Boolean] = js.undefined,
    sessionKey: SessionKey = null,
    signature: Signature = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null,
    toUserId: UserId = null,
    wildcard: js.UndefOr[scala.Boolean] = js.undefined
  ): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (!js.isUndefined(armor)) __obj.updateDynamic("armor")(armor)
    if (compression != null) __obj.updateDynamic("compression")(compression)
    if (date != null) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (fromUserId != null) __obj.updateDynamic("fromUserId")(fromUserId)
    if (passwords != null) __obj.updateDynamic("passwords")(passwords.asInstanceOf[js.Any])
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (publicKeys != null) __obj.updateDynamic("publicKeys")(publicKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSessionKey)) __obj.updateDynamic("returnSessionKey")(returnSessionKey)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    if (toUserId != null) __obj.updateDynamic("toUserId")(toUserId)
    if (!js.isUndefined(wildcard)) __obj.updateDynamic("wildcard")(wildcard)
    __obj.asInstanceOf[EncryptOptions]
  }
}

