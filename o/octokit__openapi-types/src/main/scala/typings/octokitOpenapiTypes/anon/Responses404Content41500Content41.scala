package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses404Content41500Content41 extends StObject {
  
  var parameters: Path790
  
  var requestBody: ContentApplicationjsonSelectedrepositoryids
  
  var responses: `404Content41500Content41`
}
object Responses404Content41500Content41 {
  
  inline def apply(
    parameters: Path790,
    requestBody: ContentApplicationjsonSelectedrepositoryids,
    responses: `404Content41500Content41`
  ): Responses404Content41500Content41 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses404Content41500Content41]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses404Content41500Content41] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: Path790): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonSelectedrepositoryids): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `404Content41500Content41`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
