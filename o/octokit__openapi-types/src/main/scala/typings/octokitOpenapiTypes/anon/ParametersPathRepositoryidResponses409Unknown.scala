package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidResponses409Unknown extends StObject {
  
  var parameters: PathRepositoryid
  
  var responses: `409Unknown`
}
object ParametersPathRepositoryidResponses409Unknown {
  
  inline def apply(parameters: PathRepositoryid, responses: `409Unknown`): ParametersPathRepositoryidResponses409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidResponses409Unknown]
  }
  
  extension [Self <: ParametersPathRepositoryidResponses409Unknown](x: Self) {
    
    inline def setParameters(value: PathRepositoryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
