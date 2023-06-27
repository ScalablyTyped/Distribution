package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content457HeadersLink extends StObject {
  
  var parameters: `4`
  
  var responses: `200Content457HeadersLink`
}
object Responses200Content457HeadersLink {
  
  inline def apply(parameters: `4`, responses: `200Content457HeadersLink`): Responses200Content457HeadersLink = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content457HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content457HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `4`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content457HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
