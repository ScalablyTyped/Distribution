package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath361QueryPageResponses109 extends StObject {
  
  var parameters: Path361QueryPage
  
  var responses: `109`
}
object ParametersPath361QueryPageResponses109 {
  
  inline def apply(parameters: Path361QueryPage, responses: `109`): ParametersPath361QueryPageResponses109 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath361QueryPageResponses109]
  }
  
  extension [Self <: ParametersPath361QueryPageResponses109](x: Self) {
    
    inline def setParameters(value: Path361QueryPage): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `109`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
