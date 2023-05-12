package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters496 extends StObject {
  
  var parameters: `496`
  
  var requestBody: ContentApplicationjsonAction
  
  var responses: `202403404422`
}
object Parameters496 {
  
  inline def apply(parameters: `496`, requestBody: ContentApplicationjsonAction, responses: `202403404422`): Parameters496 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters496]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters496] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAction): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
