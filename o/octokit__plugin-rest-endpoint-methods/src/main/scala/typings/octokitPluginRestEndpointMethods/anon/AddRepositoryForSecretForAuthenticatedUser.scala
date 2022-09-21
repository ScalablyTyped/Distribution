package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
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
  var addRepositoryForSecretForAuthenticatedUser_Original: `189`
  
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
  var codespaceMachinesForAuthenticatedUser_Original: `190`
  
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
  var createForAuthenticatedUser_Original: `191`
  
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository
    * permission to use this endpoint.
    *
    * #### Example of encrypting a secret using Node.js
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    * ```
    * const sodium = require('tweetsodium');
    *
    * const key = "base64-encoded-public-key";
    * const value = "plain-text-secret";
    *
    * // Convert the message and key to Uint8Array's (Buffer implements that interface)
    * const messageBytes = Buffer.from(value);
    * const keyBytes = Buffer.from(key, 'base64');
    *
    * // Encrypt using LibSodium.
    * const encryptedBytes = sodium.seal(messageBytes, keyBytes);
    *
    * // Base64 the encrypted secret
    * const encrypted = Buffer.from(encryptedBytes).toString('base64');
    *
    * console.log(encrypted);
    * ```
    *
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
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository
    * permission to use this endpoint.
    *
    * #### Example of encrypting a secret using Node.js
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    * ```
    * const sodium = require('tweetsodium');
    *
    * const key = "base64-encoded-public-key";
    * const value = "plain-text-secret";
    *
    * // Convert the message and key to Uint8Array's (Buffer implements that interface)
    * const messageBytes = Buffer.from(value);
    * const keyBytes = Buffer.from(key, 'base64');
    *
    * // Encrypt using LibSodium.
    * const encryptedBytes = sodium.seal(messageBytes, keyBytes);
    *
    * // Base64 the encrypted secret
    * const encrypted = Buffer.from(encryptedBytes).toString('base64');
    *
    * console.log(encrypted);
    * ```
    *
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
  var createOrUpdateRepoSecret_Original: `192`
  
  /**
    * Creates or updates a secret for a user's codespace with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages).
    *
    * You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must also have Codespaces access to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission and `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    *
    * #### Example encrypting a secret using Node.js
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    * ```
    * const sodium = require('tweetsodium');
    *
    * const key = "base64-encoded-public-key";
    * const value = "plain-text-secret";
    *
    * // Convert the message and key to Uint8Array's (Buffer implements that interface)
    * const messageBytes = Buffer.from(value);
    * const keyBytes = Buffer.from(key, 'base64');
    *
    * // Encrypt using LibSodium.
    * const encryptedBytes = sodium.seal(messageBytes, keyBytes);
    *
    * // Base64 the encrypted secret
    * const encrypted = Buffer.from(encryptedBytes).toString('base64');
    *
    * console.log(encrypted);
    * ```
    *
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
    * GitHub Apps must have read access to the `codespaces_user_secrets` user permission and `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.
    *
    * #### Example encrypting a secret using Node.js
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    * ```
    * const sodium = require('tweetsodium');
    *
    * const key = "base64-encoded-public-key";
    * const value = "plain-text-secret";
    *
    * // Convert the message and key to Uint8Array's (Buffer implements that interface)
    * const messageBytes = Buffer.from(value);
    * const keyBytes = Buffer.from(key, 'base64');
    *
    * // Encrypt using LibSodium.
    * const encryptedBytes = sodium.seal(messageBytes, keyBytes);
    *
    * // Base64 the encrypted secret
    * const encrypted = Buffer.from(encryptedBytes).toString('base64');
    *
    * console.log(encrypted);
    * ```
    *
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
  var createOrUpdateSecretForAuthenticatedUser_Original: `193`
  
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
  var createWithPrForAuthenticatedUser_Original: `194`
  
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
  var createWithRepoForAuthenticatedUser_Original: `195`
  
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
  var deleteForAuthenticatedUser_Original: `196`
  
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
  var deleteFromOrganization_Original: `197`
  
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
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
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("deleteRepoSecret")
  var deleteRepoSecret_Original: `198`
  
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
  var deleteSecretForAuthenticatedUser_Original: `199`
  
  /**
    * Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be monitored.
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
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  @JSName("exportForAuthenticatedUser")
  var exportForAuthenticatedUser_Original: `200`
  
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
  var getExportDetailsForAuthenticatedUser_Original: `201`
  
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
  var getForAuthenticatedUser_Original: `202`
  
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
  var getPublicKeyForAuthenticatedUser_Original: `203`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
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
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoPublicKey")
  var getRepoPublicKey_Original: `204`
  
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
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
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoSecret")
  var getRepoSecret_Original: `205`
  
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
  var getSecretForAuthenticatedUser_Original: `206`
  
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
  var listDevcontainersInRepositoryForAuthenticatedUser_Original: `207`
  
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
  var listForAuthenticatedUser_Original: `208`
  
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
  var listInOrganization_Original: `209`
  
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
  var listInRepositoryForAuthenticatedUser_Original: `210`
  
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
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
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `codespaces_secrets` repository permission to use this endpoint.
    */
  @JSName("listRepoSecrets")
  var listRepoSecrets_Original: `211`
  
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
  var listRepositoriesForSecretForAuthenticatedUser_Original: `212`
  
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
  var listSecretsForAuthenticatedUser_Original: `213`
  
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
  var preFlightWithRepoForAuthenticatedUser_Original: `214`
  
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
  var removeRepositoryForSecretForAuthenticatedUser_Original: `215`
  
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
  var repoMachinesForAuthenticatedUser_Original: `216`
  
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
  var setRepositoriesForSecretForAuthenticatedUser_Original: `217`
  
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
  var startForAuthenticatedUser_Original: `218`
  
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
  var stopForAuthenticatedUser_Original: `219`
  
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
  var stopInOrganization_Original: `220`
  
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
  var updateForAuthenticatedUser_Original: `221`
}
object AddRepositoryForSecretForAuthenticatedUser {
  
  inline def apply(
    addRepositoryForSecretForAuthenticatedUser: `189`,
    codespaceMachinesForAuthenticatedUser: `190`,
    createForAuthenticatedUser: `191`,
    createOrUpdateRepoSecret: `192`,
    createOrUpdateSecretForAuthenticatedUser: `193`,
    createWithPrForAuthenticatedUser: `194`,
    createWithRepoForAuthenticatedUser: `195`,
    deleteForAuthenticatedUser: `196`,
    deleteFromOrganization: `197`,
    deleteRepoSecret: `198`,
    deleteSecretForAuthenticatedUser: `199`,
    exportForAuthenticatedUser: `200`,
    getExportDetailsForAuthenticatedUser: `201`,
    getForAuthenticatedUser: `202`,
    getPublicKeyForAuthenticatedUser: `203`,
    getRepoPublicKey: `204`,
    getRepoSecret: `205`,
    getSecretForAuthenticatedUser: `206`,
    listDevcontainersInRepositoryForAuthenticatedUser: `207`,
    listForAuthenticatedUser: `208`,
    listInOrganization: `209`,
    listInRepositoryForAuthenticatedUser: `210`,
    listRepoSecrets: `211`,
    listRepositoriesForSecretForAuthenticatedUser: `212`,
    listSecretsForAuthenticatedUser: `213`,
    preFlightWithRepoForAuthenticatedUser: `214`,
    removeRepositoryForSecretForAuthenticatedUser: `215`,
    repoMachinesForAuthenticatedUser: `216`,
    setRepositoriesForSecretForAuthenticatedUser: `217`,
    startForAuthenticatedUser: `218`,
    stopForAuthenticatedUser: `219`,
    stopInOrganization: `220`,
    updateForAuthenticatedUser: `221`
  ): AddRepositoryForSecretForAuthenticatedUser = {
    val __obj = js.Dynamic.literal(addRepositoryForSecretForAuthenticatedUser = addRepositoryForSecretForAuthenticatedUser.asInstanceOf[js.Any], codespaceMachinesForAuthenticatedUser = codespaceMachinesForAuthenticatedUser.asInstanceOf[js.Any], createForAuthenticatedUser = createForAuthenticatedUser.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], createOrUpdateSecretForAuthenticatedUser = createOrUpdateSecretForAuthenticatedUser.asInstanceOf[js.Any], createWithPrForAuthenticatedUser = createWithPrForAuthenticatedUser.asInstanceOf[js.Any], createWithRepoForAuthenticatedUser = createWithRepoForAuthenticatedUser.asInstanceOf[js.Any], deleteForAuthenticatedUser = deleteForAuthenticatedUser.asInstanceOf[js.Any], deleteFromOrganization = deleteFromOrganization.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], deleteSecretForAuthenticatedUser = deleteSecretForAuthenticatedUser.asInstanceOf[js.Any], exportForAuthenticatedUser = exportForAuthenticatedUser.asInstanceOf[js.Any], getExportDetailsForAuthenticatedUser = getExportDetailsForAuthenticatedUser.asInstanceOf[js.Any], getForAuthenticatedUser = getForAuthenticatedUser.asInstanceOf[js.Any], getPublicKeyForAuthenticatedUser = getPublicKeyForAuthenticatedUser.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], getSecretForAuthenticatedUser = getSecretForAuthenticatedUser.asInstanceOf[js.Any], listDevcontainersInRepositoryForAuthenticatedUser = listDevcontainersInRepositoryForAuthenticatedUser.asInstanceOf[js.Any], listForAuthenticatedUser = listForAuthenticatedUser.asInstanceOf[js.Any], listInOrganization = listInOrganization.asInstanceOf[js.Any], listInRepositoryForAuthenticatedUser = listInRepositoryForAuthenticatedUser.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listRepositoriesForSecretForAuthenticatedUser = listRepositoriesForSecretForAuthenticatedUser.asInstanceOf[js.Any], listSecretsForAuthenticatedUser = listSecretsForAuthenticatedUser.asInstanceOf[js.Any], preFlightWithRepoForAuthenticatedUser = preFlightWithRepoForAuthenticatedUser.asInstanceOf[js.Any], removeRepositoryForSecretForAuthenticatedUser = removeRepositoryForSecretForAuthenticatedUser.asInstanceOf[js.Any], repoMachinesForAuthenticatedUser = repoMachinesForAuthenticatedUser.asInstanceOf[js.Any], setRepositoriesForSecretForAuthenticatedUser = setRepositoriesForSecretForAuthenticatedUser.asInstanceOf[js.Any], startForAuthenticatedUser = startForAuthenticatedUser.asInstanceOf[js.Any], stopForAuthenticatedUser = stopForAuthenticatedUser.asInstanceOf[js.Any], stopInOrganization = stopInOrganization.asInstanceOf[js.Any], updateForAuthenticatedUser = updateForAuthenticatedUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRepositoryForSecretForAuthenticatedUser]
  }
  
  extension [Self <: AddRepositoryForSecretForAuthenticatedUser](x: Self) {
    
    inline def setAddRepositoryForSecretForAuthenticatedUser(value: `189`): Self = StObject.set(x, "addRepositoryForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCodespaceMachinesForAuthenticatedUser(value: `190`): Self = StObject.set(x, "codespaceMachinesForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateForAuthenticatedUser(value: `191`): Self = StObject.set(x, "createForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: `192`): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateSecretForAuthenticatedUser(value: `193`): Self = StObject.set(x, "createOrUpdateSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateWithPrForAuthenticatedUser(value: `194`): Self = StObject.set(x, "createWithPrForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setCreateWithRepoForAuthenticatedUser(value: `195`): Self = StObject.set(x, "createWithRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteForAuthenticatedUser(value: `196`): Self = StObject.set(x, "deleteForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteFromOrganization(value: `197`): Self = StObject.set(x, "deleteFromOrganization", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `198`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteSecretForAuthenticatedUser(value: `199`): Self = StObject.set(x, "deleteSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setExportForAuthenticatedUser(value: `200`): Self = StObject.set(x, "exportForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetExportDetailsForAuthenticatedUser(value: `201`): Self = StObject.set(x, "getExportDetailsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetForAuthenticatedUser(value: `202`): Self = StObject.set(x, "getForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetPublicKeyForAuthenticatedUser(value: `203`): Self = StObject.set(x, "getPublicKeyForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `204`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `205`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetSecretForAuthenticatedUser(value: `206`): Self = StObject.set(x, "getSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListDevcontainersInRepositoryForAuthenticatedUser(value: `207`): Self = StObject.set(x, "listDevcontainersInRepositoryForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListForAuthenticatedUser(value: `208`): Self = StObject.set(x, "listForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListInOrganization(value: `209`): Self = StObject.set(x, "listInOrganization", value.asInstanceOf[js.Any])
    
    inline def setListInRepositoryForAuthenticatedUser(value: `210`): Self = StObject.set(x, "listInRepositoryForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `211`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepositoriesForSecretForAuthenticatedUser(value: `212`): Self = StObject.set(x, "listRepositoriesForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setListSecretsForAuthenticatedUser(value: `213`): Self = StObject.set(x, "listSecretsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setPreFlightWithRepoForAuthenticatedUser(value: `214`): Self = StObject.set(x, "preFlightWithRepoForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRemoveRepositoryForSecretForAuthenticatedUser(value: `215`): Self = StObject.set(x, "removeRepositoryForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setRepoMachinesForAuthenticatedUser(value: `216`): Self = StObject.set(x, "repoMachinesForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setSetRepositoriesForSecretForAuthenticatedUser(value: `217`): Self = StObject.set(x, "setRepositoriesForSecretForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setStartForAuthenticatedUser(value: `218`): Self = StObject.set(x, "startForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setStopForAuthenticatedUser(value: `219`): Self = StObject.set(x, "stopForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    inline def setStopInOrganization(value: `220`): Self = StObject.set(x, "stopInOrganization", value.asInstanceOf[js.Any])
    
    inline def setUpdateForAuthenticatedUser(value: `221`): Self = StObject.set(x, "updateForAuthenticatedUser", value.asInstanceOf[js.Any])
  }
}
