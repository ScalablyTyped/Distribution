package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwner extends StObject {
  
  var parameters: PathOwner
  
  var responses: `301`
}
object ParametersPathOwner {
  
  inline def apply(parameters: PathOwner, responses: `301`): ParametersPathOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwner]
  }
  
  extension [Self <: ParametersPathOwner](x: Self) {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
