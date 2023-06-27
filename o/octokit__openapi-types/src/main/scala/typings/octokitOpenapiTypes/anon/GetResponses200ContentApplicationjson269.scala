package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjson269 extends StObject {
  
  /**
    * List repository secrets
    * @description Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  var get: Responses200ContentApplicationjson269
}
object GetResponses200ContentApplicationjson269 {
  
  inline def apply(get: Responses200ContentApplicationjson269): GetResponses200ContentApplicationjson269 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjson269]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200ContentApplicationjson269] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200ContentApplicationjson269): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
