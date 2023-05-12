package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content654HeadersLinkString extends StObject {
  
  var parameters: Query473
  
  var responses: `200Content654HeadersLinkString`
}
object Responses200Content654HeadersLinkString {
  
  inline def apply(parameters: Query473, responses: `200Content654HeadersLinkString`): Responses200Content654HeadersLinkString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content654HeadersLinkString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content654HeadersLinkString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content654HeadersLinkString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
