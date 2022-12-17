package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters57Responses201Content21 extends StObject {
  
  var parameters: `57`
  
  var responses: `201Content21`
}
object Parameters57Responses201Content21 {
  
  inline def apply(parameters: `57`, responses: `201Content21`): Parameters57Responses201Content21 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters57Responses201Content21]
  }
  
  extension [Self <: Parameters57Responses201Content21](x: Self) {
    
    inline def setParameters(value: `57`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201Content21`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
