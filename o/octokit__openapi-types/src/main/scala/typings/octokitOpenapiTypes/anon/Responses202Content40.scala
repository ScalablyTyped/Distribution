package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202Content40 extends StObject {
  
  var parameters: `475`
  
  var responses: `202Content40`
}
object Responses202Content40 {
  
  inline def apply(parameters: `475`, responses: `202Content40`): Responses202Content40 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202Content40]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202Content40] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `475`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202Content40`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
