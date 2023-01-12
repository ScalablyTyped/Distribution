package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathJobidOwner extends StObject {
  
  var parameters: PathJobidOwner
  
  var responses: `200ContentApplicationjsonCheckrunurl`
}
object ParametersPathJobidOwner {
  
  inline def apply(parameters: PathJobidOwner, responses: `200ContentApplicationjsonCheckrunurl`): ParametersPathJobidOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathJobidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathJobidOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathJobidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCheckrunurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
