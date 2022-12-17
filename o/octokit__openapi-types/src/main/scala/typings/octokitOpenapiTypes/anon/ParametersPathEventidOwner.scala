package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEventidOwner extends StObject {
  
  var parameters: PathEventidOwner
  
  var responses: `200ContentApplicationjsonReviewrequester`
}
object ParametersPathEventidOwner {
  
  inline def apply(parameters: PathEventidOwner, responses: `200ContentApplicationjsonReviewrequester`): ParametersPathEventidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEventidOwner]
  }
  
  extension [Self <: ParametersPathEventidOwner](x: Self) {
    
    inline def setParameters(value: PathEventidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonReviewrequester`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
