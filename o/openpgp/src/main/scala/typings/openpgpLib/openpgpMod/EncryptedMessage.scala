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

object EncryptedMessage {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    message: openpgpLib.openpgpMod.messageNs.Message = null,
    sessionKey: SessionKey = null,
    signature: java.lang.String | stdLib.ReadableStream[_] | Signature = null
  ): EncryptedMessage = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (message != null) __obj.updateDynamic("message")(message)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedMessage]
  }
}

