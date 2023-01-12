package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonDescriptionDueon extends StObject {
  
  var parameters: PathMilestonenumber
  
  var requestBody: ContentApplicationjsonDescriptionDueon
  
  var responses: `283`
}
object RequestBodyContentApplicationjsonDescriptionDueon {
  
  inline def apply(
    parameters: PathMilestonenumber,
    requestBody: ContentApplicationjsonDescriptionDueon,
    responses: `283`
  ): RequestBodyContentApplicationjsonDescriptionDueon = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonDescriptionDueon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonDescriptionDueon] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathMilestonenumber): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonDescriptionDueon): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `283`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
