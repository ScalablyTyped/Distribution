package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuery355 extends StObject {
  
  var parameters: Query355
  
  var responses: `200Content356`
}
object ParametersQuery355 {
  
  inline def apply(parameters: Query355, responses: `200Content356`): ParametersQuery355 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuery355]
  }
  
  extension [Self <: ParametersQuery355](x: Self) {
    
    inline def setParameters(value: Query355): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content356`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
