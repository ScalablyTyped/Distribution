package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent54 extends StObject {
  
  var parameters: `47`
  
  var requestBody: Content54
  
  var responses: `201403`
}
object RequestBodyContent54 {
  
  inline def apply(parameters: `47`, requestBody: Content54, responses: `201403`): RequestBodyContent54 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent54]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent54] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content54): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
