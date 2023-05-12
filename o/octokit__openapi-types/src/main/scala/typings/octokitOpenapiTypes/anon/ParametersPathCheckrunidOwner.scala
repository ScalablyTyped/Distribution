package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCheckrunidOwner extends StObject {
  
  var parameters: PathCheckrunidOwner
  
  var responses: `200ContentApplicationjsonOutput`
}
object ParametersPathCheckrunidOwner {
  
  inline def apply(parameters: PathCheckrunidOwner, responses: `200ContentApplicationjsonOutput`): ParametersPathCheckrunidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCheckrunidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCheckrunidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOutput`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
