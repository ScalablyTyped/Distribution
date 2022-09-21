package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgRunneridResponses24 extends StObject {
  
  var parameters: PathOrgRunnerid
  
  var responses: `24`
}
object ParametersPathOrgRunneridResponses24 {
  
  inline def apply(parameters: PathOrgRunnerid, responses: `24`): ParametersPathOrgRunneridResponses24 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgRunneridResponses24]
  }
  
  extension [Self <: ParametersPathOrgRunneridResponses24](x: Self) {
    
    inline def setParameters(value: PathOrgRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `24`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
