package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepositoryidNumber extends StObject {
  
  var parameters: PathRepositoryidNumber
  
  var responses: `377`
}
object ParametersPathRepositoryidNumber {
  
  inline def apply(parameters: PathRepositoryidNumber, responses: `377`): ParametersPathRepositoryidNumber = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepositoryidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRepositoryidNumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `377`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
