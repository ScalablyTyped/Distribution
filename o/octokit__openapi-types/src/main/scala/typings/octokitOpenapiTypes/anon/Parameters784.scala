package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters784 extends StObject {
  
  var parameters: `784`
  
  var responses: `200Content592HeadersLinkString404Content41`
}
object Parameters784 {
  
  inline def apply(parameters: `784`, responses: `200Content592HeadersLinkString404Content41`): Parameters784 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters784]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters784] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `784`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content592HeadersLinkString404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
