package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses422ContentApplicationjsonDocumentationurl extends StObject {
  
  var parameters: PathUsername
  
  var responses: `422ContentApplicationjsonDocumentationurl`
}
object Responses422ContentApplicationjsonDocumentationurl {
  
  inline def apply(parameters: PathUsername, responses: `422ContentApplicationjsonDocumentationurl`): Responses422ContentApplicationjsonDocumentationurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses422ContentApplicationjsonDocumentationurl]
  }
  
  extension [Self <: Responses422ContentApplicationjsonDocumentationurl](x: Self) {
    
    inline def setParameters(value: PathUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `422ContentApplicationjsonDocumentationurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
