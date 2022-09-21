package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefRepo extends StObject {
  
  var parameters: PathOwnerRefRepo
  
  var responses: `404422500`
}
object ParametersPathOwnerRefRepo {
  
  inline def apply(parameters: PathOwnerRefRepo, responses: `404422500`): ParametersPathOwnerRefRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefRepo]
  }
  
  extension [Self <: ParametersPathOwnerRefRepo](x: Self) {
    
    inline def setParameters(value: PathOwnerRefRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
