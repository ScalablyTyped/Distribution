package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters122 extends StObject {
  
  var parameters: `122`
  
  var responses: `123`
}
object Parameters122 {
  
  inline def apply(parameters: `122`, responses: `123`): Parameters122 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters122]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters122] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `122`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `123`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
