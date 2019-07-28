package typings.openpgp.openpgpMod

import typings.openpgp.Anon_KeyidValid
import typings.openpgp.NodeStream
import typings.openpgp.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResult extends js.Object {
  var data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array
  var filename: String
  var signatures: js.Array[Anon_KeyidValid]
}

object DecryptResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array,
    filename: String,
    signatures: js.Array[Anon_KeyidValid]
  ): DecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename, signatures = signatures)
  
    __obj.asInstanceOf[DecryptResult]
  }
}

