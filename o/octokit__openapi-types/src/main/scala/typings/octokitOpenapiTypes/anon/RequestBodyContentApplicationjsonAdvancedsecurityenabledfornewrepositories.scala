package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAdvancedsecurityenabledfornewrepositories extends StObject {
  
  var parameters: PathOrg
  
  var requestBody: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories
  
  var responses: `409`
}
object RequestBodyContentApplicationjsonAdvancedsecurityenabledfornewrepositories {
  
  inline def apply(
    parameters: PathOrg,
    requestBody: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories,
    responses: `409`
  ): RequestBodyContentApplicationjsonAdvancedsecurityenabledfornewrepositories = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAdvancedsecurityenabledfornewrepositories]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonAdvancedsecurityenabledfornewrepositories](x: Self) {
    
    inline def setParameters(value: PathOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAdvancedsecurityenabledfornewrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `409`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
