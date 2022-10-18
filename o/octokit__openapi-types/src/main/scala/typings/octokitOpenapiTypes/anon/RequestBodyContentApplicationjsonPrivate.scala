package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPrivate extends StObject {
  
  var parameters: PathTeamslug
  
  var requestBody: ContentApplicationjsonPrivate
  
  var responses: `201ContentApplicationjsonCommentscount`
}
object RequestBodyContentApplicationjsonPrivate {
  
  inline def apply(
    parameters: PathTeamslug,
    requestBody: ContentApplicationjsonPrivate,
    responses: `201ContentApplicationjsonCommentscount`
  ): RequestBodyContentApplicationjsonPrivate = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPrivate]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPrivate](x: Self) {
    
    inline def setParameters(value: PathTeamslug): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonCommentscount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
