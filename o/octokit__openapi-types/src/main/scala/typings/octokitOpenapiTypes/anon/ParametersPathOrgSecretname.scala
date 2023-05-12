package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgSecretname extends StObject {
  
  var parameters: PathOrgSecretname
  
  var responses: `200ContentApplicationjsonCreatedatName`
}
object ParametersPathOrgSecretname {
  
  inline def apply(parameters: PathOrgSecretname, responses: `200ContentApplicationjsonCreatedatName`): ParametersPathOrgSecretname = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgSecretname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgSecretname] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgSecretname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCreatedatName`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
