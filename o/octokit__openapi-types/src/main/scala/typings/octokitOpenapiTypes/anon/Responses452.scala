package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses452 extends StObject {
  
  var parameters: Path450
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `452`
}
object Responses452 {
  
  inline def apply(parameters: Path450, requestBody: ContentApplicationjsonSelectedrepositoryids, responses: `452`): Responses452 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses452]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses452] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path450): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `452`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
