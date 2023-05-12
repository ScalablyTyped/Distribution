package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content45HeadersLink extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200Content45HeadersLink`
}
object Responses200Content45HeadersLink {
  
  inline def apply(parameters: QueryPage, responses: `200Content45HeadersLink`): Responses200Content45HeadersLink = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content45HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content45HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content45HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
