package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDeletebranchonmerge extends StObject {
  
  var requestBody: ContentApplicationjsonDeletebranchonmerge
  
  var responses: `201304400`
}
object RequestBodyContentApplicationjsonDeletebranchonmerge {
  
  inline def apply(requestBody: ContentApplicationjsonDeletebranchonmerge, responses: `201304400`): RequestBodyContentApplicationjsonDeletebranchonmerge = {
    val __obj = js.Dynamic.literal(requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDeletebranchonmerge]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonDeletebranchonmerge](x: Self) {
    
    inline def setRequestBody(value: ContentApplicationjsonDeletebranchonmerge): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201304400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
