package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretnameQuery extends StObject {
  
  var parameters: PathOrgSecretnameQuery
  
  var responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
}
object ParametersPathOrgSecretnameQuery {
  
  inline def apply(
    parameters: PathOrgSecretnameQuery,
    responses: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`
  ): ParametersPathOrgSecretnameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretnameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgSecretnameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretnameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRepositoriesArrayTotalcountNumber`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
