package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters819 extends StObject {
  
  var parameters: `819`
  
  var responses: `200Content820`
}
object Parameters819 {
  
  inline def apply(parameters: `819`, responses: `200Content820`): Parameters819 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters819]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters819] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `819`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content820`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
