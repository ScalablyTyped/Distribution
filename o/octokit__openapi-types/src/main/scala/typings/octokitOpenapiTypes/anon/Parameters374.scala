package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters374 extends StObject {
  
  var parameters: `374`
  
  var responses: `200Content95`
}
object Parameters374 {
  
  inline def apply(parameters: `374`, responses: `200Content95`): Parameters374 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters374]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters374] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `374`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content95`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
