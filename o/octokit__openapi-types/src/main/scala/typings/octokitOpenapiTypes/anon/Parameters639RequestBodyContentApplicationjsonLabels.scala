package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters639RequestBodyContentApplicationjsonLabels extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonLabels
  
  var responses: `201ContentApplicationjsonRunner`
}
object Parameters639RequestBodyContentApplicationjsonLabels {
  
  inline def apply(
    parameters: `639`,
    requestBody: ContentApplicationjsonLabels,
    responses: `201ContentApplicationjsonRunner`
  ): Parameters639RequestBodyContentApplicationjsonLabels = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters639RequestBodyContentApplicationjsonLabels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters639RequestBodyContentApplicationjsonLabels] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabels): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonRunner`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
