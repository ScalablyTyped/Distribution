package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonLogurl extends StObject {
  
  var parameters: PathDeploymentidOwner
  
  var requestBody: ContentApplicationjsonAutoinactive
  
  var responses: `201ContentApplicationjsonLogurl`
}
object Responses201ContentApplicationjsonLogurl {
  
  inline def apply(
    parameters: PathDeploymentidOwner,
    requestBody: ContentApplicationjsonAutoinactive,
    responses: `201ContentApplicationjsonLogurl`
  ): Responses201ContentApplicationjsonLogurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonLogurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonLogurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeploymentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutoinactive): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonLogurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
