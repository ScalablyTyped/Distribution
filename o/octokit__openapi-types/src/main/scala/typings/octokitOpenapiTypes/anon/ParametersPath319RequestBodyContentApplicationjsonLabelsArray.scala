package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPath319RequestBodyContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: Path319
  
  var requestBody: ContentApplicationjsonLabelsArray
  
  var responses: `262`
}
object ParametersPath319RequestBodyContentApplicationjsonLabelsArray {
  
  inline def apply(parameters: Path319, requestBody: ContentApplicationjsonLabelsArray, responses: `262`): ParametersPath319RequestBodyContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPath319RequestBodyContentApplicationjsonLabelsArray]
  }
  
  extension [Self <: ParametersPath319RequestBodyContentApplicationjsonLabelsArray](x: Self) {
    
    inline def setParameters(value: Path319): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `262`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
