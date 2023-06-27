package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses344 extends StObject {
  
  var parameters: PathNameString
  
  var requestBody: js.UndefOr[ContentApplicationjsonDescriptionNewname] = js.undefined
  
  var responses: `344`
}
object Responses344 {
  
  inline def apply(parameters: PathNameString, responses: `344`): Responses344 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses344]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses344] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionNewname): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `344`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
