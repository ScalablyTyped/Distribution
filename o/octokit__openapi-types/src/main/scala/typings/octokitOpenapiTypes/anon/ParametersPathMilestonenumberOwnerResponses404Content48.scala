package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberOwnerResponses404Content48 extends StObject {
  
  var parameters: PathMilestonenumberOwner
  
  var responses: `404Content48`
}
object ParametersPathMilestonenumberOwnerResponses404Content48 {
  
  inline def apply(parameters: PathMilestonenumberOwner, responses: `404Content48`): ParametersPathMilestonenumberOwnerResponses404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberOwnerResponses404Content48]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberOwnerResponses404Content48] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumberOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
