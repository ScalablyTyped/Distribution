package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401402 extends StObject {
  
  var parameters: Path453
  
  var responses: `401402`
}
object Responses401402 {
  
  inline def apply(parameters: Path453, responses: `401402`): Responses401402 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401402]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401402] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path453): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401402`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
