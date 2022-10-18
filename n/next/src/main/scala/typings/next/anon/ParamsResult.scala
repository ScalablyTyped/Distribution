package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResult extends StObject {
  
  var params: js.Array[String]
  
  var result: String
}
object ParamsResult {
  
  inline def apply(params: js.Array[String], result: String): ParamsResult = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResult]
  }
  
  extension [Self <: ParamsResult](x: Self) {
    
    inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
