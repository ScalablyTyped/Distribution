package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGhsaidOwner extends StObject {
  
  var parameters: PathGhsaidOwner
  
  var responses: `200ContentApplicationjsonCreditsdetailed`
}
object ParametersPathGhsaidOwner {
  
  inline def apply(parameters: PathGhsaidOwner, responses: `200ContentApplicationjsonCreditsdetailed`): ParametersPathGhsaidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGhsaidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGhsaidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGhsaidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreditsdetailed`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
