package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content241 extends StObject {
  
  var parameters: PathBranchpolicyid
  
  var requestBody: Content240
  
  var responses: `200Content241`
}
object Responses200Content241 {
  
  inline def apply(parameters: PathBranchpolicyid, requestBody: Content240, responses: `200Content241`): Responses200Content241 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content241]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content241] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content240): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content241`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
