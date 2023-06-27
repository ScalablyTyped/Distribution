package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses493 extends StObject {
  
  var parameters: Path444Query
  
  var responses: `493`
}
object Responses493 {
  
  inline def apply(parameters: Path444Query, responses: `493`): Responses493 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses493]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses493] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path444Query): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `493`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
