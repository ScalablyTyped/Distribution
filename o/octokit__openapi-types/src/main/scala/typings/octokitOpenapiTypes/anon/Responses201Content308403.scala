package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content308403 extends StObject {
  
  var parameters: PathJobidOwner
  
  var requestBody: Content79
  
  var responses: `201Content308403`
}
object Responses201Content308403 {
  
  inline def apply(parameters: PathJobidOwner, requestBody: Content79, responses: `201Content308403`): Responses201Content308403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content308403]
  }
  
  extension [Self <: Responses201Content308403](x: Self) {
    
    inline def setParameters(value: PathJobidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content79): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content308403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
