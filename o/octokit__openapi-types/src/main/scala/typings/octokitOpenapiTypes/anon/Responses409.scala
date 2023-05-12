package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses409 extends StObject {
  
  var parameters: `47`
  
  var requestBody: js.UndefOr[ContentApplicationjsonAdvancedsecurityenabledfornewrepositories] = js.undefined
  
  var responses: `409`
}
object Responses409 {
  
  inline def apply(parameters: `47`, responses: `409`): Responses409 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses409]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses409] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
