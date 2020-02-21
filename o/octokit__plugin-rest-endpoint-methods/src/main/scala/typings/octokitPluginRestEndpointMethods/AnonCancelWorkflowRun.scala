package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelWorkflowRun extends js.Object {
  var cancelWorkflowRun: AnonMethod
  var createOrUpdateSecretForRepo: AnonMethodParams
  var createRegistrationToken: AnonMethodParamsUrl
  var createRemoveToken: AnonMethodParamsUrl
  var deleteArtifact: AnonMethodParamsUrlAnonArtifactid
  var deleteSecretFromRepo: AnonMethodParamsUrlAnonName
  var downloadArtifact: AnonMethodParamsUrlAnonArchiveformat
  var getArtifact: AnonMethodParamsUrlAnonArtifactid
  var getPublicKey: AnonMethodParamsUrl
  var getSecret: AnonMethodParamsUrlAnonNameOwner
  var getSelfHostedRunner: AnonMethodParamsUrlAnonOwnerRepoRunnerid
  var getWorkflow: AnonMethodParamsUrlAnonOwnerRepoWorkflowid
  var getWorkflowJob: AnonMethodParamsUrlAnonJobid
  var getWorkflowRun: AnonMethod
  var listDownloadsForSelfHostedRunnerApplication: AnonMethodParamsUrl
  var listJobsForWorkflowRun: AnonMethodParamsUrlAnonOwnerPage
  var listRepoWorkflowRuns: AnonMethodParamsUrlAnonActor
  var listRepoWorkflows: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listSecretsForRepo: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listSelfHostedRunnersForRepo: AnonMethodParamsUrlAnonOwnerPagePerpage
  var listWorkflowJobLogs: AnonMethodParamsUrlAnonJobidOwner
  var listWorkflowRunArtifacts: AnonMethodParamsUrlAnonOwnerPage
  var listWorkflowRunLogs: AnonMethodParamsUrlAnonOwnerPage
  var listWorkflowRuns: AnonMethodParamsUrlAnonActorBranch
  var reRunWorkflow: AnonMethod
  var removeSelfHostedRunner: AnonMethodParamsUrlAnonOwnerRepoRunnerid
}

object AnonCancelWorkflowRun {
  @scala.inline
  def apply(
    cancelWorkflowRun: AnonMethod,
    createOrUpdateSecretForRepo: AnonMethodParams,
    createRegistrationToken: AnonMethodParamsUrl,
    createRemoveToken: AnonMethodParamsUrl,
    deleteArtifact: AnonMethodParamsUrlAnonArtifactid,
    deleteSecretFromRepo: AnonMethodParamsUrlAnonName,
    downloadArtifact: AnonMethodParamsUrlAnonArchiveformat,
    getArtifact: AnonMethodParamsUrlAnonArtifactid,
    getPublicKey: AnonMethodParamsUrl,
    getSecret: AnonMethodParamsUrlAnonNameOwner,
    getSelfHostedRunner: AnonMethodParamsUrlAnonOwnerRepoRunnerid,
    getWorkflow: AnonMethodParamsUrlAnonOwnerRepoWorkflowid,
    getWorkflowJob: AnonMethodParamsUrlAnonJobid,
    getWorkflowRun: AnonMethod,
    listDownloadsForSelfHostedRunnerApplication: AnonMethodParamsUrl,
    listJobsForWorkflowRun: AnonMethodParamsUrlAnonOwnerPage,
    listRepoWorkflowRuns: AnonMethodParamsUrlAnonActor,
    listRepoWorkflows: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listSecretsForRepo: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listSelfHostedRunnersForRepo: AnonMethodParamsUrlAnonOwnerPagePerpage,
    listWorkflowJobLogs: AnonMethodParamsUrlAnonJobidOwner,
    listWorkflowRunArtifacts: AnonMethodParamsUrlAnonOwnerPage,
    listWorkflowRunLogs: AnonMethodParamsUrlAnonOwnerPage,
    listWorkflowRuns: AnonMethodParamsUrlAnonActorBranch,
    reRunWorkflow: AnonMethod,
    removeSelfHostedRunner: AnonMethodParamsUrlAnonOwnerRepoRunnerid
  ): AnonCancelWorkflowRun = {
    val __obj = js.Dynamic.literal(cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createOrUpdateSecretForRepo = createOrUpdateSecretForRepo.asInstanceOf[js.Any], createRegistrationToken = createRegistrationToken.asInstanceOf[js.Any], createRemoveToken = createRemoveToken.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteSecretFromRepo = deleteSecretFromRepo.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getPublicKey = getPublicKey.asInstanceOf[js.Any], getSecret = getSecret.asInstanceOf[js.Any], getSelfHostedRunner = getSelfHostedRunner.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowJob = getWorkflowJob.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], listDownloadsForSelfHostedRunnerApplication = listDownloadsForSelfHostedRunnerApplication.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listRepoWorkflowRuns = listRepoWorkflowRuns.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listSecretsForRepo = listSecretsForRepo.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowJobLogs = listWorkflowJobLogs.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRunLogs = listWorkflowRunLogs.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], removeSelfHostedRunner = removeSelfHostedRunner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelWorkflowRun]
  }
}

