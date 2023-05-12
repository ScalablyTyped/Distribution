package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonSecretsArrayTotalcountNumber extends StObject {
  
  /**
    * List repository secrets
    * @description Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjsonSecretsArrayTotalcountNumber
}
object GetResponses200ContentApplicationjsonSecretsArrayTotalcountNumber {
  
  inline def apply(get: Responses200ContentApplicationjsonSecretsArrayTotalcountNumber): GetResponses200ContentApplicationjsonSecretsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonSecretsArrayTotalcountNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjsonSecretsArrayTotalcountNumber] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjsonSecretsArrayTotalcountNumber): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
