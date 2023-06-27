package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content792HeadersLinkString extends StObject {
  
  var parameters: `553`
  
  var responses: `200Content792HeadersLinkString`
}
object Responses200Content792HeadersLinkString {
  
  inline def apply(parameters: `553`, responses: `200Content792HeadersLinkString`): Responses200Content792HeadersLinkString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content792HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content792HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `553`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content792HeadersLinkString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
