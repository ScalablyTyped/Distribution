package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwnerRepoQuery250 extends StObject {
  
  var parameters: PathCommitshaOwnerRepoQuery250
  
  var responses: `200Content466`
}
object ParametersPathCommitshaOwnerRepoQuery250 {
  
  inline def apply(parameters: PathCommitshaOwnerRepoQuery250, responses: `200Content466`): ParametersPathCommitshaOwnerRepoQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwnerRepoQuery250]
  }
  
  extension [Self <: ParametersPathCommitshaOwnerRepoQuery250](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerRepoQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content466`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
