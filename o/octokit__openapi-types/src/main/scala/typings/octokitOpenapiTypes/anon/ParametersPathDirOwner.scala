package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDirOwner extends StObject {
  
  var parameters: PathDirOwner
  
  var responses: `200Content570`
}
object ParametersPathDirOwner {
  
  inline def apply(parameters: PathDirOwner, responses: `200Content570`): ParametersPathDirOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDirOwner]
  }
  
  extension [Self <: ParametersPathDirOwner](x: Self) {
    
    inline def setParameters(value: PathDirOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content570`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
