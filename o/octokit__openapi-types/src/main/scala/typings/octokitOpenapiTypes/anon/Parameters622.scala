package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters622 extends StObject {
  
  var parameters: `622`
  
  var responses: `200Content560`
}
object Parameters622 {
  
  inline def apply(parameters: `622`, responses: `200Content560`): Parameters622 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters622]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters622] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `622`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content560`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
