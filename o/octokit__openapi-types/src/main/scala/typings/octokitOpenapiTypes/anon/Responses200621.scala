package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200621 extends StObject {
  
  var parameters: `540`
  
  var responses: `200621`
}
object Responses200621 {
  
  inline def apply(parameters: `540`, responses: `200621`): Responses200621 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200621]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200621] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200621`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
