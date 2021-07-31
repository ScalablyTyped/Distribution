package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSelectedRepoToOrgSecret extends StObject {
  
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def addSelectedRepoToOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ]
  def addSelectedRepoToOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ]
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("addSelectedRepoToOrgSecret")
  var addSelectedRepoToOrgSecret_Original: Call
  
  /**
    * Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def cancelWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/cancel']['response'] */ js.Any
  ]
  def cancelWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/cancel']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/cancel']['response'] */ js.Any
  ]
  /**
    * Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("cancelWorkflowRun")
  var cancelWorkflowRun_Original: Defaults
  
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to
    * use this endpoint.
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
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  def createOrUpdateOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to
    * use this endpoint.
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
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
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
  var createOrUpdateOrgSecret_Original: Endpoint
  
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
    * this endpoint.
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
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  def createOrUpdateRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
    * this endpoint.
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
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
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
  var createOrUpdateRepoSecret_Original: CallDefaults
  
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * #### Example using registration token
    *
    * Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.
    *
    * ```
    * ./config.sh --url https://github.com/octo-org --token TOKEN
    * ```
    */
  def createRegistrationTokenForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/registration-token']['response'] */ js.Any
  ]
  def createRegistrationTokenForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/registration-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/registration-token']['response'] */ js.Any
  ]
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * #### Example using registration token
    *
    * Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.
    *
    * ```
    * ./config.sh --url https://github.com/octo-org --token TOKEN
    * ```
    */
  @JSName("createRegistrationTokenForOrg")
  var createRegistrationTokenForOrg_Original: DefaultsEndpoint
  
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate
    * using an access token with the `repo` scope to use this endpoint.
    *
    * #### Example using registration token
    *
    * Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.
    *
    * ```
    * ./config.sh --url https://github.com/octo-org/octo-repo-artifacts --token TOKEN
    * ```
    */
  def createRegistrationTokenForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['response'] */ js.Any
  ]
  def createRegistrationTokenForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['response'] */ js.Any
  ]
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate
    * using an access token with the `repo` scope to use this endpoint.
    *
    * #### Example using registration token
    *
    * Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.
    *
    * ```
    * ./config.sh --url https://github.com/octo-org/octo-repo-artifacts --token TOKEN
    * ```
    */
  @JSName("createRegistrationTokenForRepo")
  var createRegistrationTokenForRepo_Original: CallDefaultsEndpoint
  
  /**
    * Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * #### Example using remove token
    *
    * To remove your self-hosted runner from an organization, replace `TOKEN` with the remove token provided by this
    * endpoint.
    *
    * ```
    * ./config.sh remove --token TOKEN
    * ```
    */
  def createRemoveTokenForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/remove-token']['response'] */ js.Any
  ]
  def createRemoveTokenForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/remove-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/remove-token']['response'] */ js.Any
  ]
  /**
    * Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * #### Example using remove token
    *
    * To remove your self-hosted runner from an organization, replace `TOKEN` with the remove token provided by this
    * endpoint.
    *
    * ```
    * ./config.sh remove --token TOKEN
    * ```
    */
  @JSName("createRemoveTokenForOrg")
  var createRemoveTokenForOrg_Original: CallParams
  
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * #### Example using remove token
    *
    * To remove your self-hosted runner from a repository, replace TOKEN with the remove token provided by this endpoint.
    *
    * ```
    * ./config.sh remove --token TOKEN
    * ```
    */
  def createRemoveTokenForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['response'] */ js.Any
  ]
  def createRemoveTokenForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['response'] */ js.Any
  ]
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * #### Example using remove token
    *
    * To remove your self-hosted runner from a repository, replace TOKEN with the remove token provided by this endpoint.
    *
    * ```
    * ./config.sh remove --token TOKEN
    * ```
    */
  @JSName("createRemoveTokenForRepo")
  var createRemoveTokenForRepo_Original: EndpointEndpointInterface
  
  /**
    * You can use this endpoint to manually trigger a GitHub Actions workflow run. You can also replace `{workflow_id}` with the workflow file name. For example, you could use `main.yml`.
    *
    * You must configure your GitHub Actions workflow to run when the [`workflow_dispatch` webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The `inputs` are configured in the workflow file. For more information about how to configure the `workflow_dispatch` event in the workflow file, see "[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)."
    */
  def createWorkflowDispatch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/workflows/:workflow_id/dispatches']['response'] */ js.Any
  ]
  def createWorkflowDispatch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/workflows/:workflow_id/dispatches']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/workflows/:workflow_id/dispatches']['response'] */ js.Any
  ]
  /**
    * You can use this endpoint to manually trigger a GitHub Actions workflow run. You can also replace `{workflow_id}` with the workflow file name. For example, you could use `main.yml`.
    *
    * You must configure your GitHub Actions workflow to run when the [`workflow_dispatch` webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The `inputs` are configured in the workflow file. For more information about how to configure the `workflow_dispatch` event in the workflow file, see "[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)."
    */
  @JSName("createWorkflowDispatch")
  var createWorkflowDispatch_Original: CallParamsDefaults
  
  /**
    * Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ]
  def deleteArtifact(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/artifacts/:artifact_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ]
  /**
    * Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteArtifact")
  var deleteArtifact_Original: DefaultsEndpointEndpointInterface
  
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def deleteOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  def deleteOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("deleteOrgSecret")
  var deleteOrgSecret_Original: CallParamsDefaultsEndpointEndpointInterface
  
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def deleteRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  def deleteRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("deleteRepoSecret")
  var deleteRepoSecret_Original: `0`
  
  /**
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def deleteSelfHostedRunnerFromOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ]
  def deleteSelfHostedRunnerFromOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ]
  /**
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("deleteSelfHostedRunnerFromOrg")
  var deleteSelfHostedRunnerFromOrg_Original: `1`
  
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `repo`
    * scope to use this endpoint.
    */
  def deleteSelfHostedRunnerFromRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ]
  def deleteSelfHostedRunnerFromRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ]
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `repo`
    * scope to use this endpoint.
    */
  @JSName("deleteSelfHostedRunnerFromRepo")
  var deleteSelfHostedRunnerFromRepo_Original: `2`
  
  /**
    * Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
    * private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
    * this endpoint.
    */
  def deleteWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id']['response'] */ js.Any
  ]
  def deleteWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id']['response'] */ js.Any
  ]
  
  /**
    * Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteWorkflowRunLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ]
  def deleteWorkflowRunLogs(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ]
  /**
    * Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteWorkflowRunLogs")
  var deleteWorkflowRunLogs_Original: `4`
  
  /**
    * Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
    * private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
    * this endpoint.
    */
  @JSName("deleteWorkflowRun")
  var deleteWorkflowRun_Original: `3`
  
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in
    * the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def downloadArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id/:archive_format']['response'] */ js.Any
  ]
  def downloadArtifact(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id/:archive_format']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id/:archive_format']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in
    * the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("downloadArtifact")
  var downloadArtifact_Original: `5`
  
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look
    * for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can
    * use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must
    * have the `actions:read` permission to use this endpoint.
    */
  def downloadJobLogsForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['response'] */ js.Any
  ]
  def downloadJobLogsForWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look
    * for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can
    * use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must
    * have the `actions:read` permission to use this endpoint.
    */
  @JSName("downloadJobLogsForWorkflowRun")
  var downloadJobLogsForWorkflowRun_Original: `6`
  
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for
    * `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use
    * this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have
    * the `actions:read` permission to use this endpoint.
    */
  def downloadWorkflowRunLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ]
  def downloadWorkflowRunLogs(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for
    * `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use
    * this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have
    * the `actions:read` permission to use this endpoint.
    */
  @JSName("downloadWorkflowRunLogs")
  var downloadWorkflowRunLogs_Original: `7`
  
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ]
  def getArtifact(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ]
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getArtifact")
  var getArtifact_Original: `8`
  
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getJobForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id']['response'] */ js.Any
  ]
  def getJobForWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id']['response'] */ js.Any
  ]
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getJobForWorkflowRun")
  var getJobForWorkflowRun_Original: `9`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def getOrgPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/public-key']['response'] */ js.Any
  ]
  def getOrgPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgPublicKey")
  var getOrgPublicKey_Original: `10`
  
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def getOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  def getOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgSecret")
  var getOrgSecret_Original: `11`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getRepoPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['response'] */ js.Any
  ]
  def getRepoPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoPublicKey")
  var getRepoPublicKey_Original: `12`
  
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  def getRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ]
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoSecret")
  var getRepoSecret_Original: `13`
  
  /**
    * Gets a specific self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def getSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ]
  def getSelfHostedRunnerForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ]
  /**
    * Gets a specific self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("getSelfHostedRunnerForOrg")
  var getSelfHostedRunnerForOrg_Original: `14`
  
  /**
    * Gets a specific self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  def getSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ]
  def getSelfHostedRunnerForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ]
  /**
    * Gets a specific self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  @JSName("getSelfHostedRunnerForRepo")
  var getSelfHostedRunnerForRepo_Original: `15`
  
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id']['response'] */ js.Any
  ]
  def getWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id']['response'] */ js.Any
  ]
  
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id']['response'] */ js.Any
  ]
  def getWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id']['response'] */ js.Any
  ]
  
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowRunUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/timing']['response'] */ js.Any
  ]
  def getWorkflowRunUsage(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/timing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/timing']['response'] */ js.Any
  ]
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowRunUsage")
  var getWorkflowRunUsage_Original: `18`
  
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowRun")
  var getWorkflowRun_Original: `17`
  
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/timing']['response'] */ js.Any
  ]
  def getWorkflowUsage(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/timing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/timing']['response'] */ js.Any
  ]
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowUsage")
  var getWorkflowUsage_Original: `19`
  
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflow")
  var getWorkflow_Original: `16`
  
  /**
    * Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listArtifactsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts']['response'] */ js.Any
  ]
  def listArtifactsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts']['response'] */ js.Any
  ]
  /**
    * Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listArtifactsForRepo")
  var listArtifactsForRepo_Original: `20`
  
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    */
  def listJobsForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/jobs']['response'] */ js.Any
  ]
  def listJobsForWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/jobs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/jobs']['response'] */ js.Any
  ]
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    */
  @JSName("listJobsForWorkflowRun")
  var listJobsForWorkflowRun_Original: `21`
  
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def listOrgSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets']['response'] */ js.Any
  ]
  def listOrgSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("listOrgSecrets")
  var listOrgSecrets_Original: `22`
  
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def listRepoSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['response'] */ js.Any
  ]
  def listRepoSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("listRepoSecrets")
  var listRepoSecrets_Original: `23`
  
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listRepoWorkflows(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows']['response'] */ js.Any
  ]
  def listRepoWorkflows(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows']['response'] */ js.Any
  ]
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listRepoWorkflows")
  var listRepoWorkflows_Original: `24`
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listRunnerApplicationsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/downloads']['response'] */ js.Any
  ]
  def listRunnerApplicationsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/downloads']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/downloads']['response'] */ js.Any
  ]
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listRunnerApplicationsForOrg")
  var listRunnerApplicationsForOrg_Original: `25`
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def listRunnerApplicationsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['response'] */ js.Any
  ]
  def listRunnerApplicationsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['response'] */ js.Any
  ]
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("listRunnerApplicationsForRepo")
  var listRunnerApplicationsForRepo_Original: `26`
  
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def listSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ]
  def listSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ]
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("listSelectedReposForOrgSecret")
  var listSelectedReposForOrgSecret_Original: `27`
  
  /**
    * Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listSelfHostedRunnersForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners']['response'] */ js.Any
  ]
  def listSelfHostedRunnersForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners']['response'] */ js.Any
  ]
  /**
    * Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForOrg")
  var listSelfHostedRunnersForOrg_Original: `28`
  
  /**
    * Lists all self-hosted runners configured in a repository.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def listSelfHostedRunnersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners']['response'] */ js.Any
  ]
  def listSelfHostedRunnersForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners']['response'] */ js.Any
  ]
  /**
    * Lists all self-hosted runners configured in a repository.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForRepo")
  var listSelfHostedRunnersForRepo_Original: `29`
  
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listWorkflowRunArtifacts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/artifacts']['response'] */ js.Any
  ]
  def listWorkflowRunArtifacts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/artifacts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/artifacts']['response'] */ js.Any
  ]
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listWorkflowRunArtifacts")
  var listWorkflowRunArtifacts_Original: `30`
  
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  def listWorkflowRuns(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs']['response'] */ js.Any
  ]
  def listWorkflowRuns(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs']['response'] */ js.Any
  ]
  
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listWorkflowRunsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs']['response'] */ js.Any
  ]
  def listWorkflowRunsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs']['response'] */ js.Any
  ]
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listWorkflowRunsForRepo")
  var listWorkflowRunsForRepo_Original: `32`
  
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  @JSName("listWorkflowRuns")
  var listWorkflowRuns_Original: `31`
  
  /**
    * Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def reRunWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/rerun']['response'] */ js.Any
  ]
  def reRunWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/rerun']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/rerun']['response'] */ js.Any
  ]
  /**
    * Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("reRunWorkflow")
  var reRunWorkflow_Original: `33`
  
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def removeSelectedRepoFromOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ]
  def removeSelectedRepoFromOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ]
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("removeSelectedRepoFromOrgSecret")
  var removeSelectedRepoFromOrgSecret_Original: `34`
  
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def setSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ]
  def setSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ]
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("setSelectedReposForOrgSecret")
  var setSelectedReposForOrgSecret_Original: `35`
}
object AddSelectedRepoToOrgSecret {
  
  @scala.inline
  def apply(
    addSelectedRepoToOrgSecret: Call,
    cancelWorkflowRun: Defaults,
    createOrUpdateOrgSecret: Endpoint,
    createOrUpdateRepoSecret: CallDefaults,
    createRegistrationTokenForOrg: DefaultsEndpoint,
    createRegistrationTokenForRepo: CallDefaultsEndpoint,
    createRemoveTokenForOrg: CallParams,
    createRemoveTokenForRepo: EndpointEndpointInterface,
    createWorkflowDispatch: CallParamsDefaults,
    deleteArtifact: DefaultsEndpointEndpointInterface,
    deleteOrgSecret: CallParamsDefaultsEndpointEndpointInterface,
    deleteRepoSecret: `0`,
    deleteSelfHostedRunnerFromOrg: `1`,
    deleteSelfHostedRunnerFromRepo: `2`,
    deleteWorkflowRun: `3`,
    deleteWorkflowRunLogs: `4`,
    downloadArtifact: `5`,
    downloadJobLogsForWorkflowRun: `6`,
    downloadWorkflowRunLogs: `7`,
    getArtifact: `8`,
    getJobForWorkflowRun: `9`,
    getOrgPublicKey: `10`,
    getOrgSecret: `11`,
    getRepoPublicKey: `12`,
    getRepoSecret: `13`,
    getSelfHostedRunnerForOrg: `14`,
    getSelfHostedRunnerForRepo: `15`,
    getWorkflow: `16`,
    getWorkflowRun: `17`,
    getWorkflowRunUsage: `18`,
    getWorkflowUsage: `19`,
    listArtifactsForRepo: `20`,
    listJobsForWorkflowRun: `21`,
    listOrgSecrets: `22`,
    listRepoSecrets: `23`,
    listRepoWorkflows: `24`,
    listRunnerApplicationsForOrg: `25`,
    listRunnerApplicationsForRepo: `26`,
    listSelectedReposForOrgSecret: `27`,
    listSelfHostedRunnersForOrg: `28`,
    listSelfHostedRunnersForRepo: `29`,
    listWorkflowRunArtifacts: `30`,
    listWorkflowRuns: `31`,
    listWorkflowRunsForRepo: `32`,
    reRunWorkflow: `33`,
    removeSelectedRepoFromOrgSecret: `34`,
    setSelectedReposForOrgSecret: `35`
  ): AddSelectedRepoToOrgSecret = {
    val __obj = js.Dynamic.literal(addSelectedRepoToOrgSecret = addSelectedRepoToOrgSecret.asInstanceOf[js.Any], cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createOrUpdateOrgSecret = createOrUpdateOrgSecret.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], createRegistrationTokenForOrg = createRegistrationTokenForOrg.asInstanceOf[js.Any], createRegistrationTokenForRepo = createRegistrationTokenForRepo.asInstanceOf[js.Any], createRemoveTokenForOrg = createRemoveTokenForOrg.asInstanceOf[js.Any], createRemoveTokenForRepo = createRemoveTokenForRepo.asInstanceOf[js.Any], createWorkflowDispatch = createWorkflowDispatch.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteOrgSecret = deleteOrgSecret.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], deleteSelfHostedRunnerFromOrg = deleteSelfHostedRunnerFromOrg.asInstanceOf[js.Any], deleteSelfHostedRunnerFromRepo = deleteSelfHostedRunnerFromRepo.asInstanceOf[js.Any], deleteWorkflowRun = deleteWorkflowRun.asInstanceOf[js.Any], deleteWorkflowRunLogs = deleteWorkflowRunLogs.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], downloadJobLogsForWorkflowRun = downloadJobLogsForWorkflowRun.asInstanceOf[js.Any], downloadWorkflowRunLogs = downloadWorkflowRunLogs.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getJobForWorkflowRun = getJobForWorkflowRun.asInstanceOf[js.Any], getOrgPublicKey = getOrgPublicKey.asInstanceOf[js.Any], getOrgSecret = getOrgSecret.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], getSelfHostedRunnerForOrg = getSelfHostedRunnerForOrg.asInstanceOf[js.Any], getSelfHostedRunnerForRepo = getSelfHostedRunnerForRepo.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], getWorkflowRunUsage = getWorkflowRunUsage.asInstanceOf[js.Any], getWorkflowUsage = getWorkflowUsage.asInstanceOf[js.Any], listArtifactsForRepo = listArtifactsForRepo.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listOrgSecrets = listOrgSecrets.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listRunnerApplicationsForOrg = listRunnerApplicationsForOrg.asInstanceOf[js.Any], listRunnerApplicationsForRepo = listRunnerApplicationsForRepo.asInstanceOf[js.Any], listSelectedReposForOrgSecret = listSelectedReposForOrgSecret.asInstanceOf[js.Any], listSelfHostedRunnersForOrg = listSelfHostedRunnersForOrg.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], listWorkflowRunsForRepo = listWorkflowRunsForRepo.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], removeSelectedRepoFromOrgSecret = removeSelectedRepoFromOrgSecret.asInstanceOf[js.Any], setSelectedReposForOrgSecret = setSelectedReposForOrgSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddSelectedRepoToOrgSecret]
  }
  
  @scala.inline
  implicit class AddSelectedRepoToOrgSecretMutableBuilder[Self <: AddSelectedRepoToOrgSecret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSelectedRepoToOrgSecret(value: Call): Self = StObject.set(x, "addSelectedRepoToOrgSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelWorkflowRun(value: Defaults): Self = StObject.set(x, "cancelWorkflowRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateOrUpdateOrgSecret(value: Endpoint): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateOrUpdateRepoSecret(value: CallDefaults): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRegistrationTokenForOrg(value: DefaultsEndpoint): Self = StObject.set(x, "createRegistrationTokenForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRegistrationTokenForRepo(value: CallDefaultsEndpoint): Self = StObject.set(x, "createRegistrationTokenForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRemoveTokenForOrg(value: CallParams): Self = StObject.set(x, "createRemoveTokenForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRemoveTokenForRepo(value: EndpointEndpointInterface): Self = StObject.set(x, "createRemoveTokenForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateWorkflowDispatch(value: CallParamsDefaults): Self = StObject.set(x, "createWorkflowDispatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteArtifact(value: DefaultsEndpointEndpointInterface): Self = StObject.set(x, "deleteArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOrgSecret(value: CallParamsDefaultsEndpointEndpointInterface): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteRepoSecret(value: `0`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSelfHostedRunnerFromOrg(value: `1`): Self = StObject.set(x, "deleteSelfHostedRunnerFromOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSelfHostedRunnerFromRepo(value: `2`): Self = StObject.set(x, "deleteSelfHostedRunnerFromRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteWorkflowRun(value: `3`): Self = StObject.set(x, "deleteWorkflowRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteWorkflowRunLogs(value: `4`): Self = StObject.set(x, "deleteWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadArtifact(value: `5`): Self = StObject.set(x, "downloadArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadJobLogsForWorkflowRun(value: `6`): Self = StObject.set(x, "downloadJobLogsForWorkflowRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadWorkflowRunLogs(value: `7`): Self = StObject.set(x, "downloadWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetArtifact(value: `8`): Self = StObject.set(x, "getArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetJobForWorkflowRun(value: `9`): Self = StObject.set(x, "getJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOrgPublicKey(value: `10`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOrgSecret(value: `11`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRepoPublicKey(value: `12`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRepoSecret(value: `13`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSelfHostedRunnerForOrg(value: `14`): Self = StObject.set(x, "getSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSelfHostedRunnerForRepo(value: `15`): Self = StObject.set(x, "getSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWorkflow(value: `16`): Self = StObject.set(x, "getWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWorkflowRun(value: `17`): Self = StObject.set(x, "getWorkflowRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWorkflowRunUsage(value: `18`): Self = StObject.set(x, "getWorkflowRunUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetWorkflowUsage(value: `19`): Self = StObject.set(x, "getWorkflowUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListArtifactsForRepo(value: `20`): Self = StObject.set(x, "listArtifactsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListJobsForWorkflowRun(value: `21`): Self = StObject.set(x, "listJobsForWorkflowRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListOrgSecrets(value: `22`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRepoSecrets(value: `23`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRepoWorkflows(value: `24`): Self = StObject.set(x, "listRepoWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRunnerApplicationsForOrg(value: `25`): Self = StObject.set(x, "listRunnerApplicationsForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListRunnerApplicationsForRepo(value: `26`): Self = StObject.set(x, "listRunnerApplicationsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelectedReposForOrgSecret(value: `27`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelfHostedRunnersForOrg(value: `28`): Self = StObject.set(x, "listSelfHostedRunnersForOrg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSelfHostedRunnersForRepo(value: `29`): Self = StObject.set(x, "listSelfHostedRunnersForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWorkflowRunArtifacts(value: `30`): Self = StObject.set(x, "listWorkflowRunArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWorkflowRuns(value: `31`): Self = StObject.set(x, "listWorkflowRuns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWorkflowRunsForRepo(value: `32`): Self = StObject.set(x, "listWorkflowRunsForRepo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReRunWorkflow(value: `33`): Self = StObject.set(x, "reRunWorkflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveSelectedRepoFromOrgSecret(value: `34`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetSelectedReposForOrgSecret(value: `35`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
  }
}
