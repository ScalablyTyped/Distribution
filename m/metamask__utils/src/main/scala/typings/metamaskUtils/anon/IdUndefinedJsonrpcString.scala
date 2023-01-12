package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdUndefinedJsonrpcString extends StObject {
  
  var id: Unit
  
  var jsonrpc: String
  
  var result: String
}
object IdUndefinedJsonrpcString {
  
  inline def apply(id: Unit, jsonrpc: String, result: String): IdUndefinedJsonrpcString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdUndefinedJsonrpcString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdUndefinedJsonrpcString] (val x: Self) extends AnyVal {
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
