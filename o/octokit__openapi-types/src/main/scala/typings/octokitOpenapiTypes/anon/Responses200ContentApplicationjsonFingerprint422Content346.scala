package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonFingerprint422Content346 extends StObject {
  
  var parameters: PathClientidString
  
  var requestBody: ContentApplicationjsonAccesstoken
  
  var responses: `200ContentApplicationjsonFingerprint422Content346`
}
object Responses200ContentApplicationjsonFingerprint422Content346 {
  
  inline def apply(
    parameters: PathClientidString,
    requestBody: ContentApplicationjsonAccesstoken,
    responses: `200ContentApplicationjsonFingerprint422Content346`
  ): Responses200ContentApplicationjsonFingerprint422Content346 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonFingerprint422Content346]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonFingerprint422Content346] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathClientidString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAccesstoken): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonFingerprint422Content346`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
