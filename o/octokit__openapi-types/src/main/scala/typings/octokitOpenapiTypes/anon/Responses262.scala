package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses262 extends StObject {
  
  var parameters: Path259
  
  var requestBody: ContentApplicationjsonLabelsArray
  
  var responses: `262`
}
object Responses262 {
  
  inline def apply(parameters: Path259, requestBody: ContentApplicationjsonLabelsArray, responses: `262`): Responses262 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses262]
  }
  
  extension [Self <: Responses262](x: Self) {
    
    inline def setParameters(value: Path259): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `262`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
