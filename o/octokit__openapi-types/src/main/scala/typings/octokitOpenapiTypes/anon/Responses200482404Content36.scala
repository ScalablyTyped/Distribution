package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200482404Content36 extends StObject {
  
  var parameters: PathGistidString
  
  var requestBody: Content21
  
  var responses: `200482404Content36`
}
object Responses200482404Content36 {
  
  inline def apply(parameters: PathGistidString, requestBody: Content21, responses: `200482404Content36`): Responses200482404Content36 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200482404Content36]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200482404Content36] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content21): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200482404Content36`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
