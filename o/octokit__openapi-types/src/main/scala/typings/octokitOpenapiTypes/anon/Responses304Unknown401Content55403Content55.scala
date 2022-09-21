package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses304Unknown401Content55403Content55 extends StObject {
  
  var parameters: PathProjectidNumberUsernameString
  
  var responses: `304Unknown401Content55403Content55`
}
object Responses304Unknown401Content55403Content55 {
  
  inline def apply(parameters: PathProjectidNumberUsernameString, responses: `304Unknown401Content55403Content55`): Responses304Unknown401Content55403Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses304Unknown401Content55403Content55]
  }
  
  extension [Self <: Responses304Unknown401Content55403Content55](x: Self) {
    
    inline def setParameters(value: PathProjectidNumberUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `304Unknown401Content55403Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
