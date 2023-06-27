package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304401403404500 extends StObject {
  
  var parameters: Path453
  
  var responses: `304401403404500`
}
object Responses304401403404500 {
  
  inline def apply(parameters: Path453, responses: `304401403404500`): Responses304401403404500 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304401403404500]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304401403404500] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path453): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
