package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201716 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: js.UndefOr[ContentApplicationjson327] = js.undefined
  
  var responses: `201716`
}
object Responses201716 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `201716`): Responses201716 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201716]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201716] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjson327): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201716`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
