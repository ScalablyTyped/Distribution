package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitshaOwnerQuery407 extends StObject {
  
  var parameters: PathCommitshaOwnerQuery407
  
  var responses: `200Content498`
}
object ParametersPathCommitshaOwnerQuery407 {
  
  inline def apply(parameters: PathCommitshaOwnerQuery407, responses: `200Content498`): ParametersPathCommitshaOwnerQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitshaOwnerQuery407]
  }
  
  extension [Self <: ParametersPathCommitshaOwnerQuery407](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwnerQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content498`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
