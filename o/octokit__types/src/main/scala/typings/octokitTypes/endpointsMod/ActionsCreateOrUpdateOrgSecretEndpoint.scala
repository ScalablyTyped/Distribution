package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateOrUpdateOrgSecretEndpoint extends js.Object {
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
  var selected_repository_ids: js.UndefOr[js.Array[String]] = js.undefined
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
  def apply(
    org_ : String,
    secret_name: String,
    encrypted_value: String = null,
    key_id: String = null,
    selected_repository_ids: js.Array[String] = null,
    visibility: all | `private` | selected = null
  ): ActionsCreateOrUpdateOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(secret_name = secret_name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (encrypted_value != null) __obj.updateDynamic("encrypted_value")(encrypted_value.asInstanceOf[js.Any])
    if (key_id != null) __obj.updateDynamic("key_id")(key_id.asInstanceOf[js.Any])
    if (selected_repository_ids != null) __obj.updateDynamic("selected_repository_ids")(selected_repository_ids.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateOrgSecretEndpoint]
  }
}

