package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathReleaseid extends StObject {
  
  var parameters: PathReleaseid
  
  var responses: `200333404`
}
object ParametersPathReleaseid {
  
  inline def apply(parameters: PathReleaseid, responses: `200333404`): ParametersPathReleaseid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathReleaseid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathReleaseid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReleaseid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200333404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
