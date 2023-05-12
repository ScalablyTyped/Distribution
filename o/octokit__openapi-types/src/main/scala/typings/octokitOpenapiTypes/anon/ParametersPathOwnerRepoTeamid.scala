package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoTeamid extends StObject {
  
  var parameters: PathOwnerRepoTeamid
  
  var responses: `200ContentApplicationjsonGittagsurl`
}
object ParametersPathOwnerRepoTeamid {
  
  inline def apply(parameters: PathOwnerRepoTeamid, responses: `200ContentApplicationjsonGittagsurl`): ParametersPathOwnerRepoTeamid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoTeamid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerRepoTeamid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonGittagsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
