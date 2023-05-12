package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberResponses7 extends StObject {
  
  var parameters: PathMilestonenumber
  
  var responses: `7`
}
object ParametersPathMilestonenumberResponses7 {
  
  inline def apply(parameters: PathMilestonenumber, responses: `7`): ParametersPathMilestonenumberResponses7 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberResponses7]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberResponses7] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `7`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
