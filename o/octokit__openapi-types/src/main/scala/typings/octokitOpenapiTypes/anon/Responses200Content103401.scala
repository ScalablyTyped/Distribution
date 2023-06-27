package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content103401 extends StObject {
  
  var parameters: Path453
  
  var responses: `200Content103401`
}
object Responses200Content103401 {
  
  inline def apply(parameters: Path453, responses: `200Content103401`): Responses200Content103401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content103401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content103401] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path453): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content103401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
