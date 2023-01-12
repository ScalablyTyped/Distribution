package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent190 extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content190
  
  var responses: `201202`
}
object RequestBodyContent190 {
  
  inline def apply(parameters: `135`, requestBody: Content190, responses: `201202`): RequestBodyContent190 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent190]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent190] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content190): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
