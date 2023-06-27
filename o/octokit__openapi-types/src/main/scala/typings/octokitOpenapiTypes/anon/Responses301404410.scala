package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses301404410 extends StObject {
  
  var parameters: `328`
  
  var responses: `301404410`
}
object Responses301404410 {
  
  inline def apply(parameters: `328`, responses: `301404410`): Responses301404410 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses301404410]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses301404410] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `328`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `301404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
