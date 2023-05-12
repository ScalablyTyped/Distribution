package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404405 extends StObject {
  
  var parameters: PathPullnumberRepo
  
  var requestBody: js.UndefOr[Content320] = js.undefined
  
  var responses: `404405`
}
object Responses404405 {
  
  inline def apply(parameters: PathPullnumberRepo, responses: `404405`): Responses404405 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404405]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404405] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumberRepo): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content320): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `404405`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
