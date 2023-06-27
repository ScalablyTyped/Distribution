package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberResponses9 extends StObject {
  
  var parameters: PathMilestonenumber
  
  var responses: `9`
}
object ParametersPathMilestonenumberResponses9 {
  
  inline def apply(parameters: PathMilestonenumber, responses: `9`): ParametersPathMilestonenumberResponses9 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberResponses9]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberResponses9] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `9`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
