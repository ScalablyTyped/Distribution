package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202400403 extends StObject {
  
  var parameters: `540`
  
  var requestBody: js.UndefOr[Content243] = js.undefined
  
  var responses: `202400403`
}
object Responses202400403 {
  
  inline def apply(parameters: `540`, responses: `202400403`): Responses202400403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202400403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202400403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content243): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202400403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
