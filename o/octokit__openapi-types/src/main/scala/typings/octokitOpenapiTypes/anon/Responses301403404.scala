package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses301403404 extends StObject {
  
  var parameters: PathIssuenumberOwnerRepo
  
  var requestBody: js.UndefOr[ContentApplicationjsonMilestone] = js.undefined
  
  var responses: `301403404`
}
object Responses301403404 {
  
  inline def apply(parameters: PathIssuenumberOwnerRepo, responses: `301403404`): Responses301403404 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses301403404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses301403404] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathIssuenumberOwnerRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonMilestone): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `301403404`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
