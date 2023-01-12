package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypeQueryState extends StObject {
  
  var parameters: PathPackagenamePackagetypeQueryState
  
  var responses: `200401403404`
}
object ParametersPathPackagenamePackagetypeQueryState {
  
  inline def apply(parameters: PathPackagenamePackagetypeQueryState, responses: `200401403404`): ParametersPathPackagenamePackagetypeQueryState = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypeQueryState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetypeQueryState] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetypeQueryState): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200401403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
