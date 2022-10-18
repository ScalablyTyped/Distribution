package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200575404Content6 extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var requestBody: ContentApplicationjsonPrerelease
  
  var responses: `200575404Content6`
}
object Responses200575404Content6 {
  
  inline def apply(
    parameters: PathOwnerReleaseid,
    requestBody: ContentApplicationjsonPrerelease,
    responses: `200575404Content6`
  ): Responses200575404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200575404Content6]
  }
  
  extension [Self <: Responses200575404Content6](x: Self) {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonPrerelease): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200575404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
