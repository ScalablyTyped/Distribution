package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidNumberSecretnameString extends StObject {
  
  var parameters: PathRepositoryidNumberSecretnameString
  
  var responses: `404Content48500Content48`
}
object ParametersPathRepositoryidNumberSecretnameString {
  
  inline def apply(parameters: PathRepositoryidNumberSecretnameString, responses: `404Content48500Content48`): ParametersPathRepositoryidNumberSecretnameString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidNumberSecretnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepositoryidNumberSecretnameString] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidNumberSecretnameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content48500Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
