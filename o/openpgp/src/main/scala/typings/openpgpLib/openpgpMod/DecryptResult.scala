package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptResult extends js.Object {
  var data: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream | stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array]
  var filename: java.lang.String
  var signatures: js.Array[openpgpLib.Anon_KeyidValid]
}

object DecryptResult {
  @scala.inline
  def apply(
    data: java.lang.String | openpgpLib.ReadableStream[java.lang.String] | openpgpLib.NodeStream | stdLib.Uint8Array | openpgpLib.ReadableStream[stdLib.Uint8Array],
    filename: java.lang.String,
    signatures: js.Array[openpgpLib.Anon_KeyidValid]
  ): DecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename, signatures = signatures)
  
    __obj.asInstanceOf[DecryptResult]
  }
}

