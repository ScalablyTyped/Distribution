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
  
  var createOrUpdateEnvironmentSecret: `767`
  
  var createOrUpdateOrgSecret: `768`
  
  var createOrUpdateRepoSecret: `769`
  
  var createRegistrationTokenForOrg: `770`
  
  var createRegistrationTokenForRepo: `771`
  
  var createRemoveTokenForOrg: `772`
  
  var createRemoveTokenForRepo: `773`
  
  var createWorkflowDispatch: `774`
  
  var deleteActionsCacheById: `775`
  
  var deleteActionsCacheByKey: `776`
  
  var deleteArtifact: `777`
  
  var deleteEnvironmentSecret: `778`
  
  var deleteOrgSecret: `779`
  
  var deleteRepoSecret: `780`
  
  var deleteSelfHostedRunnerFromOrg: `781`
  
  var deleteSelfHostedRunnerFromRepo: `782`
  
  var deleteWorkflowRun: `783`
  
  var deleteWorkflowRunLogs: `784`
  
  var disableSelectedRepositoryGithubActionsOrganization: `785`
  
  var disableWorkflow: `786`
  
  var downloadArtifact: `787`
  
  var downloadJobLogsForWorkflowRun: `788`
  
  var downloadWorkflowRunAttemptLogs: `789`
  
  var downloadWorkflowRunLogs: `790`
  
  var enableSelectedRepositoryGithubActionsOrganization: `791`
  
  var enableWorkflow: `792`
  
  var getActionsCacheList: `793`
  
  var getActionsCacheUsage: `794`
  
  var getActionsCacheUsageByRepoForOrg: `795`
  
  var getActionsCacheUsageForEnterprise: `796`
  
  var getActionsCacheUsageForOrg: `797`
  
  var getAllowedActionsOrganization: `798`
  
  var getAllowedActionsRepository: `799`
  
  var getArtifact: `800`
  
  var getEnvironmentPublicKey: `801`
  
  var getEnvironmentSecret: `802`
  
  var getGithubActionsDefaultWorkflowPermissionsEnterprise: `803`
  
  var getGithubActionsDefaultWorkflowPermissionsOrganization: `804`
  
  var getGithubActionsDefaultWorkflowPermissionsRepository: `805`
  
  var getGithubActionsPermissionsOrganization: `806`
  
  var getGithubActionsPermissionsRepository: `807`
  
  var getJobForWorkflowRun: `808`
  
  var getOrgPublicKey: `809`
  
  var getOrgSecret: `810`
  
  var getPendingDeploymentsForRun: `811`
  
  var getRepoPermissions: `807`
  
  var getRepoPublicKey: `812`
  
  var getRepoSecret: `813`
  
  var getReviewsForRun: `814`
  
  var getSelfHostedRunnerForOrg: `815`
  
  var getSelfHostedRunnerForRepo: `816`
  
  var getWorkflow: `817`
  
  var getWorkflowAccessToRepository: `818`
  
  var getWorkflowRun: `819`
  
  var getWorkflowRunAttempt: `820`
  
  var getWorkflowRunUsage: `821`
  
  var getWorkflowUsage: `822`
  
  var listArtifactsForRepo: `823`
  
  var listEnvironmentSecrets: `824`
  
  var listJobsForWorkflowRun: `825`
  
  var listJobsForWorkflowRunAttempt: `826`
  
  var listLabelsForSelfHostedRunnerForOrg: `827`
  
  var listLabelsForSelfHostedRunnerForRepo: `828`
  
  var listOrgSecrets: `829`
  
  var listRepoSecrets: `830`
  
  var listRepoWorkflows: `831`
  
  var listRunnerApplicationsForOrg: `832`
  
  var listRunnerApplicationsForRepo: `833`
  
  var listSelectedReposForOrgSecret: `834`
  
  var listSelectedRepositoriesEnabledGithubActionsOrganization: `835`
  
  var listSelfHostedRunnersForOrg: `836`
  
  var listSelfHostedRunnersForRepo: `837`
  
  var listWorkflowRunArtifacts: `838`
  
  var listWorkflowRuns: `839`
  
  var listWorkflowRunsForRepo: `840`
  
  var reRunJobForWorkflowRun: `841`
  
  var reRunWorkflow: `842`
  
  var reRunWorkflowFailedJobs: `843`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForOrg: `844`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForRepo: `845`
  
  var removeCustomLabelFromSelfHostedRunnerForOrg: `846`
  
  var removeCustomLabelFromSelfHostedRunnerForRepo: `847`
  
  var removeSelectedRepoFromOrgSecret: `848`
  
  var reviewPendingDeploymentsForRun: `849`
  
  var setAllowedActionsOrganization: `850`
  
  var setAllowedActionsRepository: `851`
  
  var setCustomLabelsForSelfHostedRunnerForOrg: `852`
  
  var setCustomLabelsForSelfHostedRunnerForRepo: `853`
  
  var setGithubActionsDefaultWorkflowPermissionsEnterprise: `854`
  
  var setGithubActionsDefaultWorkflowPermissionsOrganization: `855`
  
  var setGithubActionsDefaultWorkflowPermissionsRepository: `856`
  
  var setGithubActionsPermissionsOrganization: `857`
  
  var setGithubActionsPermissionsRepository: `858`
  
  var setSelectedReposForOrgSecret: `859`
  
  var setSelectedRepositoriesEnabledGithubActionsOrganization: `860`
  
  var setWorkflowAccessToRepository: `861`
}
object AddCustomLabelsToSelfHostedRunnerForRepo {
  
  inline def apply(
    addCustomLabelsToSelfHostedRunnerForOrg: Parameters,
    addCustomLabelsToSelfHostedRunnerForRepo: Response,
    addSelectedRepoToOrgSecret: ParametersResponse,
    approveWorkflowRun: ResponseExtractOctokitResponse,
    cancelWorkflowRun: ParametersResponseExtractOctokitResponse,
    createOrUpdateEnvironmentSecret: `767`,
    createOrUpdateOrgSecret: `768`,
    createOrUpdateRepoSecret: `769`,
    createRegistrationTokenForOrg: `770`,
    createRegistrationTokenForRepo: `771`,
    createRemoveTokenForOrg: `772`,
    createRemoveTokenForRepo: `773`,
    createWorkflowDispatch: `774`,
    deleteActionsCacheById: `775`,
    deleteActionsCacheByKey: `776`,
    deleteArtifact: `777`,
    deleteEnvironmentSecret: `778`,
    deleteOrgSecret: `779`,
    deleteRepoSecret: `780`,
    deleteSelfHostedRunnerFromOrg: `781`,
    deleteSelfHostedRunnerFromRepo: `782`,
    deleteWorkflowRun: `783`,
    deleteWorkflowRunLogs: `784`,
    disableSelectedRepositoryGithubActionsOrganization: `785`,
    disableWorkflow: `786`,
    downloadArtifact: `787`,
    downloadJobLogsForWorkflowRun: `788`,
    downloadWorkflowRunAttemptLogs: `789`,
    downloadWorkflowRunLogs: `790`,
    enableSelectedRepositoryGithubActionsOrganization: `791`,
    enableWorkflow: `792`,
    getActionsCacheList: `793`,
    getActionsCacheUsage: `794`,
    getActionsCacheUsageByRepoForOrg: `795`,
    getActionsCacheUsageForEnterprise: `796`,
    getActionsCacheUsageForOrg: `797`,
    getAllowedActionsOrganization: `798`,
    getAllowedActionsRepository: `799`,
    getArtifact: `800`,
    getEnvironmentPublicKey: `801`,
    getEnvironmentSecret: `802`,
    getGithubActionsDefaultWorkflowPermissionsEnterprise: `803`,
    getGithubActionsDefaultWorkflowPermissionsOrganization: `804`,
    getGithubActionsDefaultWorkflowPermissionsRepository: `805`,
    getGithubActionsPermissionsOrganization: `806`,
    getGithubActionsPermissionsRepository: `807`,
    getJobForWorkflowRun: `808`,
    getOrgPublicKey: `809`,
    getOrgSecret: `810`,
    getPendingDeploymentsForRun: `811`,
    getRepoPermissions: `807`,
    getRepoPublicKey: `812`,
    getRepoSecret: `813`,
    getReviewsForRun: `814`,
    getSelfHostedRunnerForOrg: `815`,
    getSelfHostedRunnerForRepo: `816`,
    getWorkflow: `817`,
    getWorkflowAccessToRepository: `818`,
    getWorkflowRun: `819`,
    getWorkflowRunAttempt: `820`,
    getWorkflowRunUsage: `821`,
    getWorkflowUsage: `822`,
    listArtifactsForRepo: `823`,
    listEnvironmentSecrets: `824`,
    listJobsForWorkflowRun: `825`,
    listJobsForWorkflowRunAttempt: `826`,
    listLabelsForSelfHostedRunnerForOrg: `827`,
    listLabelsForSelfHostedRunnerForRepo: `828`,
    listOrgSecrets: `829`,
    listRepoSecrets: `830`,
    listRepoWorkflows: `831`,
    listRunnerApplicationsForOrg: `832`,
    listRunnerApplicationsForRepo: `833`,
    listSelectedReposForOrgSecret: `834`,
    listSelectedRepositoriesEnabledGithubActionsOrganization: `835`,
    listSelfHostedRunnersForOrg: `836`,
    listSelfHostedRunnersForRepo: `837`,
    listWorkflowRunArtifacts: `838`,
    listWorkflowRuns: `839`,
    listWorkflowRunsForRepo: `840`,
    reRunJobForWorkflowRun: `841`,
    reRunWorkflow: `842`,
    reRunWorkflowFailedJobs: `843`,
    removeAllCustomLabelsFromSelfHostedRunnerForOrg: `844`,
    removeAllCustomLabelsFromSelfHostedRunnerForRepo: `845`,
    removeCustomLabelFromSelfHostedRunnerForOrg: `846`,
    removeCustomLabelFromSelfHostedRunnerForRepo: `847`,
    removeSelectedRepoFromOrgSecret: `848`,
    reviewPendingDeploymentsForRun: `849`,
    setAllowedActionsOrganization: `850`,
    setAllowedActionsRepository: `851`,
    setCustomLabelsForSelfHostedRunnerForOrg: `852`,
    setCustomLabelsForSelfHostedRunnerForRepo: `853`,
    setGithubActionsDefaultWorkflowPermissionsEnterprise: `854`,
    setGithubActionsDefaultWorkflowPermissionsOrganization: `855`,
    setGithubActionsDefaultWorkflowPermissionsRepository: `856`,
    setGithubActionsPermissionsOrganization: `857`,
    setGithubActionsPermissionsRepository: `858`,
    setSelectedReposForOrgSecret: `859`,
    setSelectedRepositoriesEnabledGithubActionsOrganization: `860`,
    setWorkflowAccessToRepository: `861`
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
    
    inline def setCreateOrUpdateEnvironmentSecret(value: `767`): Self = StObject.set(x, "createOrUpdateEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateOrgSecret(value: `768`): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: `769`): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForOrg(value: `770`): Self = StObject.set(x, "createRegistrationTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForRepo(value: `771`): Self = StObject.set(x, "createRegistrationTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForOrg(value: `772`): Self = StObject.set(x, "createRemoveTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForRepo(value: `773`): Self = StObject.set(x, "createRemoveTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateWorkflowDispatch(value: `774`): Self = StObject.set(x, "createWorkflowDispatch", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheById(value: `775`): Self = StObject.set(x, "deleteActionsCacheById", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheByKey(value: `776`): Self = StObject.set(x, "deleteActionsCacheByKey", value.asInstanceOf[js.Any])
    
    inline def setDeleteArtifact(value: `777`): Self = StObject.set(x, "deleteArtifact", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentSecret(value: `778`): Self = StObject.set(x, "deleteEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgSecret(value: `779`): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `780`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromOrg(value: `781`): Self = StObject.set(x, "deleteSelfHostedRunnerFromOrg", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromRepo(value: `782`): Self = StObject.set(x, "deleteSelfHostedRunnerFromRepo", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRun(value: `783`): Self = StObject.set(x, "deleteWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRunLogs(value: `784`): Self = StObject.set(x, "deleteWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectedRepositoryGithubActionsOrganization(value: `785`): Self = StObject.set(x, "disableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setDisableWorkflow(value: `786`): Self = StObject.set(x, "disableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDownloadArtifact(value: `787`): Self = StObject.set(x, "downloadArtifact", value.asInstanceOf[js.Any])
    
    inline def setDownloadJobLogsForWorkflowRun(value: `788`): Self = StObject.set(x, "downloadJobLogsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunAttemptLogs(value: `789`): Self = StObject.set(x, "downloadWorkflowRunAttemptLogs", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunLogs(value: `790`): Self = StObject.set(x, "downloadWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectedRepositoryGithubActionsOrganization(value: `791`): Self = StObject.set(x, "enableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setEnableWorkflow(value: `792`): Self = StObject.set(x, "enableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheList(value: `793`): Self = StObject.set(x, "getActionsCacheList", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsage(value: `794`): Self = StObject.set(x, "getActionsCacheUsage", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageByRepoForOrg(value: `795`): Self = StObject.set(x, "getActionsCacheUsageByRepoForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageForEnterprise(value: `796`): Self = StObject.set(x, "getActionsCacheUsageForEnterprise", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageForOrg(value: `797`): Self = StObject.set(x, "getActionsCacheUsageForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsOrganization(value: `798`): Self = StObject.set(x, "getAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsRepository(value: `799`): Self = StObject.set(x, "getAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetArtifact(value: `800`): Self = StObject.set(x, "getArtifact", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentPublicKey(value: `801`): Self = StObject.set(x, "getEnvironmentPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentSecret(value: `802`): Self = StObject.set(x, "getEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsEnterprise(value: `803`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsOrganization(value: `804`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsRepository(value: `805`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsOrganization(value: `806`): Self = StObject.set(x, "getGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsRepository(value: `807`): Self = StObject.set(x, "getGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetJobForWorkflowRun(value: `808`): Self = StObject.set(x, "getJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetOrgPublicKey(value: `809`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetOrgSecret(value: `810`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setGetPendingDeploymentsForRun(value: `811`): Self = StObject.set(x, "getPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPermissions(value: `807`): Self = StObject.set(x, "getRepoPermissions", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `812`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `813`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetReviewsForRun(value: `814`): Self = StObject.set(x, "getReviewsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForOrg(value: `815`): Self = StObject.set(x, "getSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForRepo(value: `816`): Self = StObject.set(x, "getSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflow(value: `817`): Self = StObject.set(x, "getWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowAccessToRepository(value: `818`): Self = StObject.set(x, "getWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRun(value: `819`): Self = StObject.set(x, "getWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunAttempt(value: `820`): Self = StObject.set(x, "getWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunUsage(value: `821`): Self = StObject.set(x, "getWorkflowRunUsage", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowUsage(value: `822`): Self = StObject.set(x, "getWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setListArtifactsForRepo(value: `823`): Self = StObject.set(x, "listArtifactsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentSecrets(value: `824`): Self = StObject.set(x, "listEnvironmentSecrets", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRun(value: `825`): Self = StObject.set(x, "listJobsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRunAttempt(value: `826`): Self = StObject.set(x, "listJobsForWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForOrg(value: `827`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForRepo(value: `828`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setListOrgSecrets(value: `829`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `830`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoWorkflows(value: `831`): Self = StObject.set(x, "listRepoWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForOrg(value: `832`): Self = StObject.set(x, "listRunnerApplicationsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForRepo(value: `833`): Self = StObject.set(x, "listRunnerApplicationsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgSecret(value: `834`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesEnabledGithubActionsOrganization(value: `835`): Self = StObject.set(x, "listSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForOrg(value: `836`): Self = StObject.set(x, "listSelfHostedRunnersForOrg", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForRepo(value: `837`): Self = StObject.set(x, "listSelfHostedRunnersForRepo", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunArtifacts(value: `838`): Self = StObject.set(x, "listWorkflowRunArtifacts", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRuns(value: `839`): Self = StObject.set(x, "listWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunsForRepo(value: `840`): Self = StObject.set(x, "listWorkflowRunsForRepo", value.asInstanceOf[js.Any])
    
    inline def setReRunJobForWorkflowRun(value: `841`): Self = StObject.set(x, "reRunJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflow(value: `842`): Self = StObject.set(x, "reRunWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflowFailedJobs(value: `843`): Self = StObject.set(x, "reRunWorkflowFailedJobs", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(value: `844`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(value: `845`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForOrg(value: `846`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForRepo(value: `847`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgSecret(value: `848`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setReviewPendingDeploymentsForRun(value: `849`): Self = StObject.set(x, "reviewPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsOrganization(value: `850`): Self = StObject.set(x, "setAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsRepository(value: `851`): Self = StObject.set(x, "setAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForOrg(value: `852`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForRepo(value: `853`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsEnterprise(value: `854`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsEnterprise", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsOrganization(value: `855`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsRepository(value: `856`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsOrganization(value: `857`): Self = StObject.set(x, "setGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsRepository(value: `858`): Self = StObject.set(x, "setGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgSecret(value: `859`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedRepositoriesEnabledGithubActionsOrganization(value: `860`): Self = StObject.set(x, "setSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetWorkflowAccessToRepository(value: `861`): Self = StObject.set(x, "setWorkflowAccessToRepository", value.asInstanceOf[js.Any])
  }
}
