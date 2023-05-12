package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content368404 extends StObject {
  
  var parameters: Path370
  
  var responses: `200Content368404`
}
object Responses200Content368404 {
  
  inline def apply(parameters: Path370, responses: `200Content368404`): Responses200Content368404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content368404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content368404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path370): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content368404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
