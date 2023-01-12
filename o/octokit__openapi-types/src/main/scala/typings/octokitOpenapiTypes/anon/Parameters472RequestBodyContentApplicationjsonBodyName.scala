package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters472RequestBodyContentApplicationjsonBodyName extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonBodyName
  
  var responses: `201401403`
}
object Parameters472RequestBodyContentApplicationjsonBodyName {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonBodyName, responses: `201401403`): Parameters472RequestBodyContentApplicationjsonBodyName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters472RequestBodyContentApplicationjsonBodyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters472RequestBodyContentApplicationjsonBodyName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
