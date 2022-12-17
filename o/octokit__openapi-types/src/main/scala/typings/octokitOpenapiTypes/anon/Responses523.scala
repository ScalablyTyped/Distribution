package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses523 extends StObject {
  
  var parameters: `472`
  
  var requestBody: Content247
  
  var responses: `523`
}
object Responses523 {
  
  inline def apply(parameters: `472`, requestBody: Content247, responses: `523`): Responses523 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses523]
  }
  
  extension [Self <: Responses523](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content247): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `523`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
