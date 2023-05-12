package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content323 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: js.UndefOr[ContentApplicationjsonReviewers] = js.undefined
  
  var responses: `201Content323`
}
object Responses201Content323 {
  
  inline def apply(parameters: PathPullnumber, responses: `201Content323`): Responses201Content323 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content323]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content323] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201Content323`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
