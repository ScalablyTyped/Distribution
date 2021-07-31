package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var params: js.Array[String]
  
  var result: String
}
object Params {
  
  @scala.inline
  def apply(params: js.Array[String], result: String): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
