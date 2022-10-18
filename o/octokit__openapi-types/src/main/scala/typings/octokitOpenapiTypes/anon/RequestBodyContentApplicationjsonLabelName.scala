package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonLabelName extends StObject {
  
  var parameters: PathAssetid
  
  var requestBody: ContentApplicationjsonLabelName
  
  var responses: `200ContentApplicationjsonDownloadcount`
}
object RequestBodyContentApplicationjsonLabelName {
  
  inline def apply(
    parameters: PathAssetid,
    requestBody: ContentApplicationjsonLabelName,
    responses: `200ContentApplicationjsonDownloadcount`
  ): RequestBodyContentApplicationjsonLabelName = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonLabelName]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonLabelName](x: Self) {
    
    inline def setParameters(value: PathAssetid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonLabelName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDownloadcount`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
