package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgStringQuery407 extends StObject {
  
  var parameters: PathOrgStringQuery407
  
  var responses: `304401403404500`
}
object ParametersPathOrgStringQuery407 {
  
  inline def apply(parameters: PathOrgStringQuery407, responses: `304401403404500`): ParametersPathOrgStringQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgStringQuery407]
  }
  
  extension [Self <: ParametersPathOrgStringQuery407](x: Self) {
    
    inline def setParameters(value: PathOrgStringQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304401403404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
