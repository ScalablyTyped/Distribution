package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOrgString extends StObject {
  
  var parameters: PathNameStringOrgString
  
  var responses: `200ContentApplicationjsonNameSelectedrepositoriesurl`
}
object ParametersPathNameStringOrgString {
  
  inline def apply(
    parameters: PathNameStringOrgString,
    responses: `200ContentApplicationjsonNameSelectedrepositoriesurl`
  ): ParametersPathNameStringOrgString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOrgString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOrgString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOrgString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonNameSelectedrepositoriesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
