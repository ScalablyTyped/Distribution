package typings.openpgp.mod

import typings.openpgp.anon.Valid
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyResult extends js.Object {
  var data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array = js.native
  var signatures: js.Array[Valid] = js.native
}

object VerifyResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array,
    signatures: js.Array[Valid]
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResult]
  }
  @scala.inline
  implicit class VerifyResultOps[Self <: VerifyResult] (val x: Self) extends AnyVal {
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
    def setData(value: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignaturesVarargs(value: Valid*): Self = this.set("signatures", js.Array(value :_*))
    @scala.inline
    def setSignatures(value: js.Array[Valid]): Self = this.set("signatures", value.asInstanceOf[js.Any])
  }
  
}

