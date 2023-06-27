package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberNameOwner extends StObject {
  
  var parameters: PathIssuenumberNameOwner
  
  var responses: `200720`
}
object ParametersPathIssuenumberNameOwner {
  
  inline def apply(parameters: PathIssuenumberNameOwner, responses: `200720`): ParametersPathIssuenumberNameOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberNameOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathIssuenumberNameOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberNameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200720`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
