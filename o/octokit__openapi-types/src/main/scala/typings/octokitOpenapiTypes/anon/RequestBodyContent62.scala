package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent62 extends StObject {
  
  var parameters: `55`
  
  var requestBody: Content62
  
  var responses: `201403`
}
object RequestBodyContent62 {
  
  inline def apply(parameters: `55`, requestBody: Content62, responses: `201403`): RequestBodyContent62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent62]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent62] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content62): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
