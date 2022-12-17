package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerQueryResolution extends StObject {
  
  var parameters: PathOwnerQueryResolution
  
  var responses: `200404503`
}
object ParametersPathOwnerQueryResolution {
  
  inline def apply(parameters: PathOwnerQueryResolution, responses: `200404503`): ParametersPathOwnerQueryResolution = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerQueryResolution]
  }
  
  extension [Self <: ParametersPathOwnerQueryResolution](x: Self) {
    
    inline def setParameters(value: PathOwnerQueryResolution): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
