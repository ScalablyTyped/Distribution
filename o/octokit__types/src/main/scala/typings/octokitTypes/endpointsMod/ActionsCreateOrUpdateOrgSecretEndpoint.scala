package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateOrUpdateOrgSecretEndpoint extends StObject {
  
  /**
    * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://developer.github.com/v3/actions/secrets/#get-an-organization-public-key) endpoint.
    */
  var encrypted_value: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the key you used to encrypt the secret.
    */
  var key_id: js.UndefOr[String] = js.undefined
  
  @JSName("org")
  var org_ : String
  
  var secret_name: String
  
  /**
    * An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://developer.github.com/v3/actions/secrets/#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://developer.github.com/v3/actions/secrets/#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://developer.github.com/v3/actions/secrets/#remove-selected-repository-from-an-organization-secret) endpoints.
    */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Configures the access that repositories have to the organization secret. Can be one of:
    * \- `all` - All repositories in an organization can access the secret.
    * \- `private` - Private repositories in an organization can access the secret.
    * \- `selected` - Only specific repositories can access the secret.
    */
  var visibility: js.UndefOr[all | `private` | selected] = js.undefined
}
object ActionsCreateOrUpdateOrgSecretEndpoint {
  
  @scala.inline
  def apply(org_ : String, secret_name: String): ActionsCreateOrUpdateOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateOrUpdateOrgSecretEndpointMutableBuilder[Self <: ActionsCreateOrUpdateOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted_value(value: String): Self = StObject.set(x, "encrypted_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted_valueUndefined: Self = StObject.set(x, "encrypted_value", js.undefined)
    
    @scala.inline
    def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    @scala.inline
    def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value :_*))
    
    @scala.inline
    def setVisibility(value: all | `private` | selected): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
