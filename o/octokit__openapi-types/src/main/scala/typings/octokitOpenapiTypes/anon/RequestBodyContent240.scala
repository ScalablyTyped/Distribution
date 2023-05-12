package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent240 extends StObject {
  
  var parameters: PathEnvironmentname
  
  var requestBody: Content240
  
  var responses: `200Content241`
}
object RequestBodyContent240 {
  
  inline def apply(parameters: PathEnvironmentname, requestBody: Content240, responses: `200Content241`): RequestBodyContent240 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent240]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent240] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content240): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content241`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
