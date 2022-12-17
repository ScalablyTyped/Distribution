package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjson214 extends StObject {
  
  /** Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint. */
  var get: Responses200ContentApplicationjson214
}
object GetResponses200ContentApplicationjson214 {
  
  inline def apply(get: Responses200ContentApplicationjson214): GetResponses200ContentApplicationjson214 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjson214]
  }
  
  extension [Self <: GetResponses200ContentApplicationjson214](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjson214): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
