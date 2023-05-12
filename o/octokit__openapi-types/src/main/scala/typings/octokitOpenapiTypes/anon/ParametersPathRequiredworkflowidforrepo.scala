package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRequiredworkflowidforrepo extends StObject {
  
  var parameters: PathRequiredworkflowidforrepo
  
  var responses: `200Content139`
}
object ParametersPathRequiredworkflowidforrepo {
  
  inline def apply(parameters: PathRequiredworkflowidforrepo, responses: `200Content139`): ParametersPathRequiredworkflowidforrepo = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRequiredworkflowidforrepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParametersPathRequiredworkflowidforrepo] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRequiredworkflowidforrepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content139`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
