package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200400 extends StObject {
  
  /**
    * Gets the `opt-out` flag of a GitHub Actions OpenID Connect (OIDC) subject claim customization for a repository.
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint. GitHub Apps must have the `organization_administration:read` permission to use this endpoint.
    */
  var get: Responses200400
  
  /**
    * Sets the `opt-in` or `opt-out` flag of a GitHub Actions OpenID Connect (OIDC) subject claim customization for a repository.
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var put: RequestBodyContent153
}
object GetResponses200400 {
  
  inline def apply(get: Responses200400, put: RequestBodyContent153): GetResponses200400 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200400]
  }
  
  extension [Self <: GetResponses200400](x: Self) {
    
    inline def setGet(value: Responses200400): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent153): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
