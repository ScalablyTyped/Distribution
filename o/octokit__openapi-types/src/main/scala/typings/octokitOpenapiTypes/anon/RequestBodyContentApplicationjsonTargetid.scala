package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonTargetid extends StObject {
  
  var parameters: PathClientidString
  
  var requestBody: ContentApplicationjsonTargetid
  
  var responses: `200401403404422`
}
object RequestBodyContentApplicationjsonTargetid {
  
  inline def apply(
    parameters: PathClientidString,
    requestBody: ContentApplicationjsonTargetid,
    responses: `200401403404422`
  ): RequestBodyContentApplicationjsonTargetid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonTargetid]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonTargetid](x: Self) {
    
    inline def setParameters(value: PathClientidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonTargetid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
