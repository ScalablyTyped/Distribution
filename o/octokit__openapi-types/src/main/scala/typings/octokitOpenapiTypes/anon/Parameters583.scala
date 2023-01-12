package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters583 extends StObject {
  
  var parameters: `583`
  
  var responses: `200Content425304Unknown`
}
object Parameters583 {
  
  inline def apply(parameters: `583`, responses: `200Content425304Unknown`): Parameters583 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters583]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters583] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `583`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content425304Unknown`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
