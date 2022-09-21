package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361QueryPageResponses102 extends StObject {
  
  var parameters: Path361QueryPage
  
  var responses: `102`
}
object ParametersPath361QueryPageResponses102 {
  
  inline def apply(parameters: Path361QueryPage, responses: `102`): ParametersPath361QueryPageResponses102 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361QueryPageResponses102]
  }
  
  extension [Self <: ParametersPath361QueryPageResponses102](x: Self) {
    
    inline def setParameters(value: Path361QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `102`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
