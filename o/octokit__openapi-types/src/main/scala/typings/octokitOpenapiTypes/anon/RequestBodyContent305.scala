package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent305 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: Content305
  
  var responses: `405`
}
object RequestBodyContent305 {
  
  inline def apply(parameters: PathPullnumber, requestBody: Content305, responses: `405`): RequestBodyContent305 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent305]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent305] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content305): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `405`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
