package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdJsonrpcString extends StObject {
  
  var jsonrpc: String
  
  var result: String
}
object IdJsonrpcString {
  
  inline def apply(jsonrpc: String, result: String): IdJsonrpcString = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdJsonrpcString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdJsonrpcString] (val x: Self) extends AnyVal {
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
