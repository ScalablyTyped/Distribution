package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetype extends StObject {
  
  var parameters: PathPackagenamePackagetype
  
  var responses: `200Content114`
}
object ParametersPathPackagenamePackagetype {
  
  inline def apply(parameters: PathPackagenamePackagetype, responses: `200Content114`): ParametersPathPackagenamePackagetype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetype] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content114`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
