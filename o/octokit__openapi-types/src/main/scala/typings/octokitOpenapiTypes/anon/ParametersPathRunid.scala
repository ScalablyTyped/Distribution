package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRunid extends StObject {
  
  var parameters: PathRunid
  
  var responses: `200Content180`
}
object ParametersPathRunid {
  
  inline def apply(parameters: PathRunid, responses: `200Content180`): ParametersPathRunid = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRunid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRunid] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRunid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content180`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
