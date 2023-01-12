package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidStringQuery407 extends StObject {
  
  var parameters: PathGistidStringQuery407
  
  var responses: `200Content420`
}
object ParametersPathGistidStringQuery407 {
  
  inline def apply(parameters: PathGistidStringQuery407, responses: `200Content420`): ParametersPathGistidStringQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidStringQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGistidStringQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidStringQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content420`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
