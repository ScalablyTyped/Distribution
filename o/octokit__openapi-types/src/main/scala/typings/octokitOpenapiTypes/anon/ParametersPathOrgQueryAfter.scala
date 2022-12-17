package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgQueryAfter extends StObject {
  
  var parameters: PathOrgQueryAfter
  
  var responses: `503`
}
object ParametersPathOrgQueryAfter {
  
  inline def apply(parameters: PathOrgQueryAfter, responses: `503`): ParametersPathOrgQueryAfter = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgQueryAfter]
  }
  
  extension [Self <: ParametersPathOrgQueryAfter](x: Self) {
    
    inline def setParameters(value: PathOrgQueryAfter): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `503`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
