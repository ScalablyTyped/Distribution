package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses152 extends StObject {
  
  var parameters: `142`
  
  var responses: `152`
}
object Responses152 {
  
  inline def apply(parameters: `142`, responses: `152`): Responses152 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses152]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses152] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `142`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `152`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
