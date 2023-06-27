package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters605 extends StObject {
  
  var parameters: `605`
  
  var responses: `200Content592HeadersLinkString`
}
object Parameters605 {
  
  inline def apply(parameters: `605`, responses: `200Content592HeadersLinkString`): Parameters605 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters605]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters605] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `605`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content592HeadersLinkString`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
