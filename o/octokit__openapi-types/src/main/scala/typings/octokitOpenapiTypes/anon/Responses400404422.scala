package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses400404422 extends StObject {
  
  var parameters: `540`
  
  var requestBody: ContentApplicationjsonArtifacturl
  
  var responses: `400404422`
}
object Responses400404422 {
  
  inline def apply(parameters: `540`, requestBody: ContentApplicationjsonArtifacturl, responses: `400404422`): Responses400404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses400404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses400404422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `540`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonArtifacturl): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
