package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonSecretsArray extends StObject {
  
  /**
    * List organization secrets
    * @description Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonSecretsArray
}
object GetResponses200ContentApplicationjsonSecretsArray {
  
  inline def apply(get: Responses200ContentApplicationjsonSecretsArray): GetResponses200ContentApplicationjsonSecretsArray = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonSecretsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonSecretsArray] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonSecretsArray): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
