package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters771 extends StObject {
  
  var parameters: `771`
  
  var responses: `200ContentApplicationjsonClonesCount`
}
object Parameters771 {
  
  inline def apply(parameters: `771`, responses: `200ContentApplicationjsonClonesCount`): Parameters771 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters771]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters771] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `771`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonClonesCount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
