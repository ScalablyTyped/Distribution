package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerReleaseid extends StObject {
  
  var parameters: PathOwnerReleaseid
  
  var responses: `200748404Content41`
}
object ParametersPathOwnerReleaseid {
  
  inline def apply(parameters: PathOwnerReleaseid, responses: `200748404Content41`): ParametersPathOwnerReleaseid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerReleaseid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOwnerReleaseid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOwnerReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200748404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
