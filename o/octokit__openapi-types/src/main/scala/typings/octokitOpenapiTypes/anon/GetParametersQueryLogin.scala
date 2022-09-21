package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryLogin extends StObject {
  
  /**
    * Listing and deleting credential authorizations is available to organizations with GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products).
    *
    * An authenticated organization owner with the `read:org` scope can list all credential authorizations for an organization that uses SAML single sign-on (SSO). The credentials are either personal access tokens or SSH keys that organization members have authorized for the organization. For more information, see [About authentication with SAML single sign-on](https://docs.github.com/en/articles/about-authentication-with-saml-single-sign-on).
    */
  var get: ParametersQueryLogin
}
object GetParametersQueryLogin {
  
  inline def apply(get: ParametersQueryLogin): GetParametersQueryLogin = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryLogin]
  }
  
  extension [Self <: GetParametersQueryLogin](x: Self) {
    
    inline def setGet(value: ParametersQueryLogin): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
