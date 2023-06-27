package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters275 extends StObject {
  
  var parameters: `275`
  
  var responses: `200Content188HeadersLink`
}
object Parameters275 {
  
  inline def apply(parameters: `275`, responses: `200Content188HeadersLink`): Parameters275 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters275]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters275] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `275`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content188HeadersLink`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
