package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200437404Content55 extends StObject {
  
  var parameters: PathGistidString
  
  var requestBody: Content40
  
  var responses: `200437404Content55`
}
object Responses200437404Content55 {
  
  inline def apply(parameters: PathGistidString, requestBody: Content40, responses: `200437404Content55`): Responses200437404Content55 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200437404Content55]
  }
  
  extension [Self <: Responses200437404Content55](x: Self) {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content40): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200437404Content55`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
