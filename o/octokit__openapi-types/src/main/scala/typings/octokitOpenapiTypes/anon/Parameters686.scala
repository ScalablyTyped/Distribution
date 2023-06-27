package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters686 extends StObject {
  
  var parameters: `686`
  
  var responses: `200Content687`
}
object Parameters686 {
  
  inline def apply(parameters: `686`, responses: `200Content687`): Parameters686 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters686]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters686] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `686`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content687`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
