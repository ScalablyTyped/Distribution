package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content85401 extends StObject {
  
  var parameters: Path356
  
  var responses: `200Content85401`
}
object Responses200Content85401 {
  
  inline def apply(parameters: Path356, responses: `200Content85401`): Responses200Content85401 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content85401]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content85401] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path356): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content85401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
