package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200388 extends StObject {
  
  var parameters: `165`
  
  var responses: `200388`
}
object Responses200388 {
  
  inline def apply(parameters: `165`, responses: `200388`): Responses200388 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200388]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200388] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `165`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200388`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
