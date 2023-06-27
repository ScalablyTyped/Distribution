package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses308 extends StObject {
  
  var parameters: `165`
  
  var responses: `308`
}
object Responses308 {
  
  inline def apply(parameters: `165`, responses: `308`): Responses308 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses308]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses308] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `308`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
