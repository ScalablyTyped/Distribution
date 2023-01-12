package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgOwner extends StObject {
  
  var parameters: PathOrgOwner
  
  var responses: `200ContentApplicationjsonContributorsurl`
}
object ParametersPathOrgOwner {
  
  inline def apply(parameters: PathOrgOwner, responses: `200ContentApplicationjsonContributorsurl`): ParametersPathOrgOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonContributorsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
