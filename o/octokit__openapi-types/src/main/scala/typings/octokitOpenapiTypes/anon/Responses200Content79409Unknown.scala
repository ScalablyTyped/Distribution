package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content79409Unknown extends StObject {
  
  var parameters: `135`
  
  var requestBody: Content80
  
  var responses: `200Content79409Unknown`
}
object Responses200Content79409Unknown {
  
  inline def apply(parameters: `135`, requestBody: Content80, responses: `200Content79409Unknown`): Responses200Content79409Unknown = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content79409Unknown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content79409Unknown] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content80): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content79409Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
