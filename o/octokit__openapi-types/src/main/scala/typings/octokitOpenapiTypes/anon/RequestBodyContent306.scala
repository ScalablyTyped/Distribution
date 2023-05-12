package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent306 extends StObject {
  
  var parameters: `141`
  
  var requestBody: Content306
  
  var responses: `201409`
}
object RequestBodyContent306 {
  
  inline def apply(parameters: `141`, requestBody: Content306, responses: `201409`): RequestBodyContent306 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent306]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent306] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content306): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
