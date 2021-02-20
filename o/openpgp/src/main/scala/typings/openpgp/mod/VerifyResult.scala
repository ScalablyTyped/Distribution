package typings.openpgp.mod

import typings.openpgp.anon.Valid
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerifyResult extends StObject {
  
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
  implicit class VerifyResultMutableBuilder[Self <: VerifyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String | (ReadableStream[String | Uint8Array]) | NodeStream | Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatures(value: js.Array[Valid]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesVarargs(value: Valid*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
