package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery262 extends StObject {
  
  var parameters: Query262
  
  var responses: `200Content263`
}
object ParametersQuery262 {
  
  inline def apply(parameters: Query262, responses: `200Content263`): ParametersQuery262 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery262]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery262] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query262): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content263`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
