package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathTreesha extends StObject {
  
  var parameters: PathTreesha
  
  var responses: `200240`
}
object ParametersPathTreesha {
  
  inline def apply(parameters: PathTreesha, responses: `200240`): ParametersPathTreesha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathTreesha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathTreesha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathTreesha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200240`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
