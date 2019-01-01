package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedMessage extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[openpgpLib.openpgpMod.messageNs.Message] = js.undefined
  // TODO add NodeStream
  var sessionKey: js.UndefOr[SessionKey] = js.undefined
  var signature: js.UndefOr[java.lang.String | stdLib.ReadableStream[_] | Signature] = js.undefined
}

