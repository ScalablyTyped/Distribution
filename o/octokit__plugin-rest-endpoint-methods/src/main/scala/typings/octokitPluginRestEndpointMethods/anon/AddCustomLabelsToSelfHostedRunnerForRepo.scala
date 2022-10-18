package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomLabelsToSelfHostedRunnerForRepo extends StObject {
  
  var addCustomLabelsToSelfHostedRunnerForOrg: Parameters
  
  var addCustomLabelsToSelfHostedRunnerForRepo: Response
  
  var addSelectedRepoToOrgSecret: ParametersResponse
  
  var approveWorkflowRun: ResponseExtractOctokitResponse
  
  var cancelWorkflowRun: ParametersResponseExtractOctokitResponse
  
  var createOrUpdateEnvironmentSecret: `781`
  
  var createOrUpdateOrgSecret: `782`
  
  var createOrUpdateRepoSecret: `783`
  
  var createRegistrationTokenForOrg: `784`
  
  var createRegistrationTokenForRepo: `785`
  
  var createRemoveTokenForOrg: `786`
  
  var createRemoveTokenForRepo: `787`
  
  var createWorkflowDispatch: `788`
  
  var deleteActionsCacheById: `789`
  
  var deleteActionsCacheByKey: `790`
  
  var deleteArtifact: `791`
  
  var deleteEnvironmentSecret: `792`
  
  var deleteOrgSecret: `793`
  
  var deleteRepoSecret: `794`
  
  var deleteSelfHostedRunnerFromOrg: `795`
  
  var deleteSelfHostedRunnerFromRepo: `796`
  
  var deleteWorkflowRun: `797`
  
  var deleteWorkflowRunLogs: `798`
  
  var disableSelectedRepositoryGithubActionsOrganization: `799`
  
  var disableWorkflow: `800`
  
  var downloadArtifact: `801`
  
  var downloadJobLogsForWorkflowRun: `802`
  
  var downloadWorkflowRunAttemptLogs: `803`
  
  var downloadWorkflowRunLogs: `804`
  
  var enableSelectedRepositoryGithubActionsOrganization: `805`
  
  var enableWorkflow: `806`
  
  var getActionsCacheList: `807`
  
  var getActionsCacheUsage: `808`
  
  var getActionsCacheUsageByRepoForOrg: `809`
  
  var getActionsCacheUsageForEnterprise: `810`
  
  var getActionsCacheUsageForOrg: `811`
  
  var getAllowedActionsOrganization: `812`
  
  var getAllowedActionsRepository: `813`
  
  var getArtifact: `814`
  
  var getEnvironmentPublicKey: `815`
  
  var getEnvironmentSecret: `816`
  
  var getGithubActionsDefaultWorkflowPermissionsEnterprise: `817`
  
  var getGithubActionsDefaultWorkflowPermissionsOrganization: `818`
  
  var getGithubActionsDefaultWorkflowPermissionsRepository: `819`
  
  var getGithubActionsPermissionsOrganization: `820`
  
  var getGithubActionsPermissionsRepository: `821`
  
  var getJobForWorkflowRun: `822`
  
  var getOrgPublicKey: `823`
  
  var getOrgSecret: `824`
  
  var getPendingDeploymentsForRun: `825`
  
  var getRepoPermissions: `821`
  
  var getRepoPublicKey: `826`
  
  var getRepoSecret: `827`
  
  var getReviewsForRun: `828`
  
  var getSelfHostedRunnerForOrg: `829`
  
  var getSelfHostedRunnerForRepo: `830`
  
  var getWorkflow: `831`
  
  var getWorkflowAccessToRepository: `832`
  
  var getWorkflowRun: `833`
  
  var getWorkflowRunAttempt: `834`
  
  var getWorkflowRunUsage: `835`
  
  var getWorkflowUsage: `836`
  
  var listArtifactsForRepo: `837`
  
  var listEnvironmentSecrets: `838`
  
  var listJobsForWorkflowRun: `839`
  
  var listJobsForWorkflowRunAttempt: `840`
  
  var listLabelsForSelfHostedRunnerForOrg: `841`
  
  var listLabelsForSelfHostedRunnerForRepo: `842`
  
  var listOrgSecrets: `843`
  
  var listRepoSecrets: `844`
  
  var listRepoWorkflows: `845`
  
  var listRunnerApplicationsForOrg: `846`
  
  var listRunnerApplicationsForRepo: `847`
  
  var listSelectedReposForOrgSecret: `848`
  
  var listSelectedRepositoriesEnabledGithubActionsOrganization: `849`
  
  var listSelfHostedRunnersForOrg: `850`
  
  var listSelfHostedRunnersForRepo: `851`
  
  var listWorkflowRunArtifacts: `852`
  
  var listWorkflowRuns: `853`
  
  var listWorkflowRunsForRepo: `854`
  
  var reRunJobForWorkflowRun: `855`
  
  var reRunWorkflow: `856`
  
  var reRunWorkflowFailedJobs: `857`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForOrg: `858`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForRepo: `859`
  
  var removeCustomLabelFromSelfHostedRunnerForOrg: `860`
  
  var removeCustomLabelFromSelfHostedRunnerForRepo: `861`
  
  var removeSelectedRepoFromOrgSecret: `862`
  
  var reviewPendingDeploymentsForRun: `863`
  
  var setAllowedActionsOrganization: `864`
  
  var setAllowedActionsRepository: `865`
  
  var setCustomLabelsForSelfHostedRunnerForOrg: `866`
  
  var setCustomLabelsForSelfHostedRunnerForRepo: `867`
  
  var setGithubActionsDefaultWorkflowPermissionsEnterprise: `868`
  
  var setGithubActionsDefaultWorkflowPermissionsOrganization: `869`
  
  var setGithubActionsDefaultWorkflowPermissionsRepository: `870`
  
  var setGithubActionsPermissionsOrganization: `871`
  
  var setGithubActionsPermissionsRepository: `872`
  
  var setSelectedReposForOrgSecret: `873`
  
  var setSelectedRepositoriesEnabledGithubActionsOrganization: `874`
  
  var setWorkflowAccessToRepository: `875`
}
object AddCustomLabelsToSelfHostedRunnerForRepo {
  
  inline def apply(
    addCustomLabelsToSelfHostedRunnerForOrg: Parameters,
    addCustomLabelsToSelfHostedRunnerForRepo: Response,
    addSelectedRepoToOrgSecret: ParametersResponse,
    approveWorkflowRun: ResponseExtractOctokitResponse,
    cancelWorkflowRun: ParametersResponseExtractOctokitResponse,
    createOrUpdateEnvironmentSecret: `781`,
    createOrUpdateOrgSecret: `782`,
    createOrUpdateRepoSecret: `783`,
    createRegistrationTokenForOrg: `784`,
    createRegistrationTokenForRepo: `785`,
    createRemoveTokenForOrg: `786`,
    createRemoveTokenForRepo: `787`,
    createWorkflowDispatch: `788`,
    deleteActionsCacheById: `789`,
    deleteActionsCacheByKey: `790`,
    deleteArtifact: `791`,
    deleteEnvironmentSecret: `792`,
    deleteOrgSecret: `793`,
    deleteRepoSecret: `794`,
    deleteSelfHostedRunnerFromOrg: `795`,
    deleteSelfHostedRunnerFromRepo: `796`,
    deleteWorkflowRun: `797`,
    deleteWorkflowRunLogs: `798`,
    disableSelectedRepositoryGithubActionsOrganization: `799`,
    disableWorkflow: `800`,
    downloadArtifact: `801`,
    downloadJobLogsForWorkflowRun: `802`,
    downloadWorkflowRunAttemptLogs: `803`,
    downloadWorkflowRunLogs: `804`,
    enableSelectedRepositoryGithubActionsOrganization: `805`,
    enableWorkflow: `806`,
    getActionsCacheList: `807`,
    getActionsCacheUsage: `808`,
    getActionsCacheUsageByRepoForOrg: `809`,
    getActionsCacheUsageForEnterprise: `810`,
    getActionsCacheUsageForOrg: `811`,
    getAllowedActionsOrganization: `812`,
    getAllowedActionsRepository: `813`,
    getArtifact: `814`,
    getEnvironmentPublicKey: `815`,
    getEnvironmentSecret: `816`,
    getGithubActionsDefaultWorkflowPermissionsEnterprise: `817`,
    getGithubActionsDefaultWorkflowPermissionsOrganization: `818`,
    getGithubActionsDefaultWorkflowPermissionsRepository: `819`,
    getGithubActionsPermissionsOrganization: `820`,
    getGithubActionsPermissionsRepository: `821`,
    getJobForWorkflowRun: `822`,
    getOrgPublicKey: `823`,
    getOrgSecret: `824`,
    getPendingDeploymentsForRun: `825`,
    getRepoPermissions: `821`,
    getRepoPublicKey: `826`,
    getRepoSecret: `827`,
    getReviewsForRun: `828`,
    getSelfHostedRunnerForOrg: `829`,
    getSelfHostedRunnerForRepo: `830`,
    getWorkflow: `831`,
    getWorkflowAccessToRepository: `832`,
    getWorkflowRun: `833`,
    getWorkflowRunAttempt: `834`,
    getWorkflowRunUsage: `835`,
    getWorkflowUsage: `836`,
    listArtifactsForRepo: `837`,
    listEnvironmentSecrets: `838`,
    listJobsForWorkflowRun: `839`,
    listJobsForWorkflowRunAttempt: `840`,
    listLabelsForSelfHostedRunnerForOrg: `841`,
    listLabelsForSelfHostedRunnerForRepo: `842`,
    listOrgSecrets: `843`,
    listRepoSecrets: `844`,
    listRepoWorkflows: `845`,
    listRunnerApplicationsForOrg: `846`,
    listRunnerApplicationsForRepo: `847`,
    listSelectedReposForOrgSecret: `848`,
    listSelectedRepositoriesEnabledGithubActionsOrganization: `849`,
    listSelfHostedRunnersForOrg: `850`,
    listSelfHostedRunnersForRepo: `851`,
    listWorkflowRunArtifacts: `852`,
    listWorkflowRuns: `853`,
    listWorkflowRunsForRepo: `854`,
    reRunJobForWorkflowRun: `855`,
    reRunWorkflow: `856`,
    reRunWorkflowFailedJobs: `857`,
    removeAllCustomLabelsFromSelfHostedRunnerForOrg: `858`,
    removeAllCustomLabelsFromSelfHostedRunnerForRepo: `859`,
    removeCustomLabelFromSelfHostedRunnerForOrg: `860`,
    removeCustomLabelFromSelfHostedRunnerForRepo: `861`,
    removeSelectedRepoFromOrgSecret: `862`,
    reviewPendingDeploymentsForRun: `863`,
    setAllowedActionsOrganization: `864`,
    setAllowedActionsRepository: `865`,
    setCustomLabelsForSelfHostedRunnerForOrg: `866`,
    setCustomLabelsForSelfHostedRunnerForRepo: `867`,
    setGithubActionsDefaultWorkflowPermissionsEnterprise: `868`,
    setGithubActionsDefaultWorkflowPermissionsOrganization: `869`,
    setGithubActionsDefaultWorkflowPermissionsRepository: `870`,
    setGithubActionsPermissionsOrganization: `871`,
    setGithubActionsPermissionsRepository: `872`,
    setSelectedReposForOrgSecret: `873`,
    setSelectedRepositoriesEnabledGithubActionsOrganization: `874`,
    setWorkflowAccessToRepository: `875`
  ): AddCustomLabelsToSelfHostedRunnerForRepo = {
    val __obj = js.Dynamic.literal(addCustomLabelsToSelfHostedRunnerForOrg = addCustomLabelsToSelfHostedRunnerForOrg.asInstanceOf[js.Any], addCustomLabelsToSelfHostedRunnerForRepo = addCustomLabelsToSelfHostedRunnerForRepo.asInstanceOf[js.Any], addSelectedRepoToOrgSecret = addSelectedRepoToOrgSecret.asInstanceOf[js.Any], approveWorkflowRun = approveWorkflowRun.asInstanceOf[js.Any], cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createOrUpdateEnvironmentSecret = createOrUpdateEnvironmentSecret.asInstanceOf[js.Any], createOrUpdateOrgSecret = createOrUpdateOrgSecret.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], createRegistrationTokenForOrg = createRegistrationTokenForOrg.asInstanceOf[js.Any], createRegistrationTokenForRepo = createRegistrationTokenForRepo.asInstanceOf[js.Any], createRemoveTokenForOrg = createRemoveTokenForOrg.asInstanceOf[js.Any], createRemoveTokenForRepo = createRemoveTokenForRepo.asInstanceOf[js.Any], createWorkflowDispatch = createWorkflowDispatch.asInstanceOf[js.Any], deleteActionsCacheById = deleteActionsCacheById.asInstanceOf[js.Any], deleteActionsCacheByKey = deleteActionsCacheByKey.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteEnvironmentSecret = deleteEnvironmentSecret.asInstanceOf[js.Any], deleteOrgSecret = deleteOrgSecret.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], deleteSelfHostedRunnerFromOrg = deleteSelfHostedRunnerFromOrg.asInstanceOf[js.Any], deleteSelfHostedRunnerFromRepo = deleteSelfHostedRunnerFromRepo.asInstanceOf[js.Any], deleteWorkflowRun = deleteWorkflowRun.asInstanceOf[js.Any], deleteWorkflowRunLogs = deleteWorkflowRunLogs.asInstanceOf[js.Any], disableSelectedRepositoryGithubActionsOrganization = disableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], disableWorkflow = disableWorkflow.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], downloadJobLogsForWorkflowRun = downloadJobLogsForWorkflowRun.asInstanceOf[js.Any], downloadWorkflowRunAttemptLogs = downloadWorkflowRunAttemptLogs.asInstanceOf[js.Any], downloadWorkflowRunLogs = downloadWorkflowRunLogs.asInstanceOf[js.Any], enableSelectedRepositoryGithubActionsOrganization = enableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], enableWorkflow = enableWorkflow.asInstanceOf[js.Any], getActionsCacheList = getActionsCacheList.asInstanceOf[js.Any], getActionsCacheUsage = getActionsCacheUsage.asInstanceOf[js.Any], getActionsCacheUsageByRepoForOrg = getActionsCacheUsageByRepoForOrg.asInstanceOf[js.Any], getActionsCacheUsageForEnterprise = getActionsCacheUsageForEnterprise.asInstanceOf[js.Any], getActionsCacheUsageForOrg = getActionsCacheUsageForOrg.asInstanceOf[js.Any], getAllowedActionsOrganization = getAllowedActionsOrganization.asInstanceOf[js.Any], getAllowedActionsRepository = getAllowedActionsRepository.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getEnvironmentPublicKey = getEnvironmentPublicKey.asInstanceOf[js.Any], getEnvironmentSecret = getEnvironmentSecret.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsEnterprise = getGithubActionsDefaultWorkflowPermissionsEnterprise.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsOrganization = getGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsRepository = getGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], getGithubActionsPermissionsOrganization = getGithubActionsPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsPermissionsRepository = getGithubActionsPermissionsRepository.asInstanceOf[js.Any], getJobForWorkflowRun = getJobForWorkflowRun.asInstanceOf[js.Any], getOrgPublicKey = getOrgPublicKey.asInstanceOf[js.Any], getOrgSecret = getOrgSecret.asInstanceOf[js.Any], getPendingDeploymentsForRun = getPendingDeploymentsForRun.asInstanceOf[js.Any], getRepoPermissions = getRepoPermissions.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], getReviewsForRun = getReviewsForRun.asInstanceOf[js.Any], getSelfHostedRunnerForOrg = getSelfHostedRunnerForOrg.asInstanceOf[js.Any], getSelfHostedRunnerForRepo = getSelfHostedRunnerForRepo.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowAccessToRepository = getWorkflowAccessToRepository.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], getWorkflowRunAttempt = getWorkflowRunAttempt.asInstanceOf[js.Any], getWorkflowRunUsage = getWorkflowRunUsage.asInstanceOf[js.Any], getWorkflowUsage = getWorkflowUsage.asInstanceOf[js.Any], listArtifactsForRepo = listArtifactsForRepo.asInstanceOf[js.Any], listEnvironmentSecrets = listEnvironmentSecrets.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listJobsForWorkflowRunAttempt = listJobsForWorkflowRunAttempt.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForOrg = listLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForRepo = listLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], listOrgSecrets = listOrgSecrets.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listRunnerApplicationsForOrg = listRunnerApplicationsForOrg.asInstanceOf[js.Any], listRunnerApplicationsForRepo = listRunnerApplicationsForRepo.asInstanceOf[js.Any], listSelectedReposForOrgSecret = listSelectedReposForOrgSecret.asInstanceOf[js.Any], listSelectedRepositoriesEnabledGithubActionsOrganization = listSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], listSelfHostedRunnersForOrg = listSelfHostedRunnersForOrg.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], listWorkflowRunsForRepo = listWorkflowRunsForRepo.asInstanceOf[js.Any], reRunJobForWorkflowRun = reRunJobForWorkflowRun.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], reRunWorkflowFailedJobs = reRunWorkflowFailedJobs.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForOrg = removeAllCustomLabelsFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForRepo = removeAllCustomLabelsFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForOrg = removeCustomLabelFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForRepo = removeCustomLabelFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeSelectedRepoFromOrgSecret = removeSelectedRepoFromOrgSecret.asInstanceOf[js.Any], reviewPendingDeploymentsForRun = reviewPendingDeploymentsForRun.asInstanceOf[js.Any], setAllowedActionsOrganization = setAllowedActionsOrganization.asInstanceOf[js.Any], setAllowedActionsRepository = setAllowedActionsRepository.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForOrg = setCustomLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForRepo = setCustomLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsEnterprise = setGithubActionsDefaultWorkflowPermissionsEnterprise.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsOrganization = setGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsRepository = setGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], setGithubActionsPermissionsOrganization = setGithubActionsPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsPermissionsRepository = setGithubActionsPermissionsRepository.asInstanceOf[js.Any], setSelectedReposForOrgSecret = setSelectedReposForOrgSecret.asInstanceOf[js.Any], setSelectedRepositoriesEnabledGithubActionsOrganization = setSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], setWorkflowAccessToRepository = setWorkflowAccessToRepository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomLabelsToSelfHostedRunnerForRepo]
  }
  
  extension [Self <: AddCustomLabelsToSelfHostedRunnerForRepo](x: Self) {
    
    inline def setAddCustomLabelsToSelfHostedRunnerForOrg(value: Parameters): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setAddCustomLabelsToSelfHostedRunnerForRepo(value: Response): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgSecret(value: ParametersResponse): Self = StObject.set(x, "addSelectedRepoToOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setApproveWorkflowRun(value: ResponseExtractOctokitResponse): Self = StObject.set(x, "approveWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCancelWorkflowRun(value: ParametersResponseExtractOctokitResponse): Self = StObject.set(x, "cancelWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateEnvironmentSecret(value: `781`): Self = StObject.set(x, "createOrUpdateEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateOrgSecret(value: `782`): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: `783`): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForOrg(value: `784`): Self = StObject.set(x, "createRegistrationTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForRepo(value: `785`): Self = StObject.set(x, "createRegistrationTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForOrg(value: `786`): Self = StObject.set(x, "createRemoveTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForRepo(value: `787`): Self = StObject.set(x, "createRemoveTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateWorkflowDispatch(value: `788`): Self = StObject.set(x, "createWorkflowDispatch", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheById(value: `789`): Self = StObject.set(x, "deleteActionsCacheById", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheByKey(value: `790`): Self = StObject.set(x, "deleteActionsCacheByKey", value.asInstanceOf[js.Any])
    
    inline def setDeleteArtifact(value: `791`): Self = StObject.set(x, "deleteArtifact", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentSecret(value: `792`): Self = StObject.set(x, "deleteEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgSecret(value: `793`): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `794`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromOrg(value: `795`): Self = StObject.set(x, "deleteSelfHostedRunnerFromOrg", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromRepo(value: `796`): Self = StObject.set(x, "deleteSelfHostedRunnerFromRepo", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRun(value: `797`): Self = StObject.set(x, "deleteWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRunLogs(value: `798`): Self = StObject.set(x, "deleteWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectedRepositoryGithubActionsOrganization(value: `799`): Self = StObject.set(x, "disableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setDisableWorkflow(value: `800`): Self = StObject.set(x, "disableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDownloadArtifact(value: `801`): Self = StObject.set(x, "downloadArtifact", value.asInstanceOf[js.Any])
    
    inline def setDownloadJobLogsForWorkflowRun(value: `802`): Self = StObject.set(x, "downloadJobLogsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunAttemptLogs(value: `803`): Self = StObject.set(x, "downloadWorkflowRunAttemptLogs", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunLogs(value: `804`): Self = StObject.set(x, "downloadWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectedRepositoryGithubActionsOrganization(value: `805`): Self = StObject.set(x, "enableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setEnableWorkflow(value: `806`): Self = StObject.set(x, "enableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheList(value: `807`): Self = StObject.set(x, "getActionsCacheList", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsage(value: `808`): Self = StObject.set(x, "getActionsCacheUsage", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageByRepoForOrg(value: `809`): Self = StObject.set(x, "getActionsCacheUsageByRepoForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageForEnterprise(value: `810`): Self = StObject.set(x, "getActionsCacheUsageForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageForOrg(value: `811`): Self = StObject.set(x, "getActionsCacheUsageForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsOrganization(value: `812`): Self = StObject.set(x, "getAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsRepository(value: `813`): Self = StObject.set(x, "getAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetArtifact(value: `814`): Self = StObject.set(x, "getArtifact", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentPublicKey(value: `815`): Self = StObject.set(x, "getEnvironmentPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentSecret(value: `816`): Self = StObject.set(x, "getEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsEnterprise(value: `817`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsOrganization(value: `818`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsRepository(value: `819`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsOrganization(value: `820`): Self = StObject.set(x, "getGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsRepository(value: `821`): Self = StObject.set(x, "getGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetJobForWorkflowRun(value: `822`): Self = StObject.set(x, "getJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetOrgPublicKey(value: `823`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetOrgSecret(value: `824`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setGetPendingDeploymentsForRun(value: `825`): Self = StObject.set(x, "getPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPermissions(value: `821`): Self = StObject.set(x, "getRepoPermissions", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `826`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `827`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetReviewsForRun(value: `828`): Self = StObject.set(x, "getReviewsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForOrg(value: `829`): Self = StObject.set(x, "getSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForRepo(value: `830`): Self = StObject.set(x, "getSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflow(value: `831`): Self = StObject.set(x, "getWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowAccessToRepository(value: `832`): Self = StObject.set(x, "getWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRun(value: `833`): Self = StObject.set(x, "getWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunAttempt(value: `834`): Self = StObject.set(x, "getWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunUsage(value: `835`): Self = StObject.set(x, "getWorkflowRunUsage", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowUsage(value: `836`): Self = StObject.set(x, "getWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setListArtifactsForRepo(value: `837`): Self = StObject.set(x, "listArtifactsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentSecrets(value: `838`): Self = StObject.set(x, "listEnvironmentSecrets", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRun(value: `839`): Self = StObject.set(x, "listJobsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRunAttempt(value: `840`): Self = StObject.set(x, "listJobsForWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForOrg(value: `841`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForRepo(value: `842`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setListOrgSecrets(value: `843`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `844`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoWorkflows(value: `845`): Self = StObject.set(x, "listRepoWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForOrg(value: `846`): Self = StObject.set(x, "listRunnerApplicationsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForRepo(value: `847`): Self = StObject.set(x, "listRunnerApplicationsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgSecret(value: `848`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesEnabledGithubActionsOrganization(value: `849`): Self = StObject.set(x, "listSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForOrg(value: `850`): Self = StObject.set(x, "listSelfHostedRunnersForOrg", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForRepo(value: `851`): Self = StObject.set(x, "listSelfHostedRunnersForRepo", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunArtifacts(value: `852`): Self = StObject.set(x, "listWorkflowRunArtifacts", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRuns(value: `853`): Self = StObject.set(x, "listWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunsForRepo(value: `854`): Self = StObject.set(x, "listWorkflowRunsForRepo", value.asInstanceOf[js.Any])
    
    inline def setReRunJobForWorkflowRun(value: `855`): Self = StObject.set(x, "reRunJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflow(value: `856`): Self = StObject.set(x, "reRunWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflowFailedJobs(value: `857`): Self = StObject.set(x, "reRunWorkflowFailedJobs", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(value: `858`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(value: `859`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForOrg(value: `860`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForRepo(value: `861`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgSecret(value: `862`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setReviewPendingDeploymentsForRun(value: `863`): Self = StObject.set(x, "reviewPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsOrganization(value: `864`): Self = StObject.set(x, "setAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsRepository(value: `865`): Self = StObject.set(x, "setAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForOrg(value: `866`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForRepo(value: `867`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsEnterprise(value: `868`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsOrganization(value: `869`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsRepository(value: `870`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsOrganization(value: `871`): Self = StObject.set(x, "setGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsRepository(value: `872`): Self = StObject.set(x, "setGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgSecret(value: `873`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedRepositoriesEnabledGithubActionsOrganization(value: `874`): Self = StObject.set(x, "setSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetWorkflowAccessToRepository(value: `875`): Self = StObject.set(x, "setWorkflowAccessToRepository", value.asInstanceOf[js.Any])
  }
}
