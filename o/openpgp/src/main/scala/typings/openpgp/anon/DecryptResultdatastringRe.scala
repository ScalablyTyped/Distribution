package typings.openpgp.anon

import typings.openpgp.mod.NodeStream
import typings.openpgp.mod.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptResult & {  data  :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.NodeStream} */
trait DecryptResultdatastringRe extends js.Object {
  var data: (String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array) with (String | ReadableStream[String] | NodeStream)
  var filename: String
  var signatures: js.Array[Valid]
}

object DecryptResultdatastringRe {
  @scala.inline
  def apply(
    data: (String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array) with (String | ReadableStream[String] | NodeStream),
    filename: String,
    signatures: js.Array[Valid]
  ): DecryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResultdatastringRe]
  }
}

