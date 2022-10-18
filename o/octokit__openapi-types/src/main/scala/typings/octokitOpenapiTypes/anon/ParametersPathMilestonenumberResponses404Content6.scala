package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberResponses404Content6 extends StObject {
  
  var parameters: PathMilestonenumber
  
  var responses: `404Content6`
}
object ParametersPathMilestonenumberResponses404Content6 {
  
  inline def apply(parameters: PathMilestonenumber, responses: `404Content6`): ParametersPathMilestonenumberResponses404Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberResponses404Content6]
  }
  
  extension [Self <: ParametersPathMilestonenumberResponses404Content6](x: Self) {
    
    inline def setParameters(value: PathMilestonenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
