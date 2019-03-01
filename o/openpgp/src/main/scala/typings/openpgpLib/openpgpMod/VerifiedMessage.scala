package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifiedMessage extends js.Object {
  var data: stdLib.Uint8Array | java.lang.String | stdLib.ReadableStream[_]
   // TODO add NodeStream
  var signatures: js.Array[Signature]
}

object VerifiedMessage {
  @scala.inline
  def apply(
    data: stdLib.Uint8Array | java.lang.String | stdLib.ReadableStream[_],
    signatures: js.Array[Signature]
  ): VerifiedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("signatures")(signatures)
    __obj.asInstanceOf[VerifiedMessage]
  }
}

