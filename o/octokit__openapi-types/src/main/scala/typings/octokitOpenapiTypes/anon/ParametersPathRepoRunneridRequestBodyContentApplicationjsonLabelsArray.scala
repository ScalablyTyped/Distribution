package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabelsArray extends StObject {
  
  var parameters: PathRepoRunnerid
  
  var requestBody: ContentApplicationjsonLabelsArray
  
  var responses: `404422`
}
object ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabelsArray {
  
  inline def apply(parameters: PathRepoRunnerid, requestBody: ContentApplicationjsonLabelsArray, responses: `404422`): ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabelsArray = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabelsArray]
  }
  
  extension [Self <: ParametersPathRepoRunneridRequestBodyContentApplicationjsonLabelsArray](x: Self) {
    
    inline def setParameters(value: PathRepoRunnerid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabelsArray): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
