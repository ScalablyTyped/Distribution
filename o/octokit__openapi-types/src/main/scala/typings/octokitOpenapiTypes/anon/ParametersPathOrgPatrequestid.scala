package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPatrequestid extends StObject {
  
  var parameters: PathOrgPatrequestid
  
  var requestBody: ContentApplicationjsonReason
  
  var responses: `204403`
}
object ParametersPathOrgPatrequestid {
  
  inline def apply(parameters: PathOrgPatrequestid, requestBody: ContentApplicationjsonReason, responses: `204403`): ParametersPathOrgPatrequestid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPatrequestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgPatrequestid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgPatrequestid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReason): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `204403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
