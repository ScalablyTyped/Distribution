package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200204 extends StObject {
  
  var parameters: `165`
  
  var responses: `200204`
}
object Responses200204 {
  
  inline def apply(parameters: `165`, responses: `200204`): Responses200204 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200204]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200204] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200204`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
