package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses355 extends StObject {
  
  var parameters: Path353
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `355`
}
object Responses355 {
  
  inline def apply(parameters: Path353, requestBody: ContentApplicationjsonSelectedrepositoryids, responses: `355`): Responses355 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses355]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses355] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path353): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `355`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
