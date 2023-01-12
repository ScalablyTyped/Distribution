package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerQuery407 extends StObject {
  
  var parameters: PathEnvironmentnameOwnerQuery407
  
  var responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
}
object ParametersPathEnvironmentnameOwnerQuery407 {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerQuery407,
    responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
  ): ParametersPathEnvironmentnameOwnerQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameOwnerQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwnerQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBranchpoliciesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
