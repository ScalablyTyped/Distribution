package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerRepoRunneridResponses261 extends StObject {
  
  var parameters: PathOwnerRepoRunnerid
  
  var responses: `261`
}
object ParametersPathOwnerRepoRunneridResponses261 {
  
  inline def apply(parameters: PathOwnerRepoRunnerid, responses: `261`): ParametersPathOwnerRepoRunneridResponses261 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerRepoRunneridResponses261]
  }
  
  extension [Self <: ParametersPathOwnerRepoRunneridResponses261](x: Self) {
    
    inline def setParameters(value: PathOwnerRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `261`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
