package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathGistidStringQuery473 extends StObject {
  
  var parameters: PathGistidStringQuery473
  
  var responses: `200Content483`
}
object ParametersPathGistidStringQuery473 {
  
  inline def apply(parameters: PathGistidStringQuery473, responses: `200Content483`): ParametersPathGistidStringQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathGistidStringQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathGistidStringQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidStringQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content483`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
