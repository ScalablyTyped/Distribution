package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackageversionid extends StObject {
  
  var parameters: PathPackageversionid
  
  var responses: `200Content98`
}
object ParametersPathPackageversionid {
  
  inline def apply(parameters: PathPackageversionid, responses: `200Content98`): ParametersPathPackageversionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackageversionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackageversionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content98`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
