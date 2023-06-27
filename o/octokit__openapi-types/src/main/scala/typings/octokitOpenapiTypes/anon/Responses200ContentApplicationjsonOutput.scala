package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonOutput extends StObject {
  
  var parameters: PathCheckrunidOwner
  
  var requestBody: Content218
  
  var responses: `200ContentApplicationjsonOutput`
}
object Responses200ContentApplicationjsonOutput {
  
  inline def apply(
    parameters: PathCheckrunidOwner,
    requestBody: Content218,
    responses: `200ContentApplicationjsonOutput`
  ): Responses200ContentApplicationjsonOutput = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonOutput] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCheckrunidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: Content218): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonOutput`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
