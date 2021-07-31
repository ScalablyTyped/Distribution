package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsCreateOrUpdateRepoSecretEndpoint extends StObject {
  
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
  def apply(owner: String, repo: String, secret_name: String): ActionsCreateOrUpdateRepoSecretEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], secret_name = secret_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsCreateOrUpdateRepoSecretEndpoint]
  }
  
  @scala.inline
  implicit class ActionsCreateOrUpdateRepoSecretEndpointMutableBuilder[Self <: ActionsCreateOrUpdateRepoSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncrypted_value(value: String): Self = StObject.set(x, "encrypted_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted_valueUndefined: Self = StObject.set(x, "encrypted_value", js.undefined)
    
    @scala.inline
    def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret_name(value: String): Self = StObject.set(x, "secret_name", value.asInstanceOf[js.Any])
  }
}
