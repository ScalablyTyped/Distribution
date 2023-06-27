package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters321 extends StObject {
  
  var parameters: `321`
  
  var responses: `200Content322`
}
object Parameters321 {
  
  inline def apply(parameters: `321`, responses: `200Content322`): Parameters321 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters321]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters321] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `321`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content322`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
