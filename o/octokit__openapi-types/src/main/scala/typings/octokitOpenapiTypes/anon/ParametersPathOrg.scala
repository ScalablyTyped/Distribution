package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathOrg extends StObject {
  
  var parameters: PathOrg
  
  var responses: `500`
}
object ParametersPathOrg {
  
  inline def apply(parameters: PathOrg, responses: `500`): ParametersPathOrg = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathOrg] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `500`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
