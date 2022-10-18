package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses621 extends StObject {
  
  var parameters: Path619
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `621`
}
object Responses621 {
  
  inline def apply(parameters: Path619, requestBody: ContentApplicationjsonSelectedrepositoryids, responses: `621`): Responses621 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses621]
  }
  
  extension [Self <: Responses621](x: Self) {
    
    inline def setParameters(value: Path619): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `621`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
