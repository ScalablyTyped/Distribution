package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201Content55403 extends StObject {
  
  var parameters: PathJobid
  
  var requestBody: js.UndefOr[Content149] = js.undefined
  
  var responses: `201Content55403`
}
object Responses201Content55403 {
  
  inline def apply(parameters: PathJobid, responses: `201Content55403`): Responses201Content55403 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201Content55403]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201Content55403] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathJobid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content149): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResponses(value: `201Content55403`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
