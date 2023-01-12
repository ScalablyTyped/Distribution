package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content48422Content397 extends StObject {
  
  var parameters: PathOwnerRepoTeamid
  
  var requestBody: ContentApplicationjson345
  
  var responses: `403Content48422Content397`
}
object Responses403Content48422Content397 {
  
  inline def apply(
    parameters: PathOwnerRepoTeamid,
    requestBody: ContentApplicationjson345,
    responses: `403Content48422Content397`
  ): Responses403Content48422Content397 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content48422Content397]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403Content48422Content397] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerRepoTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson345): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content48422Content397`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
