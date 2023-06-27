package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639RequestBodyContentApplicationjsonBodyName extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonBodyName
  
  var responses: `201401403404`
}
object Parameters639RequestBodyContentApplicationjsonBodyName {
  
  inline def apply(parameters: `639`, requestBody: ContentApplicationjsonBodyName, responses: `201401403404`): Parameters639RequestBodyContentApplicationjsonBodyName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639RequestBodyContentApplicationjsonBodyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639RequestBodyContentApplicationjsonBodyName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
