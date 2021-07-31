package typings.openpgp.mod

import typings.openpgp.anon.Valid
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecryptResult extends StObject {
  
  var data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array
  
  var filename: String
  
  var signatures: js.Array[Valid]
}
object DecryptResult {
  
  @scala.inline
  def apply(
    data: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array,
    filename: String,
    signatures: js.Array[Valid]
  ): DecryptResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptResult]
  }
  
  @scala.inline
  implicit class DecryptResultMutableBuilder[Self <: DecryptResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[Valid]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: Valid*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
