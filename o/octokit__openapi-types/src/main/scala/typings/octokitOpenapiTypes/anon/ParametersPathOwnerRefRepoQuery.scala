package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRefRepoQuery extends StObject {
  
  var parameters: PathOwnerRefRepoQuery
  
  var responses: `200ContentApplicationjsonCheckrunsTotalcount`
}
object ParametersPathOwnerRefRepoQuery {
  
  inline def apply(parameters: PathOwnerRefRepoQuery, responses: `200ContentApplicationjsonCheckrunsTotalcount`): ParametersPathOwnerRefRepoQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRefRepoQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRefRepoQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRefRepoQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckrunsTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
