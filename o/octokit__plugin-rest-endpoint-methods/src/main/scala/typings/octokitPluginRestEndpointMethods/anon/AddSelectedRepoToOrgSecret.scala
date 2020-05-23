package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSelectedRepoToOrgSecret extends js.Object {
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("addSelectedRepoToOrgSecret")
  var addSelectedRepoToOrgSecret_Original: Call = js.native
  /**
    * Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("cancelWorkflowRun")
  var cancelWorkflowRun_Original: Defaults = js.native
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  @JSName("createOrUpdateOrgSecret")
  var createOrUpdateOrgSecret_Original: Endpoint = js.native
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  @JSName("createOrUpdateRepoSecret")
  var createOrUpdateRepoSecret_Original: CallDefaults = js.native
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    * @deprecated octokit.actions.createOrUpdateSecretForRepo() has been renamed to octokit.actions.createOrUpdateRepoSecret() (2020-05-14)
    */
  @JSName("createOrUpdateSecretForRepo")
  var createOrUpdateSecretForRepo_Original: CallDefaults = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.
    */
  @JSName("createRegistrationTokenForOrg")
  var createRegistrationTokenForOrg_Original: CallDefaultsEndpoint = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  @JSName("createRegistrationTokenForRepo")
  var createRegistrationTokenForRepo_Original: DefaultsEndpoint = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    * @deprecated octokit.actions.createRegistrationToken() has been renamed to octokit.actions.createRegistrationTokenForRepo() (2020-04-22)
    */
  @JSName("createRegistrationToken")
  var createRegistrationToken_Original: DefaultsEndpoint = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * To remove your self-hosted runner from an organization, replace `TOKEN` with the remove token provided by this endpoint.
    */
  @JSName("createRemoveTokenForOrg")
  var createRemoveTokenForOrg_Original: EndpointEndpointInterface = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  @JSName("createRemoveTokenForRepo")
  var createRemoveTokenForRepo_Original: CallParams = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    * @deprecated octokit.actions.createRemoveToken() has been renamed to octokit.actions.createRemoveTokenForRepo() (2020-04-22)
    */
  @JSName("createRemoveToken")
  var createRemoveToken_Original: CallParams = js.native
  /**
    * Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteArtifact")
  var deleteArtifact_Original: CallParamsDefaults = js.native
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("deleteOrgSecret")
  var deleteOrgSecret_Original: DefaultsEndpointEndpointInterface = js.native
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("deleteRepoSecret")
  var deleteRepoSecret_Original: CallParamsDefaultsEndpointEndpointInterface = js.native
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.deleteSecretFromRepo() has been renamed to octokit.actions.deleteRepoSecret() (2020-05-14)
    */
  @JSName("deleteSecretFromRepo")
  var deleteSecretFromRepo_Original: CallParamsDefaultsEndpointEndpointInterface = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("deleteSelfHostedRunnerFromOrg")
  var deleteSelfHostedRunnerFromOrg_Original: `0` = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("deleteSelfHostedRunnerFromRepo")
  var deleteSelfHostedRunnerFromRepo_Original: `1` = js.native
  /**
    * Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("deleteWorkflowRunLogs")
  var deleteWorkflowRunLogs_Original: `2` = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("downloadArtifact")
  var downloadArtifact_Original: `3` = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("downloadWorkflowJobLogs")
  var downloadWorkflowJobLogs_Original: `4` = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("downloadWorkflowRunLogs")
  var downloadWorkflowRunLogs_Original: `5` = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getArtifact")
  var getArtifact_Original: `6` = js.native
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgPublicKey")
  var getOrgPublicKey_Original: `7` = js.native
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("getOrgSecret")
  var getOrgSecret_Original: `8` = js.native
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.getPublicKey() has been renamed to octokit.actions.getRepoPublicKey() (2020-05-14)
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: `9` = js.native
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoPublicKey")
  var getRepoPublicKey_Original: `9` = js.native
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("getRepoSecret")
  var getRepoSecret_Original: `10` = js.native
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.getSecret() has been renamed to octokit.actions.getRepoSecret() (2020-05-14)
    */
  @JSName("getSecret")
  var getSecret_Original: `10` = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Gets a specific self-hosted runner for an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("getSelfHostedRunnerForOrg")
  var getSelfHostedRunnerForOrg_Original: `12` = js.native
  /**
    * Gets a specific self-hosted runner. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("getSelfHostedRunnerForRepo")
  var getSelfHostedRunnerForRepo_Original: `11` = js.native
  /**
    * Gets a specific self-hosted runner. You must authenticate using an access token with the `repo` scope to use this endpoint.
    * @deprecated octokit.actions.getSelfHostedRunner() has been renamed to octokit.actions.getSelfHostedRunnerForRepo() (2020-04-22)
    */
  @JSName("getSelfHostedRunner")
  var getSelfHostedRunner_Original: `11` = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowJob")
  var getWorkflowJob_Original: `14` = js.native
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://help.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)" in the GitHub Help documentation.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowRunUsage")
  var getWorkflowRunUsage_Original: `16` = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowRun")
  var getWorkflowRun_Original: `15` = js.native
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://help.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)" in the GitHub Help documentation.
    *
    * You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflowUsage")
  var getWorkflowUsage_Original: `17` = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("getWorkflow")
  var getWorkflow_Original: `13` = js.native
  /**
    * Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listArtifactsForRepo")
  var listArtifactsForRepo_Original: `18` = js.native
  /**
    * Lists binaries for the runner application that you can download and run. You must authenticate using an access token with the `repo` scope to use this endpoint.
    * @deprecated octokit.actions.listDownloadsForSelfHostedRunnerApplication() has been renamed to octokit.actions.listRunnerApplicationsForRepo() (2020-04-22)
    */
  @JSName("listDownloadsForSelfHostedRunnerApplication")
  var listDownloadsForSelfHostedRunnerApplication_Original: `19` = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    */
  @JSName("listJobsForWorkflowRun")
  var listJobsForWorkflowRun_Original: `20` = js.native
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("listOrgSecrets")
  var listOrgSecrets_Original: `21` = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  @JSName("listRepoSecrets")
  var listRepoSecrets_Original: `22` = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listRepoWorkflowRuns")
  var listRepoWorkflowRuns_Original: `23` = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listRepoWorkflows")
  var listRepoWorkflows_Original: `24` = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Lists binaries for the runner application that you can download and run. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listRunnerApplicationsForOrg")
  var listRunnerApplicationsForOrg_Original: `25` = js.native
  /**
    * Lists binaries for the runner application that you can download and run. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("listRunnerApplicationsForRepo")
  var listRunnerApplicationsForRepo_Original: `19` = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.listSecretsForRepo() has been renamed to octokit.actions.listRepoSecrets() (2020-05-14)
    */
  @JSName("listSecretsForRepo")
  var listSecretsForRepo_Original: `22` = js.native
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("listSelectedReposForOrgSecret")
  var listSelectedReposForOrgSecret_Original: `26` = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Lists all self-hosted runners for an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForOrg")
  var listSelfHostedRunnersForOrg_Original: `27` = js.native
  /**
    * Lists all self-hosted runners for a repository. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForRepo")
  var listSelfHostedRunnersForRepo_Original: `28` = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    * @deprecated octokit.actions.listWorkflowJobLogs() has been renamed to octokit.actions.downloadWorkflowJobLogs() (2020-05-04)
    */
  @JSName("listWorkflowJobLogs")
  var listWorkflowJobLogs_Original: `4` = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  @JSName("listWorkflowRunArtifacts")
  var listWorkflowRunArtifacts_Original: `29` = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    * @deprecated octokit.actions.listWorkflowRunLogs() has been renamed to octokit.actions.downloadWorkflowRunLogs() (2020-05-04)
    */
  @JSName("listWorkflowRunLogs")
  var listWorkflowRunLogs_Original: `5` = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  @JSName("listWorkflowRuns")
  var listWorkflowRuns_Original: `30` = js.native
  /**
    * Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  @JSName("reRunWorkflow")
  var reRunWorkflow_Original: `31` = js.native
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("removeSelectedRepoFromOrgSecret")
  var removeSelectedRepoFromOrgSecret_Original: `32` = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. You must authenticate using an access token with the `repo` scope to use this endpoint.
    * @deprecated octokit.actions.removeSelfHostedRunner() has been renamed to octokit.actions.deleteSelfHostedRunnerFromRepo() (2020-04-22)
    */
  @JSName("removeSelfHostedRunner")
  var removeSelfHostedRunner_Original: `1` = js.native
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  @JSName("setSelectedReposForOrgSecret")
  var setSelectedReposForOrgSecret_Original: `33` = js.native
  /**
    * Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def addSelectedRepoToOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ] = js.native
  def addSelectedRepoToOrgSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ] = js.native
  /**
    * Cancels a workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def cancelWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/cancel']['response'] */ js.Any
  ] = js.native
  def cancelWorkflowRun(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/cancel']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/cancel']['response'] */ js.Any
  ] = js.native
  /**
    * Creates or updates an organization secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  def createOrUpdateOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def createOrUpdateOrgSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    */
  def createOrUpdateRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def createOrUpdateRepoSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Creates or updates a repository secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/github/tweetsodium) library.
    *
    *
    *
    * Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/stable/public/#nacl-public-sealedbox) with Python 3.
    *
    *
    *
    * Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.
    *
    *
    *
    * Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.
    * @deprecated octokit.actions.createOrUpdateSecretForRepo() has been renamed to octokit.actions.createOrUpdateRepoSecret() (2020-05-14)
    */
  def createOrUpdateSecretForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def createOrUpdateSecretForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    * @deprecated octokit.actions.createRegistrationToken() has been renamed to octokit.actions.createRegistrationTokenForRepo() (2020-04-22)
    */
  def createRegistrationToken(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['response'] */ js.Any
  ] = js.native
  def createRegistrationToken(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * Configure your self-hosted runner, replacing `TOKEN` with the registration token provided by this endpoint.
    */
  def createRegistrationTokenForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/registration-token']['response'] */ js.Any
  ] = js.native
  def createRegistrationTokenForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/registration-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/registration-token']['response'] */ js.Any
  ] = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  def createRegistrationTokenForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['response'] */ js.Any
  ] = js.native
  def createRegistrationTokenForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/registration-token']['response'] */ js.Any
  ] = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    * @deprecated octokit.actions.createRemoveToken() has been renamed to octokit.actions.createRemoveTokenForRepo() (2020-04-22)
    */
  def createRemoveToken(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['response'] */ js.Any
  ] = js.native
  def createRemoveToken(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Returns a token that you can pass to the `config` script to remove a self-hosted runner from an organization. The token expires after one hour. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    *
    * To remove your self-hosted runner from an organization, replace `TOKEN` with the remove token provided by this endpoint.
    */
  def createRemoveTokenForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/remove-token']['response'] */ js.Any
  ] = js.native
  def createRemoveTokenForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/remove-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /orgs/:org/actions/runners/remove-token']['response'] */ js.Any
  ] = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. You must authenticate using an access token with the `repo` scope to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  def createRemoveTokenForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['response'] */ js.Any
  ] = js.native
  def createRemoveTokenForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runners/remove-token']['response'] */ js.Any
  ] = js.native
  /**
    * Deletes an artifact for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ] = js.native
  def deleteArtifact(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/artifacts/:artifact_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ] = js.native
  /**
    * Deletes a secret in an organization using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def deleteOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def deleteOrgSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def deleteRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def deleteRepoSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.deleteSecretFromRepo() has been renamed to octokit.actions.deleteRepoSecret() (2020-05-14)
    */
  def deleteSecretFromRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def deleteSecretFromRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Forces the removal of a self-hosted runner from an organization. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def deleteSelfHostedRunnerFromOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  def deleteSelfHostedRunnerFromOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def deleteSelfHostedRunnerFromRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  def deleteSelfHostedRunnerFromRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  /**
    * Deletes all logs for a workflow run. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def deleteWorkflowRunLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ] = js.native
  def deleteWorkflowRunLogs(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def downloadArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id/:archive_format']['response'] */ js.Any
  ] = js.native
  def downloadArtifact(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id/:archive_format']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id/:archive_format']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def downloadWorkflowJobLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['response'] */ js.Any
  ] = js.native
  def downloadWorkflowJobLogs(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def downloadWorkflowRunLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ] = js.native
  def downloadWorkflowRunLogs(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getArtifact(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ] = js.native
  def getArtifact(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts/:artifact_id']['response'] */ js.Any
  ] = js.native
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def getOrgPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/public-key']['response'] */ js.Any
  ] = js.native
  def getOrgPublicKey(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/public-key']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a single organization secret without revealing its encrypted value. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def getOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def getOrgSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.getPublicKey() has been renamed to octokit.actions.getRepoPublicKey() (2020-05-14)
    */
  def getPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['response'] */ js.Any
  ] = js.native
  def getPublicKey(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['response'] */ js.Any
  ] = js.native
  /**
    * Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getRepoPublicKey(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['response'] */ js.Any
  ] = js.native
  def getRepoPublicKey(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/public-key']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def getRepoSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def getRepoSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.getSecret() has been renamed to octokit.actions.getRepoSecret() (2020-05-14)
    */
  def getSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  def getSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets/:secret_name']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a specific self-hosted runner. You must authenticate using an access token with the `repo` scope to use this endpoint.
    * @deprecated octokit.actions.getSelfHostedRunner() has been renamed to octokit.actions.getSelfHostedRunnerForRepo() (2020-04-22)
    */
  def getSelfHostedRunner(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  def getSelfHostedRunner(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Gets a specific self-hosted runner for an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def getSelfHostedRunnerForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  def getSelfHostedRunnerForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a specific self-hosted runner. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def getSelfHostedRunnerForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  def getSelfHostedRunnerForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id']['response'] */ js.Any
  ] = js.native
  def getWorkflow(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowJob(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id']['response'] */ js.Any
  ] = js.native
  def getWorkflowJob(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id']['response'] */ js.Any
  ] = js.native
  def getWorkflowRun(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes and total run time for a specific workflow run. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://help.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)" in the GitHub Help documentation.
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowRunUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/timing']['response'] */ js.Any
  ] = js.native
  def getWorkflowRunUsage(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/timing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/timing']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** This GitHub Actions usage endpoint is currently in public beta and subject to change. For more information, see "[GitHub Actions API workflow usage](https://developer.github.com/changes/2020-05-15-actions-api-workflow-usage)."
    *
    * Gets the number of billable minutes used by a specific workflow during the current billing cycle. Billable minutes only apply to workflows in private repositories that use GitHub-hosted runners. Usage is listed for each GitHub-hosted runner operating system in milliseconds. The usage does not include the multiplier for macOS and Windows runners and is not rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://help.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)" in the GitHub Help documentation.
    *
    * You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def getWorkflowUsage(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/timing']['response'] */ js.Any
  ] = js.native
  def getWorkflowUsage(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/timing']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/timing']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all artifacts for a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listArtifactsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts']['response'] */ js.Any
  ] = js.native
  def listArtifactsForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/artifacts']['response'] */ js.Any
  ] = js.native
  /**
    * Lists binaries for the runner application that you can download and run. You must authenticate using an access token with the `repo` scope to use this endpoint.
    * @deprecated octokit.actions.listDownloadsForSelfHostedRunnerApplication() has been renamed to octokit.actions.listRunnerApplicationsForRepo() (2020-04-22)
    */
  def listDownloadsForSelfHostedRunnerApplication(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['response'] */ js.Any
  ] = js.native
  def listDownloadsForSelfHostedRunnerApplication(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['response'] */ js.Any
  ] = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    */
  def listJobsForWorkflowRun(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/jobs']['response'] */ js.Any
  ] = js.native
  def listJobsForWorkflowRun(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/jobs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/jobs']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all secrets available in an organization without revealing their encrypted values. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def listOrgSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets']['response'] */ js.Any
  ] = js.native
  def listOrgSecrets(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    */
  def listRepoSecrets(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['response'] */ js.Any
  ] = js.native
  def listRepoSecrets(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listRepoWorkflowRuns(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs']['response'] */ js.Any
  ] = js.native
  def listRepoWorkflowRuns(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs']['response'] */ js.Any
  ] = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listRepoWorkflows(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows']['response'] */ js.Any
  ] = js.native
  def listRepoWorkflows(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Lists binaries for the runner application that you can download and run. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listRunnerApplicationsForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/downloads']['response'] */ js.Any
  ] = js.native
  def listRunnerApplicationsForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/downloads']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners/downloads']['response'] */ js.Any
  ] = js.native
  /**
    * Lists binaries for the runner application that you can download and run. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def listRunnerApplicationsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['response'] */ js.Any
  ] = js.native
  def listRunnerApplicationsForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners/downloads']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `secrets` repository permission to use this endpoint.
    * @deprecated octokit.actions.listSecretsForRepo() has been renamed to octokit.actions.listRepoSecrets() (2020-05-14)
    */
  def listSecretsForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['response'] */ js.Any
  ] = js.native
  def listSecretsForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/secrets']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def listSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ] = js.native
  def listSelectedReposForOrgSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ] = js.native
  /**
    * **Warning:** The self-hosted runners API for organizations is currently in public beta and subject to change.
    *
    * Lists all self-hosted runners for an organization. You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  def listSelfHostedRunnersForOrg(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners']['response'] */ js.Any
  ] = js.native
  def listSelfHostedRunnersForOrg(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /orgs/:org/actions/runners']['response'] */ js.Any
  ] = js.native
  /**
    * Lists all self-hosted runners for a repository. You must authenticate using an access token with the `repo` scope to use this endpoint.
    */
  def listSelfHostedRunnersForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners']['response'] */ js.Any
  ] = js.native
  def listSelfHostedRunnersForRepo(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runners']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    * @deprecated octokit.actions.listWorkflowJobLogs() has been renamed to octokit.actions.downloadWorkflowJobLogs() (2020-05-04)
    */
  def listWorkflowJobLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['response'] */ js.Any
  ] = js.native
  def listWorkflowJobLogs(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/jobs/:job_id/logs']['response'] */ js.Any
  ] = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    */
  def listWorkflowRunArtifacts(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/artifacts']['response'] */ js.Any
  ] = js.native
  def listWorkflowRunArtifacts(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/artifacts']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/artifacts']['response'] */ js.Any
  ] = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have the `actions:read` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    * @deprecated octokit.actions.listWorkflowRunLogs() has been renamed to octokit.actions.downloadWorkflowRunLogs() (2020-05-04)
    */
  def listWorkflowRunLogs(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ] = js.native
  def listWorkflowRunLogs(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/runs/:run_id/logs']['response'] */ js.Any
  ] = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope.
    */
  def listWorkflowRuns(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs']['response'] */ js.Any
  ] = js.native
  def listWorkflowRuns(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/actions/workflows/:workflow_id/runs']['response'] */ js.Any
  ] = js.native
  /**
    * Re-runs your workflow run using its `id`. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have the `actions:write` permission to use this endpoint.
    */
  def reRunWorkflow(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/rerun']['response'] */ js.Any
  ] = js.native
  def reRunWorkflow(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/rerun']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/:owner/:repo/actions/runs/:run_id/rerun']['response'] */ js.Any
  ] = js.native
  /**
    * Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def removeSelectedRepoFromOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ] = js.native
  def removeSelectedRepoFromOrgSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /orgs/:org/actions/secrets/:secret_name/repositories/:repository_id']['response'] */ js.Any
  ] = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. You must authenticate using an access token with the `repo` scope to use this endpoint.
    * @deprecated octokit.actions.removeSelfHostedRunner() has been renamed to octokit.actions.deleteSelfHostedRunnerFromRepo() (2020-04-22)
    */
  def removeSelfHostedRunner(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  def removeSelfHostedRunner(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /repos/:owner/:repo/actions/runners/:runner_id']['response'] */ js.Any
  ] = js.native
  /**
    * Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://developer.github.com/v3/actions/secrets/#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint. GitHub Apps must have the `secrets` organization permission to use this endpoint.
    */
  def setSelectedReposForOrgSecret(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ] = js.native
  def setSelectedReposForOrgSecret(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /orgs/:org/actions/secrets/:secret_name/repositories']['response'] */ js.Any
  ] = js.native
}

