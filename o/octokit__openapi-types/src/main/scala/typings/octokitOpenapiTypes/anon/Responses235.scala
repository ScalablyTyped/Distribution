package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses235 extends StObject {
  
  var parameters: PathBranchpolicyid
  
  var requestBody: Content234
  
  var responses: `235`
}
object Responses235 {
  
  inline def apply(parameters: PathBranchpolicyid, requestBody: Content234, responses: `235`): Responses235 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses235]
  }
  
  extension [Self <: Responses235](x: Self) {
    
    inline def setParameters(value: PathBranchpolicyid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content234): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `235`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
