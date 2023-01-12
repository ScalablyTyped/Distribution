package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathHeadOwner extends StObject {
  
  var parameters: PathHeadOwner
  
  var responses: `200ContentApplicationjsonBasecommit`
}
object ParametersPathHeadOwner {
  
  inline def apply(parameters: PathHeadOwner, responses: `200ContentApplicationjsonBasecommit`): ParametersPathHeadOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathHeadOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathHeadOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathHeadOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBasecommit`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
