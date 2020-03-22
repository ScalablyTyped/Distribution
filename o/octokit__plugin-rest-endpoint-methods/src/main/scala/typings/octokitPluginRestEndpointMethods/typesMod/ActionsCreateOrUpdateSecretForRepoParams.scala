package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsCreateOrUpdateSecretForRepoParams extends js.Object {
  /**
    * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get your public key](https://developer.github.com/v3/actions/secrets/#get-your-public-key) endpoint.
    */
  var encrypted_value: js.UndefOr[String] = js.undefined
  /**
    * ID of the key you used to encrypt the secret.
    */
  var key_id: js.UndefOr[String] = js.undefined
  var name: String
  var owner: String
  var repo: String
}

object ActionsCreateOrUpdateSecretForRepoParams {
  @scala.inline
  def apply(name: String, owner: String, repo: String, encrypted_value: String = null, key_id: String = null): ActionsCreateOrUpdateSecretForRepoParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (encrypted_value != null) __obj.updateDynamic("encrypted_value")(encrypted_value.asInstanceOf[js.Any])
    if (key_id != null) __obj.updateDynamic("key_id")(key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateSecretForRepoParams]
  }
}

