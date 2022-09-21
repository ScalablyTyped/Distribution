package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200ContentApplicationjsonSecrets extends StObject {
  
  /** Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint. */
  var get: Responses200ContentApplicationjsonSecrets
}
object GetResponses200ContentApplicationjsonSecrets {
  
  inline def apply(get: Responses200ContentApplicationjsonSecrets): GetResponses200ContentApplicationjsonSecrets = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200ContentApplicationjsonSecrets]
  }
  
  extension [Self <: GetResponses200ContentApplicationjsonSecrets](x: Self) {
    
    inline def setGet(value: Responses200ContentApplicationjsonSecrets): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
