package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateOrUpdateRepoSecretEndpoint extends js.Object {
  /**
    * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get a repository public key](https://developer.github.com/v3/actions/secrets/#get-a-repository-public-key) endpoint.
    */
  var encrypted_value: js.UndefOr[String] = js.undefined
  /**
    * ID of the key you used to encrypt the secret.
    */
  var key_id: js.UndefOr[String] = js.undefined
  var owner: String
  var repo: String
  var secret_name: String
}

object ActionsCreateOrUpdateRepoSecretEndpoint {
  @scala.inline
  def apply(
    owner: String,
    repo: String,
    secret_name: String,
    encrypted_value: String = null,
    key_id: String = null
  ): ActionsCreateOrUpdateRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    if (encrypted_value != null) __obj.updateDynamic("encrypted_value")(encrypted_value.asInstanceOf[js.Any])
    if (key_id != null) __obj.updateDynamic("key_id")(key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateRepoSecretEndpoint]
  }
}

