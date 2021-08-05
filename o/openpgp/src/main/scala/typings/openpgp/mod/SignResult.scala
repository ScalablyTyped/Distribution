package typings.openpgp.mod

import typings.openpgp.mod.message.Message
import typings.openpgp.mod.signature.Signature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignResult extends StObject {
  
  var data: String | ReadableStream[String] | NodeStream
  
  var message: Message
  
  var signature: String | ReadableStream[String] | NodeStream | Signature
}
object SignResult {
  
  inline def apply(
    data: String | ReadableStream[String] | NodeStream,
    message: Message,
    signature: String | ReadableStream[String] | NodeStream | Signature
  ): SignResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignResult]
  }
  
  extension [Self <: SignResult](x: Self) {
    
    inline def setData(value: String | ReadableStream[String] | NodeStream): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String | ReadableStream[String] | NodeStream | Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
