package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQueryAfterBefore extends StObject {
  
  var parameters: PathOwnerStringQueryAfterBefore
  
  var responses: `200Content556`
}
object ParametersPathOwnerStringQueryAfterBefore {
  
  inline def apply(parameters: PathOwnerStringQueryAfterBefore, responses: `200Content556`): ParametersPathOwnerStringQueryAfterBefore = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQueryAfterBefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQueryAfterBefore] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQueryAfterBefore): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content556`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
