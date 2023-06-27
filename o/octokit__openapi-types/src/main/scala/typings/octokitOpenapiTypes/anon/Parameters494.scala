package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters494 extends StObject {
  
  var parameters: `494`
  
  var responses: `200Content495`
}
object Parameters494 {
  
  inline def apply(parameters: `494`, responses: `200Content495`): Parameters494 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters494]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters494] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `494`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content495`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
