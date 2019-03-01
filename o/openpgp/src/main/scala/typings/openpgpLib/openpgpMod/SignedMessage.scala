package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignedMessage extends js.Object {
   // TODO add NodeStream
  var data: js.UndefOr[java.lang.String | stdLib.ReadableStream[_]] = js.undefined
   // TODO add NodeStream
  var message: js.UndefOr[openpgpLib.openpgpMod.messageNs.Message] = js.undefined
  var signature: js.UndefOr[java.lang.String | stdLib.ReadableStream[_] | Signature] = js.undefined
}

object SignedMessage {
  @scala.inline
  def apply(
    data: java.lang.String | stdLib.ReadableStream[_] = null,
    message: openpgpLib.openpgpMod.messageNs.Message = null,
    signature: java.lang.String | stdLib.ReadableStream[_] | Signature = null
  ): SignedMessage = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedMessage]
  }
}

