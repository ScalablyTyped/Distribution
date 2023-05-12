package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200409 extends StObject {
  
  var parameters: `496`
  
  var requestBody: js.UndefOr[ContentApplicationjsonAdvancedsecurityenabledfornewrepositories] = js.undefined
  
  var responses: `200409`
}
object Responses200409 {
  
  inline def apply(parameters: `496`, responses: `200409`): Responses200409 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200409]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200409] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `496`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
