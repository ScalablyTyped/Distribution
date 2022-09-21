package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery471 extends StObject {
  
  var parameters: Query471
  
  var responses: `200Content472`
}
object ParametersQuery471 {
  
  inline def apply(parameters: Query471, responses: `200Content472`): ParametersQuery471 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery471]
  }
  
  extension [Self <: ParametersQuery471](x: Self) {
    
    inline def setParameters(value: Query471): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content472`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
