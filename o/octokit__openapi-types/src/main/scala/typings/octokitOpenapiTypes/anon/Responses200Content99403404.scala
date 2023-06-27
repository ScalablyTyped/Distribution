package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content99403404 extends StObject {
  
  var parameters: `439`
  
  var responses: `200Content99403404`
}
object Responses200Content99403404 {
  
  inline def apply(parameters: `439`, responses: `200Content99403404`): Responses200Content99403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content99403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content99403404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `439`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content99403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
