package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202403404 extends StObject {
  
  var parameters: `55`
  
  var responses: `202403404`
}
object Responses202403404 {
  
  inline def apply(parameters: `55`, responses: `202403404`): Responses202403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202403404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `55`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
