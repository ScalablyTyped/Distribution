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

