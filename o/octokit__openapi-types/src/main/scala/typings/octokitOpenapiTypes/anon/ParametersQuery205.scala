package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery205 extends StObject {
  
  var parameters: Query205
  
  var responses: `200Content206`
}
object ParametersQuery205 {
  
  inline def apply(parameters: Query205, responses: `200Content206`): ParametersQuery205 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery205]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuery205] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query205): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content206`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
