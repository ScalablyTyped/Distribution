package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomLabelsToSelfHostedRunnerForOrg extends StObject {
  
  /**
    * Add custom labels to a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def addCustomLabelsToSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def addCustomLabelsToSelfHostedRunnerForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Add custom labels to a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("addCustomLabelsToSelfHostedRunnerForOrg")
  var addCustomLabelsToSelfHostedRunnerForOrg_Original: Call
  
  /**
    * Add custom labels to a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  def addCustomLabelsToSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def addCustomLabelsToSelfHostedRunnerForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Add custom labels to a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  @JSName("addCustomLabelsToSelfHostedRunnerForRepo")
  var addCustomLabelsToSelfHostedRunnerForRepo_Original: Defaults
  
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def addSelectedRepoToOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def addSelectedRepoToOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("addSelectedRepoToOrgSecret")
  var addSelectedRepoToOrgSecret_Original: Endpoint
  
  /**
    * Adds a repository to an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  def addSelectedRepoToOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/variables/{name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def addSelectedRepoToOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/variables/{name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/variables/{name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Adds a repository to an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  @JSName("addSelectedRepoToOrgVariable")
  var addSelectedRepoToOrgVariable_Original: CallDefaults
  
  /**
    * Adds a repository to a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def addSelectedRepoToRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def addSelectedRepoToRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Adds a repository to a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("addSelectedRepoToRequiredWorkflow")
  var addSelectedRepoToRequiredWorkflow_Original: DefaultsEndpoint
  
  /**
    * Approves a workflow run for a pull request from a public fork of a first time contributor. For more information, see ["Approving workflow runs from public forks](https://docs.github.com/actions/managing-workflow-runs/approving-workflow-runs-from-public-forks)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def approveWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/approve']['response'] */ js.Any
  ]
  def approveWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/approve']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/approve']['response'] */ js.Any
  ]
  /**
    * Approves a workflow run for a pull request from a public fork of a first time contributor. For more information, see ["Approving workflow runs from public forks](https://docs.github.com/actions/managing-workflow-runs/approving-workflow-runs-from-public-forks)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("approveWorkflowRun")
  var approveWorkflowRun_Original: CallDefaultsEndpoint
  
  /**
    * Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def cancelWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/cancel']['response'] */ js.Any
  ]
  def cancelWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/cancel']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/cancel']['response'] */ js.Any
  ]
  /**
    * Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("cancelWorkflowRun")
  var cancelWorkflowRun_Original: CallParams
  
  /**
    * Create an environment variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  def createEnvironmentVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repositories/{repository_id}/environments/{environment_name}/variables']['response'] */ js.Any
  ]
  def createEnvironmentVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repositories/{repository_id}/environments/{environment_name}/variables']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repositories/{repository_id}/environments/{environment_name}/variables']['response'] */ js.Any
  ]
  /**
    * Create an environment variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  @JSName("createEnvironmentVariable")
  var createEnvironmentVariable_Original: EndpointEndpointInterface
  
  /**
    * Creates or updates an environment secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
    * this endpoint.
    *
    * **Example encrypting a secret using Node.js**
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
    * **Example encrypting a secret using Python**
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
    * **Example encrypting a secret using C#**
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
    * **Example encrypting a secret using Ruby**
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
  def createOrUpdateEnvironmentSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateEnvironmentSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Creates or updates an environment secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
    * this endpoint.
    *
    * **Example encrypting a secret using Node.js**
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
    * **Example encrypting a secret using Python**
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
    * **Example encrypting a secret using C#**
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
    * **Example encrypting a secret using Ruby**
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
  @JSName("createOrUpdateEnvironmentSecret")
  var createOrUpdateEnvironmentSecret_Original: CallParamsDefaults
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}']['response'] */ js.Any
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
  var createOrUpdateOrgSecret_Original: DefaultsEndpointEndpointInterface
  
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
    * this endpoint.
    *
    * **Example encrypting a secret using Node.js**
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
    * **Example encrypting a secret using Python**
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
    * **Example encrypting a secret using C#**
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
    * **Example encrypting a secret using Ruby**
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  def createOrUpdateRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using
    * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
    * token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use
    * this endpoint.
    *
    * **Example encrypting a secret using Node.js**
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
    * **Example encrypting a secret using Python**
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
    * **Example encrypting a secret using C#**
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
    * **Example encrypting a secret using Ruby**
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
  var createOrUpdateRepoSecret_Original: CallParamsDefaultsEndpointEndpointInterface
  
  /**
    * Creates an organization variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  def createOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/variables']['response'] */ js.Any
  ]
  def createOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/variables']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/variables']['response'] */ js.Any
  ]
  /**
    * Creates an organization variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  @JSName("createOrgVariable")
  var createOrgVariable_Original: `0`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/registration-token']['response'] */ js.Any
  ]
  def createRegistrationTokenForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/registration-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/registration-token']['response'] */ js.Any
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
  var createRegistrationTokenForOrg_Original: `1`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/registration-token']['response'] */ js.Any
  ]
  def createRegistrationTokenForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/registration-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/registration-token']['response'] */ js.Any
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
  var createRegistrationTokenForRepo_Original: `2`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/remove-token']['response'] */ js.Any
  ]
  def createRemoveTokenForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/remove-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/remove-token']['response'] */ js.Any
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
  var createRemoveTokenForOrg_Original: `3`
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/remove-token']['response'] */ js.Any
  ]
  def createRemoveTokenForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/remove-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/remove-token']['response'] */ js.Any
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
  var createRemoveTokenForRepo_Original: `4`
  
  /**
    * Creates a repository variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  def createRepoVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/variables']['response'] */ js.Any
  ]
  def createRepoVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/variables']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/variables']['response'] */ js.Any
  ]
  /**
    * Creates a repository variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  @JSName("createRepoVariable")
  var createRepoVariable_Original: `5`
  
  /**
    * Create a required workflow in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def createRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/required_workflows']['response'] */ js.Any
  ]
  def createRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/required_workflows']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/required_workflows']['response'] */ js.Any
  ]
  /**
    * Create a required workflow in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("createRequiredWorkflow")
  var createRequiredWorkflow_Original: `6`
  
  /**
    * You can use this endpoint to manually trigger a GitHub Actions workflow run. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must configure your GitHub Actions workflow to run when the [`workflow_dispatch` webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The `inputs` are configured in the workflow file. For more information about how to configure the `workflow_dispatch` event in the workflow file, see "[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)."
    */
  def createWorkflowDispatch(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/workflows/{workflow_id}/dispatches']['response'] */ js.Any
  ]
  def createWorkflowDispatch(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/workflows/{workflow_id}/dispatches']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/workflows/{workflow_id}/dispatches']['response'] */ js.Any
  ]
  /**
    * You can use this endpoint to manually trigger a GitHub Actions workflow run. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must configure your GitHub Actions workflow to run when the [`workflow_dispatch` webhook](/developers/webhooks-and-events/webhook-events-and-payloads#workflow_dispatch) event occurs. The `inputs` are configured in the workflow file. For more information about how to configure the `workflow_dispatch` event in the workflow file, see "[Events that trigger workflows](/actions/reference/events-that-trigger-workflows#workflow_dispatch)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint. For more information, see "[Creating a personal access token for the command line](https://docs.github.com/articles/creating-a-personal-access-token-for-the-command-line)."
    */
  @JSName("createWorkflowDispatch")
  var createWorkflowDispatch_Original: `7`
  
  /**
    * Deletes a GitHub Actions cache for a repository, using a cache ID.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteActionsCacheById(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/caches/{cache_id}']['response'] */ js.Any
  ]
  def deleteActionsCacheById(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/caches/{cache_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/caches/{cache_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a GitHub Actions cache for a repository, using a cache ID.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteActionsCacheById")
  var deleteActionsCacheById_Original: `8`
  
  /**
    * Deletes one or more GitHub Actions caches for a repository, using a complete cache key. By default, all caches that match the provided key are deleted, but you can optionally provide a Git ref to restrict deletions to caches that match both the provided key and the Git ref.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteActionsCacheByKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/caches{?key,ref}']['response'] */ js.Any
  ]
  def deleteActionsCacheByKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/caches{?key,ref}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/caches{?key,ref}']['response'] */ js.Any
  ]
  /**
    * Deletes one or more GitHub Actions caches for a repository, using a complete cache key. By default, all caches that match the provided key are deleted, but you can optionally provide a Git ref to restrict deletions to caches that match both the provided key and the Git ref.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteActionsCacheByKey")
  var deleteActionsCacheByKey_Original: `9`
  
  /**
    * Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/artifacts/{artifact_id}']['response'] */ js.Any
  ]
  def deleteArtifact(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/artifacts/{artifact_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/artifacts/{artifact_id}']['response'] */ js.Any
  ]
  /**
    * Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteArtifact")
  var deleteArtifact_Original: `10`
  
  /**
    * Deletes a secret in an environment using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def deleteEnvironmentSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteEnvironmentSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in an environment using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("deleteEnvironmentSecret")
  var deleteEnvironmentSecret_Original: `11`
  
  /**
    * Deletes an environment variable using the variable name.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  def deleteEnvironmentVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['response'] */ js.Any
  ]
  def deleteEnvironmentVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Deletes an environment variable using the variable name.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  @JSName("deleteEnvironmentVariable")
  var deleteEnvironmentVariable_Original: `12`
  
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def deleteOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("deleteOrgSecret")
  var deleteOrgSecret_Original: `13`
  
  /**
    * Deletes an organization variable using the variable name.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  def deleteOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/variables/{name}']['response'] */ js.Any
  ]
  def deleteOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Deletes an organization variable using the variable name.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  @JSName("deleteOrgVariable")
  var deleteOrgVariable_Original: `14`
  
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def deleteRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  def deleteRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("deleteRepoSecret")
  var deleteRepoSecret_Original: `15`
  
  /**
    * Deletes a repository variable using the variable name.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  def deleteRepoVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/variables/{name}']['response'] */ js.Any
  ]
  def deleteRepoVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Deletes a repository variable using the variable name.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  @JSName("deleteRepoVariable")
  var deleteRepoVariable_Original: `16`
  
  /**
    * Deletes a required workflow configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def deleteRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/required_workflows/{required_workflow_id}']['response'] */ js.Any
  ]
  def deleteRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/required_workflows/{required_workflow_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/required_workflows/{required_workflow_id}']['response'] */ js.Any
  ]
  /**
    * Deletes a required workflow configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("deleteRequiredWorkflow")
  var deleteRequiredWorkflow_Original: `17`
  
  /**
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def deleteSelfHostedRunnerFromOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  def deleteSelfHostedRunnerFromOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  /**
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("deleteSelfHostedRunnerFromOrg")
  var deleteSelfHostedRunnerFromOrg_Original: `18`
  
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `repo`
    * scope to use this endpoint.
    */
  def deleteSelfHostedRunnerFromRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  def deleteSelfHostedRunnerFromRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.
    *
    * You must authenticate using an access token with the `repo`
    * scope to use this endpoint.
    */
  @JSName("deleteSelfHostedRunnerFromRepo")
  var deleteSelfHostedRunnerFromRepo_Original: `19`
  
  /**
    * Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
    * private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
    * this endpoint.
    */
  def deleteWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runs/{run_id}']['response'] */ js.Any
  ]
  def deleteWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runs/{run_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runs/{run_id}']['response'] */ js.Any
  ]
  
  /**
    * Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteWorkflowRunLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runs/{run_id}/logs']['response'] */ js.Any
  ]
  def deleteWorkflowRunLogs(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runs/{run_id}/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runs/{run_id}/logs']['response'] */ js.Any
  ]
  /**
    * Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteWorkflowRunLogs")
  var deleteWorkflowRunLogs_Original: `21`
  
  /**
    * Delete a specific workflow run. Anyone with write access to the repository can use this endpoint. If the repository is
    * private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:write` permission to use
    * this endpoint.
    */
  @JSName("deleteWorkflowRun")
  var deleteWorkflowRun_Original: `20`
  
  /**
    * Removes a repository from the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def disableSelectedRepositoryGithubActionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/permissions/repositories/{repository_id}']['response'] */ js.Any
  ]
  def disableSelectedRepositoryGithubActionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/permissions/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/permissions/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Removes a repository from the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("disableSelectedRepositoryGithubActionsOrganization")
  var disableSelectedRepositoryGithubActionsOrganization_Original: `22`
  
  /**
    * Disables a workflow and sets the `state` of the workflow to `disabled_manually`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def disableWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/workflows/{workflow_id}/disable']['response'] */ js.Any
  ]
  def disableWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/workflows/{workflow_id}/disable']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/workflows/{workflow_id}/disable']['response'] */ js.Any
  ]
  /**
    * Disables a workflow and sets the `state` of the workflow to `disabled_manually`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("disableWorkflow")
  var disableWorkflow_Original: `23`
  
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in
    * the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def downloadArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts/{artifact_id}/{archive_format}']['response'] */ js.Any
  ]
  def downloadArtifact(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts/{artifact_id}/{archive_format}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts/{artifact_id}/{archive_format}']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in
    * the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("downloadArtifact")
  var downloadArtifact_Original: `24`
  
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look
    * for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can
    * use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must
    * have the `actions:read` permission to use this endpoint.
    */
  def downloadJobLogsForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['response'] */ js.Any
  ]
  def downloadJobLogsForWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/jobs/{job_id}/logs']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look
    * for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can
    * use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must
    * have the `actions:read` permission to use this endpoint.
    */
  @JSName("downloadJobLogsForWorkflowRun")
  var downloadJobLogsForWorkflowRun_Original: `25`
  
  /**
    * Gets a redirect URL to download an archive of log files for a specific workflow run attempt. This link expires after
    * 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def downloadWorkflowRunAttemptLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/logs']['response'] */ js.Any
  ]
  def downloadWorkflowRunAttemptLogs(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/logs']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download an archive of log files for a specific workflow run attempt. This link expires after
    * 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to
    * the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("downloadWorkflowRunAttemptLogs")
  var downloadWorkflowRunAttemptLogs_Original: `26`
  
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for
    * `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use
    * this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have
    * the `actions:read` permission to use this endpoint.
    */
  def downloadWorkflowRunLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/logs']['response'] */ js.Any
  ]
  def downloadWorkflowRunLogs(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/logs']['response'] */ js.Any
  ]
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for
    * `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use
    * this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have
    * the `actions:read` permission to use this endpoint.
    */
  @JSName("downloadWorkflowRunLogs")
  var downloadWorkflowRunLogs_Original: `27`
  
  /**
    * Adds a repository to the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def enableSelectedRepositoryGithubActionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/repositories/{repository_id}']['response'] */ js.Any
  ]
  def enableSelectedRepositoryGithubActionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Adds a repository to the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("enableSelectedRepositoryGithubActionsOrganization")
  var enableSelectedRepositoryGithubActionsOrganization_Original: `28`
  
  /**
    * Enables a workflow and sets the `state` of the workflow to `active`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def enableWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/workflows/{workflow_id}/enable']['response'] */ js.Any
  ]
  def enableWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/workflows/{workflow_id}/enable']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/workflows/{workflow_id}/enable']['response'] */ js.Any
  ]
  /**
    * Enables a workflow and sets the `state` of the workflow to `active`. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("enableWorkflow")
  var enableWorkflow_Original: `29`
  
  /**
    * Generates a configuration that can be passed to the runner application at startup.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def generateRunnerJitconfigForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/generate-jitconfig']['response'] */ js.Any
  ]
  def generateRunnerJitconfigForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/generate-jitconfig']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/{org}/actions/runners/generate-jitconfig']['response'] */ js.Any
  ]
  /**
    * Generates a configuration that can be passed to the runner application at startup.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("generateRunnerJitconfigForOrg")
  var generateRunnerJitconfigForOrg_Original: `30`
  
  /**
    * Generates a configuration that can be passed to the runner application at startup.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def generateRunnerJitconfigForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/generate-jitconfig']['response'] */ js.Any
  ]
  def generateRunnerJitconfigForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/generate-jitconfig']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runners/generate-jitconfig']['response'] */ js.Any
  ]
  /**
    * Generates a configuration that can be passed to the runner application at startup.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("generateRunnerJitconfigForRepo")
  var generateRunnerJitconfigForRepo_Original: `31`
  
  /**
    * Lists the GitHub Actions caches for a repository.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getActionsCacheList(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/caches']['response'] */ js.Any
  ]
  def getActionsCacheList(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/caches']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/caches']['response'] */ js.Any
  ]
  /**
    * Lists the GitHub Actions caches for a repository.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getActionsCacheList")
  var getActionsCacheList_Original: `32`
  
  /**
    * Gets GitHub Actions cache usage for a repository.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getActionsCacheUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/cache/usage']['response'] */ js.Any
  ]
  def getActionsCacheUsage(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/cache/usage']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/cache/usage']['response'] */ js.Any
  ]
  
  /**
    * Lists repositories and their GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  def getActionsCacheUsageByRepoForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/cache/usage-by-repository']['response'] */ js.Any
  ]
  def getActionsCacheUsageByRepoForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/cache/usage-by-repository']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/cache/usage-by-repository']['response'] */ js.Any
  ]
  /**
    * Lists repositories and their GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  @JSName("getActionsCacheUsageByRepoForOrg")
  var getActionsCacheUsageByRepoForOrg_Original: `34`
  
  /**
    * Gets the total GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  def getActionsCacheUsageForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/cache/usage']['response'] */ js.Any
  ]
  def getActionsCacheUsageForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/cache/usage']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/cache/usage']['response'] */ js.Any
  ]
  /**
    * Gets the total GitHub Actions cache usage for an organization.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `organization_admistration:read` permission to use this endpoint.
    */
  @JSName("getActionsCacheUsageForOrg")
  var getActionsCacheUsageForOrg_Original: `35`
  
  /**
    * Gets GitHub Actions cache usage for a repository.
    * The data fetched using this API is refreshed approximately every 5 minutes, so values returned from this endpoint may take at least 5 minutes to get updated.
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getActionsCacheUsage")
  var getActionsCacheUsage_Original: `33`
  
  /**
    * Gets the selected actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).""
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def getAllowedActionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  def getAllowedActionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/selected-actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  /**
    * Gets the selected actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization).""
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("getAllowedActionsOrganization")
  var getAllowedActionsOrganization_Original: `36`
  
  /**
    * Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  def getAllowedActionsRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  def getAllowedActionsRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/selected-actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  /**
    * Gets the settings for selected actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  @JSName("getAllowedActionsRepository")
  var getAllowedActionsRepository_Original: `37`
  
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts/{artifact_id}']['response'] */ js.Any
  ]
  def getArtifact(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts/{artifact_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts/{artifact_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getArtifact")
  var getArtifact_Original: `38`
  
  /**
    * Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getEnvironmentPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets/public-key']['response'] */ js.Any
  ]
  def getEnvironmentPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Get the public key for an environment, which you need to encrypt environment secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getEnvironmentPublicKey")
  var getEnvironmentPublicKey_Original: `39`
  
  /**
    * Gets a single environment secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getEnvironmentSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getEnvironmentSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets a single environment secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getEnvironmentSecret")
  var getEnvironmentSecret_Original: `40`
  
  /**
    * Gets a specific variable in an environment. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.
    */
  def getEnvironmentVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['response'] */ js.Any
  ]
  def getEnvironmentVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Gets a specific variable in an environment. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.
    */
  @JSName("getEnvironmentVariable")
  var getEnvironmentVariable_Original: `41`
  
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization,
    * as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def getGithubActionsDefaultWorkflowPermissionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/workflow']['response'] */ js.Any
  ]
  def getGithubActionsDefaultWorkflowPermissionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/workflow']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/workflow']['response'] */ js.Any
  ]
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization,
    * as well as whether GitHub Actions can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("getGithubActionsDefaultWorkflowPermissionsOrganization")
  var getGithubActionsDefaultWorkflowPermissionsOrganization_Original: `42`
  
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository,
    * as well as if GitHub Actions can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  def getGithubActionsDefaultWorkflowPermissionsRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/workflow']['response'] */ js.Any
  ]
  def getGithubActionsDefaultWorkflowPermissionsRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/workflow']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/workflow']['response'] */ js.Any
  ]
  /**
    * Gets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository,
    * as well as if GitHub Actions can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  @JSName("getGithubActionsDefaultWorkflowPermissionsRepository")
  var getGithubActionsDefaultWorkflowPermissionsRepository_Original: `43`
  
  /**
    * Gets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def getGithubActionsPermissionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions']['response'] */ js.Any
  ]
  def getGithubActionsPermissionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions']['response'] */ js.Any
  ]
  /**
    * Gets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("getGithubActionsPermissionsOrganization")
  var getGithubActionsPermissionsOrganization_Original: `44`
  
  /**
    * Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  def getGithubActionsPermissionsRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions']['response'] */ js.Any
  ]
  def getGithubActionsPermissionsRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions']['response'] */ js.Any
  ]
  /**
    * Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  @JSName("getGithubActionsPermissionsRepository")
  var getGithubActionsPermissionsRepository_Original: `45`
  
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getJobForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/jobs/{job_id}']['response'] */ js.Any
  ]
  def getJobForWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/jobs/{job_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/jobs/{job_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getJobForWorkflowRun")
  var getJobForWorkflowRun_Original: `46`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def getOrgPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/public-key']['response'] */ js.Any
  ]
  def getOrgPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgPublicKey")
  var getOrgPublicKey_Original: `47`
  
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def getOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgSecret")
  var getOrgSecret_Original: `48`
  
  /**
    * Gets a specific variable in an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  def getOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables/{name}']['response'] */ js.Any
  ]
  def getOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Gets a specific variable in an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  @JSName("getOrgVariable")
  var getOrgVariable_Original: `49`
  
  /**
    * Get all deployment environments for a workflow run that are waiting for protection rules to pass.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getPendingDeploymentsForRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments']['response'] */ js.Any
  ]
  def getPendingDeploymentsForRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments']['response'] */ js.Any
  ]
  /**
    * Get all deployment environments for a workflow run that are waiting for protection rules to pass.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getPendingDeploymentsForRun")
  var getPendingDeploymentsForRun_Original: `50`
  
  /**
    * Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    * @deprecated octokit.rest.actions.getRepoPermissions() has been renamed to octokit.rest.actions.getGithubActionsPermissionsRepository() (2020-11-10)
    */
  def getRepoPermissions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions']['response'] */ js.Any
  ]
  def getRepoPermissions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions']['response'] */ js.Any
  ]
  /**
    * Gets the GitHub Actions permissions policy for a repository, including whether GitHub Actions is enabled and the actions and reusable workflows allowed to run in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    * @deprecated octokit.rest.actions.getRepoPermissions() has been renamed to octokit.rest.actions.getGithubActionsPermissionsRepository() (2020-11-10)
    */
  @JSName("getRepoPermissions")
  var getRepoPermissions_Original: `45`
  
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getRepoPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets/public-key']['response'] */ js.Any
  ]
  def getRepoPublicKey(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets/public-key']['response'] */ js.Any
  ]
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoPublicKey")
  var getRepoPublicKey_Original: `51`
  
  /**
    * Gets a specific required workflow present in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def getRepoRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}']['response'] */ js.Any
  ]
  def getRepoRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}']['response'] */ js.Any
  ]
  
  /**
    * Gets the number of billable minutes used by a specific required workflow during the current billing cycle.
    *
    * Billable minutes only apply to required workflows running in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)."
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getRepoRequiredWorkflowUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/timing']['response'] */ js.Any
  ]
  def getRepoRequiredWorkflowUsage(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/timing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/timing']['response'] */ js.Any
  ]
  /**
    * Gets the number of billable minutes used by a specific required workflow during the current billing cycle.
    *
    * Billable minutes only apply to required workflows running in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)."
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getRepoRequiredWorkflowUsage")
  var getRepoRequiredWorkflowUsage_Original: `53`
  
  /**
    * Gets a specific required workflow present in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("getRepoRequiredWorkflow")
  var getRepoRequiredWorkflow_Original: `52`
  
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  def getRepoSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets/{secret_name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets/{secret_name}']['response'] */ js.Any
  ]
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoSecret")
  var getRepoSecret_Original: `54`
  
  /**
    * Gets a specific variable in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  def getRepoVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/variables/{name}']['response'] */ js.Any
  ]
  def getRepoVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Gets a specific variable in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  @JSName("getRepoVariable")
  var getRepoVariable_Original: `55`
  
  /**
    * Get a required workflow configured in an organization.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def getRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows/{required_workflow_id}']['response'] */ js.Any
  ]
  def getRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows/{required_workflow_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows/{required_workflow_id}']['response'] */ js.Any
  ]
  /**
    * Get a required workflow configured in an organization.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("getRequiredWorkflow")
  var getRequiredWorkflow_Original: `56`
  
  /**
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getReviewsForRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/approvals']['response'] */ js.Any
  ]
  def getReviewsForRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/approvals']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/approvals']['response'] */ js.Any
  ]
  /**
    * Anyone with read access to the repository can use this endpoint. If the repository is private, you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getReviewsForRun")
  var getReviewsForRun_Original: `57`
  
  /**
    * Gets a specific self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def getSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  def getSelfHostedRunnerForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/{runner_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specific self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("getSelfHostedRunnerForOrg")
  var getSelfHostedRunnerForOrg_Original: `58`
  
  /**
    * Gets a specific self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  def getSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  def getSelfHostedRunnerForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/{runner_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/{runner_id}']['response'] */ js.Any
  ]
  /**
    * Gets a specific self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  @JSName("getSelfHostedRunnerForRepo")
  var getSelfHostedRunnerForRepo_Original: `59`
  
  /**
    * Gets a specific workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}']['response'] */ js.Any
  ]
  def getWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}']['response'] */ js.Any
  ]
  
  /**
    * Gets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to private repositories.
    * For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  def getWorkflowAccessToRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/access']['response'] */ js.Any
  ]
  def getWorkflowAccessToRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/access']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/permissions/access']['response'] */ js.Any
  ]
  /**
    * Gets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to private repositories.
    * For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  @JSName("getWorkflowAccessToRepository")
  var getWorkflowAccessToRepository_Original: `61`
  
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}']['response'] */ js.Any
  ]
  def getWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}']['response'] */ js.Any
  ]
  
  /**
    * Gets a specific workflow run attempt. Anyone with read access to the repository
    * can use this endpoint. If the repository is private you must use an access token
    * with the `repo` scope. GitHub Apps must have the `actions:read` permission to
    * use this endpoint.
    */
  def getWorkflowRunAttempt(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}']['response'] */ js.Any
  ]
  def getWorkflowRunAttempt(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}']['response'] */ js.Any
  ]
  /**
    * Gets a specific workflow run attempt. Anyone with read access to the repository
    * can use this endpoint. If the repository is private you must use an access token
    * with the `repo` scope. GitHub Apps must have the `actions:read` permission to
    * use this endpoint.
    */
  @JSName("getWorkflowRunAttempt")
  var getWorkflowRunAttempt_Original: `63`
  
  /**
    * Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowRunUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/timing']['response'] */ js.Any
  ]
  def getWorkflowRunUsage(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/timing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/timing']['response'] */ js.Any
  ]
  /**
    * Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowRunUsage")
  var getWorkflowRunUsage_Original: `64`
  
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowRun")
  var getWorkflowRun_Original: `62`
  
  /**
    * Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/timing']['response'] */ js.Any
  ]
  def getWorkflowUsage(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/timing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/timing']['response'] */ js.Any
  ]
  /**
    * Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. Any job re-runs are also included in the usage. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".
    *
    * You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowUsage")
  var getWorkflowUsage_Original: `65`
  
  /**
    * Gets a specific workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflow")
  var getWorkflow_Original: `60`
  
  /**
    * Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listArtifactsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts']['response'] */ js.Any
  ]
  def listArtifactsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/artifacts']['response'] */ js.Any
  ]
  /**
    * Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listArtifactsForRepo")
  var listArtifactsForRepo_Original: `66`
  
  /**
    * Lists all secrets available in an environment without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def listEnvironmentSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets']['response'] */ js.Any
  ]
  def listEnvironmentSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in an environment without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("listEnvironmentSecrets")
  var listEnvironmentSecrets_Original: `67`
  
  /**
    * Lists all environment variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.
    */
  def listEnvironmentVariables(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/variables']['response'] */ js.Any
  ]
  def listEnvironmentVariables(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/variables']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repositories/{repository_id}/environments/{environment_name}/variables']['response'] */ js.Any
  ]
  /**
    * Lists all environment variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `environments:read` repository permission to use this endpoint.
    */
  @JSName("listEnvironmentVariables")
  var listEnvironmentVariables_Original: `68`
  
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    */
  def listJobsForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/jobs']['response'] */ js.Any
  ]
  def listJobsForWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/jobs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/jobs']['response'] */ js.Any
  ]
  
  /**
    * Lists jobs for a specific workflow run attempt. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    */
  def listJobsForWorkflowRunAttempt(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs']['response'] */ js.Any
  ]
  def listJobsForWorkflowRunAttempt(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/attempts/{attempt_number}/jobs']['response'] */ js.Any
  ]
  /**
    * Lists jobs for a specific workflow run attempt. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    */
  @JSName("listJobsForWorkflowRunAttempt")
  var listJobsForWorkflowRunAttempt_Original: `70`
  
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    */
  @JSName("listJobsForWorkflowRun")
  var listJobsForWorkflowRun_Original: `69`
  
  /**
    * Lists all labels for a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listLabelsForSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def listLabelsForSelfHostedRunnerForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Lists all labels for a self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listLabelsForSelfHostedRunnerForOrg")
  var listLabelsForSelfHostedRunnerForOrg_Original: `71`
  
  /**
    * Lists all labels for a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  def listLabelsForSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def listLabelsForSelfHostedRunnerForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Lists all labels for a self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  @JSName("listLabelsForSelfHostedRunnerForRepo")
  var listLabelsForSelfHostedRunnerForRepo_Original: `72`
  
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def listOrgSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets']['response'] */ js.Any
  ]
  def listOrgSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("listOrgSecrets")
  var listOrgSecrets_Original: `73`
  
  /**
    * Lists all organization variables. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  def listOrgVariables(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables']['response'] */ js.Any
  ]
  def listOrgVariables(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables']['response'] */ js.Any
  ]
  /**
    * Lists all organization variables. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  @JSName("listOrgVariables")
  var listOrgVariables_Original: `74`
  
  /**
    * Lists all organization secrets shared with a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def listRepoOrganizationSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/organization-secrets']['response'] */ js.Any
  ]
  def listRepoOrganizationSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/organization-secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/organization-secrets']['response'] */ js.Any
  ]
  /**
    * Lists all organization secrets shared with a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("listRepoOrganizationSecrets")
  var listRepoOrganizationSecrets_Original: `75`
  
  /**
    * Lists all organiation variables shared with a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  def listRepoOrganizationVariables(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/organization-variables']['response'] */ js.Any
  ]
  def listRepoOrganizationVariables(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/organization-variables']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/organization-variables']['response'] */ js.Any
  ]
  /**
    * Lists all organiation variables shared with a repository. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  @JSName("listRepoOrganizationVariables")
  var listRepoOrganizationVariables_Original: `76`
  
  /**
    * Lists the required workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def listRepoRequiredWorkflows(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows']['response'] */ js.Any
  ]
  def listRepoRequiredWorkflows(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{org}/{repo}/actions/required_workflows']['response'] */ js.Any
  ]
  /**
    * Lists the required workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("listRepoRequiredWorkflows")
  var listRepoRequiredWorkflows_Original: `77`
  
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def listRepoSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets']['response'] */ js.Any
  ]
  def listRepoSecrets(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/secrets']['response'] */ js.Any
  ]
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("listRepoSecrets")
  var listRepoSecrets_Original: `78`
  
  /**
    * Lists all repository variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  def listRepoVariables(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/variables']['response'] */ js.Any
  ]
  def listRepoVariables(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/variables']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/variables']['response'] */ js.Any
  ]
  /**
    * Lists all repository variables. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions_variables:read` repository permission to use this endpoint.
    */
  @JSName("listRepoVariables")
  var listRepoVariables_Original: `79`
  
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listRepoWorkflows(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows']['response'] */ js.Any
  ]
  def listRepoWorkflows(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows']['response'] */ js.Any
  ]
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listRepoWorkflows")
  var listRepoWorkflows_Original: `80`
  
  /**
    * List all workflow runs for a required workflow. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def listRequiredWorkflowRuns(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/runs']['response'] */ js.Any
  ]
  def listRequiredWorkflowRuns(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/runs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/required_workflows/{required_workflow_id_for_repo}/runs']['response'] */ js.Any
  ]
  /**
    * List all workflow runs for a required workflow. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("listRequiredWorkflowRuns")
  var listRequiredWorkflowRuns_Original: `81`
  
  /**
    * List all required workflows in an organization.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def listRequiredWorkflows(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows']['response'] */ js.Any
  ]
  def listRequiredWorkflows(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows']['response'] */ js.Any
  ]
  /**
    * List all required workflows in an organization.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("listRequiredWorkflows")
  var listRequiredWorkflows_Original: `82`
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listRunnerApplicationsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/downloads']['response'] */ js.Any
  ]
  def listRunnerApplicationsForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/downloads']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners/downloads']['response'] */ js.Any
  ]
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listRunnerApplicationsForOrg")
  var listRunnerApplicationsForOrg_Original: `83`
  
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def listRunnerApplicationsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/downloads']['response'] */ js.Any
  ]
  def listRunnerApplicationsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/downloads']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners/downloads']['response'] */ js.Any
  ]
  /**
    * Lists binaries for the runner application that you can download and run.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("listRunnerApplicationsForRepo")
  var listRunnerApplicationsForRepo_Original: `84`
  
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def listSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def listSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("listSelectedReposForOrgSecret")
  var listSelectedReposForOrgSecret_Original: `85`
  
  /**
    * Lists all repositories that can access an organization variable that is available to selected repositories. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  def listSelectedReposForOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables/{name}/repositories']['response'] */ js.Any
  ]
  def listSelectedReposForOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables/{name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/variables/{name}/repositories']['response'] */ js.Any
  ]
  /**
    * Lists all repositories that can access an organization variable that is available to selected repositories. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:read` organization permission to use this endpoint.
    */
  @JSName("listSelectedReposForOrgVariable")
  var listSelectedReposForOrgVariable_Original: `86`
  
  /**
    * Lists the selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def listSelectedRepositoriesEnabledGithubActionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/repositories']['response'] */ js.Any
  ]
  def listSelectedRepositoriesEnabledGithubActionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/permissions/repositories']['response'] */ js.Any
  ]
  /**
    * Lists the selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("listSelectedRepositoriesEnabledGithubActionsOrganization")
  var listSelectedRepositoriesEnabledGithubActionsOrganization_Original: `87`
  
  /**
    * Lists the selected repositories that are configured for a required workflow in an organization. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def listSelectedRepositoriesRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories']['response'] */ js.Any
  ]
  def listSelectedRepositoriesRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories']['response'] */ js.Any
  ]
  /**
    * Lists the selected repositories that are configured for a required workflow in an organization. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `read:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("listSelectedRepositoriesRequiredWorkflow")
  var listSelectedRepositoriesRequiredWorkflow_Original: `88`
  
  /**
    * Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listSelfHostedRunnersForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners']['response'] */ js.Any
  ]
  def listSelfHostedRunnersForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/{org}/actions/runners']['response'] */ js.Any
  ]
  /**
    * Lists all self-hosted runners configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForOrg")
  var listSelfHostedRunnersForOrg_Original: `89`
  
  /**
    * Lists all self-hosted runners configured in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def listSelfHostedRunnersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners']['response'] */ js.Any
  ]
  def listSelfHostedRunnersForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runners']['response'] */ js.Any
  ]
  /**
    * Lists all self-hosted runners configured in a repository. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForRepo")
  var listSelfHostedRunnersForRepo_Original: `90`
  
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listWorkflowRunArtifacts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts']['response'] */ js.Any
  ]
  def listWorkflowRunArtifacts(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs/{run_id}/artifacts']['response'] */ js.Any
  ]
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listWorkflowRunArtifacts")
  var listWorkflowRunArtifacts_Original: `91`
  
  /**
    * List all workflow runs for a workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  def listWorkflowRuns(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs']['response'] */ js.Any
  ]
  def listWorkflowRuns(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/workflows/{workflow_id}/runs']['response'] */ js.Any
  ]
  
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listWorkflowRunsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs']['response'] */ js.Any
  ]
  def listWorkflowRunsForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/actions/runs']['response'] */ js.Any
  ]
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listWorkflowRunsForRepo")
  var listWorkflowRunsForRepo_Original: `93`
  
  /**
    * List all workflow runs for a workflow. You can replace `workflow_id` with the workflow file name. For example, you could use `main.yaml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://docs.github.com/rest/overview/resources-in-the-rest-api#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  @JSName("listWorkflowRuns")
  var listWorkflowRuns_Original: `92`
  
  /**
    * Re-run a job and its dependent jobs in a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def reRunJobForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/jobs/{job_id}/rerun']['response'] */ js.Any
  ]
  def reRunJobForWorkflowRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/jobs/{job_id}/rerun']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/jobs/{job_id}/rerun']['response'] */ js.Any
  ]
  /**
    * Re-run a job and its dependent jobs in a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("reRunJobForWorkflowRun")
  var reRunJobForWorkflowRun_Original: `94`
  
  /**
    * Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def reRunWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/rerun']['response'] */ js.Any
  ]
  def reRunWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/rerun']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/rerun']['response'] */ js.Any
  ]
  
  /**
    * Re-run all of the failed jobs and their dependent jobs in a workflow run using the `id` of the workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def reRunWorkflowFailedJobs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/rerun-failed-jobs']['response'] */ js.Any
  ]
  def reRunWorkflowFailedJobs(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/rerun-failed-jobs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/rerun-failed-jobs']['response'] */ js.Any
  ]
  /**
    * Re-run all of the failed jobs and their dependent jobs in a workflow run using the `id` of the workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("reRunWorkflowFailedJobs")
  var reRunWorkflowFailedJobs_Original: `96`
  
  /**
    * Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("reRunWorkflow")
  var reRunWorkflow_Original: `95`
  
  /**
    * Remove all custom labels from a self-hosted runner configured in an
    * organization. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def removeAllCustomLabelsFromSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def removeAllCustomLabelsFromSelfHostedRunnerForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Remove all custom labels from a self-hosted runner configured in an
    * organization. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("removeAllCustomLabelsFromSelfHostedRunnerForOrg")
  var removeAllCustomLabelsFromSelfHostedRunnerForOrg_Original: `97`
  
  /**
    * Remove all custom labels from a self-hosted runner configured in a
    * repository. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  def removeAllCustomLabelsFromSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def removeAllCustomLabelsFromSelfHostedRunnerForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Remove all custom labels from a self-hosted runner configured in a
    * repository. Returns the remaining read-only labels from the runner.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  @JSName("removeAllCustomLabelsFromSelfHostedRunnerForRepo")
  var removeAllCustomLabelsFromSelfHostedRunnerForRepo_Original: `98`
  
  /**
    * Remove a custom label from a self-hosted runner configured
    * in an organization. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def removeCustomLabelFromSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}/labels/{name}']['response'] */ js.Any
  ]
  def removeCustomLabelFromSelfHostedRunnerForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}/labels/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/runners/{runner_id}/labels/{name}']['response'] */ js.Any
  ]
  /**
    * Remove a custom label from a self-hosted runner configured
    * in an organization. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("removeCustomLabelFromSelfHostedRunnerForOrg")
  var removeCustomLabelFromSelfHostedRunnerForOrg_Original: `99`
  
  /**
    * Remove a custom label from a self-hosted runner configured
    * in a repository. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  def removeCustomLabelFromSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}/labels/{name}']['response'] */ js.Any
  ]
  def removeCustomLabelFromSelfHostedRunnerForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}/labels/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/{owner}/{repo}/actions/runners/{runner_id}/labels/{name}']['response'] */ js.Any
  ]
  /**
    * Remove a custom label from a self-hosted runner configured
    * in a repository. Returns the remaining labels from the runner.
    *
    * This endpoint returns a `404 Not Found` status if the custom label is not
    * present on the runner.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  @JSName("removeCustomLabelFromSelfHostedRunnerForRepo")
  var removeCustomLabelFromSelfHostedRunnerForRepo_Original: `100`
  
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def removeSelectedRepoFromOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def removeSelectedRepoFromOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/secrets/{secret_name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("removeSelectedRepoFromOrgSecret")
  var removeSelectedRepoFromOrgSecret_Original: `101`
  
  /**
    * Removes a repository from an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  def removeSelectedRepoFromOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/variables/{name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def removeSelectedRepoFromOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/variables/{name}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/variables/{name}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Removes a repository from an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  @JSName("removeSelectedRepoFromOrgVariable")
  var removeSelectedRepoFromOrgVariable_Original: `102`
  
  /**
    * Removes a repository from a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def removeSelectedRepoFromRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id}']['response'] */ js.Any
  ]
  def removeSelectedRepoFromRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories/{repository_id}']['response'] */ js.Any
  ]
  /**
    * Removes a repository from a required workflow. To use this endpoint, the required workflow must be configured to run on selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("removeSelectedRepoFromRequiredWorkflow")
  var removeSelectedRepoFromRequiredWorkflow_Original: `103`
  
  /**
    * Approve or reject custom deployment protection rules provided by a GitHub App for a workflow run. For more information, see "[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment)."
    *
    * **Note:** GitHub Apps can only review their own custom deployment protection rules.
    * To approve or reject pending deployments that are waiting for review from a specific person or team, see [`POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments`](/rest/actions/workflow-runs#review-pending-deployments-for-a-workflow-run).
    *
    * GitHub Apps must have read and write permission for **Deployments** to use this endpoint.
    */
  def reviewCustomGatesForRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/deployment_protection_rule']['response'] */ js.Any
  ]
  def reviewCustomGatesForRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/deployment_protection_rule']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/deployment_protection_rule']['response'] */ js.Any
  ]
  /**
    * Approve or reject custom deployment protection rules provided by a GitHub App for a workflow run. For more information, see "[Using environments for deployment](https://docs.github.com/actions/deployment/targeting-different-environments/using-environments-for-deployment)."
    *
    * **Note:** GitHub Apps can only review their own custom deployment protection rules.
    * To approve or reject pending deployments that are waiting for review from a specific person or team, see [`POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments`](/rest/actions/workflow-runs#review-pending-deployments-for-a-workflow-run).
    *
    * GitHub Apps must have read and write permission for **Deployments** to use this endpoint.
    */
  @JSName("reviewCustomGatesForRun")
  var reviewCustomGatesForRun_Original: `104`
  
  /**
    * Approve or reject pending deployments that are waiting on approval by a required reviewer.
    *
    * Required reviewers with read access to the repository contents and deployments can use this endpoint. Required reviewers must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def reviewPendingDeploymentsForRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments']['response'] */ js.Any
  ]
  def reviewPendingDeploymentsForRun(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/actions/runs/{run_id}/pending_deployments']['response'] */ js.Any
  ]
  /**
    * Approve or reject pending deployments that are waiting on approval by a required reviewer.
    *
    * Required reviewers with read access to the repository contents and deployments can use this endpoint. Required reviewers must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("reviewPendingDeploymentsForRun")
  var reviewPendingDeploymentsForRun_Original: `105`
  
  /**
    * Sets the actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def setAllowedActionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  def setAllowedActionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/selected-actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  /**
    * Sets the actions and reusable workflows that are allowed in an organization. To use this endpoint, the organization permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("setAllowedActionsOrganization")
  var setAllowedActionsOrganization_Original: `106`
  
  /**
    * Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  def setAllowedActionsRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  def setAllowedActionsRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/selected-actions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/selected-actions']['response'] */ js.Any
  ]
  /**
    * Sets the actions and reusable workflows that are allowed in a repository. To use this endpoint, the repository permission policy for `allowed_actions` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for a repository](#set-github-actions-permissions-for-a-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  @JSName("setAllowedActionsRepository")
  var setAllowedActionsRepository_Original: `107`
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def setCustomLabelsForSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def setCustomLabelsForSelfHostedRunnerForOrg(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("setCustomLabelsForSelfHostedRunnerForOrg")
  var setCustomLabelsForSelfHostedRunnerForOrg_Original: `108`
  
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  def setCustomLabelsForSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  def setCustomLabelsForSelfHostedRunnerForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/runners/{runner_id}/labels']['response'] */ js.Any
  ]
  /**
    * Remove all previous custom labels and set the new custom labels for a specific
    * self-hosted runner configured in a repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this
    * endpoint.
    */
  @JSName("setCustomLabelsForSelfHostedRunnerForRepo")
  var setCustomLabelsForSelfHostedRunnerForRepo_Original: `109`
  
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization, and sets if GitHub Actions
    * can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def setGithubActionsDefaultWorkflowPermissionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/workflow']['response'] */ js.Any
  ]
  def setGithubActionsDefaultWorkflowPermissionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/workflow']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/workflow']['response'] */ js.Any
  ]
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in an organization, and sets if GitHub Actions
    * can submit approving pull request reviews. For more information, see
    * "[Setting the permissions of the GITHUB_TOKEN for your organization](https://docs.github.com/organizations/managing-organization-settings/disabling-or-limiting-github-actions-for-your-organization#setting-the-permissions-of-the-github_token-for-your-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("setGithubActionsDefaultWorkflowPermissionsOrganization")
  var setGithubActionsDefaultWorkflowPermissionsOrganization_Original: `110`
  
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository, and sets if GitHub Actions
    * can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  def setGithubActionsDefaultWorkflowPermissionsRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/workflow']['response'] */ js.Any
  ]
  def setGithubActionsDefaultWorkflowPermissionsRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/workflow']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/workflow']['response'] */ js.Any
  ]
  /**
    * Sets the default workflow permissions granted to the `GITHUB_TOKEN` when running workflows in a repository, and sets if GitHub Actions
    * can submit approving pull request reviews.
    * For more information, see "[Setting the permissions of the GITHUB_TOKEN for your repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#setting-the-permissions-of-the-github_token-for-your-repository)."
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the repository `administration` permission to use this API.
    */
  @JSName("setGithubActionsDefaultWorkflowPermissionsRepository")
  var setGithubActionsDefaultWorkflowPermissionsRepository_Original: `111`
  
  /**
    * Sets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def setGithubActionsPermissionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions']['response'] */ js.Any
  ]
  def setGithubActionsPermissionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions']['response'] */ js.Any
  ]
  /**
    * Sets the GitHub Actions permissions policy for repositories and allowed actions and reusable workflows in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("setGithubActionsPermissionsOrganization")
  var setGithubActionsPermissionsOrganization_Original: `112`
  
  /**
    * Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions and reusable workflows in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  def setGithubActionsPermissionsRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions']['response'] */ js.Any
  ]
  def setGithubActionsPermissionsRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions']['response'] */ js.Any
  ]
  /**
    * Sets the GitHub Actions permissions policy for enabling GitHub Actions and allowed actions and reusable workflows in the repository.
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `administration` repository permission to use this API.
    */
  @JSName("setGithubActionsPermissionsRepository")
  var setGithubActionsPermissionsRepository_Original: `113`
  
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def setSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  def setSelectedReposForOrgSecret(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/secrets/{secret_name}/repositories']['response'] */ js.Any
  ]
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/actions#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("setSelectedReposForOrgSecret")
  var setSelectedReposForOrgSecret_Original: `114`
  
  /**
    * Replaces all repositories for an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  def setSelectedReposForOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/variables/{name}/repositories']['response'] */ js.Any
  ]
  def setSelectedReposForOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/variables/{name}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/variables/{name}/repositories']['response'] */ js.Any
  ]
  /**
    * Replaces all repositories for an organization variable that is available to selected repositories. Organization variables that are available to selected repositories have their `visibility` field set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  @JSName("setSelectedReposForOrgVariable")
  var setSelectedReposForOrgVariable_Original: `115`
  
  /**
    * Sets the repositories for a required workflow that is required for selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def setSelectedReposToRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories']['response'] */ js.Any
  ]
  def setSelectedReposToRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/required_workflows/{required_workflow_id}/repositories']['response'] */ js.Any
  ]
  /**
    * Sets the repositories for a required workflow that is required for selected repositories.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("setSelectedReposToRequiredWorkflow")
  var setSelectedReposToRequiredWorkflow_Original: `116`
  
  /**
    * Replaces the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  def setSelectedRepositoriesEnabledGithubActionsOrganization(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/repositories']['response'] */ js.Any
  ]
  def setSelectedRepositoriesEnabledGithubActionsOrganization(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/{org}/actions/permissions/repositories']['response'] */ js.Any
  ]
  /**
    * Replaces the list of selected repositories that are enabled for GitHub Actions in an organization. To use this endpoint, the organization permission policy for `enabled_repositories` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an organization](#set-github-actions-permissions-for-an-organization)."
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `administration` organization permission to use this API.
    */
  @JSName("setSelectedRepositoriesEnabledGithubActionsOrganization")
  var setSelectedRepositoriesEnabledGithubActionsOrganization_Original: `117`
  
  /**
    * Sets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to private repositories.
    * For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)".
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  def setWorkflowAccessToRepository(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/access']['response'] */ js.Any
  ]
  def setWorkflowAccessToRepository(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/access']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/{owner}/{repo}/actions/permissions/access']['response'] */ js.Any
  ]
  /**
    * Sets the level of access that workflows outside of the repository have to actions and reusable workflows in the repository.
    * This endpoint only applies to private repositories.
    * For more information, see "[Allowing access to components in a private repository](https://docs.github.com/repositories/managing-your-repositorys-settings-and-features/enabling-features-for-your-repository/managing-github-actions-settings-for-a-repository#allowing-access-to-components-in-a-private-repository)".
    *
    * You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the
    * repository `administration` permission to use this endpoint.
    */
  @JSName("setWorkflowAccessToRepository")
  var setWorkflowAccessToRepository_Original: `118`
  
  /**
    * Updates an environment variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  def updateEnvironmentVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['response'] */ js.Any
  ]
  def updateEnvironmentVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repositories/{repository_id}/environments/{environment_name}/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Updates an environment variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `environment:write` repository permission to use this endpoint.
    */
  @JSName("updateEnvironmentVariable")
  var updateEnvironmentVariable_Original: `119`
  
  /**
    * Updates an organization variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  def updateOrgVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/actions/variables/{name}']['response'] */ js.Any
  ]
  def updateOrgVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/actions/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/actions/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Updates an organization variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    * GitHub Apps must have the `organization_actions_variables:write` organization permission to use this endpoint.
    */
  @JSName("updateOrgVariable")
  var updateOrgVariable_Original: `120`
  
  /**
    * Updates a repository variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  def updateRepoVariable(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/actions/variables/{name}']['response'] */ js.Any
  ]
  def updateRepoVariable(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/actions/variables/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /repos/{owner}/{repo}/actions/variables/{name}']['response'] */ js.Any
  ]
  /**
    * Updates a repository variable that you can reference in a GitHub Actions workflow.
    * You must authenticate using an access token with the `repo` scope to use this endpoint.
    * GitHub Apps must have the `actions_variables:write` repository permission to use this endpoint.
    */
  @JSName("updateRepoVariable")
  var updateRepoVariable_Original: `121`
  
  /**
    * Update a required workflow in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  def updateRequiredWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/actions/required_workflows/{required_workflow_id}']['response'] */ js.Any
  ]
  def updateRequiredWorkflow(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/actions/required_workflows/{required_workflow_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /orgs/{org}/actions/required_workflows/{required_workflow_id}']['response'] */ js.Any
  ]
  /**
    * Update a required workflow in an organization.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * For more information, see "[Required Workflows](https://docs.github.com/actions/using-workflows/required-workflows)."
    */
  @JSName("updateRequiredWorkflow")
  var updateRequiredWorkflow_Original: `122`
}
object AddCustomLabelsToSelfHostedRunnerForOrg {
  
  inline def apply(
    addCustomLabelsToSelfHostedRunnerForOrg: Call,
    addCustomLabelsToSelfHostedRunnerForRepo: Defaults,
    addSelectedRepoToOrgSecret: Endpoint,
    addSelectedRepoToOrgVariable: CallDefaults,
    addSelectedRepoToRequiredWorkflow: DefaultsEndpoint,
    approveWorkflowRun: CallDefaultsEndpoint,
    cancelWorkflowRun: CallParams,
    createEnvironmentVariable: EndpointEndpointInterface,
    createOrUpdateEnvironmentSecret: CallParamsDefaults,
    createOrUpdateOrgSecret: DefaultsEndpointEndpointInterface,
    createOrUpdateRepoSecret: CallParamsDefaultsEndpointEndpointInterface,
    createOrgVariable: `0`,
    createRegistrationTokenForOrg: `1`,
    createRegistrationTokenForRepo: `2`,
    createRemoveTokenForOrg: `3`,
    createRemoveTokenForRepo: `4`,
    createRepoVariable: `5`,
    createRequiredWorkflow: `6`,
    createWorkflowDispatch: `7`,
    deleteActionsCacheById: `8`,
    deleteActionsCacheByKey: `9`,
    deleteArtifact: `10`,
    deleteEnvironmentSecret: `11`,
    deleteEnvironmentVariable: `12`,
    deleteOrgSecret: `13`,
    deleteOrgVariable: `14`,
    deleteRepoSecret: `15`,
    deleteRepoVariable: `16`,
    deleteRequiredWorkflow: `17`,
    deleteSelfHostedRunnerFromOrg: `18`,
    deleteSelfHostedRunnerFromRepo: `19`,
    deleteWorkflowRun: `20`,
    deleteWorkflowRunLogs: `21`,
    disableSelectedRepositoryGithubActionsOrganization: `22`,
    disableWorkflow: `23`,
    downloadArtifact: `24`,
    downloadJobLogsForWorkflowRun: `25`,
    downloadWorkflowRunAttemptLogs: `26`,
    downloadWorkflowRunLogs: `27`,
    enableSelectedRepositoryGithubActionsOrganization: `28`,
    enableWorkflow: `29`,
    generateRunnerJitconfigForOrg: `30`,
    generateRunnerJitconfigForRepo: `31`,
    getActionsCacheList: `32`,
    getActionsCacheUsage: `33`,
    getActionsCacheUsageByRepoForOrg: `34`,
    getActionsCacheUsageForOrg: `35`,
    getAllowedActionsOrganization: `36`,
    getAllowedActionsRepository: `37`,
    getArtifact: `38`,
    getEnvironmentPublicKey: `39`,
    getEnvironmentSecret: `40`,
    getEnvironmentVariable: `41`,
    getGithubActionsDefaultWorkflowPermissionsOrganization: `42`,
    getGithubActionsDefaultWorkflowPermissionsRepository: `43`,
    getGithubActionsPermissionsOrganization: `44`,
    getGithubActionsPermissionsRepository: `45`,
    getJobForWorkflowRun: `46`,
    getOrgPublicKey: `47`,
    getOrgSecret: `48`,
    getOrgVariable: `49`,
    getPendingDeploymentsForRun: `50`,
    getRepoPermissions: `45`,
    getRepoPublicKey: `51`,
    getRepoRequiredWorkflow: `52`,
    getRepoRequiredWorkflowUsage: `53`,
    getRepoSecret: `54`,
    getRepoVariable: `55`,
    getRequiredWorkflow: `56`,
    getReviewsForRun: `57`,
    getSelfHostedRunnerForOrg: `58`,
    getSelfHostedRunnerForRepo: `59`,
    getWorkflow: `60`,
    getWorkflowAccessToRepository: `61`,
    getWorkflowRun: `62`,
    getWorkflowRunAttempt: `63`,
    getWorkflowRunUsage: `64`,
    getWorkflowUsage: `65`,
    listArtifactsForRepo: `66`,
    listEnvironmentSecrets: `67`,
    listEnvironmentVariables: `68`,
    listJobsForWorkflowRun: `69`,
    listJobsForWorkflowRunAttempt: `70`,
    listLabelsForSelfHostedRunnerForOrg: `71`,
    listLabelsForSelfHostedRunnerForRepo: `72`,
    listOrgSecrets: `73`,
    listOrgVariables: `74`,
    listRepoOrganizationSecrets: `75`,
    listRepoOrganizationVariables: `76`,
    listRepoRequiredWorkflows: `77`,
    listRepoSecrets: `78`,
    listRepoVariables: `79`,
    listRepoWorkflows: `80`,
    listRequiredWorkflowRuns: `81`,
    listRequiredWorkflows: `82`,
    listRunnerApplicationsForOrg: `83`,
    listRunnerApplicationsForRepo: `84`,
    listSelectedReposForOrgSecret: `85`,
    listSelectedReposForOrgVariable: `86`,
    listSelectedRepositoriesEnabledGithubActionsOrganization: `87`,
    listSelectedRepositoriesRequiredWorkflow: `88`,
    listSelfHostedRunnersForOrg: `89`,
    listSelfHostedRunnersForRepo: `90`,
    listWorkflowRunArtifacts: `91`,
    listWorkflowRuns: `92`,
    listWorkflowRunsForRepo: `93`,
    reRunJobForWorkflowRun: `94`,
    reRunWorkflow: `95`,
    reRunWorkflowFailedJobs: `96`,
    removeAllCustomLabelsFromSelfHostedRunnerForOrg: `97`,
    removeAllCustomLabelsFromSelfHostedRunnerForRepo: `98`,
    removeCustomLabelFromSelfHostedRunnerForOrg: `99`,
    removeCustomLabelFromSelfHostedRunnerForRepo: `100`,
    removeSelectedRepoFromOrgSecret: `101`,
    removeSelectedRepoFromOrgVariable: `102`,
    removeSelectedRepoFromRequiredWorkflow: `103`,
    reviewCustomGatesForRun: `104`,
    reviewPendingDeploymentsForRun: `105`,
    setAllowedActionsOrganization: `106`,
    setAllowedActionsRepository: `107`,
    setCustomLabelsForSelfHostedRunnerForOrg: `108`,
    setCustomLabelsForSelfHostedRunnerForRepo: `109`,
    setGithubActionsDefaultWorkflowPermissionsOrganization: `110`,
    setGithubActionsDefaultWorkflowPermissionsRepository: `111`,
    setGithubActionsPermissionsOrganization: `112`,
    setGithubActionsPermissionsRepository: `113`,
    setSelectedReposForOrgSecret: `114`,
    setSelectedReposForOrgVariable: `115`,
    setSelectedReposToRequiredWorkflow: `116`,
    setSelectedRepositoriesEnabledGithubActionsOrganization: `117`,
    setWorkflowAccessToRepository: `118`,
    updateEnvironmentVariable: `119`,
    updateOrgVariable: `120`,
    updateRepoVariable: `121`,
    updateRequiredWorkflow: `122`
  ): AddCustomLabelsToSelfHostedRunnerForOrg = {
    val __obj = js.Dynamic.literal(addCustomLabelsToSelfHostedRunnerForOrg = addCustomLabelsToSelfHostedRunnerForOrg.asInstanceOf[js.Any], addCustomLabelsToSelfHostedRunnerForRepo = addCustomLabelsToSelfHostedRunnerForRepo.asInstanceOf[js.Any], addSelectedRepoToOrgSecret = addSelectedRepoToOrgSecret.asInstanceOf[js.Any], addSelectedRepoToOrgVariable = addSelectedRepoToOrgVariable.asInstanceOf[js.Any], addSelectedRepoToRequiredWorkflow = addSelectedRepoToRequiredWorkflow.asInstanceOf[js.Any], approveWorkflowRun = approveWorkflowRun.asInstanceOf[js.Any], cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createEnvironmentVariable = createEnvironmentVariable.asInstanceOf[js.Any], createOrUpdateEnvironmentSecret = createOrUpdateEnvironmentSecret.asInstanceOf[js.Any], createOrUpdateOrgSecret = createOrUpdateOrgSecret.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], createOrgVariable = createOrgVariable.asInstanceOf[js.Any], createRegistrationTokenForOrg = createRegistrationTokenForOrg.asInstanceOf[js.Any], createRegistrationTokenForRepo = createRegistrationTokenForRepo.asInstanceOf[js.Any], createRemoveTokenForOrg = createRemoveTokenForOrg.asInstanceOf[js.Any], createRemoveTokenForRepo = createRemoveTokenForRepo.asInstanceOf[js.Any], createRepoVariable = createRepoVariable.asInstanceOf[js.Any], createRequiredWorkflow = createRequiredWorkflow.asInstanceOf[js.Any], createWorkflowDispatch = createWorkflowDispatch.asInstanceOf[js.Any], deleteActionsCacheById = deleteActionsCacheById.asInstanceOf[js.Any], deleteActionsCacheByKey = deleteActionsCacheByKey.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteEnvironmentSecret = deleteEnvironmentSecret.asInstanceOf[js.Any], deleteEnvironmentVariable = deleteEnvironmentVariable.asInstanceOf[js.Any], deleteOrgSecret = deleteOrgSecret.asInstanceOf[js.Any], deleteOrgVariable = deleteOrgVariable.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], deleteRepoVariable = deleteRepoVariable.asInstanceOf[js.Any], deleteRequiredWorkflow = deleteRequiredWorkflow.asInstanceOf[js.Any], deleteSelfHostedRunnerFromOrg = deleteSelfHostedRunnerFromOrg.asInstanceOf[js.Any], deleteSelfHostedRunnerFromRepo = deleteSelfHostedRunnerFromRepo.asInstanceOf[js.Any], deleteWorkflowRun = deleteWorkflowRun.asInstanceOf[js.Any], deleteWorkflowRunLogs = deleteWorkflowRunLogs.asInstanceOf[js.Any], disableSelectedRepositoryGithubActionsOrganization = disableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], disableWorkflow = disableWorkflow.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], downloadJobLogsForWorkflowRun = downloadJobLogsForWorkflowRun.asInstanceOf[js.Any], downloadWorkflowRunAttemptLogs = downloadWorkflowRunAttemptLogs.asInstanceOf[js.Any], downloadWorkflowRunLogs = downloadWorkflowRunLogs.asInstanceOf[js.Any], enableSelectedRepositoryGithubActionsOrganization = enableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], enableWorkflow = enableWorkflow.asInstanceOf[js.Any], generateRunnerJitconfigForOrg = generateRunnerJitconfigForOrg.asInstanceOf[js.Any], generateRunnerJitconfigForRepo = generateRunnerJitconfigForRepo.asInstanceOf[js.Any], getActionsCacheList = getActionsCacheList.asInstanceOf[js.Any], getActionsCacheUsage = getActionsCacheUsage.asInstanceOf[js.Any], getActionsCacheUsageByRepoForOrg = getActionsCacheUsageByRepoForOrg.asInstanceOf[js.Any], getActionsCacheUsageForOrg = getActionsCacheUsageForOrg.asInstanceOf[js.Any], getAllowedActionsOrganization = getAllowedActionsOrganization.asInstanceOf[js.Any], getAllowedActionsRepository = getAllowedActionsRepository.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getEnvironmentPublicKey = getEnvironmentPublicKey.asInstanceOf[js.Any], getEnvironmentSecret = getEnvironmentSecret.asInstanceOf[js.Any], getEnvironmentVariable = getEnvironmentVariable.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsOrganization = getGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsRepository = getGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], getGithubActionsPermissionsOrganization = getGithubActionsPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsPermissionsRepository = getGithubActionsPermissionsRepository.asInstanceOf[js.Any], getJobForWorkflowRun = getJobForWorkflowRun.asInstanceOf[js.Any], getOrgPublicKey = getOrgPublicKey.asInstanceOf[js.Any], getOrgSecret = getOrgSecret.asInstanceOf[js.Any], getOrgVariable = getOrgVariable.asInstanceOf[js.Any], getPendingDeploymentsForRun = getPendingDeploymentsForRun.asInstanceOf[js.Any], getRepoPermissions = getRepoPermissions.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoRequiredWorkflow = getRepoRequiredWorkflow.asInstanceOf[js.Any], getRepoRequiredWorkflowUsage = getRepoRequiredWorkflowUsage.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], getRepoVariable = getRepoVariable.asInstanceOf[js.Any], getRequiredWorkflow = getRequiredWorkflow.asInstanceOf[js.Any], getReviewsForRun = getReviewsForRun.asInstanceOf[js.Any], getSelfHostedRunnerForOrg = getSelfHostedRunnerForOrg.asInstanceOf[js.Any], getSelfHostedRunnerForRepo = getSelfHostedRunnerForRepo.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowAccessToRepository = getWorkflowAccessToRepository.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], getWorkflowRunAttempt = getWorkflowRunAttempt.asInstanceOf[js.Any], getWorkflowRunUsage = getWorkflowRunUsage.asInstanceOf[js.Any], getWorkflowUsage = getWorkflowUsage.asInstanceOf[js.Any], listArtifactsForRepo = listArtifactsForRepo.asInstanceOf[js.Any], listEnvironmentSecrets = listEnvironmentSecrets.asInstanceOf[js.Any], listEnvironmentVariables = listEnvironmentVariables.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listJobsForWorkflowRunAttempt = listJobsForWorkflowRunAttempt.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForOrg = listLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForRepo = listLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], listOrgSecrets = listOrgSecrets.asInstanceOf[js.Any], listOrgVariables = listOrgVariables.asInstanceOf[js.Any], listRepoOrganizationSecrets = listRepoOrganizationSecrets.asInstanceOf[js.Any], listRepoOrganizationVariables = listRepoOrganizationVariables.asInstanceOf[js.Any], listRepoRequiredWorkflows = listRepoRequiredWorkflows.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listRepoVariables = listRepoVariables.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listRequiredWorkflowRuns = listRequiredWorkflowRuns.asInstanceOf[js.Any], listRequiredWorkflows = listRequiredWorkflows.asInstanceOf[js.Any], listRunnerApplicationsForOrg = listRunnerApplicationsForOrg.asInstanceOf[js.Any], listRunnerApplicationsForRepo = listRunnerApplicationsForRepo.asInstanceOf[js.Any], listSelectedReposForOrgSecret = listSelectedReposForOrgSecret.asInstanceOf[js.Any], listSelectedReposForOrgVariable = listSelectedReposForOrgVariable.asInstanceOf[js.Any], listSelectedRepositoriesEnabledGithubActionsOrganization = listSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], listSelectedRepositoriesRequiredWorkflow = listSelectedRepositoriesRequiredWorkflow.asInstanceOf[js.Any], listSelfHostedRunnersForOrg = listSelfHostedRunnersForOrg.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], listWorkflowRunsForRepo = listWorkflowRunsForRepo.asInstanceOf[js.Any], reRunJobForWorkflowRun = reRunJobForWorkflowRun.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], reRunWorkflowFailedJobs = reRunWorkflowFailedJobs.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForOrg = removeAllCustomLabelsFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForRepo = removeAllCustomLabelsFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForOrg = removeCustomLabelFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForRepo = removeCustomLabelFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeSelectedRepoFromOrgSecret = removeSelectedRepoFromOrgSecret.asInstanceOf[js.Any], removeSelectedRepoFromOrgVariable = removeSelectedRepoFromOrgVariable.asInstanceOf[js.Any], removeSelectedRepoFromRequiredWorkflow = removeSelectedRepoFromRequiredWorkflow.asInstanceOf[js.Any], reviewCustomGatesForRun = reviewCustomGatesForRun.asInstanceOf[js.Any], reviewPendingDeploymentsForRun = reviewPendingDeploymentsForRun.asInstanceOf[js.Any], setAllowedActionsOrganization = setAllowedActionsOrganization.asInstanceOf[js.Any], setAllowedActionsRepository = setAllowedActionsRepository.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForOrg = setCustomLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForRepo = setCustomLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsOrganization = setGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsRepository = setGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], setGithubActionsPermissionsOrganization = setGithubActionsPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsPermissionsRepository = setGithubActionsPermissionsRepository.asInstanceOf[js.Any], setSelectedReposForOrgSecret = setSelectedReposForOrgSecret.asInstanceOf[js.Any], setSelectedReposForOrgVariable = setSelectedReposForOrgVariable.asInstanceOf[js.Any], setSelectedReposToRequiredWorkflow = setSelectedReposToRequiredWorkflow.asInstanceOf[js.Any], setSelectedRepositoriesEnabledGithubActionsOrganization = setSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], setWorkflowAccessToRepository = setWorkflowAccessToRepository.asInstanceOf[js.Any], updateEnvironmentVariable = updateEnvironmentVariable.asInstanceOf[js.Any], updateOrgVariable = updateOrgVariable.asInstanceOf[js.Any], updateRepoVariable = updateRepoVariable.asInstanceOf[js.Any], updateRequiredWorkflow = updateRequiredWorkflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomLabelsToSelfHostedRunnerForOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCustomLabelsToSelfHostedRunnerForOrg] (val x: Self) extends AnyVal {
    
    inline def setAddCustomLabelsToSelfHostedRunnerForOrg(value: Call): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setAddCustomLabelsToSelfHostedRunnerForRepo(value: Defaults): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgSecret(value: Endpoint): Self = StObject.set(x, "addSelectedRepoToOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgVariable(value: CallDefaults): Self = StObject.set(x, "addSelectedRepoToOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToRequiredWorkflow(value: DefaultsEndpoint): Self = StObject.set(x, "addSelectedRepoToRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setApproveWorkflowRun(value: CallDefaultsEndpoint): Self = StObject.set(x, "approveWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCancelWorkflowRun(value: CallParams): Self = StObject.set(x, "cancelWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCreateEnvironmentVariable(value: EndpointEndpointInterface): Self = StObject.set(x, "createEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateEnvironmentSecret(value: CallParamsDefaults): Self = StObject.set(x, "createOrUpdateEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateOrgSecret(value: DefaultsEndpointEndpointInterface): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: CallParamsDefaultsEndpointEndpointInterface): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrgVariable(value: `0`): Self = StObject.set(x, "createOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForOrg(value: `1`): Self = StObject.set(x, "createRegistrationTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForRepo(value: `2`): Self = StObject.set(x, "createRegistrationTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForOrg(value: `3`): Self = StObject.set(x, "createRemoveTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForRepo(value: `4`): Self = StObject.set(x, "createRemoveTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRepoVariable(value: `5`): Self = StObject.set(x, "createRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateRequiredWorkflow(value: `6`): Self = StObject.set(x, "createRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setCreateWorkflowDispatch(value: `7`): Self = StObject.set(x, "createWorkflowDispatch", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheById(value: `8`): Self = StObject.set(x, "deleteActionsCacheById", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheByKey(value: `9`): Self = StObject.set(x, "deleteActionsCacheByKey", value.asInstanceOf[js.Any])
    
    inline def setDeleteArtifact(value: `10`): Self = StObject.set(x, "deleteArtifact", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentSecret(value: `11`): Self = StObject.set(x, "deleteEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentVariable(value: `12`): Self = StObject.set(x, "deleteEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgSecret(value: `13`): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgVariable(value: `14`): Self = StObject.set(x, "deleteOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `15`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoVariable(value: `16`): Self = StObject.set(x, "deleteRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequiredWorkflow(value: `17`): Self = StObject.set(x, "deleteRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromOrg(value: `18`): Self = StObject.set(x, "deleteSelfHostedRunnerFromOrg", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromRepo(value: `19`): Self = StObject.set(x, "deleteSelfHostedRunnerFromRepo", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRun(value: `20`): Self = StObject.set(x, "deleteWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRunLogs(value: `21`): Self = StObject.set(x, "deleteWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectedRepositoryGithubActionsOrganization(value: `22`): Self = StObject.set(x, "disableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setDisableWorkflow(value: `23`): Self = StObject.set(x, "disableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDownloadArtifact(value: `24`): Self = StObject.set(x, "downloadArtifact", value.asInstanceOf[js.Any])
    
    inline def setDownloadJobLogsForWorkflowRun(value: `25`): Self = StObject.set(x, "downloadJobLogsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunAttemptLogs(value: `26`): Self = StObject.set(x, "downloadWorkflowRunAttemptLogs", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunLogs(value: `27`): Self = StObject.set(x, "downloadWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectedRepositoryGithubActionsOrganization(value: `28`): Self = StObject.set(x, "enableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setEnableWorkflow(value: `29`): Self = StObject.set(x, "enableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGenerateRunnerJitconfigForOrg(value: `30`): Self = StObject.set(x, "generateRunnerJitconfigForOrg", value.asInstanceOf[js.Any])
    
    inline def setGenerateRunnerJitconfigForRepo(value: `31`): Self = StObject.set(x, "generateRunnerJitconfigForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheList(value: `32`): Self = StObject.set(x, "getActionsCacheList", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsage(value: `33`): Self = StObject.set(x, "getActionsCacheUsage", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageByRepoForOrg(value: `34`): Self = StObject.set(x, "getActionsCacheUsageByRepoForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageForOrg(value: `35`): Self = StObject.set(x, "getActionsCacheUsageForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsOrganization(value: `36`): Self = StObject.set(x, "getAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsRepository(value: `37`): Self = StObject.set(x, "getAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetArtifact(value: `38`): Self = StObject.set(x, "getArtifact", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentPublicKey(value: `39`): Self = StObject.set(x, "getEnvironmentPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentSecret(value: `40`): Self = StObject.set(x, "getEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentVariable(value: `41`): Self = StObject.set(x, "getEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsOrganization(value: `42`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsRepository(value: `43`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsOrganization(value: `44`): Self = StObject.set(x, "getGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsRepository(value: `45`): Self = StObject.set(x, "getGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetJobForWorkflowRun(value: `46`): Self = StObject.set(x, "getJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetOrgPublicKey(value: `47`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetOrgSecret(value: `48`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setGetOrgVariable(value: `49`): Self = StObject.set(x, "getOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setGetPendingDeploymentsForRun(value: `50`): Self = StObject.set(x, "getPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPermissions(value: `45`): Self = StObject.set(x, "getRepoPermissions", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `51`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoRequiredWorkflow(value: `52`): Self = StObject.set(x, "getRepoRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetRepoRequiredWorkflowUsage(value: `53`): Self = StObject.set(x, "getRepoRequiredWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `54`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetRepoVariable(value: `55`): Self = StObject.set(x, "getRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setGetRequiredWorkflow(value: `56`): Self = StObject.set(x, "getRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetReviewsForRun(value: `57`): Self = StObject.set(x, "getReviewsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForOrg(value: `58`): Self = StObject.set(x, "getSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForRepo(value: `59`): Self = StObject.set(x, "getSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflow(value: `60`): Self = StObject.set(x, "getWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowAccessToRepository(value: `61`): Self = StObject.set(x, "getWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRun(value: `62`): Self = StObject.set(x, "getWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunAttempt(value: `63`): Self = StObject.set(x, "getWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunUsage(value: `64`): Self = StObject.set(x, "getWorkflowRunUsage", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowUsage(value: `65`): Self = StObject.set(x, "getWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setListArtifactsForRepo(value: `66`): Self = StObject.set(x, "listArtifactsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentSecrets(value: `67`): Self = StObject.set(x, "listEnvironmentSecrets", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentVariables(value: `68`): Self = StObject.set(x, "listEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRun(value: `69`): Self = StObject.set(x, "listJobsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRunAttempt(value: `70`): Self = StObject.set(x, "listJobsForWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForOrg(value: `71`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForRepo(value: `72`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setListOrgSecrets(value: `73`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    inline def setListOrgVariables(value: `74`): Self = StObject.set(x, "listOrgVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoOrganizationSecrets(value: `75`): Self = StObject.set(x, "listRepoOrganizationSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoOrganizationVariables(value: `76`): Self = StObject.set(x, "listRepoOrganizationVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoRequiredWorkflows(value: `77`): Self = StObject.set(x, "listRepoRequiredWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `78`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoVariables(value: `79`): Self = StObject.set(x, "listRepoVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoWorkflows(value: `80`): Self = StObject.set(x, "listRepoWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRequiredWorkflowRuns(value: `81`): Self = StObject.set(x, "listRequiredWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListRequiredWorkflows(value: `82`): Self = StObject.set(x, "listRequiredWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForOrg(value: `83`): Self = StObject.set(x, "listRunnerApplicationsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForRepo(value: `84`): Self = StObject.set(x, "listRunnerApplicationsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgSecret(value: `85`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgVariable(value: `86`): Self = StObject.set(x, "listSelectedReposForOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesEnabledGithubActionsOrganization(value: `87`): Self = StObject.set(x, "listSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesRequiredWorkflow(value: `88`): Self = StObject.set(x, "listSelectedRepositoriesRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForOrg(value: `89`): Self = StObject.set(x, "listSelfHostedRunnersForOrg", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForRepo(value: `90`): Self = StObject.set(x, "listSelfHostedRunnersForRepo", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunArtifacts(value: `91`): Self = StObject.set(x, "listWorkflowRunArtifacts", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRuns(value: `92`): Self = StObject.set(x, "listWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunsForRepo(value: `93`): Self = StObject.set(x, "listWorkflowRunsForRepo", value.asInstanceOf[js.Any])
    
    inline def setReRunJobForWorkflowRun(value: `94`): Self = StObject.set(x, "reRunJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflow(value: `95`): Self = StObject.set(x, "reRunWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflowFailedJobs(value: `96`): Self = StObject.set(x, "reRunWorkflowFailedJobs", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(value: `97`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(value: `98`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForOrg(value: `99`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForRepo(value: `100`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgSecret(value: `101`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgVariable(value: `102`): Self = StObject.set(x, "removeSelectedRepoFromOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromRequiredWorkflow(value: `103`): Self = StObject.set(x, "removeSelectedRepoFromRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReviewCustomGatesForRun(value: `104`): Self = StObject.set(x, "reviewCustomGatesForRun", value.asInstanceOf[js.Any])
    
    inline def setReviewPendingDeploymentsForRun(value: `105`): Self = StObject.set(x, "reviewPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsOrganization(value: `106`): Self = StObject.set(x, "setAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsRepository(value: `107`): Self = StObject.set(x, "setAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForOrg(value: `108`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForRepo(value: `109`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsOrganization(value: `110`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsRepository(value: `111`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsOrganization(value: `112`): Self = StObject.set(x, "setGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsRepository(value: `113`): Self = StObject.set(x, "setGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgSecret(value: `114`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgVariable(value: `115`): Self = StObject.set(x, "setSelectedReposForOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposToRequiredWorkflow(value: `116`): Self = StObject.set(x, "setSelectedReposToRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedRepositoriesEnabledGithubActionsOrganization(value: `117`): Self = StObject.set(x, "setSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetWorkflowAccessToRepository(value: `118`): Self = StObject.set(x, "setWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setUpdateEnvironmentVariable(value: `119`): Self = StObject.set(x, "updateEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateOrgVariable(value: `120`): Self = StObject.set(x, "updateOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateRepoVariable(value: `121`): Self = StObject.set(x, "updateRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateRequiredWorkflow(value: `122`): Self = StObject.set(x, "updateRequiredWorkflow", value.asInstanceOf[js.Any])
  }
}
