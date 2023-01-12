package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrganizationid extends StObject {
  
  var parameters: PathOrganizationid
  
  var responses: `200ContentApplicationjsonCustomroles`
}
object ParametersPathOrganizationid {
  
  inline def apply(parameters: PathOrganizationid, responses: `200ContentApplicationjsonCustomroles`): ParametersPathOrganizationid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrganizationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrganizationid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrganizationid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCustomroles`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
