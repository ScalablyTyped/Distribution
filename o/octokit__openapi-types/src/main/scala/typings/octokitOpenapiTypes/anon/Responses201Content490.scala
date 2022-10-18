package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content490 extends StObject {
  
  var parameters: PathDeploymentidOwner
  
  var requestBody: ContentApplicationjsonAutoinactive
  
  var responses: `201Content490`
}
object Responses201Content490 {
  
  inline def apply(
    parameters: PathDeploymentidOwner,
    requestBody: ContentApplicationjsonAutoinactive,
    responses: `201Content490`
  ): Responses201Content490 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content490]
  }
  
  extension [Self <: Responses201Content490](x: Self) {
    
    inline def setParameters(value: PathDeploymentidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutoinactive): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content490`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
