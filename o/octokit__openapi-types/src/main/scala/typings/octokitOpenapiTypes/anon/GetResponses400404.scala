package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses400404 extends StObject {
  
  /**
    * Get the customization template for an OIDC subject claim for a repository
    * @description Gets the customization template for an OpenID Connect (OIDC) subject claim.
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint. GitHub Apps must have the `organization_administration:read` permission to use this endpoint.
    */
  var get: Responses400404
  
  /**
    * Set the customization template for an OIDC subject claim for a repository
    * @description Sets the customization template and `opt-in` or `opt-out` flag for an OpenID Connect (OIDC) subject claim for a repository.
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  var put: RequestBodyContentApplicationjsonIncludeclaimkeys
}
object GetResponses400404 {
  
  inline def apply(get: Responses400404, put: RequestBodyContentApplicationjsonIncludeclaimkeys): GetResponses400404 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses400404]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses400404] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses400404): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonIncludeclaimkeys): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
