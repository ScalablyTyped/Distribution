package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPatrequestid extends StObject {
  
  var parameters: PathPatrequestid
  
  var requestBody: ContentApplicationjsonReason
  
  var responses: `204`
}
object ParametersPathPatrequestid {
  
  inline def apply(parameters: PathPatrequestid, requestBody: ContentApplicationjsonReason, responses: `204`): ParametersPathPatrequestid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPatrequestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPatrequestid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPatrequestid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReason): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `204`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
