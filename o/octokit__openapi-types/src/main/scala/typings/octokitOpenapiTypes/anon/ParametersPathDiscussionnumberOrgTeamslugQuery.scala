package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDiscussionnumberOrgTeamslugQuery extends StObject {
  
  var parameters: PathDiscussionnumberOrgTeamslugQuery
  
  var responses: `200Content626`
}
object ParametersPathDiscussionnumberOrgTeamslugQuery {
  
  inline def apply(parameters: PathDiscussionnumberOrgTeamslugQuery, responses: `200Content626`): ParametersPathDiscussionnumberOrgTeamslugQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDiscussionnumberOrgTeamslugQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDiscussionnumberOrgTeamslugQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDiscussionnumberOrgTeamslugQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content626`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
