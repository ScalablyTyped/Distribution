package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonBodyLine extends StObject {
  
  var parameters: PathCommitshaOwner
  
  var requestBody: ContentApplicationjsonBodyLine
  
  var responses: `201HeadersLocation`
}
object RequestBodyContentApplicationjsonBodyLine {
  
  inline def apply(
    parameters: PathCommitshaOwner,
    requestBody: ContentApplicationjsonBodyLine,
    responses: `201HeadersLocation`
  ): RequestBodyContentApplicationjsonBodyLine = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonBodyLine]
  }
  
  extension [Self <: RequestBodyContentApplicationjsonBodyLine](x: Self) {
    
    inline def setParameters(value: PathCommitshaOwner): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBodyLine): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201HeadersLocation`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
