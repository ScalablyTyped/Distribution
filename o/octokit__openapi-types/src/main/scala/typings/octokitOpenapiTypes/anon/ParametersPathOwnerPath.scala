package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOwnerPath extends StObject {
  
  var parameters: PathOwnerPath
  
  var responses: `200302`
}
object ParametersPathOwnerPath {
  
  inline def apply(parameters: PathOwnerPath, responses: `200302`): ParametersPathOwnerPath = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOwnerPath]
  }
  
  extension [Self <: ParametersPathOwnerPath](x: Self) {
    
    inline def setParameters(value: PathOwnerPath): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200302`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
