package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRequestBodyContent15 extends StObject {
  
  /**
    * Sets the GitHub Actions OpenID Connect (OIDC) custom issuer policy for an enterprise.
    * You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.
    * GitHub Apps must have the `enterprise_administration:write` permission to use this endpoint.
    */
  var put: RequestBodyContent15
}
object PutRequestBodyContent15 {
  
  inline def apply(put: RequestBodyContent15): PutRequestBodyContent15 = {
    val __obj = js.Dynamic.literal(put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRequestBodyContent15]
  }
  
  extension [Self <: PutRequestBodyContent15](x: Self) {
    
    inline def setPut(value: RequestBodyContent15): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
