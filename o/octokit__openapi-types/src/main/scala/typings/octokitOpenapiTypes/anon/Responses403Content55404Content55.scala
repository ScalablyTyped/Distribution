package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses403Content55404Content55 extends StObject {
  
  var parameters: PathUsernameString
  
  var responses: `403Content55404Content55`
}
object Responses403Content55404Content55 {
  
  inline def apply(parameters: PathUsernameString, responses: `403Content55404Content55`): Responses403Content55404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses403Content55404Content55]
  }
  
  extension [Self <: Responses403Content55404Content55](x: Self) {
    
    inline def setParameters(value: PathUsernameString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `403Content55404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
