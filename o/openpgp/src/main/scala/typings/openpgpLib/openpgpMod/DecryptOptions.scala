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

