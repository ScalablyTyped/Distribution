package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjson327 extends StObject {
  
  /** Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint. */
  var get: Responses200ContentApplicationjson327
}
object GetResponses200ContentApplicationjson327 {
  
  inline def apply(get: Responses200ContentApplicationjson327): GetResponses200ContentApplicationjson327 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjson327]
  }
  
  extension [Self <: GetResponses200ContentApplicationjson327](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjson327): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
