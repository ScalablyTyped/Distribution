package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses513 extends StObject {
  
  var parameters: PathBranchpolicyidEnvironmentname
  
  var requestBody: ContentApplicationjsonNameString
  
  var responses: `513`
}
object Responses513 {
  
  inline def apply(
    parameters: PathBranchpolicyidEnvironmentname,
    requestBody: ContentApplicationjsonNameString,
    responses: `513`
  ): Responses513 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses513]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses513] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathBranchpolicyidEnvironmentname): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonNameString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `513`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
