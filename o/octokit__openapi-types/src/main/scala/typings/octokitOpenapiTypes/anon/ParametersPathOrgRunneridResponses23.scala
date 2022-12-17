package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunneridResponses23 extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `23`
}
object ParametersPathOrgRunneridResponses23 {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `23`): ParametersPathOrgRunneridResponses23 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunneridResponses23]
  }
  
  extension [Self <: ParametersPathOrgRunneridResponses23](x: Self) {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `23`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
