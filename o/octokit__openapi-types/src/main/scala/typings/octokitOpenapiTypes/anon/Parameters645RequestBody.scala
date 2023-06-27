package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters645RequestBody extends StObject {
  
  var parameters: `645`
  
  var requestBody: js.UndefOr[Content174] = js.undefined
  
  var responses: `590`
}
object Parameters645RequestBody {
  
  inline def apply(parameters: `645`, responses: `590`): Parameters645RequestBody = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters645RequestBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters645RequestBody] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `645`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content174): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `590`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
