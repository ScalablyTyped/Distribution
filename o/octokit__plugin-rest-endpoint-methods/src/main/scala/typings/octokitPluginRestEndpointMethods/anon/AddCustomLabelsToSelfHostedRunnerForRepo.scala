package typings.octokitPluginRestEndpointMethods.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddCustomLabelsToSelfHostedRunnerForRepo extends StObject {
  
  var addCustomLabelsToSelfHostedRunnerForOrg: Parameters
  
  var addCustomLabelsToSelfHostedRunnerForRepo: Response
  
  var addSelectedRepoToOrgSecret: ParametersResponse
  
  var addSelectedRepoToOrgVariable: ResponseExtractOctokitResponse
  
  var addSelectedRepoToRequiredWorkflow: ParametersResponseExtractOctokitResponse
  
  var approveWorkflowRun: `843`
  
  var cancelWorkflowRun: `844`
  
  var createEnvironmentVariable: `845`
  
  var createOrUpdateEnvironmentSecret: `846`
  
  var createOrUpdateOrgSecret: `847`
  
  var createOrUpdateRepoSecret: `848`
  
  var createOrgVariable: `849`
  
  var createRegistrationTokenForOrg: `850`
  
  var createRegistrationTokenForRepo: `851`
  
  var createRemoveTokenForOrg: `852`
  
  var createRemoveTokenForRepo: `853`
  
  var createRepoVariable: `854`
  
  var createRequiredWorkflow: `855`
  
  var createWorkflowDispatch: `856`
  
  var deleteActionsCacheById: `857`
  
  var deleteActionsCacheByKey: `858`
  
  var deleteArtifact: `859`
  
  var deleteEnvironmentSecret: `860`
  
  var deleteEnvironmentVariable: `861`
  
  var deleteOrgSecret: `862`
  
  var deleteOrgVariable: `863`
  
  var deleteRepoSecret: `864`
  
  var deleteRepoVariable: `865`
  
  var deleteRequiredWorkflow: `866`
  
  var deleteSelfHostedRunnerFromOrg: `867`
  
  var deleteSelfHostedRunnerFromRepo: `868`
  
  var deleteWorkflowRun: `869`
  
  var deleteWorkflowRunLogs: `870`
  
  var disableSelectedRepositoryGithubActionsOrganization: `871`
  
  var disableWorkflow: `872`
  
  var downloadArtifact: `873`
  
  var downloadJobLogsForWorkflowRun: `874`
  
  var downloadWorkflowRunAttemptLogs: `875`
  
  var downloadWorkflowRunLogs: `876`
  
  var enableSelectedRepositoryGithubActionsOrganization: `877`
  
  var enableWorkflow: `878`
  
  var generateRunnerJitconfigForOrg: `879`
  
  var generateRunnerJitconfigForRepo: `880`
  
  var getActionsCacheList: `881`
  
  var getActionsCacheUsage: `882`
  
  var getActionsCacheUsageByRepoForOrg: `883`
  
  var getActionsCacheUsageForOrg: `884`
  
  var getAllowedActionsOrganization: `885`
  
  var getAllowedActionsRepository: `886`
  
  var getArtifact: `887`
  
  var getEnvironmentPublicKey: `888`
  
  var getEnvironmentSecret: `889`
  
  var getEnvironmentVariable: `890`
  
  var getGithubActionsDefaultWorkflowPermissionsOrganization: `891`
  
  var getGithubActionsDefaultWorkflowPermissionsRepository: `892`
  
  var getGithubActionsPermissionsOrganization: `893`
  
  var getGithubActionsPermissionsRepository: `894`
  
  var getJobForWorkflowRun: `895`
  
  var getOrgPublicKey: `896`
  
  var getOrgSecret: `897`
  
  var getOrgVariable: `898`
  
  var getPendingDeploymentsForRun: `899`
  
  var getRepoPermissions: `894`
  
  var getRepoPublicKey: `900`
  
  var getRepoRequiredWorkflow: `901`
  
  var getRepoRequiredWorkflowUsage: `902`
  
  var getRepoSecret: `903`
  
  var getRepoVariable: `904`
  
  var getRequiredWorkflow: `905`
  
  var getReviewsForRun: `906`
  
  var getSelfHostedRunnerForOrg: `907`
  
  var getSelfHostedRunnerForRepo: `908`
  
  var getWorkflow: `909`
  
  var getWorkflowAccessToRepository: `910`
  
  var getWorkflowRun: `911`
  
  var getWorkflowRunAttempt: `912`
  
  var getWorkflowRunUsage: `913`
  
  var getWorkflowUsage: `914`
  
  var listArtifactsForRepo: `915`
  
  var listEnvironmentSecrets: `916`
  
  var listEnvironmentVariables: `917`
  
  var listJobsForWorkflowRun: `918`
  
  var listJobsForWorkflowRunAttempt: `919`
  
  var listLabelsForSelfHostedRunnerForOrg: `920`
  
  var listLabelsForSelfHostedRunnerForRepo: `921`
  
  var listOrgSecrets: `922`
  
  var listOrgVariables: `923`
  
  var listRepoOrganizationSecrets: `924`
  
  var listRepoOrganizationVariables: `925`
  
  var listRepoRequiredWorkflows: `926`
  
  var listRepoSecrets: `927`
  
  var listRepoVariables: `928`
  
  var listRepoWorkflows: `929`
  
  var listRequiredWorkflowRuns: `930`
  
  var listRequiredWorkflows: `931`
  
  var listRunnerApplicationsForOrg: `932`
  
  var listRunnerApplicationsForRepo: `933`
  
  var listSelectedReposForOrgSecret: `934`
  
  var listSelectedReposForOrgVariable: `935`
  
  var listSelectedRepositoriesEnabledGithubActionsOrganization: `936`
  
  var listSelectedRepositoriesRequiredWorkflow: `937`
  
  var listSelfHostedRunnersForOrg: `938`
  
  var listSelfHostedRunnersForRepo: `939`
  
  var listWorkflowRunArtifacts: `940`
  
  var listWorkflowRuns: `941`
  
  var listWorkflowRunsForRepo: `942`
  
  var reRunJobForWorkflowRun: `943`
  
  var reRunWorkflow: `944`
  
  var reRunWorkflowFailedJobs: `945`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForOrg: `946`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForRepo: `947`
  
  var removeCustomLabelFromSelfHostedRunnerForOrg: `948`
  
  var removeCustomLabelFromSelfHostedRunnerForRepo: `949`
  
  var removeSelectedRepoFromOrgSecret: `950`
  
  var removeSelectedRepoFromOrgVariable: `951`
  
  var removeSelectedRepoFromRequiredWorkflow: `952`
  
  var reviewCustomGatesForRun: `953`
  
  var reviewPendingDeploymentsForRun: `954`
  
  var setAllowedActionsOrganization: `955`
  
  var setAllowedActionsRepository: `956`
  
  var setCustomLabelsForSelfHostedRunnerForOrg: `957`
  
  var setCustomLabelsForSelfHostedRunnerForRepo: `958`
  
  var setGithubActionsDefaultWorkflowPermissionsOrganization: `959`
  
  var setGithubActionsDefaultWorkflowPermissionsRepository: `960`
  
  var setGithubActionsPermissionsOrganization: `961`
  
  var setGithubActionsPermissionsRepository: `962`
  
  var setSelectedReposForOrgSecret: `963`
  
  var setSelectedReposForOrgVariable: `964`
  
  var setSelectedReposToRequiredWorkflow: `965`
  
  var setSelectedRepositoriesEnabledGithubActionsOrganization: `966`
  
  var setWorkflowAccessToRepository: `967`
  
  var updateEnvironmentVariable: `968`
  
  var updateOrgVariable: `969`
  
  var updateRepoVariable: `970`
  
  var updateRequiredWorkflow: `971`
}
object AddCustomLabelsToSelfHostedRunnerForRepo {
  
  inline def apply(
    addCustomLabelsToSelfHostedRunnerForOrg: Parameters,
    addCustomLabelsToSelfHostedRunnerForRepo: Response,
    addSelectedRepoToOrgSecret: ParametersResponse,
    addSelectedRepoToOrgVariable: ResponseExtractOctokitResponse,
    addSelectedRepoToRequiredWorkflow: ParametersResponseExtractOctokitResponse,
    approveWorkflowRun: `843`,
    cancelWorkflowRun: `844`,
    createEnvironmentVariable: `845`,
    createOrUpdateEnvironmentSecret: `846`,
    createOrUpdateOrgSecret: `847`,
    createOrUpdateRepoSecret: `848`,
    createOrgVariable: `849`,
    createRegistrationTokenForOrg: `850`,
    createRegistrationTokenForRepo: `851`,
    createRemoveTokenForOrg: `852`,
    createRemoveTokenForRepo: `853`,
    createRepoVariable: `854`,
    createRequiredWorkflow: `855`,
    createWorkflowDispatch: `856`,
    deleteActionsCacheById: `857`,
    deleteActionsCacheByKey: `858`,
    deleteArtifact: `859`,
    deleteEnvironmentSecret: `860`,
    deleteEnvironmentVariable: `861`,
    deleteOrgSecret: `862`,
    deleteOrgVariable: `863`,
    deleteRepoSecret: `864`,
    deleteRepoVariable: `865`,
    deleteRequiredWorkflow: `866`,
    deleteSelfHostedRunnerFromOrg: `867`,
    deleteSelfHostedRunnerFromRepo: `868`,
    deleteWorkflowRun: `869`,
    deleteWorkflowRunLogs: `870`,
    disableSelectedRepositoryGithubActionsOrganization: `871`,
    disableWorkflow: `872`,
    downloadArtifact: `873`,
    downloadJobLogsForWorkflowRun: `874`,
    downloadWorkflowRunAttemptLogs: `875`,
    downloadWorkflowRunLogs: `876`,
    enableSelectedRepositoryGithubActionsOrganization: `877`,
    enableWorkflow: `878`,
    generateRunnerJitconfigForOrg: `879`,
    generateRunnerJitconfigForRepo: `880`,
    getActionsCacheList: `881`,
    getActionsCacheUsage: `882`,
    getActionsCacheUsageByRepoForOrg: `883`,
    getActionsCacheUsageForOrg: `884`,
    getAllowedActionsOrganization: `885`,
    getAllowedActionsRepository: `886`,
    getArtifact: `887`,
    getEnvironmentPublicKey: `888`,
    getEnvironmentSecret: `889`,
    getEnvironmentVariable: `890`,
    getGithubActionsDefaultWorkflowPermissionsOrganization: `891`,
    getGithubActionsDefaultWorkflowPermissionsRepository: `892`,
    getGithubActionsPermissionsOrganization: `893`,
    getGithubActionsPermissionsRepository: `894`,
    getJobForWorkflowRun: `895`,
    getOrgPublicKey: `896`,
    getOrgSecret: `897`,
    getOrgVariable: `898`,
    getPendingDeploymentsForRun: `899`,
    getRepoPermissions: `894`,
    getRepoPublicKey: `900`,
    getRepoRequiredWorkflow: `901`,
    getRepoRequiredWorkflowUsage: `902`,
    getRepoSecret: `903`,
    getRepoVariable: `904`,
    getRequiredWorkflow: `905`,
    getReviewsForRun: `906`,
    getSelfHostedRunnerForOrg: `907`,
    getSelfHostedRunnerForRepo: `908`,
    getWorkflow: `909`,
    getWorkflowAccessToRepository: `910`,
    getWorkflowRun: `911`,
    getWorkflowRunAttempt: `912`,
    getWorkflowRunUsage: `913`,
    getWorkflowUsage: `914`,
    listArtifactsForRepo: `915`,
    listEnvironmentSecrets: `916`,
    listEnvironmentVariables: `917`,
    listJobsForWorkflowRun: `918`,
    listJobsForWorkflowRunAttempt: `919`,
    listLabelsForSelfHostedRunnerForOrg: `920`,
    listLabelsForSelfHostedRunnerForRepo: `921`,
    listOrgSecrets: `922`,
    listOrgVariables: `923`,
    listRepoOrganizationSecrets: `924`,
    listRepoOrganizationVariables: `925`,
    listRepoRequiredWorkflows: `926`,
    listRepoSecrets: `927`,
    listRepoVariables: `928`,
    listRepoWorkflows: `929`,
    listRequiredWorkflowRuns: `930`,
    listRequiredWorkflows: `931`,
    listRunnerApplicationsForOrg: `932`,
    listRunnerApplicationsForRepo: `933`,
    listSelectedReposForOrgSecret: `934`,
    listSelectedReposForOrgVariable: `935`,
    listSelectedRepositoriesEnabledGithubActionsOrganization: `936`,
    listSelectedRepositoriesRequiredWorkflow: `937`,
    listSelfHostedRunnersForOrg: `938`,
    listSelfHostedRunnersForRepo: `939`,
    listWorkflowRunArtifacts: `940`,
    listWorkflowRuns: `941`,
    listWorkflowRunsForRepo: `942`,
    reRunJobForWorkflowRun: `943`,
    reRunWorkflow: `944`,
    reRunWorkflowFailedJobs: `945`,
    removeAllCustomLabelsFromSelfHostedRunnerForOrg: `946`,
    removeAllCustomLabelsFromSelfHostedRunnerForRepo: `947`,
    removeCustomLabelFromSelfHostedRunnerForOrg: `948`,
    removeCustomLabelFromSelfHostedRunnerForRepo: `949`,
    removeSelectedRepoFromOrgSecret: `950`,
    removeSelectedRepoFromOrgVariable: `951`,
    removeSelectedRepoFromRequiredWorkflow: `952`,
    reviewCustomGatesForRun: `953`,
    reviewPendingDeploymentsForRun: `954`,
    setAllowedActionsOrganization: `955`,
    setAllowedActionsRepository: `956`,
    setCustomLabelsForSelfHostedRunnerForOrg: `957`,
    setCustomLabelsForSelfHostedRunnerForRepo: `958`,
    setGithubActionsDefaultWorkflowPermissionsOrganization: `959`,
    setGithubActionsDefaultWorkflowPermissionsRepository: `960`,
    setGithubActionsPermissionsOrganization: `961`,
    setGithubActionsPermissionsRepository: `962`,
    setSelectedReposForOrgSecret: `963`,
    setSelectedReposForOrgVariable: `964`,
    setSelectedReposToRequiredWorkflow: `965`,
    setSelectedRepositoriesEnabledGithubActionsOrganization: `966`,
    setWorkflowAccessToRepository: `967`,
    updateEnvironmentVariable: `968`,
    updateOrgVariable: `969`,
    updateRepoVariable: `970`,
    updateRequiredWorkflow: `971`
  ): AddCustomLabelsToSelfHostedRunnerForRepo = {
    val __obj = js.Dynamic.literal(addCustomLabelsToSelfHostedRunnerForOrg = addCustomLabelsToSelfHostedRunnerForOrg.asInstanceOf[js.Any], addCustomLabelsToSelfHostedRunnerForRepo = addCustomLabelsToSelfHostedRunnerForRepo.asInstanceOf[js.Any], addSelectedRepoToOrgSecret = addSelectedRepoToOrgSecret.asInstanceOf[js.Any], addSelectedRepoToOrgVariable = addSelectedRepoToOrgVariable.asInstanceOf[js.Any], addSelectedRepoToRequiredWorkflow = addSelectedRepoToRequiredWorkflow.asInstanceOf[js.Any], approveWorkflowRun = approveWorkflowRun.asInstanceOf[js.Any], cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createEnvironmentVariable = createEnvironmentVariable.asInstanceOf[js.Any], createOrUpdateEnvironmentSecret = createOrUpdateEnvironmentSecret.asInstanceOf[js.Any], createOrUpdateOrgSecret = createOrUpdateOrgSecret.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], createOrgVariable = createOrgVariable.asInstanceOf[js.Any], createRegistrationTokenForOrg = createRegistrationTokenForOrg.asInstanceOf[js.Any], createRegistrationTokenForRepo = createRegistrationTokenForRepo.asInstanceOf[js.Any], createRemoveTokenForOrg = createRemoveTokenForOrg.asInstanceOf[js.Any], createRemoveTokenForRepo = createRemoveTokenForRepo.asInstanceOf[js.Any], createRepoVariable = createRepoVariable.asInstanceOf[js.Any], createRequiredWorkflow = createRequiredWorkflow.asInstanceOf[js.Any], createWorkflowDispatch = createWorkflowDispatch.asInstanceOf[js.Any], deleteActionsCacheById = deleteActionsCacheById.asInstanceOf[js.Any], deleteActionsCacheByKey = deleteActionsCacheByKey.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteEnvironmentSecret = deleteEnvironmentSecret.asInstanceOf[js.Any], deleteEnvironmentVariable = deleteEnvironmentVariable.asInstanceOf[js.Any], deleteOrgSecret = deleteOrgSecret.asInstanceOf[js.Any], deleteOrgVariable = deleteOrgVariable.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], deleteRepoVariable = deleteRepoVariable.asInstanceOf[js.Any], deleteRequiredWorkflow = deleteRequiredWorkflow.asInstanceOf[js.Any], deleteSelfHostedRunnerFromOrg = deleteSelfHostedRunnerFromOrg.asInstanceOf[js.Any], deleteSelfHostedRunnerFromRepo = deleteSelfHostedRunnerFromRepo.asInstanceOf[js.Any], deleteWorkflowRun = deleteWorkflowRun.asInstanceOf[js.Any], deleteWorkflowRunLogs = deleteWorkflowRunLogs.asInstanceOf[js.Any], disableSelectedRepositoryGithubActionsOrganization = disableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], disableWorkflow = disableWorkflow.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], downloadJobLogsForWorkflowRun = downloadJobLogsForWorkflowRun.asInstanceOf[js.Any], downloadWorkflowRunAttemptLogs = downloadWorkflowRunAttemptLogs.asInstanceOf[js.Any], downloadWorkflowRunLogs = downloadWorkflowRunLogs.asInstanceOf[js.Any], enableSelectedRepositoryGithubActionsOrganization = enableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], enableWorkflow = enableWorkflow.asInstanceOf[js.Any], generateRunnerJitconfigForOrg = generateRunnerJitconfigForOrg.asInstanceOf[js.Any], generateRunnerJitconfigForRepo = generateRunnerJitconfigForRepo.asInstanceOf[js.Any], getActionsCacheList = getActionsCacheList.asInstanceOf[js.Any], getActionsCacheUsage = getActionsCacheUsage.asInstanceOf[js.Any], getActionsCacheUsageByRepoForOrg = getActionsCacheUsageByRepoForOrg.asInstanceOf[js.Any], getActionsCacheUsageForOrg = getActionsCacheUsageForOrg.asInstanceOf[js.Any], getAllowedActionsOrganization = getAllowedActionsOrganization.asInstanceOf[js.Any], getAllowedActionsRepository = getAllowedActionsRepository.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getEnvironmentPublicKey = getEnvironmentPublicKey.asInstanceOf[js.Any], getEnvironmentSecret = getEnvironmentSecret.asInstanceOf[js.Any], getEnvironmentVariable = getEnvironmentVariable.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsOrganization = getGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsRepository = getGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], getGithubActionsPermissionsOrganization = getGithubActionsPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsPermissionsRepository = getGithubActionsPermissionsRepository.asInstanceOf[js.Any], getJobForWorkflowRun = getJobForWorkflowRun.asInstanceOf[js.Any], getOrgPublicKey = getOrgPublicKey.asInstanceOf[js.Any], getOrgSecret = getOrgSecret.asInstanceOf[js.Any], getOrgVariable = getOrgVariable.asInstanceOf[js.Any], getPendingDeploymentsForRun = getPendingDeploymentsForRun.asInstanceOf[js.Any], getRepoPermissions = getRepoPermissions.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoRequiredWorkflow = getRepoRequiredWorkflow.asInstanceOf[js.Any], getRepoRequiredWorkflowUsage = getRepoRequiredWorkflowUsage.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], getRepoVariable = getRepoVariable.asInstanceOf[js.Any], getRequiredWorkflow = getRequiredWorkflow.asInstanceOf[js.Any], getReviewsForRun = getReviewsForRun.asInstanceOf[js.Any], getSelfHostedRunnerForOrg = getSelfHostedRunnerForOrg.asInstanceOf[js.Any], getSelfHostedRunnerForRepo = getSelfHostedRunnerForRepo.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowAccessToRepository = getWorkflowAccessToRepository.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], getWorkflowRunAttempt = getWorkflowRunAttempt.asInstanceOf[js.Any], getWorkflowRunUsage = getWorkflowRunUsage.asInstanceOf[js.Any], getWorkflowUsage = getWorkflowUsage.asInstanceOf[js.Any], listArtifactsForRepo = listArtifactsForRepo.asInstanceOf[js.Any], listEnvironmentSecrets = listEnvironmentSecrets.asInstanceOf[js.Any], listEnvironmentVariables = listEnvironmentVariables.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listJobsForWorkflowRunAttempt = listJobsForWorkflowRunAttempt.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForOrg = listLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForRepo = listLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], listOrgSecrets = listOrgSecrets.asInstanceOf[js.Any], listOrgVariables = listOrgVariables.asInstanceOf[js.Any], listRepoOrganizationSecrets = listRepoOrganizationSecrets.asInstanceOf[js.Any], listRepoOrganizationVariables = listRepoOrganizationVariables.asInstanceOf[js.Any], listRepoRequiredWorkflows = listRepoRequiredWorkflows.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listRepoVariables = listRepoVariables.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listRequiredWorkflowRuns = listRequiredWorkflowRuns.asInstanceOf[js.Any], listRequiredWorkflows = listRequiredWorkflows.asInstanceOf[js.Any], listRunnerApplicationsForOrg = listRunnerApplicationsForOrg.asInstanceOf[js.Any], listRunnerApplicationsForRepo = listRunnerApplicationsForRepo.asInstanceOf[js.Any], listSelectedReposForOrgSecret = listSelectedReposForOrgSecret.asInstanceOf[js.Any], listSelectedReposForOrgVariable = listSelectedReposForOrgVariable.asInstanceOf[js.Any], listSelectedRepositoriesEnabledGithubActionsOrganization = listSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], listSelectedRepositoriesRequiredWorkflow = listSelectedRepositoriesRequiredWorkflow.asInstanceOf[js.Any], listSelfHostedRunnersForOrg = listSelfHostedRunnersForOrg.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], listWorkflowRunsForRepo = listWorkflowRunsForRepo.asInstanceOf[js.Any], reRunJobForWorkflowRun = reRunJobForWorkflowRun.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], reRunWorkflowFailedJobs = reRunWorkflowFailedJobs.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForOrg = removeAllCustomLabelsFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForRepo = removeAllCustomLabelsFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForOrg = removeCustomLabelFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForRepo = removeCustomLabelFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeSelectedRepoFromOrgSecret = removeSelectedRepoFromOrgSecret.asInstanceOf[js.Any], removeSelectedRepoFromOrgVariable = removeSelectedRepoFromOrgVariable.asInstanceOf[js.Any], removeSelectedRepoFromRequiredWorkflow = removeSelectedRepoFromRequiredWorkflow.asInstanceOf[js.Any], reviewCustomGatesForRun = reviewCustomGatesForRun.asInstanceOf[js.Any], reviewPendingDeploymentsForRun = reviewPendingDeploymentsForRun.asInstanceOf[js.Any], setAllowedActionsOrganization = setAllowedActionsOrganization.asInstanceOf[js.Any], setAllowedActionsRepository = setAllowedActionsRepository.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForOrg = setCustomLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForRepo = setCustomLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsOrganization = setGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsRepository = setGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], setGithubActionsPermissionsOrganization = setGithubActionsPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsPermissionsRepository = setGithubActionsPermissionsRepository.asInstanceOf[js.Any], setSelectedReposForOrgSecret = setSelectedReposForOrgSecret.asInstanceOf[js.Any], setSelectedReposForOrgVariable = setSelectedReposForOrgVariable.asInstanceOf[js.Any], setSelectedReposToRequiredWorkflow = setSelectedReposToRequiredWorkflow.asInstanceOf[js.Any], setSelectedRepositoriesEnabledGithubActionsOrganization = setSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], setWorkflowAccessToRepository = setWorkflowAccessToRepository.asInstanceOf[js.Any], updateEnvironmentVariable = updateEnvironmentVariable.asInstanceOf[js.Any], updateOrgVariable = updateOrgVariable.asInstanceOf[js.Any], updateRepoVariable = updateRepoVariable.asInstanceOf[js.Any], updateRequiredWorkflow = updateRequiredWorkflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomLabelsToSelfHostedRunnerForRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCustomLabelsToSelfHostedRunnerForRepo] (val x: Self) extends AnyVal {
    
    inline def setAddCustomLabelsToSelfHostedRunnerForOrg(value: Parameters): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setAddCustomLabelsToSelfHostedRunnerForRepo(value: Response): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgSecret(value: ParametersResponse): Self = StObject.set(x, "addSelectedRepoToOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgVariable(value: ResponseExtractOctokitResponse): Self = StObject.set(x, "addSelectedRepoToOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToRequiredWorkflow(value: ParametersResponseExtractOctokitResponse): Self = StObject.set(x, "addSelectedRepoToRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setApproveWorkflowRun(value: `843`): Self = StObject.set(x, "approveWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCancelWorkflowRun(value: `844`): Self = StObject.set(x, "cancelWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCreateEnvironmentVariable(value: `845`): Self = StObject.set(x, "createEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateEnvironmentSecret(value: `846`): Self = StObject.set(x, "createOrUpdateEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateOrgSecret(value: `847`): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: `848`): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrgVariable(value: `849`): Self = StObject.set(x, "createOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForOrg(value: `850`): Self = StObject.set(x, "createRegistrationTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForRepo(value: `851`): Self = StObject.set(x, "createRegistrationTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForOrg(value: `852`): Self = StObject.set(x, "createRemoveTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForRepo(value: `853`): Self = StObject.set(x, "createRemoveTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRepoVariable(value: `854`): Self = StObject.set(x, "createRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateRequiredWorkflow(value: `855`): Self = StObject.set(x, "createRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setCreateWorkflowDispatch(value: `856`): Self = StObject.set(x, "createWorkflowDispatch", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheById(value: `857`): Self = StObject.set(x, "deleteActionsCacheById", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheByKey(value: `858`): Self = StObject.set(x, "deleteActionsCacheByKey", value.asInstanceOf[js.Any])
    
    inline def setDeleteArtifact(value: `859`): Self = StObject.set(x, "deleteArtifact", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentSecret(value: `860`): Self = StObject.set(x, "deleteEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentVariable(value: `861`): Self = StObject.set(x, "deleteEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgSecret(value: `862`): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgVariable(value: `863`): Self = StObject.set(x, "deleteOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `864`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoVariable(value: `865`): Self = StObject.set(x, "deleteRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequiredWorkflow(value: `866`): Self = StObject.set(x, "deleteRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromOrg(value: `867`): Self = StObject.set(x, "deleteSelfHostedRunnerFromOrg", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromRepo(value: `868`): Self = StObject.set(x, "deleteSelfHostedRunnerFromRepo", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRun(value: `869`): Self = StObject.set(x, "deleteWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRunLogs(value: `870`): Self = StObject.set(x, "deleteWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectedRepositoryGithubActionsOrganization(value: `871`): Self = StObject.set(x, "disableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setDisableWorkflow(value: `872`): Self = StObject.set(x, "disableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDownloadArtifact(value: `873`): Self = StObject.set(x, "downloadArtifact", value.asInstanceOf[js.Any])
    
    inline def setDownloadJobLogsForWorkflowRun(value: `874`): Self = StObject.set(x, "downloadJobLogsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunAttemptLogs(value: `875`): Self = StObject.set(x, "downloadWorkflowRunAttemptLogs", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunLogs(value: `876`): Self = StObject.set(x, "downloadWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectedRepositoryGithubActionsOrganization(value: `877`): Self = StObject.set(x, "enableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setEnableWorkflow(value: `878`): Self = StObject.set(x, "enableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGenerateRunnerJitconfigForOrg(value: `879`): Self = StObject.set(x, "generateRunnerJitconfigForOrg", value.asInstanceOf[js.Any])
    
    inline def setGenerateRunnerJitconfigForRepo(value: `880`): Self = StObject.set(x, "generateRunnerJitconfigForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheList(value: `881`): Self = StObject.set(x, "getActionsCacheList", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsage(value: `882`): Self = StObject.set(x, "getActionsCacheUsage", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageByRepoForOrg(value: `883`): Self = StObject.set(x, "getActionsCacheUsageByRepoForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageForOrg(value: `884`): Self = StObject.set(x, "getActionsCacheUsageForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsOrganization(value: `885`): Self = StObject.set(x, "getAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsRepository(value: `886`): Self = StObject.set(x, "getAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetArtifact(value: `887`): Self = StObject.set(x, "getArtifact", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentPublicKey(value: `888`): Self = StObject.set(x, "getEnvironmentPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentSecret(value: `889`): Self = StObject.set(x, "getEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentVariable(value: `890`): Self = StObject.set(x, "getEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsOrganization(value: `891`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsRepository(value: `892`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsOrganization(value: `893`): Self = StObject.set(x, "getGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsRepository(value: `894`): Self = StObject.set(x, "getGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetJobForWorkflowRun(value: `895`): Self = StObject.set(x, "getJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetOrgPublicKey(value: `896`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetOrgSecret(value: `897`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setGetOrgVariable(value: `898`): Self = StObject.set(x, "getOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setGetPendingDeploymentsForRun(value: `899`): Self = StObject.set(x, "getPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPermissions(value: `894`): Self = StObject.set(x, "getRepoPermissions", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `900`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoRequiredWorkflow(value: `901`): Self = StObject.set(x, "getRepoRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetRepoRequiredWorkflowUsage(value: `902`): Self = StObject.set(x, "getRepoRequiredWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `903`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetRepoVariable(value: `904`): Self = StObject.set(x, "getRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setGetRequiredWorkflow(value: `905`): Self = StObject.set(x, "getRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetReviewsForRun(value: `906`): Self = StObject.set(x, "getReviewsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForOrg(value: `907`): Self = StObject.set(x, "getSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForRepo(value: `908`): Self = StObject.set(x, "getSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflow(value: `909`): Self = StObject.set(x, "getWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowAccessToRepository(value: `910`): Self = StObject.set(x, "getWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRun(value: `911`): Self = StObject.set(x, "getWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunAttempt(value: `912`): Self = StObject.set(x, "getWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunUsage(value: `913`): Self = StObject.set(x, "getWorkflowRunUsage", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowUsage(value: `914`): Self = StObject.set(x, "getWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setListArtifactsForRepo(value: `915`): Self = StObject.set(x, "listArtifactsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentSecrets(value: `916`): Self = StObject.set(x, "listEnvironmentSecrets", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentVariables(value: `917`): Self = StObject.set(x, "listEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRun(value: `918`): Self = StObject.set(x, "listJobsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRunAttempt(value: `919`): Self = StObject.set(x, "listJobsForWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForOrg(value: `920`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForRepo(value: `921`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setListOrgSecrets(value: `922`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    inline def setListOrgVariables(value: `923`): Self = StObject.set(x, "listOrgVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoOrganizationSecrets(value: `924`): Self = StObject.set(x, "listRepoOrganizationSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoOrganizationVariables(value: `925`): Self = StObject.set(x, "listRepoOrganizationVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoRequiredWorkflows(value: `926`): Self = StObject.set(x, "listRepoRequiredWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `927`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoVariables(value: `928`): Self = StObject.set(x, "listRepoVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoWorkflows(value: `929`): Self = StObject.set(x, "listRepoWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRequiredWorkflowRuns(value: `930`): Self = StObject.set(x, "listRequiredWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListRequiredWorkflows(value: `931`): Self = StObject.set(x, "listRequiredWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForOrg(value: `932`): Self = StObject.set(x, "listRunnerApplicationsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForRepo(value: `933`): Self = StObject.set(x, "listRunnerApplicationsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgSecret(value: `934`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgVariable(value: `935`): Self = StObject.set(x, "listSelectedReposForOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesEnabledGithubActionsOrganization(value: `936`): Self = StObject.set(x, "listSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesRequiredWorkflow(value: `937`): Self = StObject.set(x, "listSelectedRepositoriesRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForOrg(value: `938`): Self = StObject.set(x, "listSelfHostedRunnersForOrg", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForRepo(value: `939`): Self = StObject.set(x, "listSelfHostedRunnersForRepo", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunArtifacts(value: `940`): Self = StObject.set(x, "listWorkflowRunArtifacts", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRuns(value: `941`): Self = StObject.set(x, "listWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunsForRepo(value: `942`): Self = StObject.set(x, "listWorkflowRunsForRepo", value.asInstanceOf[js.Any])
    
    inline def setReRunJobForWorkflowRun(value: `943`): Self = StObject.set(x, "reRunJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflow(value: `944`): Self = StObject.set(x, "reRunWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflowFailedJobs(value: `945`): Self = StObject.set(x, "reRunWorkflowFailedJobs", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(value: `946`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(value: `947`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForOrg(value: `948`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForRepo(value: `949`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgSecret(value: `950`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgVariable(value: `951`): Self = StObject.set(x, "removeSelectedRepoFromOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromRequiredWorkflow(value: `952`): Self = StObject.set(x, "removeSelectedRepoFromRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReviewCustomGatesForRun(value: `953`): Self = StObject.set(x, "reviewCustomGatesForRun", value.asInstanceOf[js.Any])
    
    inline def setReviewPendingDeploymentsForRun(value: `954`): Self = StObject.set(x, "reviewPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsOrganization(value: `955`): Self = StObject.set(x, "setAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsRepository(value: `956`): Self = StObject.set(x, "setAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForOrg(value: `957`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForRepo(value: `958`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsOrganization(value: `959`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsRepository(value: `960`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsOrganization(value: `961`): Self = StObject.set(x, "setGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsRepository(value: `962`): Self = StObject.set(x, "setGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgSecret(value: `963`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgVariable(value: `964`): Self = StObject.set(x, "setSelectedReposForOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposToRequiredWorkflow(value: `965`): Self = StObject.set(x, "setSelectedReposToRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedRepositoriesEnabledGithubActionsOrganization(value: `966`): Self = StObject.set(x, "setSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetWorkflowAccessToRepository(value: `967`): Self = StObject.set(x, "setWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setUpdateEnvironmentVariable(value: `968`): Self = StObject.set(x, "updateEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateOrgVariable(value: `969`): Self = StObject.set(x, "updateOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateRepoVariable(value: `970`): Self = StObject.set(x, "updateRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateRequiredWorkflow(value: `971`): Self = StObject.set(x, "updateRequiredWorkflow", value.asInstanceOf[js.Any])
  }
}
