package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringResponses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters extends StObject {
  
  var parameters: PathOrgString
  
  var responses: `200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters`
}
object ParametersPathOrgStringResponses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters {
  
  inline def apply(
    parameters: PathOrgString,
    responses: `200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters`
  ): ParametersPathOrgStringResponses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringResponses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgStringResponses200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesTotaladvancedsecuritycommitters`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
