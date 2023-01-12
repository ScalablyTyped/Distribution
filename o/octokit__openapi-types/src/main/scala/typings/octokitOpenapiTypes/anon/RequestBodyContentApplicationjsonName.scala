package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonName extends StObject {
  
  var parameters: PathRunnergroupid
  
  var requestBody: ContentApplicationjsonName
  
  var responses: `200Content19`
}
object RequestBodyContentApplicationjsonName {
  
  inline def apply(parameters: PathRunnergroupid, requestBody: ContentApplicationjsonName, responses: `200Content19`): RequestBodyContentApplicationjsonName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonName] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content19`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
