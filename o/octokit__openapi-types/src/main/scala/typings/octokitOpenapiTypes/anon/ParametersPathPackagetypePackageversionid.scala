package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagetypePackageversionid extends StObject {
  
  var parameters: PathPackagetypePackageversionid
  
  var responses: `200Content118`
}
object ParametersPathPackagetypePackageversionid {
  
  inline def apply(parameters: PathPackagetypePackageversionid, responses: `200Content118`): ParametersPathPackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagetypePackageversionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagetypePackageversionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagetypePackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content118`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
