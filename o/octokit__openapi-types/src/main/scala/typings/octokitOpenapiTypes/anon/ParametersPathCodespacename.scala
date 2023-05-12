package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathCodespacename extends StObject {
  
  var parameters: PathCodespacename
  
  var responses: `202304401`
}
object ParametersPathCodespacename {
  
  inline def apply(parameters: PathCodespacename, responses: `202304401`): ParametersPathCodespacename = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathCodespacename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathCodespacename] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCodespacename): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `202304401`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
