package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content62 extends StObject {
  
  var parameters: `47`
  
  var responses: `201Content62`
}
object Responses201Content62 {
  
  inline def apply(parameters: `47`, responses: `201Content62`): Responses201Content62 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content62]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content62] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `47`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content62`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
