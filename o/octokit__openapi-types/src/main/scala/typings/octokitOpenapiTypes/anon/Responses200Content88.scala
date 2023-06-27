package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content88 extends StObject {
  
  var parameters: PathSecretname
  
  var responses: `200Content88`
}
object Responses200Content88 {
  
  inline def apply(parameters: PathSecretname, responses: `200Content88`): Responses200Content88 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content88]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content88] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content88`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
