package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses377 extends StObject {
  
  var parameters: Path375
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `377`
}
object Responses377 {
  
  inline def apply(parameters: Path375, requestBody: ContentApplicationjsonSelectedrepositoryids, responses: `377`): Responses377 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses377]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses377] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path375): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `377`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
