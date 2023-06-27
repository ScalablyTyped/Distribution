package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters630 extends StObject {
  
  var parameters: `630`
  
  var responses: `631`
}
object Parameters630 {
  
  inline def apply(parameters: `630`, responses: `631`): Parameters630 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters630]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters630] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `630`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `631`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
