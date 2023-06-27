package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonNamePrivate extends StObject {
  
  var parameters: Path453
  
  var requestBody: ContentApplicationjsonNamePrivate
  
  var responses: `201401`
}
object RequestBodyContentApplicationjsonNamePrivate {
  
  inline def apply(parameters: Path453, requestBody: ContentApplicationjsonNamePrivate, responses: `201401`): RequestBodyContentApplicationjsonNamePrivate = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonNamePrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonNamePrivate] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path453): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNamePrivate): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
