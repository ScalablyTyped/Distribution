package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonComments extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: ContentApplicationjsonComments
  
  var responses: `200Content310`
}
object RequestBodyContentApplicationjsonComments {
  
  inline def apply(
    parameters: PathPullnumber,
    requestBody: ContentApplicationjsonComments,
    responses: `200Content310`
  ): RequestBodyContentApplicationjsonComments = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonComments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonComments] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonComments): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content310`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
