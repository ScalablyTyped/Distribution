package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonRecord304 extends StObject {
  
  var parameters: PathColumnidNumber
  
  var requestBody: ContentApplicationjsonPosition
  
  var responses: `201ContentApplicationjsonRecord304`
}
object Responses201ContentApplicationjsonRecord304 {
  
  inline def apply(
    parameters: PathColumnidNumber,
    requestBody: ContentApplicationjsonPosition,
    responses: `201ContentApplicationjsonRecord304`
  ): Responses201ContentApplicationjsonRecord304 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonRecord304]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonRecord304] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPosition): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRecord304`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
