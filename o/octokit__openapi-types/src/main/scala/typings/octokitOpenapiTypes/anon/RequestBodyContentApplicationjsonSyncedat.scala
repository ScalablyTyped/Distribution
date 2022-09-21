package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonSyncedat extends StObject {
  
  var parameters: PathTeamid
  
  var requestBody: ContentApplicationjsonSyncedat
  
  var responses: `200132403422`
}
object RequestBodyContentApplicationjsonSyncedat {
  
  inline def apply(parameters: PathTeamid, requestBody: ContentApplicationjsonSyncedat, responses: `200132403422`): RequestBodyContentApplicationjsonSyncedat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonSyncedat]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonSyncedat](x: Self) {
    
    inline def setParameters(value: PathTeamid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSyncedat): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200132403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
