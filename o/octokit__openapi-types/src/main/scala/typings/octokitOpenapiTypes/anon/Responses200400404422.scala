package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200400404422 extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonArtifacturl
  
  var responses: `200400404422`
}
object Responses200400404422 {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonArtifacturl, responses: `200400404422`): Responses200400404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200400404422]
  }
  
  extension [Self <: Responses200400404422](x: Self) {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonArtifacturl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200400404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
