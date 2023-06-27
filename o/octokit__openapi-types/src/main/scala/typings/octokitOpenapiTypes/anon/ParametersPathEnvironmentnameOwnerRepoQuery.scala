package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnvironmentnameOwnerRepoQuery extends StObject {
  
  var parameters: PathEnvironmentnameOwnerRepoQuery
  
  var responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
}
object ParametersPathEnvironmentnameOwnerRepoQuery {
  
  inline def apply(
    parameters: PathEnvironmentnameOwnerRepoQuery,
    responses: `200ContentApplicationjsonBranchpoliciesTotalcount`
  ): ParametersPathEnvironmentnameOwnerRepoQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnvironmentnameOwnerRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathEnvironmentnameOwnerRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentnameOwnerRepoQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBranchpoliciesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
