package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses409Content48 extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories
  
  var responses: `409Content48`
}
object Responses409Content48 {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories,
    responses: `409Content48`
  ): Responses409Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses409Content48]
  }
  
  extension [Self <: Responses409Content48](x: Self) {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
