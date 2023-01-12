package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses400409422 extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonBuildtype
  
  var responses: `400409422`
}
object Responses400409422 {
  
  inline def apply(parameters: `472`, requestBody: ContentApplicationjsonBuildtype, responses: `400409422`): Responses400409422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses400409422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses400409422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBuildtype): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `400409422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
