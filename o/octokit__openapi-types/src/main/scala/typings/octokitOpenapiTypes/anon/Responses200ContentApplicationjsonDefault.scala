package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Responses200ContentApplicationjsonDefault extends StObject {
  
  var parameters: PathEnterpriseRunnergroupid
  
  var requestBody: ContentApplicationjsonName
  
  var responses: `200ContentApplicationjsonDefault`
}
object Responses200ContentApplicationjsonDefault {
  
  inline def apply(
    parameters: PathEnterpriseRunnergroupid,
    requestBody: ContentApplicationjsonName,
    responses: `200ContentApplicationjsonDefault`
  ): Responses200ContentApplicationjsonDefault = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Responses200ContentApplicationjsonDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Responses200ContentApplicationjsonDefault] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: PathEnterpriseRunnergroupid): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequestBody(value: ContentApplicationjsonName): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: `200ContentApplicationjsonDefault`): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
  }
}
