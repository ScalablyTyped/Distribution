package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonCreatedatDiffurl extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: js.UndefOr[ContentApplicationjsonReviewers] = js.undefined
  
  var responses: `201ContentApplicationjsonCreatedatDiffurl`
}
object Responses201ContentApplicationjsonCreatedatDiffurl {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `201ContentApplicationjsonCreatedatDiffurl`): Responses201ContentApplicationjsonCreatedatDiffurl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonCreatedatDiffurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonCreatedatDiffurl] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonReviewers): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201ContentApplicationjsonCreatedatDiffurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
