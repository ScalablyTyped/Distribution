package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters47 extends StObject {
  
  var parameters: `47`
  
  var requestBody: ContentApplicationjsonAction
  
  var responses: `202403`
}
object Parameters47 {
  
  inline def apply(parameters: `47`, requestBody: ContentApplicationjsonAction, responses: `202403`): Parameters47 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters47]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters47] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAction): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
