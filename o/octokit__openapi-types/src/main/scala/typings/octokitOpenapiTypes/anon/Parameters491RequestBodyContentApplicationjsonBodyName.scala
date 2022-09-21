package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters491RequestBodyContentApplicationjsonBodyName extends StObject {
  
  var parameters: `491`
  
  var requestBody: ContentApplicationjsonBodyName
  
  var responses: `201401403`
}
object Parameters491RequestBodyContentApplicationjsonBodyName {
  
  inline def apply(parameters: `491`, requestBody: ContentApplicationjsonBodyName, responses: `201401403`): Parameters491RequestBodyContentApplicationjsonBodyName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters491RequestBodyContentApplicationjsonBodyName]
  }
  
  extension [Self <: Parameters491RequestBodyContentApplicationjsonBodyName](x: Self) {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
