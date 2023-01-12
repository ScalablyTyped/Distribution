package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201403404409 extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonEncoding
  
  var responses: `201403404409`
}
object Responses201403404409 {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonEncoding, responses: `201403404409`): Responses201403404409 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201403404409]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201403404409] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonEncoding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403404409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
