package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunnergroupidQueryPage extends StObject {
  
  var parameters: PathOrgRunnergroupidQueryPage
  
  var responses: `200ContentApplicationjsonRunners`
}
object ParametersPathOrgRunnergroupidQueryPage {
  
  inline def apply(parameters: PathOrgRunnergroupidQueryPage, responses: `200ContentApplicationjsonRunners`): ParametersPathOrgRunnergroupidQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunnergroupidQueryPage]
  }
  
  extension [Self <: ParametersPathOrgRunnergroupidQueryPage](x: Self) {
    
    inline def setParameters(value: PathOrgRunnergroupidQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonRunners`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
