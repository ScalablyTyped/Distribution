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

