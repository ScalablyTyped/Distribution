package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content255 extends StObject {
  
  var parameters: PathEnterpriseRunnergroupid
  
  var requestBody: ContentApplicationjsonSelectedworkflows
  
  var responses: `200Content255`
}
object Responses200Content255 {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupid,
    requestBody: ContentApplicationjsonSelectedworkflows,
    responses: `200Content255`
  ): Responses200Content255 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content255]
  }
  
  extension [Self <: Responses200Content255](x: Self) {
    
    inline def setParameters(value: PathEnterpriseRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedworkflows): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content255`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
