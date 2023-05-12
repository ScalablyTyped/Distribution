package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent84 extends StObject {
  
  var parameters: `47`
  
  var requestBody: Content84
  
  var responses: `200Content85`
}
object RequestBodyContent84 {
  
  inline def apply(parameters: `47`, requestBody: Content84, responses: `200Content85`): RequestBodyContent84 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent84]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent84] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content84): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content85`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
