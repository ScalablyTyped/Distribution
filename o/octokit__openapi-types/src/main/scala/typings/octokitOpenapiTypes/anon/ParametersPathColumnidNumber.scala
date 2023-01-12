package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathColumnidNumber extends StObject {
  
  var parameters: PathColumnidNumber
  
  var responses: `200ContentApplicationjsonCardsurl`
}
object ParametersPathColumnidNumber {
  
  inline def apply(parameters: PathColumnidNumber, responses: `200ContentApplicationjsonCardsurl`): ParametersPathColumnidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathColumnidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathColumnidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathColumnidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonCardsurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
