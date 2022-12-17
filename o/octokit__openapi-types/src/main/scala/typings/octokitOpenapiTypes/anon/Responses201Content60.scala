package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content60 extends StObject {
  
  var parameters: `147`
  
  var requestBody: Content143
  
  var responses: `201Content60`
}
object Responses201Content60 {
  
  inline def apply(parameters: `147`, requestBody: Content143, responses: `201Content60`): Responses201Content60 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content60]
  }
  
  extension [Self <: Responses201Content60](x: Self) {
    
    inline def setParameters(value: `147`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content143): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content60`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
