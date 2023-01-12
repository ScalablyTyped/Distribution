package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonRunnersArray extends StObject {
  
  var parameters: PathOrgRunnergroupid
  
  var requestBody: ContentApplicationjsonRunnersArray
}
object ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonRunnersArray {
  
  inline def apply(parameters: PathOrgRunnergroupid, requestBody: ContentApplicationjsonRunnersArray): ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonRunnersArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonRunnersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgRunnergroupidRequestBodyContentApplicationjsonRunnersArray] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRunnersArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
  }
}
