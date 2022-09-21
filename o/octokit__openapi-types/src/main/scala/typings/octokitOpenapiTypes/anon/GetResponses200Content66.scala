package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content66 extends StObject {
  
  /**
    * Gets the customization template for an OpenID Connect (OIDC) subject claim.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_administration:write` permission to use this endpoint.
    */
  var get: Responses200Content66
  
  /**
    * Creates or updates the customization template for an OpenID Connect (OIDC) subject claim.
    * You must authenticate using an access token with the `write:org` scope to use this endpoint.
    * GitHub Apps must have the `admin:org` permission to use this endpoint.
    */
  var put: RequestBodyContent66
}
object GetResponses200Content66 {
  
  inline def apply(get: Responses200Content66, put: RequestBodyContent66): GetResponses200Content66 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content66]
  }
  
  extension [Self <: GetResponses200Content66](x: Self) {
    
    inline def setGet(value: Responses200Content66): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContent66): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
