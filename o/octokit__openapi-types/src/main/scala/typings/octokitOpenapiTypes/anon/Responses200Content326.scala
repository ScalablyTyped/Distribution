package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content326 extends StObject {
  
  var parameters: PathOrgRoleid
  
  var requestBody: ContentApplicationjsonNamePermissions
  
  var responses: `200Content326`
}
object Responses200Content326 {
  
  inline def apply(
    parameters: PathOrgRoleid,
    requestBody: ContentApplicationjsonNamePermissions,
    responses: `200Content326`
  ): Responses200Content326 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content326]
  }
  
  extension [Self <: Responses200Content326](x: Self) {
    
    inline def setParameters(value: PathOrgRoleid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNamePermissions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content326`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
