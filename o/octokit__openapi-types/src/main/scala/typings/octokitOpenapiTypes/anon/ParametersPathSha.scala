package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathSha extends StObject {
  
  var parameters: PathSha
  
  var responses: `200403404`
}
object ParametersPathSha {
  
  inline def apply(parameters: PathSha, responses: `200403404`): ParametersPathSha = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathSha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathSha] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathSha): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
