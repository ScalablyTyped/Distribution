package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsCreateOrUpdateRepoSecretEndpoint extends js.Object {
  
  /**
    * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get a repository public key](https://developer.github.com/v3/actions/secrets/#get-a-repository-public-key) endpoint.
    */
  var encrypted_value: js.UndefOr[String] = js.native
  
  /**
    * ID of the key you used to encrypt the secret.
    */
  var key_id: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  var secret_name: String = js.native
}
object ActionsCreateOrUpdateRepoSecretEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, secret_name: String): ActionsCreateOrUpdateRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateRepoSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateOrUpdateRepoSecretEndpointOps[Self <: ActionsCreateOrUpdateRepoSecretEndpoint] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    
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
  }
}
