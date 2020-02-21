package typings.octokitRest

import typings.octokitRest.mod.Octokit.ActionsCancelWorkflowRunParams
import typings.octokitRest.mod.Octokit.ActionsCreateOrUpdateSecretForRepoParams
import typings.octokitRest.mod.Octokit.ActionsCreateRegistrationTokenParams
import typings.octokitRest.mod.Octokit.ActionsCreateRegistrationTokenResponse
import typings.octokitRest.mod.Octokit.ActionsCreateRemoveTokenParams
import typings.octokitRest.mod.Octokit.ActionsCreateRemoveTokenResponse
import typings.octokitRest.mod.Octokit.ActionsDeleteArtifactParams
import typings.octokitRest.mod.Octokit.ActionsDeleteSecretFromRepoParams
import typings.octokitRest.mod.Octokit.ActionsDownloadArtifactParams
import typings.octokitRest.mod.Octokit.ActionsGetArtifactParams
import typings.octokitRest.mod.Octokit.ActionsGetArtifactResponse
import typings.octokitRest.mod.Octokit.ActionsGetPublicKeyParams
import typings.octokitRest.mod.Octokit.ActionsGetPublicKeyResponse
import typings.octokitRest.mod.Octokit.ActionsGetSecretParams
import typings.octokitRest.mod.Octokit.ActionsGetSecretResponse
import typings.octokitRest.mod.Octokit.ActionsGetSelfHostedRunnerParams
import typings.octokitRest.mod.Octokit.ActionsGetSelfHostedRunnerResponse
import typings.octokitRest.mod.Octokit.ActionsGetWorkflowJobParams
import typings.octokitRest.mod.Octokit.ActionsGetWorkflowJobResponse
import typings.octokitRest.mod.Octokit.ActionsGetWorkflowParams
import typings.octokitRest.mod.Octokit.ActionsGetWorkflowResponse
import typings.octokitRest.mod.Octokit.ActionsGetWorkflowRunParams
import typings.octokitRest.mod.Octokit.ActionsGetWorkflowRunResponse
import typings.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationParams
import typings.octokitRest.mod.Octokit.ActionsListDownloadsForSelfHostedRunnerApplicationResponse
import typings.octokitRest.mod.Octokit.ActionsListJobsForWorkflowRunParams
import typings.octokitRest.mod.Octokit.ActionsListJobsForWorkflowRunResponse
import typings.octokitRest.mod.Octokit.ActionsListRepoWorkflowRunsParams
import typings.octokitRest.mod.Octokit.ActionsListRepoWorkflowRunsResponse
import typings.octokitRest.mod.Octokit.ActionsListRepoWorkflowsParams
import typings.octokitRest.mod.Octokit.ActionsListRepoWorkflowsResponse
import typings.octokitRest.mod.Octokit.ActionsListSecretsForRepoParams
import typings.octokitRest.mod.Octokit.ActionsListSecretsForRepoResponse
import typings.octokitRest.mod.Octokit.ActionsListSelfHostedRunnersForRepoParams
import typings.octokitRest.mod.Octokit.ActionsListSelfHostedRunnersForRepoResponse
import typings.octokitRest.mod.Octokit.ActionsListWorkflowJobLogsParams
import typings.octokitRest.mod.Octokit.ActionsListWorkflowRunArtifactsParams
import typings.octokitRest.mod.Octokit.ActionsListWorkflowRunArtifactsResponse
import typings.octokitRest.mod.Octokit.ActionsListWorkflowRunLogsParams
import typings.octokitRest.mod.Octokit.ActionsListWorkflowRunsParams
import typings.octokitRest.mod.Octokit.ActionsListWorkflowRunsResponse
import typings.octokitRest.mod.Octokit.ActionsReRunWorkflowParams
import typings.octokitRest.mod.Octokit.ActionsRemoveSelfHostedRunnerParams
import typings.octokitRest.mod.Octokit.AnyResponse
import typings.octokitRest.mod.Octokit.RequestOptions
import typings.octokitRest.mod.Octokit.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCancelWorkflowRun extends js.Object {
  /**
    * Cancels a workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("cancelWorkflowRun")
  var cancelWorkflowRun_Original: AnonEndpoint = js.native
  /**
    * Creates or updates a secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/mastahyeti/tweetsodium) library.
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
  @JSName("createOrUpdateSecretForRepo")
  var createOrUpdateSecretForRepo_Original: AnonEndpointParams = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  @JSName("createRegistrationToken")
  var createRegistrationToken_Original: AnonEndpointParamsActionsCreateRegistrationTokenParams = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  @JSName("createRemoveToken")
  var createRemoveToken_Original: AnonEndpointParamsActionsCreateRemoveTokenParams = js.native
  /**
    * Deletes an artifact for a workflow run. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("deleteArtifact")
  var deleteArtifact_Original: AnonEndpointParamsActionsDeleteArtifactParams = js.native
  /**
    * Deletes a secret in a repository using the secret name. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("deleteSecretFromRepo")
  var deleteSecretFromRepo_Original: AnonEndpointParamsActionsDeleteSecretFromRepoParams = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("downloadArtifact")
  var downloadArtifact_Original: AnonEndpointParamsActionsDownloadArtifactParams = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getArtifact")
  var getArtifact_Original: AnonEndpointParamsActionsGetArtifactParams = js.native
  /**
    * Gets your public key, which you must store. You need your public key to use other secrets endpoints. Use the returned `key` to encrypt your secrets. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("getPublicKey")
  var getPublicKey_Original: AnonEndpointParamsActionsGetPublicKeyParams = js.native
  /**
    * Gets a single secret without revealing its encrypted value. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("getSecret")
  var getSecret_Original: AnonEndpointParamsActionsGetSecretParams = js.native
  /**
    * Gets a specific self-hosted runner. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("getSelfHostedRunner")
  var getSelfHostedRunner_Original: AnonEndpointParamsActionsGetSelfHostedRunnerParams = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflowJob")
  var getWorkflowJob_Original: AnonEndpointParamsActionsGetWorkflowJobParams = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflowRun")
  var getWorkflowRun_Original: AnonEndpointParamsActionsGetWorkflowRunParams = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("getWorkflow")
  var getWorkflow_Original: AnonEndpointParamsActionsGetWorkflowParams = js.native
  /**
    * Lists binaries for the self-hosted runner application that you can download and run. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("listDownloadsForSelfHostedRunnerApplication")
  var listDownloadsForSelfHostedRunnerApplication_Original: AnonEndpointParamsActionsListDownloadsForSelfHostedRunnerApplicationParams = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listJobsForWorkflowRun")
  var listJobsForWorkflowRun_Original: AnonEndpointParamsActionsListJobsForWorkflowRunParams = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listRepoWorkflowRuns")
  var listRepoWorkflowRuns_Original: AnonEndpointParamsActionsListRepoWorkflowRunsParams = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listRepoWorkflows")
  var listRepoWorkflows_Original: AnonEndpointParamsActionsListRepoWorkflowsParams = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  @JSName("listSecretsForRepo")
  var listSecretsForRepo_Original: AnonEndpointParamsActionsListSecretsForRepoParams = js.native
  /**
    * Lists all self-hosted runners for a repository. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("listSelfHostedRunnersForRepo")
  var listSelfHostedRunnersForRepo_Original: AnonEndpointParamsActionsListSelfHostedRunnersForRepoParams = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("listWorkflowJobLogs")
  var listWorkflowJobLogs_Original: AnonEndpointParamsActionsListWorkflowJobLogsParams = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("listWorkflowRunArtifacts")
  var listWorkflowRunArtifacts_Original: AnonEndpointParamsActionsListWorkflowRunArtifactsParams = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  @JSName("listWorkflowRunLogs")
  var listWorkflowRunLogs_Original: AnonEndpointParamsActionsListWorkflowRunLogsParams = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint.
    */
  @JSName("listWorkflowRuns")
  var listWorkflowRuns_Original: AnonEndpointParamsActionsListWorkflowRunsParams = js.native
  /**
    * Re-runs your workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  @JSName("reRunWorkflow")
  var reRunWorkflow_Original: AnonEndpointParamsActionsReRunWorkflowParams = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  @JSName("removeSelfHostedRunner")
  var removeSelfHostedRunner_Original: AnonEndpointParamsActionsRemoveSelfHostedRunnerParams = js.native
  /**
    * Cancels a workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def cancelWorkflowRun(): js.Promise[AnyResponse] = js.native
  def cancelWorkflowRun(params: RequestOptions with ActionsCancelWorkflowRunParams): js.Promise[AnyResponse] = js.native
  /**
    * Creates or updates a secret with an encrypted value. Encrypt your secret using [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    *
    * Encrypt your secret using the [tweetsodium](https://github.com/mastahyeti/tweetsodium) library.
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
  def createOrUpdateSecretForRepo(): js.Promise[AnyResponse] = js.native
  def createOrUpdateSecretForRepo(params: RequestOptions with ActionsCreateOrUpdateSecretForRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Returns a token that you can pass to the `config` script. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Configure your self-hosted runner, replacing TOKEN with the registration token provided by this endpoint.
    */
  def createRegistrationToken(): js.Promise[Response[ActionsCreateRegistrationTokenResponse]] = js.native
  def createRegistrationToken(params: RequestOptions with ActionsCreateRegistrationTokenParams): js.Promise[Response[ActionsCreateRegistrationTokenResponse]] = js.native
  /**
    * Returns a token that you can pass to remove a self-hosted runner from a repository. The token expires after one hour. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    *
    * Remove your self-hosted runner from a repository, replacing TOKEN with the remove token provided by this endpoint.
    */
  def createRemoveToken(): js.Promise[Response[ActionsCreateRemoveTokenResponse]] = js.native
  def createRemoveToken(params: RequestOptions with ActionsCreateRemoveTokenParams): js.Promise[Response[ActionsCreateRemoveTokenResponse]] = js.native
  /**
    * Deletes an artifact for a workflow run. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def deleteArtifact(): js.Promise[AnyResponse] = js.native
  def deleteArtifact(params: RequestOptions with ActionsDeleteArtifactParams): js.Promise[AnyResponse] = js.native
  /**
    * Deletes a secret in a repository using the secret name. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def deleteSecretFromRepo(): js.Promise[AnyResponse] = js.native
  def deleteSecretFromRepo(params: RequestOptions with ActionsDeleteSecretFromRepoParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets a redirect URL to download an archive for a repository. This URL expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. The `:archive_format` must be `zip`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def downloadArtifact(): js.Promise[AnyResponse] = js.native
  def downloadArtifact(params: RequestOptions with ActionsDownloadArtifactParams): js.Promise[AnyResponse] = js.native
  /**
    * Gets a specific artifact for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getArtifact(): js.Promise[Response[ActionsGetArtifactResponse]] = js.native
  def getArtifact(params: RequestOptions with ActionsGetArtifactParams): js.Promise[Response[ActionsGetArtifactResponse]] = js.native
  /**
    * Gets your public key, which you must store. You need your public key to use other secrets endpoints. Use the returned `key` to encrypt your secrets. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def getPublicKey(): js.Promise[Response[ActionsGetPublicKeyResponse]] = js.native
  def getPublicKey(params: RequestOptions with ActionsGetPublicKeyParams): js.Promise[Response[ActionsGetPublicKeyResponse]] = js.native
  /**
    * Gets a single secret without revealing its encrypted value. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def getSecret(): js.Promise[Response[ActionsGetSecretResponse]] = js.native
  def getSecret(params: RequestOptions with ActionsGetSecretParams): js.Promise[Response[ActionsGetSecretResponse]] = js.native
  /**
    * Gets a specific self-hosted runner. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def getSelfHostedRunner(): js.Promise[Response[ActionsGetSelfHostedRunnerResponse]] = js.native
  def getSelfHostedRunner(params: RequestOptions with ActionsGetSelfHostedRunnerParams): js.Promise[Response[ActionsGetSelfHostedRunnerResponse]] = js.native
  /**
    * Gets a specific workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflow(): js.Promise[Response[ActionsGetWorkflowResponse]] = js.native
  def getWorkflow(params: RequestOptions with ActionsGetWorkflowParams): js.Promise[Response[ActionsGetWorkflowResponse]] = js.native
  /**
    * Gets a specific job in a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflowJob(): js.Promise[Response[ActionsGetWorkflowJobResponse]] = js.native
  def getWorkflowJob(params: RequestOptions with ActionsGetWorkflowJobParams): js.Promise[Response[ActionsGetWorkflowJobResponse]] = js.native
  /**
    * Gets a specific workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def getWorkflowRun(): js.Promise[Response[ActionsGetWorkflowRunResponse]] = js.native
  def getWorkflowRun(params: RequestOptions with ActionsGetWorkflowRunParams): js.Promise[Response[ActionsGetWorkflowRunResponse]] = js.native
  /**
    * Lists binaries for the self-hosted runner application that you can download and run. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def listDownloadsForSelfHostedRunnerApplication(): js.Promise[Response[ActionsListDownloadsForSelfHostedRunnerApplicationResponse]] = js.native
  def listDownloadsForSelfHostedRunnerApplication(params: RequestOptions with ActionsListDownloadsForSelfHostedRunnerApplicationParams): js.Promise[Response[ActionsListDownloadsForSelfHostedRunnerApplicationResponse]] = js.native
  /**
    * Lists jobs for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listJobsForWorkflowRun(): js.Promise[Response[ActionsListJobsForWorkflowRunResponse]] = js.native
  def listJobsForWorkflowRun(params: RequestOptions with ActionsListJobsForWorkflowRunParams): js.Promise[Response[ActionsListJobsForWorkflowRunResponse]] = js.native
  /**
    * Lists all workflow runs for a repository. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listRepoWorkflowRuns(): js.Promise[Response[ActionsListRepoWorkflowRunsResponse]] = js.native
  def listRepoWorkflowRuns(params: RequestOptions with ActionsListRepoWorkflowRunsParams): js.Promise[Response[ActionsListRepoWorkflowRunsResponse]] = js.native
  /**
    * Lists the workflows in a repository. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listRepoWorkflows(): js.Promise[Response[ActionsListRepoWorkflowsResponse]] = js.native
  def listRepoWorkflows(params: RequestOptions with ActionsListRepoWorkflowsParams): js.Promise[Response[ActionsListRepoWorkflowsResponse]] = js.native
  /**
    * Lists all secrets available in a repository without revealing their encrypted values. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `secrets` permission to use this endpoint.
    */
  def listSecretsForRepo(): js.Promise[Response[ActionsListSecretsForRepoResponse]] = js.native
  def listSecretsForRepo(params: RequestOptions with ActionsListSecretsForRepoParams): js.Promise[Response[ActionsListSecretsForRepoResponse]] = js.native
  /**
    * Lists all self-hosted runners for a repository. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def listSelfHostedRunnersForRepo(): js.Promise[Response[ActionsListSelfHostedRunnersForRepoResponse]] = js.native
  def listSelfHostedRunnersForRepo(params: RequestOptions with ActionsListSelfHostedRunnersForRepoParams): js.Promise[Response[ActionsListSelfHostedRunnersForRepoResponse]] = js.native
  /**
    * Gets a redirect URL to download a plain text file of logs for a workflow job. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def listWorkflowJobLogs(): js.Promise[AnyResponse] = js.native
  def listWorkflowJobLogs(params: RequestOptions with ActionsListWorkflowJobLogsParams): js.Promise[AnyResponse] = js.native
  /**
    * Lists artifacts for a workflow run. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def listWorkflowRunArtifacts(): js.Promise[Response[ActionsListWorkflowRunArtifactsResponse]] = js.native
  def listWorkflowRunArtifacts(params: RequestOptions with ActionsListWorkflowRunArtifactsParams): js.Promise[Response[ActionsListWorkflowRunArtifactsResponse]] = js.native
  /**
    * Gets a redirect URL to download an archive of log files for a workflow run. This link expires after 1 minute. Look for `Location:` in the response header to find the URL for the download. Anyone with read access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    *
    * Call this endpoint using the `-v` flag, which enables verbose output and allows you to see the download URL in the header. To download the file into the current working directory, specify the filename using the `-o` flag.
    */
  def listWorkflowRunLogs(): js.Promise[AnyResponse] = js.native
  def listWorkflowRunLogs(params: RequestOptions with ActionsListWorkflowRunLogsParams): js.Promise[AnyResponse] = js.native
  /**
    * List all workflow runs for a workflow. You can also replace `:workflow_id` with `:workflow_file_name`. For example, you could use `main.yml`. You can use parameters to narrow the list of results. For more information about using parameters, see [Parameters](https://developer.github.com/v3/#parameters).
    *
    * Anyone with read access to the repository can use this endpoint.
    */
  def listWorkflowRuns(): js.Promise[Response[ActionsListWorkflowRunsResponse]] = js.native
  def listWorkflowRuns(params: RequestOptions with ActionsListWorkflowRunsParams): js.Promise[Response[ActionsListWorkflowRunsResponse]] = js.native
  /**
    * Re-runs your workflow run using its `id`. Anyone with write access to the repository can use this endpoint. GitHub Apps must have the `actions` permission to use this endpoint.
    */
  def reRunWorkflow(): js.Promise[AnyResponse] = js.native
  def reRunWorkflow(params: RequestOptions with ActionsReRunWorkflowParams): js.Promise[AnyResponse] = js.native
  /**
    * Forces the removal of a self-hosted runner from a repository. You can use this endpoint to completely remove the runner when the machine you were using no longer exists. Anyone with admin access to the repository can use this endpoint. GitHub Apps must have the `administration` permission to use this endpoint.
    */
  def removeSelfHostedRunner(): js.Promise[AnyResponse] = js.native
  def removeSelfHostedRunner(params: RequestOptions with ActionsRemoveSelfHostedRunnerParams): js.Promise[AnyResponse] = js.native
}

