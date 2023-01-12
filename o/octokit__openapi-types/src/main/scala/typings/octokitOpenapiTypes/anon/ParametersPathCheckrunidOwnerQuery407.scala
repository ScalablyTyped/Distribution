package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidOwnerQuery407 extends StObject {
  
  var parameters: PathCheckrunidOwnerQuery407
  
  var responses: `200Content490`
}
object ParametersPathCheckrunidOwnerQuery407 {
  
  inline def apply(parameters: PathCheckrunidOwnerQuery407, responses: `200Content490`): ParametersPathCheckrunidOwnerQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidOwnerQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCheckrunidOwnerQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunidOwnerQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content490`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
