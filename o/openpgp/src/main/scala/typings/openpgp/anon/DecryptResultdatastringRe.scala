package typings.openpgp.anon

import typings.openpgp.mod.NodeStream
import typings.openpgp.mod.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined openpgp.openpgp.DecryptResult & {  data :string | openpgp.openpgp.ReadableStream<std.String> | openpgp.openpgp.NodeStream} */
trait DecryptResultdatastringRe extends StObject {
  
  var data: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array
  
  var filename: String
  
  var signatures: js.Array[Valid]
}
object DecryptResultdatastringRe {
  
  inline def apply(
    data: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array,
    filename: String,
    signatures: js.Array[Valid]
  ): DecryptResultdatastringRe = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResultdatastringRe]
  }
  
  extension [Self <: DecryptResultdatastringRe](x: Self) {
    
    inline def setData(
      value: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: js.Array[Valid]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: Valid*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
