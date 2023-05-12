package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses401403404422 extends StObject {
  
  var parameters: PathCardid
  
  var requestBody: js.UndefOr[ContentApplicationjsonArchived] = js.undefined
  
  var responses: `401403404422`
}
object Responses401403404422 {
  
  inline def apply(parameters: PathCardid, responses: `401403404422`): Responses401403404422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses401403404422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses401403404422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCardid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonArchived): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `401403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
