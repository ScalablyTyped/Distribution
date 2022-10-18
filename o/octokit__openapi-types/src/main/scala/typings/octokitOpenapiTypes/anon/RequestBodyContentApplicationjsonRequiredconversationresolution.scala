package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonRequiredconversationresolution extends StObject {
  
  var parameters: PathBranchOwner
  
  var requestBody: ContentApplicationjsonRequiredconversationresolution
  
  var responses: `200403404422`
}
object RequestBodyContentApplicationjsonRequiredconversationresolution {
  
  inline def apply(
    parameters: PathBranchOwner,
    requestBody: ContentApplicationjsonRequiredconversationresolution,
    responses: `200403404422`
  ): RequestBodyContentApplicationjsonRequiredconversationresolution = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonRequiredconversationresolution]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonRequiredconversationresolution](x: Self) {
    
    inline def setParameters(value: PathBranchOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonRequiredconversationresolution): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200403404422`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
