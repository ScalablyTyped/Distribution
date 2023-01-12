package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDescriptionNewname extends StObject {
  
  var parameters: PathNameOwnerRepo
  
  var requestBody: ContentApplicationjsonDescriptionNewname
  
  var responses: `276`
}
object RequestBodyContentApplicationjsonDescriptionNewname {
  
  inline def apply(
    parameters: PathNameOwnerRepo,
    requestBody: ContentApplicationjsonDescriptionNewname,
    responses: `276`
  ): RequestBodyContentApplicationjsonDescriptionNewname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDescriptionNewname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDescriptionNewname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `276`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
