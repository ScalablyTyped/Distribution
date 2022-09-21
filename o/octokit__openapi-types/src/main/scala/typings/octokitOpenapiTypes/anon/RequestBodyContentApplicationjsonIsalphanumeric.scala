package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonIsalphanumeric extends StObject {
  
  var parameters: `144`
  
  var requestBody: ContentApplicationjsonIsalphanumeric
  
  var responses: `201422`
}
object RequestBodyContentApplicationjsonIsalphanumeric {
  
  inline def apply(parameters: `144`, requestBody: ContentApplicationjsonIsalphanumeric, responses: `201422`): RequestBodyContentApplicationjsonIsalphanumeric = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonIsalphanumeric]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonIsalphanumeric](x: Self) {
    
    inline def setParameters(value: `144`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIsalphanumeric): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
