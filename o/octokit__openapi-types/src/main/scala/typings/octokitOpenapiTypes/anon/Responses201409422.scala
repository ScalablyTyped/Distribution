package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201409422 extends StObject {
  
  var parameters: `540`
  
  var requestBody: Content306
  
  var responses: `201409422`
}
object Responses201409422 {
  
  inline def apply(parameters: `540`, requestBody: Content306, responses: `201409422`): Responses201409422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201409422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201409422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content306): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
