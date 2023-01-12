package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters416 extends StObject {
  
  var parameters: `416`
  
  var responses: `403503`
}
object Parameters416 {
  
  inline def apply(parameters: `416`, responses: `403503`): Parameters416 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters416]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters416] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `416`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
