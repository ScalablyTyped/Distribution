package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters328 extends StObject {
  
  var parameters: `328`
  
  var responses: `200410`
}
object Parameters328 {
  
  inline def apply(parameters: `328`, responses: `200410`): Parameters328 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters328]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters328] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `328`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
