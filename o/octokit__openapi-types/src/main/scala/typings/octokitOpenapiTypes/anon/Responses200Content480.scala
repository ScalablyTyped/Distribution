package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content480 extends StObject {
  
  var parameters: PathOrgStringQuery473
  
  var responses: `200Content480`
}
object Responses200Content480 {
  
  inline def apply(parameters: PathOrgStringQuery473, responses: `200Content480`): Responses200Content480 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content480]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content480] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content480`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
