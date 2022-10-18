package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryPagePerpageProtected extends StObject {
  
  var parameters: QueryPagePerpageProtected
  
  var responses: `200Content436`
}
object ParametersQueryPagePerpageProtected {
  
  inline def apply(parameters: QueryPagePerpageProtected, responses: `200Content436`): ParametersQueryPagePerpageProtected = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryPagePerpageProtected]
  }
  
  extension [Self <: ParametersQueryPagePerpageProtected](x: Self) {
    
    inline def setParameters(value: QueryPagePerpageProtected): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content436`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
