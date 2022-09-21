package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathEnterpriseScimgroupid extends StObject {
  
  var parameters: PathEnterpriseScimgroupid
  
  var responses: `200ContentApplicationjsonMeta`
}
object ParametersPathEnterpriseScimgroupid {
  
  inline def apply(parameters: PathEnterpriseScimgroupid, responses: `200ContentApplicationjsonMeta`): ParametersPathEnterpriseScimgroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathEnterpriseScimgroupid]
  }
  
  extension [Self <: ParametersPathEnterpriseScimgroupid](x: Self) {
    
    inline def setParameters(value: PathEnterpriseScimgroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonMeta`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
