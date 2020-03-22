package typings.openpgp.mod

import typings.openpgp.AnonValid
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array
  var signatures: js.Array[AnonValid]
}

object VerifyResult {
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array,
    signatures: js.Array[AnonValid]
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyResult]
  }
}

