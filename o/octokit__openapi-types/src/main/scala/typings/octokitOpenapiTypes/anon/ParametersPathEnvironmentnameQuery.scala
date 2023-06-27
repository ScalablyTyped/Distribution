package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameQuery extends StObject {
  
  var parameters: PathEnvironmentnameQuery
  
  var responses: `200ContentApplicationjsonBranchpolicies`
}
object ParametersPathEnvironmentnameQuery {
  
  inline def apply(parameters: PathEnvironmentnameQuery, responses: `200ContentApplicationjsonBranchpolicies`): ParametersPathEnvironmentnameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBranchpolicies`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
