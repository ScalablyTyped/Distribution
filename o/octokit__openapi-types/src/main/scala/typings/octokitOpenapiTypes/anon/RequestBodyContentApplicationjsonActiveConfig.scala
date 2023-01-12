package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestBodyContentApplicationjsonActiveConfig extends StObject {
  
  var parameters: `433`
  
  var requestBody: ContentApplicationjsonActiveConfig
  
  var responses: `201ContentApplicationjsonDeliveriesurl`
}
object RequestBodyContentApplicationjsonActiveConfig {
  
  inline def apply(
    parameters: `433`,
    requestBody: ContentApplicationjsonActiveConfig,
    responses: `201ContentApplicationjsonDeliveriesurl`
  ): RequestBodyContentApplicationjsonActiveConfig = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestBodyContentApplicationjsonActiveConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestBodyContentApplicationjsonActiveConfig] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: `433`): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonActiveConfig): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDeliveriesurl`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
