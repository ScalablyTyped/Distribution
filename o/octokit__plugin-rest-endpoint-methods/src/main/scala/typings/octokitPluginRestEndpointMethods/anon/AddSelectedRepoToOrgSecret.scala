package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSelectedRepoToOrgSecret extends StObject {
  
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def addSelectedRepoToOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def addSelectedRepoToOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("addSelectedRepoToOrgSecret")
  var addSelectedRepoToOrgSecret_Original: `270`
  
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization
    * permission to use this endpoint.
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
  def createOrUpdateOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization
    * permission to use this endpoint.
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
  @JSName("createOrUpdateOrgSecret")
  var createOrUpdateOrgSecret_Original: `271`
  
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository
    * permission to use this endpoint.
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
  def createOrUpdateRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository
    * permission to use this endpoint.
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
  @JSName("createOrUpdateRepoSecret")
  var createOrUpdateRepoSecret_Original: `272`
  
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def deleteOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/dependabot/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("deleteOrgSecret")
  var deleteOrgSecret_Original: `273`
  
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  def deleteRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  @JSName("deleteRepoSecret")
  var deleteRepoSecret_Original: `274`
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  def getAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/alerts/{alert_number}']['response'] */ js.Any
  ]
  def getAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/alerts/{alert_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/alerts/{alert_number}']['response'] */ js.Any
  ]
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  @JSName("getAlert")
  var getAlert_Original: `275`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def getOrgPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/public-key']['response'] */ js.Any
  ]
  def getOrgPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgPublicKey")
  var getOrgPublicKey_Original: `276`
  
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def getOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgSecret")
  var getOrgSecret_Original: `277`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  def getRepoPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets/public-key']['response'] */ js.Any
  ]
  def getRepoPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoPublicKey")
  var getRepoPublicKey_Original: `278`
  
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  def getRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoSecret")
  var getRepoSecret_Original: `279`
  
  /**
    * Lists Dependabot alerts for repositories that are owned by the specified enterprise.
    * To use this endpoint, you must be a member of the enterprise, and you must use an
    * access token with the `repo` scope or `security_events` scope.
    * Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security manager. For more information about security managers, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  def listAlertsForEnterprise(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/dependabot/alerts']['response'] */ js.Any
  ]
  def listAlertsForEnterprise(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/dependabot/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /enterprises/{enterprise}/dependabot/alerts']['response'] */ js.Any
  ]
  /**
    * Lists Dependabot alerts for repositories that are owned by the specified enterprise.
    * To use this endpoint, you must be a member of the enterprise, and you must use an
    * access token with the `repo` scope or `security_events` scope.
    * Alerts are only returned for organizations in the enterprise for which you are an organization owner or a security manager. For more information about security managers, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."
    */
  @JSName("listAlertsForEnterprise")
  var listAlertsForEnterprise_Original: `280`
  
  /**
    * Lists Dependabot alerts for an organization.
    *
    * To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    *
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  def listAlertsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/alerts']['response'] */ js.Any
  ]
  def listAlertsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/alerts']['response'] */ js.Any
  ]
  /**
    * Lists Dependabot alerts for an organization.
    *
    * To use this endpoint, you must be an owner or security manager for the organization, and you must use an access token with the `repo` scope or `security_events` scope.
    *
    * For public repositories, you may instead use the `public_repo` scope.
    *
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  @JSName("listAlertsForOrg")
  var listAlertsForOrg_Original: `281`
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  def listAlertsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/alerts']['response'] */ js.Any
  ]
  def listAlertsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/alerts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/alerts']['response'] */ js.Any
  ]
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** read permission to use this endpoint.
    */
  @JSName("listAlertsForRepo")
  var listAlertsForRepo_Original: `282`
  
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def listOrgSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets']['response'] */ js.Any
  ]
  def listOrgSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("listOrgSecrets")
  var listOrgSecrets_Original: `283`
  
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  def listRepoSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets']['response'] */ js.Any
  ]
  def listRepoSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependabot/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` repository permission to use this endpoint.
    */
  @JSName("listRepoSecrets")
  var listRepoSecrets_Original: `284`
  
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def listSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def listSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/dependabot/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("listSelectedReposForOrgSecret")
  var listSelectedReposForOrgSecret_Original: `285`
  
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def removeSelectedRepoFromOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def removeSelectedRepoFromOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/dependabot/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("removeSelectedRepoFromOrgSecret")
  var removeSelectedRepoFromOrgSecret_Original: `286`
  
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  def setSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def setSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/dependabot/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/dependabot#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `dependabot_secrets` organization permission to use this endpoint.
    */
  @JSName("setSelectedReposForOrgSecret")
  var setSelectedReposForOrgSecret_Original: `287`
  
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** write permission to use this endpoint.
    */
  def updateAlert(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/dependabot/alerts/{alert_number}']['response'] */ js.Any
  ]
  def updateAlert(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/dependabot/alerts/{alert_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/dependabot/alerts/{alert_number}']['response'] */ js.Any
  ]
  /**
    * You must use an access token with the `security_events` scope to use this endpoint with private repositories.
    * You can also use tokens with the `public_repo` scope for public repositories only.
    * GitHub Apps must have **Dependabot alerts** write permission to use this endpoint.
    */
  @JSName("updateAlert")
  var updateAlert_Original: `288`
}
object AddSelectedRepoToOrgSecret {
  
  inline def apply(
    addSelectedRepoToOrgSecret: `270`,
    createOrUpdateOrgSecret: `271`,
    createOrUpdateRepoSecret: `272`,
    deleteOrgSecret: `273`,
    deleteRepoSecret: `274`,
    getAlert: `275`,
    getOrgPublicKey: `276`,
    getOrgSecret: `277`,
    getRepoPublicKey: `278`,
    getRepoSecret: `279`,
    listAlertsForEnterprise: `280`,
    listAlertsForOrg: `281`,
    listAlertsForRepo: `282`,
    listOrgSecrets: `283`,
    listRepoSecrets: `284`,
    listSelectedReposForOrgSecret: `285`,
    removeSelectedRepoFromOrgSecret: `286`,
    setSelectedReposForOrgSecret: `287`,
    updateAlert: `288`
  ): AddSelectedRepoToOrgSecret = {
    val __obj = js.Dynamic.literal(addSelectedRepoToOrgSecret = addSelectedRepoToOrgSecret.asInstanceOf[js.Any], createOrUpdateOrgSecret = createOrUpdateOrgSecret.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], deleteOrgSecret = deleteOrgSecret.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], getAlert = getAlert.asInstanceOf[js.Any], getOrgPublicKey = getOrgPublicKey.asInstanceOf[js.Any], getOrgSecret = getOrgSecret.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], listAlertsForEnterprise = listAlertsForEnterprise.asInstanceOf[js.Any], listAlertsForOrg = listAlertsForOrg.asInstanceOf[js.Any], listAlertsForRepo = listAlertsForRepo.asInstanceOf[js.Any], listOrgSecrets = listOrgSecrets.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listSelectedReposForOrgSecret = listSelectedReposForOrgSecret.asInstanceOf[js.Any], removeSelectedRepoFromOrgSecret = removeSelectedRepoFromOrgSecret.asInstanceOf[js.Any], setSelectedReposForOrgSecret = setSelectedReposForOrgSecret.asInstanceOf[js.Any], updateAlert = updateAlert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSelectedRepoToOrgSecret]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddSelectedRepoToOrgSecret] (val x: Self) extends AnyVal {
    
    inline def setAddSelectedRepoToOrgSecret(value: `270`): Self = StObject.set(x, "addSelectedRepoToOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateOrgSecret(value: `271`): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: `272`): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgSecret(value: `273`): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `274`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetAlert(value: `275`): Self = StObject.set(x, "getAlert", value.asInstanceOf[js.Any])
    
    inline def setGetOrgPublicKey(value: `276`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetOrgSecret(value: `277`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `278`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `279`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForEnterprise(value: `280`): Self = StObject.set(x, "listAlertsForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForOrg(value: `281`): Self = StObject.set(x, "listAlertsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListAlertsForRepo(value: `282`): Self = StObject.set(x, "listAlertsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListOrgSecrets(value: `283`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `284`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgSecret(value: `285`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgSecret(value: `286`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgSecret(value: `287`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setUpdateAlert(value: `288`): Self = StObject.set(x, "updateAlert", value.asInstanceOf[js.Any])
  }
}
