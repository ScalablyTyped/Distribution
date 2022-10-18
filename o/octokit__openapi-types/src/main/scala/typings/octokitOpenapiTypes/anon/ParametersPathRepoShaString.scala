package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoShaString extends StObject {
  
  var parameters: PathRepoShaString
  
  var requestBody: ContentApplicationjsonContextDescription
  
  var responses: `201Content586`
}
object ParametersPathRepoShaString {
  
  inline def apply(
    parameters: PathRepoShaString,
    requestBody: ContentApplicationjsonContextDescription,
    responses: `201Content586`
  ): ParametersPathRepoShaString = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoShaString]
  }
  
  extension [Self <: ParametersPathRepoShaString](x: Self) {
    
    inline def setParameters(value: PathRepoShaString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonContextDescription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content586`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
