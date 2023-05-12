package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathJobid extends StObject {
  
  var parameters: PathJobid
  
  var responses: `200Content148`
}
object ParametersPathJobid {
  
  inline def apply(parameters: PathJobid, responses: `200Content148`): ParametersPathJobid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathJobid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathJobid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathJobid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content148`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
