package typings.openpgp.anon

import typings.openpgp.mod.NodeStream
import typings.openpgp.mod.ReadableStream
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined openpgp.openpgp.DecryptResult & {  data :std.Uint8Array | openpgp.openpgp.ReadableStream<std.Uint8Array> | openpgp.openpgp.NodeStream} */
@js.native
trait DecryptResultdataUint8Arr extends js.Object {
  var data: (String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array) with (Uint8Array | ReadableStream[Uint8Array] | NodeStream) = js.native
  var filename: String = js.native
  var signatures: js.Array[Valid] = js.native
}

object DecryptResultdataUint8Arr {
  @scala.inline
  def apply(
    data: (String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array) with (Uint8Array | ReadableStream[Uint8Array] | NodeStream),
    filename: String,
    signatures: js.Array[Valid]
  ): DecryptResultdataUint8Arr = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResultdataUint8Arr]
  }
  @scala.inline
  implicit class DecryptResultdataUint8ArrOps[Self <: DecryptResultdataUint8Arr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(
      value: (String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array) with (Uint8Array | ReadableStream[Uint8Array] | NodeStream)
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturesVarargs(value: Valid*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[Valid]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
  
}

