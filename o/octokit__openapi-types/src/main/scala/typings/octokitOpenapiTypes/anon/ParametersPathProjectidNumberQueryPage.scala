package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectidNumberQueryPage extends StObject {
  
  var parameters: PathProjectidNumberQueryPage
  
  var responses: `200Content75`
}
object ParametersPathProjectidNumberQueryPage {
  
  inline def apply(parameters: PathProjectidNumberQueryPage, responses: `200Content75`): ParametersPathProjectidNumberQueryPage = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectidNumberQueryPage]
  }
  
  extension [Self <: ParametersPathProjectidNumberQueryPage](x: Self) {
    
    inline def setParameters(value: PathProjectidNumberQueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content75`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
