package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses123 extends StObject {
  
  var parameters: `142`
  
  var responses: `123`
}
object Responses123 {
  
  inline def apply(parameters: `142`, responses: `123`): Responses123 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses123]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses123] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `142`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `123`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
