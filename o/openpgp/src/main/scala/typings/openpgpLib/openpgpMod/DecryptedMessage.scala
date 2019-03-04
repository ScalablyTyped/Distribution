package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptedMessage extends js.Object {
  var data: stdLib.Uint8Array | java.lang.String | stdLib.ReadableStream[_]
  var filename: java.lang.String
   // TODO add NodeStream
  var signatures: js.Array[Signature]
}

object DecryptedMessage {
  @scala.inline
  def apply(
    data: stdLib.Uint8Array | java.lang.String | stdLib.ReadableStream[_],
    filename: java.lang.String,
    signatures: js.Array[Signature]
  ): DecryptedMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename, signatures = signatures)
  
    __obj.asInstanceOf[DecryptedMessage]
  }
}

