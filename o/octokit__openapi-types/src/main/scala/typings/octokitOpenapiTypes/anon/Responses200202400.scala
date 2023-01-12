package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200202400 extends StObject {
  
  var parameters: `472`
  
  var responses: `200202400`
}
object Responses200202400 {
  
  inline def apply(parameters: `472`, responses: `200202400`): Responses200202400 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200202400]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200202400] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200202400`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
