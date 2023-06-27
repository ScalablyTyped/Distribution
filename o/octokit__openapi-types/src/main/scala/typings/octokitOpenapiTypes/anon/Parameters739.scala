package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters739 extends StObject {
  
  var parameters: `739`
  
  var responses: `200Content740`
}
object Parameters739 {
  
  inline def apply(parameters: `739`, responses: `200Content740`): Parameters739 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters739]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters739] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `739`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content740`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
