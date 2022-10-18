package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwner extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var responses: `200Content112`
}
object ParametersPathCommitshaOwner {
  
  inline def apply(parameters: PathCommitshaOwner, responses: `200Content112`): ParametersPathCommitshaOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwner]
  }
  
  extension [Self <: ParametersPathCommitshaOwner](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content112`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
