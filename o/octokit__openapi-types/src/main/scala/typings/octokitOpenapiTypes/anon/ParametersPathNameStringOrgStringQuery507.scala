package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOrgStringQuery507 extends StObject {
  
  var parameters: PathNameStringOrgStringQuery507
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
}
object ParametersPathNameStringOrgStringQuery507 {
  
  inline def apply(
    parameters: PathNameStringOrgStringQuery507,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
  ): ParametersPathNameStringOrgStringQuery507 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOrgStringQuery507]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOrgStringQuery507] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOrgStringQuery507): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
