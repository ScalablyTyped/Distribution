package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters754 extends StObject {
  
  var parameters: `754`
  
  /** @description Request body */
  var requestBody: js.UndefOr[ContentApplicationjsonBypassmodeConditions] = js.undefined
  
  var responses: `200ContentApplicationjsonRules`
}
object Parameters754 {
  
  inline def apply(parameters: `754`, responses: `200ContentApplicationjsonRules`): Parameters754 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters754]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters754] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `754`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBypassmodeConditions): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `200ContentApplicationjsonRules`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
