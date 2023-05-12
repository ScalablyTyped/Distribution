package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathNameOwner extends StObject {
  
  var parameters: PathNameOwner
  
  var responses: `200404422`
}
object ParametersPathNameOwner {
  
  inline def apply(parameters: PathNameOwner, responses: `200404422`): ParametersPathNameOwner = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathNameOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathNameOwner] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathNameOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
