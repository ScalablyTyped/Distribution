package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200419404Content48 extends StObject {
  
  var parameters: PathGistidString
  
  var requestBody: Content33
  
  var responses: `200419404Content48`
}
object Responses200419404Content48 {
  
  inline def apply(parameters: PathGistidString, requestBody: Content33, responses: `200419404Content48`): Responses200419404Content48 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200419404Content48]
  }
  
  extension [Self <: Responses200419404Content48](x: Self) {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content33): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200419404Content48`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
