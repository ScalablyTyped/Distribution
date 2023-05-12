package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathUsernameStringQuery473 extends StObject {
  
  var parameters: PathUsernameStringQuery473
  
  var responses: `200304401403404500`
}
object ParametersPathUsernameStringQuery473 {
  
  inline def apply(parameters: PathUsernameStringQuery473, responses: `200304401403404500`): ParametersPathUsernameStringQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathUsernameStringQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathUsernameStringQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathUsernameStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
