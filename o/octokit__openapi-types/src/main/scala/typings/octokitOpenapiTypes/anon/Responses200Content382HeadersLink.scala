package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content382HeadersLink extends StObject {
  
  var parameters: QueryPage
  
  var responses: `200Content382HeadersLink`
}
object Responses200Content382HeadersLink {
  
  inline def apply(parameters: QueryPage, responses: `200Content382HeadersLink`): Responses200Content382HeadersLink = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content382HeadersLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content382HeadersLink] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content382HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
