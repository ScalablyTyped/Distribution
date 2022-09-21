package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryTypeVisibility extends StObject {
  
  var parameters: QueryTypeVisibility
  
  var responses: `200Content614`
}
object ParametersQueryTypeVisibility {
  
  inline def apply(parameters: QueryTypeVisibility, responses: `200Content614`): ParametersQueryTypeVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryTypeVisibility]
  }
  
  extension [Self <: ParametersQueryTypeVisibility](x: Self) {
    
    inline def setParameters(value: QueryTypeVisibility): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content614`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
