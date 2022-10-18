package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQueryPage extends StObject {
  
  var parameters: PathOrgStringQueryPage
  
  var responses: `500`
}
object ParametersPathOrgStringQueryPage {
  
  inline def apply(parameters: PathOrgStringQueryPage, responses: `500`): ParametersPathOrgStringQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQueryPage]
  }
  
  extension [Self <: ParametersPathOrgStringQueryPage](x: Self) {
    
    inline def setParameters(value: PathOrgStringQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
