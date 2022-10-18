package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304Unknown401Content6403Content6 extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `304Unknown401Content6403Content6`
}
object Responses304Unknown401Content6403Content6 {
  
  inline def apply(parameters: PathUsernameString, responses: `304Unknown401Content6403Content6`): Responses304Unknown401Content6403Content6 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304Unknown401Content6403Content6]
  }
  
  extension [Self <: Responses304Unknown401Content6403Content6](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content6403Content6`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
