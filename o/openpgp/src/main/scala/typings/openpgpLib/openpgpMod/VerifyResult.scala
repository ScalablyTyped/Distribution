package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  var data: java.lang.String | (openpgpLib.ReadableStream[java.lang.String | stdLib.Uint8Array]) | openpgpLib.NodeStream | stdLib.Uint8Array
  var signatures: js.Array[openpgpLib.Anon_KeyidValid]
}

object VerifyResult {
  @scala.inline
  def apply(
    data: java.lang.String | (openpgpLib.ReadableStream[java.lang.String | stdLib.Uint8Array]) | openpgpLib.NodeStream | stdLib.Uint8Array,
    signatures: js.Array[openpgpLib.Anon_KeyidValid]
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signatures = signatures)
  
    __obj.asInstanceOf[VerifyResult]
  }
}

