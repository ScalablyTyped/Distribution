package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content340 extends StObject {
  
  var parameters: QueryPer
  
  var responses: `200Content340`
}
object Responses200Content340 {
  
  inline def apply(parameters: QueryPer, responses: `200Content340`): Responses200Content340 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content340]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content340] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryPer): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content340`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
