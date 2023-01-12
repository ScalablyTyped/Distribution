package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses201ContentApplicationjsonDefault extends StObject {
  
  var parameters: PathEnterpriseString
  
  var requestBody: ContentApplicationjsonAllowspublicrepositories
  
  var responses: `201ContentApplicationjsonDefault`
}
object Responses201ContentApplicationjsonDefault {
  
  inline def apply(
    parameters: PathEnterpriseString,
    requestBody: ContentApplicationjsonAllowspublicrepositories,
    responses: `201ContentApplicationjsonDefault`
  ): Responses201ContentApplicationjsonDefault = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses201ContentApplicationjsonDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses201ContentApplicationjsonDefault] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseString): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonAllowspublicrepositories): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `201ContentApplicationjsonDefault`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
