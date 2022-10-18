package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerQuery250 extends StObject {
  
  var parameters: PathEnvironmentnameOwnerQuery250
  
  var responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
}
object ParametersPathEnvironmentnameOwnerQuery250 {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerQuery250,
    responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
  ): ParametersPathEnvironmentnameOwnerQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerQuery250]
  }
  
  extension [Self <: ParametersPathEnvironmentnameOwnerQuery250](x: Self) {
    
    inline def setParameters(value: PathEnvironmentnameOwnerQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBranchpoliciesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
