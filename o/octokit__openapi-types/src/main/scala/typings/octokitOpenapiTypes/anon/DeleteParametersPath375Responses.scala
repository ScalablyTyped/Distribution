package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteParametersPath375Responses extends StObject {
  
  /**
    * Delete a secret for the authenticated user
    * @description Deletes a secret from a user's codespaces using the secret name. Deleting the secret will remove access from all codespaces that were allowed to access the secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  var delete: ParametersPath375Responses
  
  /**
    * Get a secret for the authenticated user
    * @description Gets a secret available to a user's codespaces without revealing its encrypted value.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  var get: ParametersPath375
  
  /**
    * Create or update a secret for the authenticated user
    * @description Creates or updates a secret for a user's codespace with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages).
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must also have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    *
    * #### Example encrypting a secret using Node.js
    *
    * Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.
    *
    * ```
    * const sodium = require('libsodium-wrappers')
    * const secret = 'plain-text-secret' // replace with the secret you want to encrypt
    * const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key
    *
    * //Check if libsodium is ready and then proceed.
    * sodium.ready.then(() => {
    *   // Convert Secret & Base64 key to Uint8Array.
    *   let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
    *   let binsec = sodium.from_string(secret)
    *
    *   //Encrypt the secret using LibSodium
    *   let encBytes = sodium.crypto_box_seal(binsec, binkey)
    *
    *   // Convert encrypted Uint8Array to Base64
    *   let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)
    *
    *   console.log(output)
    * });
    * ```
    *
    * #### Example encrypting a secret using Python
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.
    *
    * ```
    * from base64 import b64encode
    * from nacl import encoding, public
    *
    * def encrypt(public_key: str, secret_value: str) -> str:
    *   """Encrypt a Unicode string using the public key."""
    *   public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
    *   sealed_box = public.SealedBox(public_key)
    *   encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
    *   return b64encode(encrypted).decode("utf-8")
    * ```
    *
    * #### Example encrypting a secret using C#
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    * ```
    * var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
    * var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");
    *
    * var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);
    *
    * Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
    * ```
    *
    * #### Example encrypting a secret using Ruby
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    *
    * ```ruby
    * require "rbnacl"
    * require "base64"
    *
    * key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
    * public_key = RbNaCl::PublicKey.new(key)
    *
    * box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
    * encrypted_secret = box.encrypt("my_secret")
    *
    * # Print the base64 encoded secret
    * puts Base64.strict_encode64(encrypted_secret)
    * ```
    */
  var put: RequestBodyContentApplicationjsonKeyidSelectedrepositoryids
}
object DeleteParametersPath375Responses {
  
  inline def apply(
    delete: ParametersPath375Responses,
    get: ParametersPath375,
    put: RequestBodyContentApplicationjsonKeyidSelectedrepositoryids
  ): DeleteParametersPath375Responses = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParametersPath375Responses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteParametersPath375Responses] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: ParametersPath375Responses): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath375): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: RequestBodyContentApplicationjsonKeyidSelectedrepositoryids): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
