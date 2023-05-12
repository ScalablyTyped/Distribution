package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201275 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: js.UndefOr[ContentApplicationjson276] = js.undefined
  
  var responses: `201275`
}
object Responses201275 {
  
  inline def apply(parameters: PathIssuenumber, responses: `201275`): Responses201275 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201275]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201275] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson276): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201275`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
