package typings.openpgp.anon

import typings.openpgp.mod.NodeStream
import typings.openpgp.mod.ReadableStream
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.DecryptResult & {  data :std.Uint8Array | openpgp.openpgp.ReadableStream<std.Uint8Array> | openpgp.openpgp.NodeStream} */
@js.native
trait DecryptResultdataUint8Arr extends StObject {
  
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
  implicit class DecryptResultdataUint8ArrMutableBuilder[Self <: DecryptResultdataUint8Arr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(
      value: (String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array) with (Uint8Array | ReadableStream[Uint8Array] | NodeStream)
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[Valid]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: Valid*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
