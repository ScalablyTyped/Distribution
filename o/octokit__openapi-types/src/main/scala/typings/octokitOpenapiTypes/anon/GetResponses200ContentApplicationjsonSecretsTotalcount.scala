package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonSecretsTotalcount extends StObject {
  
  /**
    * List organization secrets
    * @description Lists all Codespaces secrets available at the organization-level without revealing their encrypted values.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonSecretsTotalcount
}
object GetResponses200ContentApplicationjsonSecretsTotalcount {
  
  inline def apply(get: Responses200ContentApplicationjsonSecretsTotalcount): GetResponses200ContentApplicationjsonSecretsTotalcount = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonSecretsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonSecretsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonSecretsTotalcount): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
