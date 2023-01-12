package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonBasebranch extends StObject {
  
  var parameters: `472`
  
  var requestBody: ContentApplicationjsonBranchString
  
  var responses: `200ContentApplicationjsonBasebranch`
}
object Responses200ContentApplicationjsonBasebranch {
  
  inline def apply(
    parameters: `472`,
    requestBody: ContentApplicationjsonBranchString,
    responses: `200ContentApplicationjsonBasebranch`
  ): Responses200ContentApplicationjsonBasebranch = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonBasebranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonBasebranch] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `472`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBranchString): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonBasebranch`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
