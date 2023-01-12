package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403422503 extends StObject {
  
  var parameters: PathCardidNumber
  
  var requestBody: ContentApplicationjsonColumnid
  
  var responses: `401403422503`
}
object Responses401403422503 {
  
  inline def apply(
    parameters: PathCardidNumber,
    requestBody: ContentApplicationjsonColumnid,
    responses: `401403422503`
  ): Responses401403422503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403422503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401403422503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCardidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonColumnid): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401403422503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
