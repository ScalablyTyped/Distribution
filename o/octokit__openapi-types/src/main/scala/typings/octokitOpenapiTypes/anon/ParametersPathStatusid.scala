package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathStatusid extends StObject {
  
  var parameters: PathStatusid
  
  var responses: `200223`
}
object ParametersPathStatusid {
  
  inline def apply(parameters: PathStatusid, responses: `200223`): ParametersPathStatusid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathStatusid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathStatusid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathStatusid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200223`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
