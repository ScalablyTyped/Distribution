package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201326 extends StObject {
  
  var parameters: PathIssuenumber
  
  var requestBody: js.UndefOr[ContentApplicationjson327] = js.undefined
  
  var responses: `201326`
}
object Responses201326 {
  
  inline def apply(parameters: PathIssuenumber, responses: `201326`): Responses201326 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201326]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201326] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson327): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201326`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
