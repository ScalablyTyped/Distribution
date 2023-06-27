package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent358 extends StObject {
  
  var parameters: `165`
  
  var requestBody: Content358
  
  var responses: `201409`
}
object RequestBodyContent358 {
  
  inline def apply(parameters: `165`, requestBody: Content358, responses: `201409`): RequestBodyContent358 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent358]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent358] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content358): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
