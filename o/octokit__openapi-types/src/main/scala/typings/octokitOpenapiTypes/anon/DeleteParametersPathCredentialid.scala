package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPathCredentialid extends StObject {
  
  /**
    * Listing and deleting credential authorizations is available to organizations with GitHub Enterprise Cloud. For more information, see [GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products).
    *
    * An authenticated organization owner with the `admin:org` scope can remove a credential authorization for an organization that uses SAML SSO. Once you remove someone's credential authorization, they will need to create a new personal access token or SSH key and authorize it for the organization they want to access.
    */
  var delete: ParametersPathCredentialid
}
object DeleteParametersPathCredentialid {
  
  inline def apply(delete: ParametersPathCredentialid): DeleteParametersPathCredentialid = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPathCredentialid]
  }
  
  extension [Self <: DeleteParametersPathCredentialid](x: Self) {
    
    inline def setDelete(value: ParametersPathCredentialid): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}
