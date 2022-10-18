package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoQueryResolution extends StObject {
  
  var parameters: PathOwnerRepoQueryResolution
  
  var responses: `200404503`
}
object ParametersPathOwnerRepoQueryResolution {
  
  inline def apply(parameters: PathOwnerRepoQueryResolution, responses: `200404503`): ParametersPathOwnerRepoQueryResolution = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoQueryResolution]
  }
  
  extension [Self <: ParametersPathOwnerRepoQueryResolution](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoQueryResolution): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
