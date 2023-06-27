package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200716 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: ContentApplicationjsonAssigneesArray
  
  var responses: `200716`
}
object Responses200716 {
  
  inline def apply(
    parameters: PathIssuenumberOwnerRepo,
    requestBody: ContentApplicationjsonAssigneesArray,
    responses: `200716`
  ): Responses200716 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200716]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200716] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAssigneesArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200716`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
