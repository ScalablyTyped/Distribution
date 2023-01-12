package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathBaseHead_ extends StObject {
  
  var parameters: PathBaseHead_
  
  var responses: `200404500`
}
object ParametersPathBaseHead_ {
  
  inline def apply(parameters: PathBaseHead_, responses: `200404500`): ParametersPathBaseHead_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathBaseHead_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathBaseHead_] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBaseHead_): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
