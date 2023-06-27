package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content284 extends StObject {
  
  var parameters: PathBranchpolicyid
  
  var requestBody: Content283
  
  var responses: `200Content284`
}
object Responses200Content284 {
  
  inline def apply(parameters: PathBranchpolicyid, requestBody: Content283, responses: `200Content284`): Responses200Content284 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content284]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content284] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content283): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content284`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
