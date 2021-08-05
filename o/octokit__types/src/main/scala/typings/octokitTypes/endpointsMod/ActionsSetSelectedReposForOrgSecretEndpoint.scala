package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsSetSelectedReposForOrgSecretEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var secret_name: String
  
  /**
    * An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can add and remove individual repositories using the [Set selected repositories for an organization secret](https://developer.github.com/v3/actions/secrets/#set-selected-repositories-for-an-organization-secret) and [Remove selected repository from an organization secret](https://developer.github.com/v3/actions/secrets/#remove-selected-repository-from-an-organization-secret) endpoints.
    */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
}
object ActionsSetSelectedReposForOrgSecretEndpoint {
  
  inline def apply(org_ : String, secret_name: String): ActionsSetSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSetSelectedReposForOrgSecretEndpoint]
  }
  
  extension [Self <: ActionsSetSelectedReposForOrgSecretEndpoint](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    inline def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value :_*))
  }
}
