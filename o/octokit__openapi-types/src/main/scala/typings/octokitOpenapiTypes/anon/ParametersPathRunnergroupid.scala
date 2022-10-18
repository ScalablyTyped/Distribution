package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunnergroupid extends StObject {
  
  var parameters: PathRunnergroupid
  
  var responses: `200ContentApplicationjsonAllowspublicrepositories`
}
object ParametersPathRunnergroupid {
  
  inline def apply(parameters: PathRunnergroupid, responses: `200ContentApplicationjsonAllowspublicrepositories`): ParametersPathRunnergroupid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunnergroupid]
  }
  
  extension [Self <: ParametersPathRunnergroupid](x: Self) {
    
    inline def setParameters(value: PathRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonAllowspublicrepositories`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
