package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathDir extends StObject {
  
  var parameters: PathDir
  
  var responses: `200Content383`
}
object ParametersPathDir {
  
  inline def apply(parameters: PathDir, responses: `200Content383`): ParametersPathDir = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathDir]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathDir] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathDir): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content383`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
