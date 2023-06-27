package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content415 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content415`
}
object Responses200Content415 {
  
  inline def apply(parameters: PathOwner, responses: `200Content415`): Responses200Content415 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content415]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content415] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content415`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
