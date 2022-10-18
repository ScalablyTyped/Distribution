package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHeadOwner extends StObject {
  
  var parameters: PathHeadOwner
  
  var responses: `200Content475`
}
object ParametersPathHeadOwner {
  
  inline def apply(parameters: PathHeadOwner, responses: `200Content475`): ParametersPathHeadOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHeadOwner]
  }
  
  extension [Self <: ParametersPathHeadOwner](x: Self) {
    
    inline def setParameters(value: PathHeadOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content475`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
