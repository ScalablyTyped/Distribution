package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberOwnerQuery407 extends StObject {
  
  var parameters: PathMilestonenumberOwnerQuery407
  
  var responses: `543`
}
object ParametersPathMilestonenumberOwnerQuery407 {
  
  inline def apply(parameters: PathMilestonenumberOwnerQuery407, responses: `543`): ParametersPathMilestonenumberOwnerQuery407 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberOwnerQuery407]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberOwnerQuery407] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumberOwnerQuery407): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `543`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
