package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorCodeData extends StObject {
  
  var error: CodeData
  
  var id: String
  
  var jsonrpc: String
}
object ErrorCodeData {
  
  inline def apply(error: CodeData, id: String, jsonrpc: String): ErrorCodeData = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeData]
  }
  
  extension [Self <: ErrorCodeData](x: Self) {
    
    inline def setError(value: CodeData): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
