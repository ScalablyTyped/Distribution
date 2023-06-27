package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304401 extends StObject {
  
  var parameters: `20`
  
  var responses: `304401`
}
object Responses304401 {
  
  inline def apply(parameters: `20`, responses: `304401`): Responses304401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses304401] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `20`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
