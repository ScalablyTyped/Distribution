package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters665 extends StObject {
  
  var parameters: `665`
  
  var responses: `200304403404503`
}
object Parameters665 {
  
  inline def apply(parameters: `665`, responses: `200304403404503`): Parameters665 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters665]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters665] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `665`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304403404503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
