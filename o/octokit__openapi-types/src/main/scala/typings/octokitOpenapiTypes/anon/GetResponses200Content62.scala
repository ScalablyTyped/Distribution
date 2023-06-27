package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content62 extends StObject {
  
  /**
    * Get the customization template for an OIDC subject claim for an organization
    * @description Gets the customization template for an OpenID Connect (OIDC) subject claim.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_administration:write` permission to use this endpoint.
    */
  var get: Responses200Content62
  
  /**
    * Set the customization template for an OIDC subject claim for an organization
    * @description Creates or updates the customization template for an OpenID Connect (OIDC) subject claim.
    * You must authenticate using an access token with the `write:org` scope to use this endpoint.
    * GitHub Apps must have the `admin:org` permission to use this endpoint.
    */
  var put: RequestBodyContent62
}
object GetResponses200Content62 {
  
  inline def apply(get: Responses200Content62, put: RequestBodyContent62): GetResponses200Content62 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content62]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponses200Content62] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Responses200Content62): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent62): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
