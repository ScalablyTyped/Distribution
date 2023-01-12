package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathAlertnumberOwner extends StObject {
  
  var parameters: PathAlertnumberOwner
  
  var responses: `200Content213`
}
object ParametersPathAlertnumberOwner {
  
  inline def apply(parameters: PathAlertnumberOwner, responses: `200Content213`): ParametersPathAlertnumberOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathAlertnumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathAlertnumberOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAlertnumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content213`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
