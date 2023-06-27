package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content380422 extends StObject {
  
  var parameters: PathReviewid
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200Content380422`
}
object Responses200Content380422 {
  
  inline def apply(parameters: PathReviewid, requestBody: ContentApplicationjsonBody, responses: `200Content380422`): Responses200Content380422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content380422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200Content380422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathReviewid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content380422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
