package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerStringQuery524 extends StObject {
  
  var parameters: PathOwnerStringQuery524
  
  var responses: `200401403404410`
}
object ParametersPathOwnerStringQuery524 {
  
  inline def apply(parameters: PathOwnerStringQuery524, responses: `200401403404410`): ParametersPathOwnerStringQuery524 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerStringQuery524]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerStringQuery524] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerStringQuery524): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404410`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
