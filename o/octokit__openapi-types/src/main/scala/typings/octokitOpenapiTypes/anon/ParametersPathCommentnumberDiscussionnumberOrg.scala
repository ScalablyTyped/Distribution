package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommentnumberDiscussionnumberOrg extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberOrg
  
  var responses: `200ContentApplicationjsonLasteditedat`
}
object ParametersPathCommentnumberDiscussionnumberOrg {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberOrg,
    responses: `200ContentApplicationjsonLasteditedat`
  ): ParametersPathCommentnumberDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommentnumberDiscussionnumberOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommentnumberDiscussionnumberOrg] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLasteditedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
