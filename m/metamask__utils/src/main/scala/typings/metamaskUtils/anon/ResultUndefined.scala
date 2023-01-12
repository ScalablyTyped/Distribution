package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultUndefined extends StObject {
  
  var id: Double
  
  var jsonrpc: String
  
  var result: Unit
}
object ResultUndefined {
  
  inline def apply(id: Double, jsonrpc: String, result: Unit): ResultUndefined = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultUndefined] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJsonrpc(value: String): Self = StObject.set(x, "jsonrpc", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Unit): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
