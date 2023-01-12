package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent33 extends StObject {
  
  var parameters: PathGistid
  
  var requestBody: Content33
  
  var responses: `20032`
}
object RequestBodyContent33 {
  
  inline def apply(parameters: PathGistid, requestBody: Content33, responses: `20032`): RequestBodyContent33 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent33]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent33] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content33): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `20032`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
