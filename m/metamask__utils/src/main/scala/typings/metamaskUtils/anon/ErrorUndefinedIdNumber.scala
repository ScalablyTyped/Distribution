package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorUndefinedIdNumber extends StObject {
  
  var error: Unit
  
  var id: Double
  
  var jsonrpc: String
}
object ErrorUndefinedIdNumber {
  
  inline def apply(error: Unit, id: Double, jsonrpc: String): ErrorUndefinedIdNumber = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorUndefinedIdNumber]
  }
  
  extension [Self <: ErrorUndefinedIdNumber](x: Self) {
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
  }
}
