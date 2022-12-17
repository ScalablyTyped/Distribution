package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonInreplytoidHeadersLocation extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: ContentApplicationjsonCommitid
  
  var responses: `201ContentApplicationjsonInreplytoidHeadersLocation`
}
object Responses201ContentApplicationjsonInreplytoidHeadersLocation {
  
  inline def apply(
    parameters: PathPullnumberRepo,
    requestBody: ContentApplicationjsonCommitid,
    responses: `201ContentApplicationjsonInreplytoidHeadersLocation`
  ): Responses201ContentApplicationjsonInreplytoidHeadersLocation = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonInreplytoidHeadersLocation]
  }
  
  extension [Self <: Responses201ContentApplicationjsonInreplytoidHeadersLocation](x: Self) {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonCommitid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonInreplytoidHeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
