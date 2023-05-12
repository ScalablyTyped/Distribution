package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQuerySecrettype extends StObject {
  
  var parameters: QuerySecrettype
  
  var responses: `200Content479`
}
object ParametersQuerySecrettype {
  
  inline def apply(parameters: QuerySecrettype, responses: `200Content479`): ParametersQuerySecrettype = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQuerySecrettype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQuerySecrettype] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QuerySecrettype): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content479`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
