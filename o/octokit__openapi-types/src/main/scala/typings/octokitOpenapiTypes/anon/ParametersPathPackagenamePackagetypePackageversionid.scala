package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathPackagenamePackagetypePackageversionid extends StObject {
  
  var parameters: PathPackagenamePackagetypePackageversionid
  
  var responses: `99`
}
object ParametersPathPackagenamePackagetypePackageversionid {
  
  inline def apply(parameters: PathPackagenamePackagetypePackageversionid, responses: `99`): ParametersPathPackagenamePackagetypePackageversionid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathPackagenamePackagetypePackageversionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathPackagenamePackagetypePackageversionid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPackagenamePackagetypePackageversionid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `99`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
