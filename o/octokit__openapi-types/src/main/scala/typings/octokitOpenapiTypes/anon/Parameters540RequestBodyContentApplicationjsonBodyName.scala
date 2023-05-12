package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters540RequestBodyContentApplicationjsonBodyName extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonBodyName
  
  var responses: `201401403404`
}
object Parameters540RequestBodyContentApplicationjsonBodyName {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjsonBodyName, responses: `201401403404`): Parameters540RequestBodyContentApplicationjsonBodyName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters540RequestBodyContentApplicationjsonBodyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters540RequestBodyContentApplicationjsonBodyName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
