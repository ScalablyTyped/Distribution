package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDownloadcount extends StObject {
  
  var parameters: PathAssetidOwner
  
  var requestBody: ContentApplicationjsonLabel
  
  var responses: `200ContentApplicationjsonDownloadcount`
}
object Responses200ContentApplicationjsonDownloadcount {
  
  inline def apply(
    parameters: PathAssetidOwner,
    requestBody: ContentApplicationjsonLabel,
    responses: `200ContentApplicationjsonDownloadcount`
  ): Responses200ContentApplicationjsonDownloadcount = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDownloadcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonDownloadcount] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathAssetidOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDownloadcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
