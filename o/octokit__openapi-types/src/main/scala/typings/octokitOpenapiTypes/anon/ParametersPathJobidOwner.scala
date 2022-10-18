package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathJobidOwner extends StObject {
  
  var parameters: PathJobidOwner
  
  var responses: `200Content411`
}
object ParametersPathJobidOwner {
  
  inline def apply(parameters: PathJobidOwner, responses: `200Content411`): ParametersPathJobidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathJobidOwner]
  }
  
  extension [Self <: ParametersPathJobidOwner](x: Self) {
    
    inline def setParameters(value: PathJobidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content411`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
