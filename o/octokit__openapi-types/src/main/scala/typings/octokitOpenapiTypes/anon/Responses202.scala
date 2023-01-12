package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202 extends StObject {
  
  var parameters: PathDeliveryid
  
  var responses: `202`
}
object Responses202 {
  
  inline def apply(parameters: PathDeliveryid, responses: `202`): Responses202 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDeliveryid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
