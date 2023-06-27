package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters776RequestBodyContentApplicationjsonNameValue extends StObject {
  
  var parameters: `776`
  
  var requestBody: ContentApplicationjsonNameValue
  
  var responses: `590`
}
object Parameters776RequestBodyContentApplicationjsonNameValue {
  
  inline def apply(parameters: `776`, requestBody: ContentApplicationjsonNameValue, responses: `590`): Parameters776RequestBodyContentApplicationjsonNameValue = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters776RequestBodyContentApplicationjsonNameValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters776RequestBodyContentApplicationjsonNameValue] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `776`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameValue): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
