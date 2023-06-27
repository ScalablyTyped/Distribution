package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCommitsha extends StObject {
  
  var parameters: PathCommitsha
  
  var responses: `200Content253`
}
object ParametersPathCommitsha {
  
  inline def apply(parameters: PathCommitsha, responses: `200Content253`): ParametersPathCommitsha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCommitsha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCommitsha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommitsha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content253`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
