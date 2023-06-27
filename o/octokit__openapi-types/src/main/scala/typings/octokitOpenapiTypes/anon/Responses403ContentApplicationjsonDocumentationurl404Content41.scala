package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403ContentApplicationjsonDocumentationurl404Content41 extends StObject {
  
  var parameters: PathProjectidNumberTeamidNumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonPermission] = js.undefined
  
  var responses: `403ContentApplicationjsonDocumentationurl404Content41`
}
object Responses403ContentApplicationjsonDocumentationurl404Content41 {
  
  inline def apply(
    parameters: PathProjectidNumberTeamidNumber,
    responses: `403ContentApplicationjsonDocumentationurl404Content41`
  ): Responses403ContentApplicationjsonDocumentationurl404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403ContentApplicationjsonDocumentationurl404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses403ContentApplicationjsonDocumentationurl404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidNumberTeamidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPermission): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `403ContentApplicationjsonDocumentationurl404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
