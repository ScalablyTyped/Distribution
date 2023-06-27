package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameStringOrgStringQuery extends StObject {
  
  var parameters: PathNameStringOrgStringQuery
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
}
object ParametersPathNameStringOrgStringQuery {
  
  inline def apply(
    parameters: PathNameStringOrgStringQuery,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
  ): ParametersPathNameStringOrgStringQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameStringOrgStringQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameStringOrgStringQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOrgStringQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
