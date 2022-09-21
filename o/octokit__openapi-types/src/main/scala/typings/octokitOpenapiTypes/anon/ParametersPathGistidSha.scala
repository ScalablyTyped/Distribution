package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidSha extends StObject {
  
  var parameters: PathGistidSha
  
  var responses: `200437403Content55`
}
object ParametersPathGistidSha {
  
  inline def apply(parameters: PathGistidSha, responses: `200437403Content55`): ParametersPathGistidSha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidSha]
  }
  
  extension [Self <: ParametersPathGistidSha](x: Self) {
    
    inline def setParameters(value: PathGistidSha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200437403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
