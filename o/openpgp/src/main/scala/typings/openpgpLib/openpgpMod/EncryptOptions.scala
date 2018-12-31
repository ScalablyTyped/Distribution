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
  var toUserId: js.UndefOr[UserId] = js.undefined
  var wildcard: js.UndefOr[scala.Boolean] = js.undefined
}

