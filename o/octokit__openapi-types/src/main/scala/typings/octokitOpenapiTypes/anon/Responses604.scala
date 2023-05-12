package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses604 extends StObject {
  
  var parameters: PathNameStringOwnerString
  
  var requestBody: js.UndefOr[ContentApplicationjsonDescriptionNewname] = js.undefined
  
  var responses: `604`
}
object Responses604 {
  
  inline def apply(parameters: PathNameStringOwnerString, responses: `604`): Responses604 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses604]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses604] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `604`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
