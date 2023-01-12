package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonAutotriggerchecks extends StObject {
  
  var parameters: `135`
  
  var requestBody: ContentApplicationjsonAutotriggerchecks
  
  var responses: `200Content176`
}
object RequestBodyContentApplicationjsonAutotriggerchecks {
  
  inline def apply(
    parameters: `135`,
    requestBody: ContentApplicationjsonAutotriggerchecks,
    responses: `200Content176`
  ): RequestBodyContentApplicationjsonAutotriggerchecks = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonAutotriggerchecks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonAutotriggerchecks] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `135`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAutotriggerchecks): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200Content176`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
