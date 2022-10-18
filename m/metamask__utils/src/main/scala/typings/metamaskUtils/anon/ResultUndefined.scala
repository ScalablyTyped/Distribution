package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultUndefined extends StObject {
  
  var id: Unit
  
  var jsonrpc: Unit
  
  var result: Unit
}
object ResultUndefined {
  
  inline def apply(id: Unit, jsonrpc: Unit, result: Unit): ResultUndefined = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultUndefined]
  }
  
  extension [Self <: ResultUndefined](x: Self) {
    
    inline def setId(value: Unit): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: Unit): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Unit): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
