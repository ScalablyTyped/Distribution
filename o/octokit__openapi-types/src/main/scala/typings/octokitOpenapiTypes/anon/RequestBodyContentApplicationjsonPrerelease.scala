package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonPrerelease extends StObject {
  
  var parameters: PathReleaseid
  
  var requestBody: ContentApplicationjsonPrerelease
  
  var responses: `200323404Content55`
}
object RequestBodyContentApplicationjsonPrerelease {
  
  inline def apply(
    parameters: PathReleaseid,
    requestBody: ContentApplicationjsonPrerelease,
    responses: `200323404Content55`
  ): RequestBodyContentApplicationjsonPrerelease = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonPrerelease]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonPrerelease](x: Self) {
    
    inline def setParameters(value: PathReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrerelease): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200323404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
