package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200202404 extends StObject {
  
  var parameters: `141`
  
  var responses: `200202404`
}
object Responses200202404 {
  
  inline def apply(parameters: `141`, responses: `200202404`): Responses200202404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200202404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200202404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `141`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200202404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
