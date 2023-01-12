package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content440HeadersLink extends StObject {
  
  var parameters: Query430
  
  var responses: `200Content440HeadersLink`
}
object Responses200Content440HeadersLink {
  
  inline def apply(parameters: Query430, responses: `200Content440HeadersLink`): Responses200Content440HeadersLink = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content440HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content440HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query430): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content440HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
