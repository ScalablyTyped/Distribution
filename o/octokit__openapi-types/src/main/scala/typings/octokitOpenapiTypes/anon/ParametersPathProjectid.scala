package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathProjectid extends StObject {
  
  var parameters: PathProjectid
  
  var responses: `200Content148`
}
object ParametersPathProjectid {
  
  inline def apply(parameters: PathProjectid, responses: `200Content148`): ParametersPathProjectid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathProjectid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathProjectid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathProjectid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content148`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
