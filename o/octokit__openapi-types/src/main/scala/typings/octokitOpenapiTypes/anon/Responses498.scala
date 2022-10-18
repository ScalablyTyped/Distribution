package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses498 extends StObject {
  
  var parameters: PathBranchpolicyidEnvironmentname
  
  var requestBody: Content497
  
  var responses: `498`
}
object Responses498 {
  
  inline def apply(parameters: PathBranchpolicyidEnvironmentname, requestBody: Content497, responses: `498`): Responses498 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses498]
  }
  
  extension [Self <: Responses498](x: Self) {
    
    inline def setParameters(value: PathBranchpolicyidEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content497): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `498`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
