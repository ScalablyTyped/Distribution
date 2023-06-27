package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters692 extends StObject {
  
  var parameters: `692`
  
  var responses: `200Content653HeadersLinkString`
}
object Parameters692 {
  
  inline def apply(parameters: `692`, responses: `200Content653HeadersLinkString`): Parameters692 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters692]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters692] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `692`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content653HeadersLinkString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
