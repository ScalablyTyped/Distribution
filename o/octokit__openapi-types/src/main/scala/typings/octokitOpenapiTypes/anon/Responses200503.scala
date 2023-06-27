package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200503 extends StObject {
  
  var parameters: `165`
  
  var requestBody: js.UndefOr[Content309] = js.undefined
  
  var responses: `200503`
}
object Responses200503 {
  
  inline def apply(parameters: `165`, responses: `200503`): Responses200503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content309): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
