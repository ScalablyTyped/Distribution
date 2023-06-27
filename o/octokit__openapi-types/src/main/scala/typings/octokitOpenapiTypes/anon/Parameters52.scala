package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters52 extends StObject {
  
  var parameters: `52`
  
  var responses: `200Content53`
}
object Parameters52 {
  
  inline def apply(parameters: `52`, responses: `200Content53`): Parameters52 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters52]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters52] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `52`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content53`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
