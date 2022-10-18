package typings.openpgp.mod

import typings.openpgp.anon.Keyid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyResult extends StObject {
  
  var data: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array
  
  var signatures: js.Array[Keyid]
}
object VerifyResult {
  
  inline def apply(
    data: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array,
    signatures: js.Array[Keyid]
  ): VerifyResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyResult]
  }
  
  extension [Self <: VerifyResult](x: Self) {
    
    inline def setData(
      value: String | (ReadableStream[String | js.typedarray.Uint8Array]) | NodeStream | js.typedarray.Uint8Array
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSignatures(value: js.Array[Keyid]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesVarargs(value: Keyid*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
