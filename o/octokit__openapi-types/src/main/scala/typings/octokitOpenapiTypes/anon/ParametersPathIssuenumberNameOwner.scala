package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathIssuenumberNameOwner extends StObject {
  
  var parameters: PathIssuenumberNameOwner
  
  var responses: `200552404Content55`
}
object ParametersPathIssuenumberNameOwner {
  
  inline def apply(parameters: PathIssuenumberNameOwner, responses: `200552404Content55`): ParametersPathIssuenumberNameOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathIssuenumberNameOwner]
  }
  
  extension [Self <: ParametersPathIssuenumberNameOwner](x: Self) {
    
    inline def setParameters(value: PathIssuenumberNameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200552404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
