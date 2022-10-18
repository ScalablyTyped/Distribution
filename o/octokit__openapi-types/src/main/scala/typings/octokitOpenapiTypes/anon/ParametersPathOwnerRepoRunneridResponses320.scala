package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunneridResponses320 extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
  
  var responses: `320`
}
object ParametersPathOwnerRepoRunneridResponses320 {
  
  inline def apply(parameters: PathOwnerRepoRunnerid, responses: `320`): ParametersPathOwnerRepoRunneridResponses320 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunneridResponses320]
  }
  
  extension [Self <: ParametersPathOwnerRepoRunneridResponses320](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `320`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
