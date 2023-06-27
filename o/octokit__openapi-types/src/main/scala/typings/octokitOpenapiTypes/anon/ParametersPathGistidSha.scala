package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidSha extends StObject {
  
  var parameters: PathGistidSha
  
  var responses: `200564403Content41`
}
object ParametersPathGistidSha {
  
  inline def apply(parameters: PathGistidSha, responses: `200564403Content41`): ParametersPathGistidSha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGistidSha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidSha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200564403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
