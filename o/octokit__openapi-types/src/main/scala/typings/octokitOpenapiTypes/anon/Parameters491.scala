package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters491 extends StObject {
  
  var parameters: `491`
  
  var responses: `123`
}
object Parameters491 {
  
  inline def apply(parameters: `491`, responses: `123`): Parameters491 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters491]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters491] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `491`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `123`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
