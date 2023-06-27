package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoTeamidRequestBody extends StObject {
  
  var parameters: PathRepoTeamid
  
  var requestBody: js.UndefOr[ContentApplicationjson441] = js.undefined
  
  var responses: `247`
}
object ParametersPathRepoTeamidRequestBody {
  
  inline def apply(parameters: PathRepoTeamid, responses: `247`): ParametersPathRepoTeamidRequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoTeamidRequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepoTeamidRequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson441): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `247`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
