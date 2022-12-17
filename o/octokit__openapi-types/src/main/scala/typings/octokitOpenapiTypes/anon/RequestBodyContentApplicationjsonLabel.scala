package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonLabel extends StObject {
  
  var parameters: PathAssetid
  
  var requestBody: ContentApplicationjsonLabel
  
  var responses: `200Content316`
}
object RequestBodyContentApplicationjsonLabel {
  
  inline def apply(parameters: PathAssetid, requestBody: ContentApplicationjsonLabel, responses: `200Content316`): RequestBodyContentApplicationjsonLabel = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonLabel]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonLabel](x: Self) {
    
    inline def setParameters(value: PathAssetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content316`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
