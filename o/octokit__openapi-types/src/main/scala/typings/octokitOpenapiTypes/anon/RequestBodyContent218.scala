package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent218 extends StObject {
  
  var parameters: PathCheckrunid
  
  var requestBody: Content218
  
  var responses: `200Content217`
}
object RequestBodyContent218 {
  
  inline def apply(parameters: PathCheckrunid, requestBody: Content218, responses: `200Content217`): RequestBodyContent218 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent218]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent218] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content218): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content217`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
