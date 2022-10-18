package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath615QueryPackagetypeVisibility extends StObject {
  
  var parameters: Path615QueryPackagetypeVisibility
  
  var responses: `200Content352`
}
object ParametersPath615QueryPackagetypeVisibility {
  
  inline def apply(parameters: Path615QueryPackagetypeVisibility, responses: `200Content352`): ParametersPath615QueryPackagetypeVisibility = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath615QueryPackagetypeVisibility]
  }
  
  extension [Self <: ParametersPath615QueryPackagetypeVisibility](x: Self) {
    
    inline def setParameters(value: Path615QueryPackagetypeVisibility): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content352`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
