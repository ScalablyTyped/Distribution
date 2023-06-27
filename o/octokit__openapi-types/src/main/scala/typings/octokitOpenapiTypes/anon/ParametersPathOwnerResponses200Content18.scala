package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerResponses200Content18 extends StObject {
  
  var parameters: PathOwner
  
  var responses: `200Content18`
}
object ParametersPathOwnerResponses200Content18 {
  
  inline def apply(parameters: PathOwner, responses: `200Content18`): ParametersPathOwnerResponses200Content18 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerResponses200Content18]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerResponses200Content18] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content18`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
