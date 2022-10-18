package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberOwnerQuery250 extends StObject {
  
  var parameters: PathMilestonenumberOwnerQuery250
  
  var responses: `549`
}
object ParametersPathMilestonenumberOwnerQuery250 {
  
  inline def apply(parameters: PathMilestonenumberOwnerQuery250, responses: `549`): ParametersPathMilestonenumberOwnerQuery250 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberOwnerQuery250]
  }
  
  extension [Self <: ParametersPathMilestonenumberOwnerQuery250](x: Self) {
    
    inline def setParameters(value: PathMilestonenumberOwnerQuery250): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `549`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
