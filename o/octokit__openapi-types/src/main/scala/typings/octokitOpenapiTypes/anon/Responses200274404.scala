package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200274404 extends StObject {
  
  var parameters: Path273
  
  var requestBody: Content21
  
  var responses: `200274404`
}
object Responses200274404 {
  
  inline def apply(parameters: Path273, requestBody: Content21, responses: `200274404`): Responses200274404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200274404]
  }
  
  extension [Self <: Responses200274404](x: Self) {
    
    inline def setParameters(value: Path273): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content21): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200274404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
