package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonLasteditedat extends StObject {
  
  var parameters: PathCommentnumberDiscussionnumberOrg
  
  var requestBody: ContentApplicationjsonBody
  
  var responses: `200ContentApplicationjsonLasteditedat`
}
object Responses200ContentApplicationjsonLasteditedat {
  
  inline def apply(
    parameters: PathCommentnumberDiscussionnumberOrg,
    requestBody: ContentApplicationjsonBody,
    responses: `200ContentApplicationjsonLasteditedat`
  ): Responses200ContentApplicationjsonLasteditedat = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonLasteditedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonLasteditedat] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathCommentnumberDiscussionnumberOrg): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonLasteditedat`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
