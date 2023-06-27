package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses726 extends StObject {
  
  var parameters: PathNameStringOwnerString
  
  var requestBody: js.UndefOr[ContentApplicationjsonDescriptionNewname] = js.undefined
  
  var responses: `726`
}
object Responses726 {
  
  inline def apply(parameters: PathNameStringOwnerString, responses: `726`): Responses726 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses726]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses726] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameStringOwnerString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `726`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
