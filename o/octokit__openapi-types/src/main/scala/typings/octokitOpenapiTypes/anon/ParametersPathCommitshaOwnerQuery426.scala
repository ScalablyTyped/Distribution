package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwnerQuery426 extends StObject {
  
  var parameters: PathCommitshaOwnerQuery426
  
  var responses: `200Content520`
}
object ParametersPathCommitshaOwnerQuery426 {
  
  inline def apply(parameters: PathCommitshaOwnerQuery426, responses: `200Content520`): ParametersPathCommitshaOwnerQuery426 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwnerQuery426]
  }
  
  extension [Self <: ParametersPathCommitshaOwnerQuery426](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerQuery426): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content520`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
