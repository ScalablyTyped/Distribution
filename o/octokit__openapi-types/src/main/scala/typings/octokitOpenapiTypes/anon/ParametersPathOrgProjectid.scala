package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgProjectid extends StObject {
  
  var parameters: PathOrgProjectid
  
  var responses: `200ContentApplicationjsonBodyColumnsurl`
}
object ParametersPathOrgProjectid {
  
  inline def apply(parameters: PathOrgProjectid, responses: `200ContentApplicationjsonBodyColumnsurl`): ParametersPathOrgProjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgProjectid]
  }
  
  extension [Self <: ParametersPathOrgProjectid](x: Self) {
    
    inline def setParameters(value: PathOrgProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBodyColumnsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
