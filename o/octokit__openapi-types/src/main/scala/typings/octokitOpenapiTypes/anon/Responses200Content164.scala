package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content164 extends StObject {
  
  var parameters: PathRequiredworkflowidforrepo
  
  var responses: `200Content164`
}
object Responses200Content164 {
  
  inline def apply(parameters: PathRequiredworkflowidforrepo, responses: `200Content164`): Responses200Content164 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content164]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content164] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathRequiredworkflowidforrepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content164`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
