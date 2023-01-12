package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonMaintainercanmodify extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonMaintainercanmodify
  
  var responses: `200298`
}
object RequestBodyContentApplicationjsonMaintainercanmodify {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonMaintainercanmodify,
    responses: `200298`
  ): RequestBodyContentApplicationjsonMaintainercanmodify = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonMaintainercanmodify]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonMaintainercanmodify] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMaintainercanmodify): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200298`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
