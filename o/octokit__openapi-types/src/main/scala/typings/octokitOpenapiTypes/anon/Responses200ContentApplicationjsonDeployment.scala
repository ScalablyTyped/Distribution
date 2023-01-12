package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDeployment extends StObject {
  
  var parameters: PathCheckrunidOwner
  
  var requestBody: Content173
  
  var responses: `200ContentApplicationjsonDeployment`
}
object Responses200ContentApplicationjsonDeployment {
  
  inline def apply(
    parameters: PathCheckrunidOwner,
    requestBody: Content173,
    responses: `200ContentApplicationjsonDeployment`
  ): Responses200ContentApplicationjsonDeployment = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDeployment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonDeployment] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content173): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDeployment`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
