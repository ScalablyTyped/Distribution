package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent247 extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content247
  
  var responses: `246`
}
object RequestBodyContent247 {
  
  inline def apply(parameters: `135`, requestBody: Content247, responses: `246`): RequestBodyContent247 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent247]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent247] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content247): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `246`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
