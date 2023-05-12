package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304403503 extends StObject {
  
  var parameters: Query473
  
  var responses: `304403503`
}
object Responses304403503 {
  
  inline def apply(parameters: Query473, responses: `304403503`): Responses304403503 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304403503]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304403503] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Query473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304403503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
