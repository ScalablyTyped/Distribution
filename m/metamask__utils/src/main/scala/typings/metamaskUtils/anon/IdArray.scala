package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdArray extends StObject {
  
  var id: js.Array[scala.Nothing]
  
  var jsonrpc: String
  
  var result: String
}
object IdArray {
  
  inline def apply(id: js.Array[scala.Nothing], jsonrpc: String, result: String): IdArray = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdArray]
  }
  
  extension [Self <: IdArray](x: Self) {
    
    inline def setId(value: js.Array[scala.Nothing]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdVarargs(value: scala.Nothing*): Self = StObject.set(x, "id", js.Array(value*))
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
