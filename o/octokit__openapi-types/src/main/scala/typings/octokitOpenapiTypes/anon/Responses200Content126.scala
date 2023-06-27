package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content126 extends StObject {
  
  var parameters: PathRulesetid
  
  /** @description Request body */
  var requestBody: js.UndefOr[ContentApplicationjsonConditions] = js.undefined
  
  var responses: `200Content126`
}
object Responses200Content126 {
  
  inline def apply(parameters: PathRulesetid, responses: `200Content126`): Responses200Content126 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content126]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content126] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRulesetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonConditions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200Content126`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
