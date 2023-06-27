package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters483 extends StObject {
  
  var parameters: `483`
  
  var responses: `200Content80Headers28`
}
object Parameters483 {
  
  inline def apply(parameters: `483`, responses: `200Content80Headers28`): Parameters483 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters483]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters483] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `483`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content80Headers28`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
