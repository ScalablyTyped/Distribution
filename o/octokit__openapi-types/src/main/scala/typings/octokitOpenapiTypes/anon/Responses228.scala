package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses228 extends StObject {
  
  var parameters: PathBranchpolicyid
  
  var requestBody: Content227
  
  var responses: `228`
}
object Responses228 {
  
  inline def apply(parameters: PathBranchpolicyid, requestBody: Content227, responses: `228`): Responses228 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses228]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses228] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content227): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `228`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
