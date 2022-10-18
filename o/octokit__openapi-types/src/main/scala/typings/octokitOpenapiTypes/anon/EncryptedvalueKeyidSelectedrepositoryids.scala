package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedvalueKeyidSelectedrepositoryids extends StObject {
  
  /** @description Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get the public key for the authenticated user](https://docs.github.com/rest/reference/codespaces#get-the-public-key-for-the-authenticated-user) endpoint. */
  var encrypted_value: js.UndefOr[String] = js.undefined
  
  /** @description ID of the key you used to encrypt the secret. */
  var key_id: String
  
  /** @description An array of repository ids that can access the user secret. You can manage the list of selected repositories using the [List selected repositories for a user secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret), [Set selected repositories for a user secret](https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-a-user-secret), and [Remove a selected repository from a user secret](https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret) endpoints. */
  var selected_repository_ids: js.UndefOr[js.Array[String]] = js.undefined
}
object EncryptedvalueKeyidSelectedrepositoryids {
  
  inline def apply(key_id: String): EncryptedvalueKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal(key_id = key_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedvalueKeyidSelectedrepositoryids]
  }
  
  extension [Self <: EncryptedvalueKeyidSelectedrepositoryids](x: Self) {
    
    inline def setEncrypted_value(value: String): Self = StObject.set(x, "encrypted_value", value.asInstanceOf[js.Any])
    
    inline def setEncrypted_valueUndefined: Self = StObject.set(x, "encrypted_value", js.undefined)
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_ids(value: js.Array[String]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    inline def setSelected_repository_idsVarargs(value: String*): Self = StObject.set(x, "selected_repository_ids", js.Array(value*))
  }
}
