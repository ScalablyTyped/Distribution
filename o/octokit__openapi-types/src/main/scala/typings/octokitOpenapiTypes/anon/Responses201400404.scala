package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201400404 extends StObject {
  
  var parameters: `639`
  
  var requestBody: ContentApplicationjsonIncludeclaimkeys
  
  var responses: `201400404`
}
object Responses201400404 {
  
  inline def apply(parameters: `639`, requestBody: ContentApplicationjsonIncludeclaimkeys, responses: `201400404`): Responses201400404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201400404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201400404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `639`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonIncludeclaimkeys): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201400404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
