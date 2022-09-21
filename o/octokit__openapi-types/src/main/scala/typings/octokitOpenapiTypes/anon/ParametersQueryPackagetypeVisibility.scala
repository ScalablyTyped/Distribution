package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPackagetypeVisibility extends StObject {
  
  var parameters: QueryPackagetypeVisibility
  
  var responses: `200Content470`
}
object ParametersQueryPackagetypeVisibility {
  
  inline def apply(parameters: QueryPackagetypeVisibility, responses: `200Content470`): ParametersQueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPackagetypeVisibility]
  }
  
  extension [Self <: ParametersQueryPackagetypeVisibility](x: Self) {
    
    inline def setParameters(value: QueryPackagetypeVisibility): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content470`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
