package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnergroupid extends StObject {
  
  var parameters: PathOrgRunnergroupid
  
  var responses: `200ContentApplicationjsonDefault`
}
object ParametersPathOrgRunnergroupid {
  
  inline def apply(parameters: PathOrgRunnergroupid, responses: `200ContentApplicationjsonDefault`): ParametersPathOrgRunnergroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnergroupid]
  }
  
  extension [Self <: ParametersPathOrgRunnergroupid](x: Self) {
    
    inline def setParameters(value: PathOrgRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDefault`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
