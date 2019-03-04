package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignOptions extends js.Object {
  var armor: js.UndefOr[scala.Boolean] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  var fromUserIds: js.UndefOr[js.Array[UserId]] = js.undefined
  var message: openpgpLib.openpgpMod.messageNs.Message
  var privateKeys: js.UndefOr[openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key]] = js.undefined
  var streaming: js.UndefOr[
    openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false`
  ] = js.undefined
}

object SignOptions {
  @scala.inline
  def apply(
    message: openpgpLib.openpgpMod.messageNs.Message,
    armor: js.UndefOr[scala.Boolean] = js.undefined,
    date: stdLib.Date = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    fromUserIds: js.Array[UserId] = null,
    privateKeys: openpgpLib.openpgpMod.keyNs.Key | js.Array[openpgpLib.openpgpMod.keyNs.Key] = null,
    streaming: openpgpLib.openpgpLibStrings.web | openpgpLib.openpgpLibStrings.node | openpgpLib.openpgpLibNumbers.`false` = null
  ): SignOptions = {
    val __obj = js.Dynamic.literal(message = message)
    if (!js.isUndefined(armor)) __obj.updateDynamic("armor")(armor)
    if (date != null) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (fromUserIds != null) __obj.updateDynamic("fromUserIds")(fromUserIds)
    if (privateKeys != null) __obj.updateDynamic("privateKeys")(privateKeys.asInstanceOf[js.Any])
    if (streaming != null) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignOptions]
  }
}

