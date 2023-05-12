package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses405 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: js.UndefOr[Content320] = js.undefined
  
  var responses: `405`
}
object Responses405 {
  
  inline def apply(parameters: PathPullnumber, responses: `405`): Responses405 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses405]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses405] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content320): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `405`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
