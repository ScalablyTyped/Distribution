package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathMilestonenumberQuery extends StObject {
  
  var parameters: PathMilestonenumberQuery
  
  var responses: `354`
}
object ParametersPathMilestonenumberQuery {
  
  inline def apply(parameters: PathMilestonenumberQuery, responses: `354`): ParametersPathMilestonenumberQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathMilestonenumberQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathMilestonenumberQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumberQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `354`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
