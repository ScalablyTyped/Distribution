package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryDirectionHead extends StObject {
  
  var parameters: QueryDirectionHead
  
  var responses: `200Content470304`
}
object ParametersQueryDirectionHead {
  
  inline def apply(parameters: QueryDirectionHead, responses: `200Content470304`): ParametersQueryDirectionHead = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryDirectionHead]
  }
  
  extension [Self <: ParametersQueryDirectionHead](x: Self) {
    
    inline def setParameters(value: QueryDirectionHead): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content470304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
