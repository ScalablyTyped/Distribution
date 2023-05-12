package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content35 extends StObject {
  
  var parameters: PathAccountid
  
  var responses: `200Content35`
}
object Responses200Content35 {
  
  inline def apply(parameters: PathAccountid, responses: `200Content35`): Responses200Content35 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content35]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content35] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAccountid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content35`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
