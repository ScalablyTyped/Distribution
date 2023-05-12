package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseidQuery473 extends StObject {
  
  var parameters: PathOwnerReleaseidQuery473
  
  var responses: `200Content622`
}
object ParametersPathOwnerReleaseidQuery473 {
  
  inline def apply(parameters: PathOwnerReleaseidQuery473, responses: `200Content622`): ParametersPathOwnerReleaseidQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseidQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReleaseidQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseidQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content622`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
