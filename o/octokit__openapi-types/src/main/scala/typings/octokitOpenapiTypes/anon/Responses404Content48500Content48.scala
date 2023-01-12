package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content48500Content48 extends StObject {
  
  var parameters: PathSecretnameString
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `404Content48500Content48`
}
object Responses404Content48500Content48 {
  
  inline def apply(
    parameters: PathSecretnameString,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `404Content48500Content48`
  ): Responses404Content48500Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content48500Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content48500Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48500Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
