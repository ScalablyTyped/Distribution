package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionsCreateOrUpdateOrgSecretEndpoint extends js.Object {
  /**
    * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://developer.github.com/v3/actions/secrets/#get-an-organization-public-key) endpoint.
    */
  var encrypted_value: js.UndefOr[String] = js.native
  /**
    * ID of the key you used to encrypt the secret.
    */
  var key_id: js.UndefOr[String] = js.native
  @JSName("org")
  var org_ : String = js.native
  var secret_name: String = js.native
  /**
    * An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://developer.github.com/v3/actions/secrets/#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://developer.github.com/v3/actions/secrets/#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://developer.github.com/v3/actions/secrets/#remove-selected-repository-from-an-organization-secret) endpoints.
    */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Configures the access that repositories have to the organization secret. Can be one of:
    * \- `all` - All repositories in an organization can access the secret.
    * \- `private` - Private repositories in an organization can access the secret.
    * \- `selected` - Only specific repositories can access the secret.
    */
  var visibility: js.UndefOr[all | `private` | selected] = js.native
}

object ActionsCreateOrUpdateOrgSecretEndpoint {
  @scala.inline
  def apply(org_ : String, secret_name: String): ActionsCreateOrUpdateOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateOrgSecretEndpoint]
  }
  @scala.inline
  implicit class ActionsCreateOrUpdateOrgSecretEndpointOps[Self <: ActionsCreateOrUpdateOrgSecretEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecret_name(value: String): Self = this.set("secret_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncrypted_value(value: String): Self = this.set("encrypted_value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted_value: Self = this.set("encrypted_value", js.undefined)
    @scala.inline
    def setKey_id(value: String): Self = this.set("key_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey_id: Self = this.set("key_id", js.undefined)
    @scala.inline
    def setSelected_repository_idsVarargs(value: Double*): Self = this.set("selected_repository_ids", js.Array(value :_*))
    @scala.inline
    def setSelected_repository_ids(value: js.Array[Double]): Self = this.set("selected_repository_ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected_repository_ids: Self = this.set("selected_repository_ids", js.undefined)
    @scala.inline
    def setVisibility(value: all | `private` | selected): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}

