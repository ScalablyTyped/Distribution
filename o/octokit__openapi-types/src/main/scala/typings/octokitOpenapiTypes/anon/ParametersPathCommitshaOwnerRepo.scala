package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwnerRepo extends StObject {
  
  var parameters: PathCommitshaOwnerRepo
  
  var responses: `200Content469`
}
object ParametersPathCommitshaOwnerRepo {
  
  inline def apply(parameters: PathCommitshaOwnerRepo, responses: `200Content469`): ParametersPathCommitshaOwnerRepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwnerRepo]
  }
  
  extension [Self <: ParametersPathCommitshaOwnerRepo](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content469`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
