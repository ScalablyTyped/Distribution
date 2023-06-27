package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonForce extends StObject {
  
  var parameters: `292`
  
  var requestBody: ContentApplicationjsonForce
  
  var responses: `200Content294422`
}
object RequestBodyContentApplicationjsonForce {
  
  inline def apply(parameters: `292`, requestBody: ContentApplicationjsonForce, responses: `200Content294422`): RequestBodyContentApplicationjsonForce = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonForce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonForce] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `292`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonForce): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content294422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
