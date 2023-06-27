package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses202403422 extends StObject {
  
  var parameters: PathPullnumber
  
  var requestBody: js.UndefOr[Content382] = js.undefined
  
  var responses: `202403422`
}
object Responses202403422 {
  
  inline def apply(parameters: PathPullnumber, responses: `202403422`): Responses202403422 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses202403422]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses202403422] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathPullnumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content382): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `202403422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
