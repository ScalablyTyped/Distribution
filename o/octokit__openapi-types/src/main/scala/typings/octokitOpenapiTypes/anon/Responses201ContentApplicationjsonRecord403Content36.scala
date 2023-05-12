package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonRecord403Content36 extends StObject {
  
  var parameters: PathJobidOwner
  
  var requestBody: js.UndefOr[Content149] = js.undefined
  
  var responses: `201ContentApplicationjsonRecord403Content36`
}
object Responses201ContentApplicationjsonRecord403Content36 {
  
  inline def apply(parameters: PathJobidOwner, responses: `201ContentApplicationjsonRecord403Content36`): Responses201ContentApplicationjsonRecord403Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonRecord403Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonRecord403Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathJobidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content149): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201ContentApplicationjsonRecord403Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
