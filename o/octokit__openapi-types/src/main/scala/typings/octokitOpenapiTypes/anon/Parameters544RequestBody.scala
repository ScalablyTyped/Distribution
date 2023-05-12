package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters544RequestBody extends StObject {
  
  var parameters: `544`
  
  var requestBody: js.UndefOr[Content149] = js.undefined
  
  var responses: `506`
}
object Parameters544RequestBody {
  
  inline def apply(parameters: `544`, responses: `506`): Parameters544RequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters544RequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters544RequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `544`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content149): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `506`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
