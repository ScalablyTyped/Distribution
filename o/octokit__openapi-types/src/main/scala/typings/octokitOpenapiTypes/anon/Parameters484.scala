package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters484 extends StObject {
  
  var parameters: `484`
  
  var responses: `200Content21`
}
object Parameters484 {
  
  inline def apply(parameters: `484`, responses: `200Content21`): Parameters484 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters484]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters484] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `484`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content21`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
