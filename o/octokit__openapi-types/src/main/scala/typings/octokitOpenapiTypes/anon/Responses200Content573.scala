package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200Content573 extends StObject {
  
  var parameters: PathAssetidOwner
  
  var requestBody: ContentApplicationjsonLabelName
  
  var responses: `200Content573`
}
object Responses200Content573 {
  
  inline def apply(
    parameters: PathAssetidOwner,
    requestBody: ContentApplicationjsonLabelName,
    responses: `200Content573`
  ): Responses200Content573 = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200Content573]
  }
  
  extension [Self <: Responses200Content573](x: Self) {
    
    inline def setParameters(value: PathAssetidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabelName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content573`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
