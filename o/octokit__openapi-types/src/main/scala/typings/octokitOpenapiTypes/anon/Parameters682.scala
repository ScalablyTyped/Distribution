package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters682 extends StObject {
  
  var parameters: `682`
  
  var responses: `200ContentApplicationjsonChecksuitesTotalcount`
}
object Parameters682 {
  
  inline def apply(parameters: `682`, responses: `200ContentApplicationjsonChecksuitesTotalcount`): Parameters682 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters682]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters682] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `682`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonChecksuitesTotalcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
