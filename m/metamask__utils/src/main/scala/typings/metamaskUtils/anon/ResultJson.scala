package typings.metamaskUtils.anon

import typings.metamaskUtils.jsonMod.Json
import typings.metamaskUtils.metamaskUtilsStrings.`2Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultJson extends StObject {
  
  var id: String | Double | Null
  
  var jsonrpc: `2Dot0`
  
  var result: Json
}
object ResultJson {
  
  inline def apply(): ResultJson = {
    val __obj = js.Dynamic.literal(jsonrpc = "2.0", id = null, result = null)
    __obj.asInstanceOf[ResultJson]
  }
  
  extension [Self <: ResultJson](x: Self) {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setJsonrpc(value: `2Dot0`): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Json): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setResultVarargs(value: Any*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
