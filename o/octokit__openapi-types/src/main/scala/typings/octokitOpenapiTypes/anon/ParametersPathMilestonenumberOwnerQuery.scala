package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberOwnerQuery extends StObject {
  
  var parameters: PathMilestonenumberOwnerQuery
  
  var responses: `733`
}
object ParametersPathMilestonenumberOwnerQuery {
  
  inline def apply(parameters: PathMilestonenumberOwnerQuery, responses: `733`): ParametersPathMilestonenumberOwnerQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberOwnerQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberOwnerQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumberOwnerQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `733`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
