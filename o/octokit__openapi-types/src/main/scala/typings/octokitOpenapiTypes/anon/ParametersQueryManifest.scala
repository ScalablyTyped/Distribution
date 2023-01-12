package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersQueryManifest extends StObject {
  
  var parameters: QueryManifest
  
  var responses: `200Content507`
}
object ParametersQueryManifest {
  
  inline def apply(parameters: QueryManifest, responses: `200Content507`): ParametersQueryManifest = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersQueryManifest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersQueryManifest] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: QueryManifest): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content507`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
