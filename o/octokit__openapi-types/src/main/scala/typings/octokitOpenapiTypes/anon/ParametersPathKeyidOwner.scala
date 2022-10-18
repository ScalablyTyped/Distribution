package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathKeyidOwner extends StObject {
  
  var parameters: PathKeyidOwner
  
  var responses: `200156`
}
object ParametersPathKeyidOwner {
  
  inline def apply(parameters: PathKeyidOwner, responses: `200156`): ParametersPathKeyidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathKeyidOwner]
  }
  
  extension [Self <: ParametersPathKeyidOwner](x: Self) {
    
    inline def setParameters(value: PathKeyidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200156`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
