package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200564404Content41 extends StObject {
  
  var parameters: PathGistidString
  
  var requestBody: Content24
  
  var responses: `200564404Content41`
}
object Responses200564404Content41 {
  
  inline def apply(parameters: PathGistidString, requestBody: Content24, responses: `200564404Content41`): Responses200564404Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200564404Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200564404Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathGistidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content24): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200564404Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
