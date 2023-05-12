package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201202400 extends StObject {
  
  var parameters: `540`
  
  var requestBody: Content207
  
  var responses: `201202400`
}
object Responses201202400 {
  
  inline def apply(parameters: `540`, requestBody: Content207, responses: `201202400`): Responses201202400 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201202400]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201202400] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content207): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201202400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
