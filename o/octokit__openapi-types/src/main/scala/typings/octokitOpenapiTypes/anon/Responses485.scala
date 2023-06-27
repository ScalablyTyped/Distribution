package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses485 extends StObject {
  
  var parameters: Path444Query
  
  var responses: `485`
}
object Responses485 {
  
  inline def apply(parameters: Path444Query, responses: `485`): Responses485 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses485]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses485] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `485`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
