package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContent184 extends StObject {
  
  var parameters: PathCheckrunid
  
  var requestBody: Content184
  
  var responses: `200Content183`
}
object RequestBodyContent184 {
  
  inline def apply(parameters: PathCheckrunid, requestBody: Content184, responses: `200Content183`): RequestBodyContent184 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContent184]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContent184] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content184): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content183`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
