package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgQueryPage extends StObject {
  
  var parameters: PathOrgQueryPage
  
  var responses: `500`
}
object ParametersPathOrgQueryPage {
  
  inline def apply(parameters: PathOrgQueryPage, responses: `500`): ParametersPathOrgQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgQueryPage]
  }
  
  extension [Self <: ParametersPathOrgQueryPage](x: Self) {
    
    inline def setParameters(value: PathOrgQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
