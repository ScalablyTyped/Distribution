package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidShaString extends StObject {
  
  var parameters: PathGistidShaString
  
  var responses: `200274403`
}
object ParametersPathGistidShaString {
  
  inline def apply(parameters: PathGistidShaString, responses: `200274403`): ParametersPathGistidShaString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidShaString]
  }
  
  extension [Self <: ParametersPathGistidShaString](x: Self) {
    
    inline def setParameters(value: PathGistidShaString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200274403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
