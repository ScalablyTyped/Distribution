package typings.openpgp.mod

import typings.openpgp.AnonValid
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResult extends js.Object {
  var data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array
  var filename: String
  var signatures: js.Array[AnonValid]
}

object DecryptResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array,
    filename: String,
    signatures: js.Array[AnonValid]
  ): DecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResult]
  }
}

