package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumber extends StObject {
  
  var parameters: PathMilestonenumber
  
  var responses: `200282`
}
object ParametersPathMilestonenumber {
  
  inline def apply(parameters: PathMilestonenumber, responses: `200282`): ParametersPathMilestonenumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumber]
  }
  
  extension [Self <: ParametersPathMilestonenumber](x: Self) {
    
    inline def setParameters(value: PathMilestonenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200282`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
