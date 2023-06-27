package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters55 extends StObject {
  
  var parameters: `55`
  
  var requestBody: ContentApplicationjsonAction
  
  var responses: `202403`
}
object Parameters55 {
  
  inline def apply(parameters: `55`, requestBody: ContentApplicationjsonAction, responses: `202403`): Parameters55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters55]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters55] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAction): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
