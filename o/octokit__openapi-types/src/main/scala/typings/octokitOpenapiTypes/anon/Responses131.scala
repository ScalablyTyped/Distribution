package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses131 extends StObject {
  
  var parameters: PathProjectidUsername
  
  var responses: `131`
}
object Responses131 {
  
  inline def apply(parameters: PathProjectidUsername, responses: `131`): Responses131 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses131]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses131] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectidUsername): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `131`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
