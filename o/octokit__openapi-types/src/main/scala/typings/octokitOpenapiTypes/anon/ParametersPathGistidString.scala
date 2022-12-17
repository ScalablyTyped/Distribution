package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidString extends StObject {
  
  var parameters: PathGistidString
  
  var responses: `200419`
}
object ParametersPathGistidString {
  
  inline def apply(parameters: PathGistidString, responses: `200419`): ParametersPathGistidString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidString]
  }
  
  extension [Self <: ParametersPathGistidString](x: Self) {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200419`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
