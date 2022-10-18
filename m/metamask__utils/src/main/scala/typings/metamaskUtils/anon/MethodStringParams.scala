package typings.metamaskUtils.anon

import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodStringParams extends StObject {
  
  var id: String | Double | Null
  
  var jsonrpc: `2Dot0`
  
  var method: String
  
  var params: js.UndefOr[js.Array[Any] | (Record[String, Any])] = js.undefined
}
object MethodStringParams {
  
  inline def apply(method: String): MethodStringParams = {
    val __obj = js.Dynamic.literal(jsonrpc = "2.0", method = method.asInstanceOf[js.Any], id = null)
    __obj.asInstanceOf[MethodStringParams]
  }
  
  extension [Self <: MethodStringParams](x: Self) {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setJsonrpc(value: `2Dot0`): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParams(value: js.Array[Any] | (Record[String, Any])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
  }
}
