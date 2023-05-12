package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberOwnerQuery473 extends StObject {
  
  var parameters: PathMilestonenumberOwnerQuery473
  
  var responses: `610`
}
object ParametersPathMilestonenumberOwnerQuery473 {
  
  inline def apply(parameters: PathMilestonenumberOwnerQuery473, responses: `610`): ParametersPathMilestonenumberOwnerQuery473 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberOwnerQuery473]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberOwnerQuery473] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumberOwnerQuery473): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `610`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
