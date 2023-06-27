package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrgPackagenameQuery extends StObject {
  
  var parameters: PathOrgPackagenameQuery
  
  var responses: `401Content41403Content41`
}
object ParametersPathOrgPackagenameQuery {
  
  inline def apply(parameters: PathOrgPackagenameQuery, responses: `401Content41403Content41`): ParametersPathOrgPackagenameQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrgPackagenameQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrgPackagenameQuery] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrgPackagenameQuery): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `401Content41403Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
