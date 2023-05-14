package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRepositoryForSecretForAuthenticatedUser extends StObject {
  
  /**
    * Adds a repository to the selected repositories for a user's codespace secret.
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on the referenced repository to use this endpoint.
    */
  def addRepositoryForSecretForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def addRepositoryForSecretForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Adds a repository to the selected repositories for a user's codespace secret.
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on the referenced repository to use this endpoint.
    */
  @JSName("addRepositoryForSecretForAuthenticatedUser")
  var addRepositoryForSecretForAuthenticatedUser_Original: `223`
  
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def addSelectedRepoToOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def addSelectedRepoToOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("addSelectedRepoToOrgSecret")
  var addSelectedRepoToOrgSecret_Original: `224`
  
  /**
    * List the machine types a codespace can transition to use.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  def codespaceMachinesForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}/machines']['response'] */ js.Any
  ]
  def codespaceMachinesForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}/machines']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}/machines']['response'] */ js.Any
  ]
  /**
    * List the machine types a codespace can transition to use.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  @JSName("codespaceMachinesForAuthenticatedUser")
  var codespaceMachinesForAuthenticatedUser_Original: `225`
  
  /**
    * Creates a new codespace, owned by the authenticated user.
    *
    * This endpoint requires either a `repository_id` OR a `pull_request` but not both.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  def createForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces']['response'] */ js.Any
  ]
  def createForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces']['response'] */ js.Any
  ]
  /**
    * Creates a new codespace, owned by the authenticated user.
    *
    * This endpoint requires either a `repository_id` OR a `pull_request` but not both.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("createForAuthenticatedUser")
  var createForAuthenticatedUser_Original: `226`
  
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `admin:org` scope to use this endpoint.
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
  def createOrUpdateOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `admin:org` scope to use this endpoint.
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
  @JSName("createOrUpdateOrgSecret")
  var createOrUpdateOrgSecret_Original: `227`
  
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets`
    * repository permission to use this endpoint.
    *
    * #### Example of encrypting a secret using Node.js
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
    * #### Example of encrypting a secret using Python
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
    * #### Example of encrypting a secret using C#
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
    * #### Example of encrypting a secret using Ruby
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
  def createOrUpdateRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets`
    * repository permission to use this endpoint.
    *
    * #### Example of encrypting a secret using Node.js
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
    * #### Example of encrypting a secret using Python
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
    * #### Example of encrypting a secret using C#
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
    * #### Example of encrypting a secret using Ruby
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
  @JSName("createOrUpdateRepoSecret")
  var createOrUpdateRepoSecret_Original: `228`
  
  /**
    * Creates or updates a secret for a user's codespace with an encrypted value. Encrypt your secret using
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
  def createOrUpdateSecretForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateSecretForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Creates or updates a secret for a user's codespace with an encrypted value. Encrypt your secret using
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
  @JSName("createOrUpdateSecretForAuthenticatedUser")
  var createOrUpdateSecretForAuthenticatedUser_Original: `229`
  
  /**
    * Creates a codespace owned by the authenticated user for the specified pull request.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  def createWithPrForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/codespaces']['response'] */ js.Any
  ]
  def createWithPrForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/codespaces']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/pulls/{pull_number}/codespaces']['response'] */ js.Any
  ]
  /**
    * Creates a codespace owned by the authenticated user for the specified pull request.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("createWithPrForAuthenticatedUser")
  var createWithPrForAuthenticatedUser_Original: `230`
  
  /**
    * Creates a codespace owned by the authenticated user in the specified repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  def createWithRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/codespaces']['response'] */ js.Any
  ]
  def createWithRepoForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/codespaces']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/codespaces']['response'] */ js.Any
  ]
  /**
    * Creates a codespace owned by the authenticated user in the specified repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("createWithRepoForAuthenticatedUser")
  var createWithRepoForAuthenticatedUser_Original: `231`
  
  /**
    * Codespaces for the specified users will no longer be billed to the organization.
    * To use this endpoint, the billing settings for the organization must be set to `selected_members`. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def deleteCodespacesBillingUsers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/billing/selected_users']['response'] */ js.Any
  ]
  def deleteCodespacesBillingUsers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/billing/selected_users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/billing/selected_users']['response'] */ js.Any
  ]
  /**
    * Codespaces for the specified users will no longer be billed to the organization.
    * To use this endpoint, the billing settings for the organization must be set to `selected_members`. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("deleteCodespacesBillingUsers")
  var deleteCodespacesBillingUsers_Original: `232`
  
  /**
    * Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  def deleteForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  def deleteForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/{codespace_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("deleteForAuthenticatedUser")
  var deleteForAuthenticatedUser_Original: `233`
  
  /**
    * Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def deleteFromOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/members/{username}/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  def deleteFromOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/members/{username}/codespaces/{codespace_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/members/{username}/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("deleteFromOrganization")
  var deleteFromOrganization_Original: `234`
  
  /**
    * Deletes an organization secret using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def deleteOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes an organization secret using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("deleteOrgSecret")
  var deleteOrgSecret_Original: `235`
  
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  def deleteRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("deleteRepoSecret")
  var deleteRepoSecret_Original: `236`
  
  /**
    * Deletes a secret from a user's codespaces using the secret name. Deleting the secret will remove access from all codespaces that were allowed to access the secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  def deleteSecretForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteSecretForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a secret from a user's codespaces using the secret name. Deleting the secret will remove access from all codespaces that were allowed to access the secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  @JSName("deleteSecretForAuthenticatedUser")
  var deleteSecretForAuthenticatedUser_Original: `237`
  
  /**
    * Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be monitored.
    *
    * If changes cannot be pushed to the codespace's repository, they will be pushed to a new or previously-existing fork instead.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  def exportForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/exports']['response'] */ js.Any
  ]
  def exportForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/exports']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/exports']['response'] */ js.Any
  ]
  /**
    * Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be monitored.
    *
    * If changes cannot be pushed to the codespace's repository, they will be pushed to a new or previously-existing fork instead.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  @JSName("exportForAuthenticatedUser")
  var exportForAuthenticatedUser_Original: `238`
  
  /**
    * Lists the codespaces that a member of an organization has for repositories in that organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def getCodespacesForUserInOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members/{username}/codespaces']['response'] */ js.Any
  ]
  def getCodespacesForUserInOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members/{username}/codespaces']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/members/{username}/codespaces']['response'] */ js.Any
  ]
  /**
    * Lists the codespaces that a member of an organization has for repositories in that organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("getCodespacesForUserInOrg")
  var getCodespacesForUserInOrg_Original: `239`
  
  /**
    * Gets information about an export of a codespace.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  def getExportDetailsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}/exports/{export_id}']['response'] */ js.Any
  ]
  def getExportDetailsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}/exports/{export_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}/exports/{export_id}']['response'] */ js.Any
  ]
  /**
    * Gets information about an export of a codespace.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  @JSName("getExportDetailsForAuthenticatedUser")
  var getExportDetailsForAuthenticatedUser_Original: `240`
  
  /**
    * Gets information about a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  def getForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  def getForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  /**
    * Gets information about a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("getForAuthenticatedUser")
  var getForAuthenticatedUser_Original: `241`
  
  /**
    * Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def getOrgPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/public-key']['response'] */ js.Any
  ]
  def getOrgPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("getOrgPublicKey")
  var getOrgPublicKey_Original: `242`
  
  /**
    * Gets an organization secret without revealing its encrypted value.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def getOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets an organization secret without revealing its encrypted value.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("getOrgSecret")
  var getOrgSecret_Original: `243`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  def getPublicKeyForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/public-key']['response'] */ js.Any
  ]
  def getPublicKeyForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  @JSName("getPublicKeyForAuthenticatedUser")
  var getPublicKeyForAuthenticatedUser_Original: `244`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  def getRepoPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets/public-key']['response'] */ js.Any
  ]
  def getRepoPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoPublicKey")
  var getRepoPublicKey_Original: `245`
  
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  def getRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoSecret")
  var getRepoSecret_Original: `246`
  
  /**
    * Gets a secret available to a user's codespaces without revealing its encrypted value.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  def getSecretForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getSecretForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets a secret available to a user's codespaces without revealing its encrypted value.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  @JSName("getSecretForAuthenticatedUser")
  var getSecretForAuthenticatedUser_Original: `247`
  
  /**
    * Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files
    * specify launchpoint configurations for codespaces created within the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  def listDevcontainersInRepositoryForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/devcontainers']['response'] */ js.Any
  ]
  def listDevcontainersInRepositoryForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/devcontainers']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/devcontainers']['response'] */ js.Any
  ]
  /**
    * Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files
    * specify launchpoint configurations for codespaces created within the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  @JSName("listDevcontainersInRepositoryForAuthenticatedUser")
  var listDevcontainersInRepositoryForAuthenticatedUser_Original: `248`
  
  /**
    * Lists the authenticated user's codespaces.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  def listForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces']['response'] */ js.Any
  ]
  def listForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces']['response'] */ js.Any
  ]
  /**
    * Lists the authenticated user's codespaces.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("listForAuthenticatedUser")
  var listForAuthenticatedUser_Original: `249`
  
  /**
    * Lists the codespaces associated to a specified organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listInOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces']['response'] */ js.Any
  ]
  def listInOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces']['response'] */ js.Any
  ]
  /**
    * Lists the codespaces associated to a specified organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listInOrganization")
  var listInOrganization_Original: `250`
  
  /**
    * Lists the codespaces associated to a specified repository and the authenticated user.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  def listInRepositoryForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces']['response'] */ js.Any
  ]
  def listInRepositoryForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces']['response'] */ js.Any
  ]
  /**
    * Lists the codespaces associated to a specified repository and the authenticated user.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("listInRepositoryForAuthenticatedUser")
  var listInRepositoryForAuthenticatedUser_Original: `251`
  
  /**
    * Lists all Codespaces secrets available at the organization-level without revealing their encrypted values.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listOrgSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets']['response'] */ js.Any
  ]
  def listOrgSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all Codespaces secrets available at the organization-level without revealing their encrypted values.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listOrgSecrets")
  var listOrgSecrets_Original: `252`
  
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  def listRepoSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets']['response'] */ js.Any
  ]
  def listRepoSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("listRepoSecrets")
  var listRepoSecrets_Original: `253`
  
  /**
    * List the repositories that have been granted the ability to use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  def listRepositoriesForSecretForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def listRepositoriesForSecretForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * List the repositories that have been granted the ability to use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  @JSName("listRepositoriesForSecretForAuthenticatedUser")
  var listRepositoriesForSecretForAuthenticatedUser_Original: `254`
  
  /**
    * Lists all secrets available for a user's Codespaces without revealing their
    * encrypted values.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  def listSecretsForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets']['response'] */ js.Any
  ]
  def listSecretsForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /user/codespaces/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available for a user's Codespaces without revealing their
    * encrypted values.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  @JSName("listSecretsForAuthenticatedUser")
  var listSecretsForAuthenticatedUser_Original: `255`
  
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def listSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listSelectedReposForOrgSecret")
  var listSelectedReposForOrgSecret_Original: `256`
  
  /**
    * Gets the default attributes for codespaces created by the user with the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  def preFlightWithRepoForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/new']['response'] */ js.Any
  ]
  def preFlightWithRepoForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/new']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/new']['response'] */ js.Any
  ]
  /**
    * Gets the default attributes for codespaces created by the user with the repository.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("preFlightWithRepoForAuthenticatedUser")
  var preFlightWithRepoForAuthenticatedUser_Original: `257`
  
  /**
    * Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.
    *
    * The codespace's token is granted write permissions to the repository, allowing the user to push their changes.
    *
    * This will fail for a codespace that is already published, meaning it has an associated repository.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  def publishForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/publish']['response'] */ js.Any
  ]
  def publishForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/publish']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/publish']['response'] */ js.Any
  ]
  /**
    * Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.
    *
    * The codespace's token is granted write permissions to the repository, allowing the user to push their changes.
    *
    * This will fail for a codespace that is already published, meaning it has an associated repository.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("publishForAuthenticatedUser")
  var publishForAuthenticatedUser_Original: `258`
  
  /**
    * Removes a repository from the selected repositories for a user's codespace secret.
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  def removeRepositoryForSecretForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def removeRepositoryForSecretForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /user/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Removes a repository from the selected repositories for a user's codespace secret.
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.
    */
  @JSName("removeRepositoryForSecretForAuthenticatedUser")
  var removeRepositoryForSecretForAuthenticatedUser_Original: `259`
  
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def removeSelectedRepoFromOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def removeSelectedRepoFromOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/codespaces/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("removeSelectedRepoFromOrgSecret")
  var removeSelectedRepoFromOrgSecret_Original: `260`
  
  /**
    * List the machine types available for a given repository based on its configuration.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  def repoMachinesForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/machines']['response'] */ js.Any
  ]
  def repoMachinesForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/machines']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/codespaces/machines']['response'] */ js.Any
  ]
  /**
    * List the machine types available for a given repository based on its configuration.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_metadata` repository permission to use this endpoint.
    */
  @JSName("repoMachinesForAuthenticatedUser")
  var repoMachinesForAuthenticatedUser_Original: `261`
  
  /**
    * Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces billing permissions for users according to the visibility.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def setCodespacesBilling(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/billing']['response'] */ js.Any
  ]
  def setCodespacesBilling(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/billing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/billing']['response'] */ js.Any
  ]
  
  /**
    * Codespaces for the specified users will be billed to the organization.
    * To use this endpoint, the billing settings for the organization must be set to `selected_members`. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def setCodespacesBillingUsers(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/codespaces/billing/selected_users']['response'] */ js.Any
  ]
  def setCodespacesBillingUsers(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/codespaces/billing/selected_users']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/codespaces/billing/selected_users']['response'] */ js.Any
  ]
  /**
    * Codespaces for the specified users will be billed to the organization.
    * To use this endpoint, the billing settings for the organization must be set to `selected_members`. For information on how to change this setting please see [these docs].(https://docs.github.com/rest/codespaces/organizations#manage-access-control-for-organization-codespaces) You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("setCodespacesBillingUsers")
  var setCodespacesBillingUsers_Original: `263`
  
  /**
    * Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces billing permissions for users according to the visibility.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("setCodespacesBilling")
  var setCodespacesBilling_Original: `262`
  
  /**
    * Select the repositories that will use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  def setRepositoriesForSecretForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def setRepositoriesForSecretForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /user/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * Select the repositories that will use a user's codespace secret.
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    */
  @JSName("setRepositoriesForSecretForAuthenticatedUser")
  var setRepositoriesForSecretForAuthenticatedUser_Original: `264`
  
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def setSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def setSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/codespaces/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("setSelectedReposForOrgSecret")
  var setSelectedReposForOrgSecret_Original: `265`
  
  /**
    * Starts a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  def startForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/start']['response'] */ js.Any
  ]
  def startForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/start']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/start']['response'] */ js.Any
  ]
  /**
    * Starts a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  @JSName("startForAuthenticatedUser")
  var startForAuthenticatedUser_Original: `266`
  
  /**
    * Stops a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  def stopForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/stop']['response'] */ js.Any
  ]
  def stopForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/stop']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /user/codespaces/{codespace_name}/stop']['response'] */ js.Any
  ]
  /**
    * Stops a user's codespace.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  @JSName("stopForAuthenticatedUser")
  var stopForAuthenticatedUser_Original: `267`
  
  /**
    * Stops a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def stopInOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/members/{username}/codespaces/{codespace_name}/stop']['response'] */ js.Any
  ]
  def stopInOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/members/{username}/codespaces/{codespace_name}/stop']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/members/{username}/codespaces/{codespace_name}/stop']['response'] */ js.Any
  ]
  /**
    * Stops a user's codespace.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("stopInOrganization")
  var stopInOrganization_Original: `268`
  
  /**
    * Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders can be modified using this endpoint.
    *
    * If you specify a new machine type it will be applied the next time your codespace is started.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  def updateForAuthenticatedUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  def updateForAuthenticatedUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/codespaces/{codespace_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /user/codespaces/{codespace_name}']['response'] */ js.Any
  ]
  /**
    * Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders can be modified using this endpoint.
    *
    * If you specify a new machine type it will be applied the next time your codespace is started.
    *
    * You must authenticate using an access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.
    */
  @JSName("updateForAuthenticatedUser")
  var updateForAuthenticatedUser_Original: `269`
}
object AddRepositoryForSecretForAuthenticatedUser {
  
  inline def apply(
    addRepositoryForSecretForAuthenticatedUser: `223`,
    addSelectedRepoToOrgSecret: `224`,
    codespaceMachinesForAuthenticatedUser: `225`,
    createForAuthenticatedUser: `226`,
    createOrUpdateOrgSecret: `227`,
    createOrUpdateRepoSecret: `228`,
    createOrUpdateSecretForAuthenticatedUser: `229`,
    createWithPrForAuthenticatedUser: `230`,
    createWithRepoForAuthenticatedUser: `231`,
    deleteCodespacesBillingUsers: `232`,
    deleteForAuthenticatedUser: `233`,
    deleteFromOrganization: `234`,
    deleteOrgSecret: `235`,
    deleteRepoSecret: `236`,
    deleteSecretForAuthenticatedUser: `237`,
    exportForAuthenticatedUser: `238`,
    getCodespacesForUserInOrg: `239`,
    getExportDetailsForAuthenticatedUser: `240`,
    getForAuthenticatedUser: `241`,
    getOrgPublicKey: `242`,
    getOrgSecret: `243`,
    getPublicKeyForAuthenticatedUser: `244`,
    getRepoPublicKey: `245`,
    getRepoSecret: `246`,
    getSecretForAuthenticatedUser: `247`,
    listDevcontainersInRepositoryForAuthenticatedUser: `248`,
    listForAuthenticatedUser: `249`,
    listInOrganization: `250`,
    listInRepositoryForAuthenticatedUser: `251`,
    listOrgSecrets: `252`,
    listRepoSecrets: `253`,
    listRepositoriesForSecretForAuthenticatedUser: `254`,
    listSecretsForAuthenticatedUser: `255`,
    listSelectedReposForOrgSecret: `256`,
    preFlightWithRepoForAuthenticatedUser: `257`,
    publishForAuthenticatedUser: `258`,
    removeRepositoryForSecretForAuthenticatedUser: `259`,
    removeSelectedRepoFromOrgSecret: `260`,
    repoMachinesForAuthenticatedUser: `261`,
    setCodespacesBilling: `262`,
    setCodespacesBillingUsers: `263`,
    setRepositoriesForSecretForAuthenticatedUser: `264`,
    setSelectedReposForOrgSecret: `265`,
    startForAuthenticatedUser: `266`,
    stopForAuthenticatedUser: `267`,
    stopInOrganization: `268`,
    updateForAuthenticatedUser: `269`
  ): AddRepositoryForSecretForAuthenticatedUser = {
    val __obj = js.Dynamic.literal(addRepositoryForSecretForAuthenticatedUser = addRepositoryForSecretForAuthenticatedUser.asInstanceOf[js.Any], addSelectedRepoToOrgSecret = addSelectedRepoToOrgSecret.asInstanceOf[js.Any], codespaceMachinesForAuthenticatedUser = codespaceMachinesForAuthenticatedUser.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createOrUpdateOrgSecret = createOrUpdateOrgSecret.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], createOrUpdateSecretForAuthenticatedUser = createOrUpdateSecretForAuthenticatedUser.asInstanceOf[js.Any], createWithPrForAuthenticatedUser = createWithPrForAuthenticatedUser.asInstanceOf[js.Any], createWithRepoForAuthenticatedUser = createWithRepoForAuthenticatedUser.asInstanceOf[js.Any], deleteCodespacesBillingUsers = deleteCodespacesBillingUsers.asInstanceOf[js.Any], deleteForAuthenticatedUser = deleteForAuthenticatedUser.asInstanceOf[js.Any], deleteFromOrganization = deleteFromOrganization.asInstanceOf[js.Any], deleteOrgSecret = deleteOrgSecret.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], deleteSecretForAuthenticatedUser = deleteSecretForAuthenticatedUser.asInstanceOf[js.Any], exportForAuthenticatedUser = exportForAuthenticatedUser.asInstanceOf[js.Any], getCodespacesForUserInOrg = getCodespacesForUserInOrg.asInstanceOf[js.Any], getExportDetailsForAuthenticatedUser = getExportDetailsForAuthenticatedUser.asInstanceOf[js.Any], getForAuthenticatedUser = getForAuthenticatedUser.asInstanceOf[js.Any], getOrgPublicKey = getOrgPublicKey.asInstanceOf[js.Any], getOrgSecret = getOrgSecret.asInstanceOf[js.Any], getPublicKeyForAuthenticatedUser = getPublicKeyForAuthenticatedUser.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], getSecretForAuthenticatedUser = getSecretForAuthenticatedUser.asInstanceOf[js.Any], listDevcontainersInRepositoryForAuthenticatedUser = listDevcontainersInRepositoryForAuthenticatedUser.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listInOrganization = listInOrganization.asInstanceOf[js.Any], listInRepositoryForAuthenticatedUser = listInRepositoryForAuthenticatedUser.asInstanceOf[js.Any], listOrgSecrets = listOrgSecrets.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listRepositoriesForSecretForAuthenticatedUser = listRepositoriesForSecretForAuthenticatedUser.asInstanceOf[js.Any], listSecretsForAuthenticatedUser = listSecretsForAuthenticatedUser.asInstanceOf[js.Any], listSelectedReposForOrgSecret = listSelectedReposForOrgSecret.asInstanceOf[js.Any], preFlightWithRepoForAuthenticatedUser = preFlightWithRepoForAuthenticatedUser.asInstanceOf[js.Any], publishForAuthenticatedUser = publishForAuthenticatedUser.asInstanceOf[js.Any], removeRepositoryForSecretForAuthenticatedUser = removeRepositoryForSecretForAuthenticatedUser.asInstanceOf[js.Any], removeSelectedRepoFromOrgSecret = removeSelectedRepoFromOrgSecret.asInstanceOf[js.Any], repoMachinesForAuthenticatedUser = repoMachinesForAuthenticatedUser.asInstanceOf[js.Any], setCodespacesBilling = setCodespacesBilling.asInstanceOf[js.Any], setCodespacesBillingUsers = setCodespacesBillingUsers.asInstanceOf[js.Any], setRepositoriesForSecretForAuthenticatedUser = setRepositoriesForSecretForAuthenticatedUser.asInstanceOf[js.Any], setSelectedReposForOrgSecret = setSelectedReposForOrgSecret.asInstanceOf[js.Any], startForAuthenticatedUser = startForAuthenticatedUser.asInstanceOf[js.Any], stopForAuthenticatedUser = stopForAuthenticatedUser.asInstanceOf[js.Any], stopInOrganization = stopInOrganization.asInstanceOf[js.Any], updateForAuthenticatedUser = updateForAuthenticatedUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRepositoryForSecretForAuthenticatedUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddRepositoryForSecretForAuthenticatedUser] (val x: Self) extends AnyVal {
    
    inline def setAddRepositoryForSecretForAuthenticatedUser(value: `223`): Self = StObject.set(x, "addRepositoryForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgSecret(value: `224`): Self = StObject.set(x, "addSelectedRepoToOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCodespaceMachinesForAuthenticatedUser(value: `225`): Self = StObject.set(x, "codespaceMachinesForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateForAuthenticatedUser(value: `226`): Self = StObject.set(x, "createForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateOrgSecret(value: `227`): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: `228`): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateSecretForAuthenticatedUser(value: `229`): Self = StObject.set(x, "createOrUpdateSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateWithPrForAuthenticatedUser(value: `230`): Self = StObject.set(x, "createWithPrForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateWithRepoForAuthenticatedUser(value: `231`): Self = StObject.set(x, "createWithRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteCodespacesBillingUsers(value: `232`): Self = StObject.set(x, "deleteCodespacesBillingUsers", value.asInstanceOf[js.Any])
    
    inline def setDeleteForAuthenticatedUser(value: `233`): Self = StObject.set(x, "deleteForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteFromOrganization(value: `234`): Self = StObject.set(x, "deleteFromOrganization", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgSecret(value: `235`): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `236`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteSecretForAuthenticatedUser(value: `237`): Self = StObject.set(x, "deleteSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setExportForAuthenticatedUser(value: `238`): Self = StObject.set(x, "exportForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetCodespacesForUserInOrg(value: `239`): Self = StObject.set(x, "getCodespacesForUserInOrg", value.asInstanceOf[js.Any])
    
    inline def setGetExportDetailsForAuthenticatedUser(value: `240`): Self = StObject.set(x, "getExportDetailsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetForAuthenticatedUser(value: `241`): Self = StObject.set(x, "getForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetOrgPublicKey(value: `242`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetOrgSecret(value: `243`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setGetPublicKeyForAuthenticatedUser(value: `244`): Self = StObject.set(x, "getPublicKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `245`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `246`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetSecretForAuthenticatedUser(value: `247`): Self = StObject.set(x, "getSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListDevcontainersInRepositoryForAuthenticatedUser(value: `248`): Self = StObject.set(x, "listDevcontainersInRepositoryForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListForAuthenticatedUser(value: `249`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListInOrganization(value: `250`): Self = StObject.set(x, "listInOrganization", value.asInstanceOf[js.Any])
    
    inline def setListInRepositoryForAuthenticatedUser(value: `251`): Self = StObject.set(x, "listInRepositoryForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListOrgSecrets(value: `252`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `253`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepositoriesForSecretForAuthenticatedUser(value: `254`): Self = StObject.set(x, "listRepositoriesForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListSecretsForAuthenticatedUser(value: `255`): Self = StObject.set(x, "listSecretsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgSecret(value: `256`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setPreFlightWithRepoForAuthenticatedUser(value: `257`): Self = StObject.set(x, "preFlightWithRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setPublishForAuthenticatedUser(value: `258`): Self = StObject.set(x, "publishForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRemoveRepositoryForSecretForAuthenticatedUser(value: `259`): Self = StObject.set(x, "removeRepositoryForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgSecret(value: `260`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setRepoMachinesForAuthenticatedUser(value: `261`): Self = StObject.set(x, "repoMachinesForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setSetCodespacesBilling(value: `262`): Self = StObject.set(x, "setCodespacesBilling", value.asInstanceOf[js.Any])
    
    inline def setSetCodespacesBillingUsers(value: `263`): Self = StObject.set(x, "setCodespacesBillingUsers", value.asInstanceOf[js.Any])
    
    inline def setSetRepositoriesForSecretForAuthenticatedUser(value: `264`): Self = StObject.set(x, "setRepositoriesForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgSecret(value: `265`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setStartForAuthenticatedUser(value: `266`): Self = StObject.set(x, "startForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setStopForAuthenticatedUser(value: `267`): Self = StObject.set(x, "stopForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setStopInOrganization(value: `268`): Self = StObject.set(x, "stopInOrganization", value.asInstanceOf[js.Any])
    
    inline def setUpdateForAuthenticatedUser(value: `269`): Self = StObject.set(x, "updateForAuthenticatedUser", value.asInstanceOf[js.Any])
  }
}
