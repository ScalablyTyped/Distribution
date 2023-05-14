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
  
  var approveWorkflowRun: `841`
  
  var cancelWorkflowRun: `842`
  
  var createEnvironmentVariable: `843`
  
  var createOrUpdateEnvironmentSecret: `844`
  
  var createOrUpdateOrgSecret: `845`
  
  var createOrUpdateRepoSecret: `846`
  
  var createOrgVariable: `847`
  
  var createRegistrationTokenForOrg: `848`
  
  var createRegistrationTokenForRepo: `849`
  
  var createRemoveTokenForOrg: `850`
  
  var createRemoveTokenForRepo: `851`
  
  var createRepoVariable: `852`
  
  var createRequiredWorkflow: `853`
  
  var createWorkflowDispatch: `854`
  
  var deleteActionsCacheById: `855`
  
  var deleteActionsCacheByKey: `856`
  
  var deleteArtifact: `857`
  
  var deleteEnvironmentSecret: `858`
  
  var deleteEnvironmentVariable: `859`
  
  var deleteOrgSecret: `860`
  
  var deleteOrgVariable: `861`
  
  var deleteRepoSecret: `862`
  
  var deleteRepoVariable: `863`
  
  var deleteRequiredWorkflow: `864`
  
  var deleteSelfHostedRunnerFromOrg: `865`
  
  var deleteSelfHostedRunnerFromRepo: `866`
  
  var deleteWorkflowRun: `867`
  
  var deleteWorkflowRunLogs: `868`
  
  var disableSelectedRepositoryGithubActionsOrganization: `869`
  
  var disableWorkflow: `870`
  
  var downloadArtifact: `871`
  
  var downloadJobLogsForWorkflowRun: `872`
  
  var downloadWorkflowRunAttemptLogs: `873`
  
  var downloadWorkflowRunLogs: `874`
  
  var enableSelectedRepositoryGithubActionsOrganization: `875`
  
  var enableWorkflow: `876`
  
  var getActionsCacheList: `877`
  
  var getActionsCacheUsage: `878`
  
  var getActionsCacheUsageByRepoForOrg: `879`
  
  var getActionsCacheUsageForOrg: `880`
  
  var getAllowedActionsOrganization: `881`
  
  var getAllowedActionsRepository: `882`
  
  var getArtifact: `883`
  
  var getEnvironmentPublicKey: `884`
  
  var getEnvironmentSecret: `885`
  
  var getEnvironmentVariable: `886`
  
  var getGithubActionsDefaultWorkflowPermissionsOrganization: `887`
  
  var getGithubActionsDefaultWorkflowPermissionsRepository: `888`
  
  var getGithubActionsPermissionsOrganization: `889`
  
  var getGithubActionsPermissionsRepository: `890`
  
  var getJobForWorkflowRun: `891`
  
  var getOrgPublicKey: `892`
  
  var getOrgSecret: `893`
  
  var getOrgVariable: `894`
  
  var getPendingDeploymentsForRun: `895`
  
  var getRepoPermissions: `890`
  
  var getRepoPublicKey: `896`
  
  var getRepoRequiredWorkflow: `897`
  
  var getRepoRequiredWorkflowUsage: `898`
  
  var getRepoSecret: `899`
  
  var getRepoVariable: `900`
  
  var getRequiredWorkflow: `901`
  
  var getReviewsForRun: `902`
  
  var getSelfHostedRunnerForOrg: `903`
  
  var getSelfHostedRunnerForRepo: `904`
  
  var getWorkflow: `905`
  
  var getWorkflowAccessToRepository: `906`
  
  var getWorkflowRun: `907`
  
  var getWorkflowRunAttempt: `908`
  
  var getWorkflowRunUsage: `909`
  
  var getWorkflowUsage: `910`
  
  var listArtifactsForRepo: `911`
  
  var listEnvironmentSecrets: `912`
  
  var listEnvironmentVariables: `913`
  
  var listJobsForWorkflowRun: `914`
  
  var listJobsForWorkflowRunAttempt: `915`
  
  var listLabelsForSelfHostedRunnerForOrg: `916`
  
  var listLabelsForSelfHostedRunnerForRepo: `917`
  
  var listOrgSecrets: `918`
  
  var listOrgVariables: `919`
  
  var listRepoOrganizationSecrets: `920`
  
  var listRepoOrganizationVariables: `921`
  
  var listRepoRequiredWorkflows: `922`
  
  var listRepoSecrets: `923`
  
  var listRepoVariables: `924`
  
  var listRepoWorkflows: `925`
  
  var listRequiredWorkflowRuns: `926`
  
  var listRequiredWorkflows: `927`
  
  var listRunnerApplicationsForOrg: `928`
  
  var listRunnerApplicationsForRepo: `929`
  
  var listSelectedReposForOrgSecret: `930`
  
  var listSelectedReposForOrgVariable: `931`
  
  var listSelectedRepositoriesEnabledGithubActionsOrganization: `932`
  
  var listSelectedRepositoriesRequiredWorkflow: `933`
  
  var listSelfHostedRunnersForOrg: `934`
  
  var listSelfHostedRunnersForRepo: `935`
  
  var listWorkflowRunArtifacts: `936`
  
  var listWorkflowRuns: `937`
  
  var listWorkflowRunsForRepo: `938`
  
  var reRunJobForWorkflowRun: `939`
  
  var reRunWorkflow: `940`
  
  var reRunWorkflowFailedJobs: `941`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForOrg: `942`
  
  var removeAllCustomLabelsFromSelfHostedRunnerForRepo: `943`
  
  var removeCustomLabelFromSelfHostedRunnerForOrg: `944`
  
  var removeCustomLabelFromSelfHostedRunnerForRepo: `945`
  
  var removeSelectedRepoFromOrgSecret: `946`
  
  var removeSelectedRepoFromOrgVariable: `947`
  
  var removeSelectedRepoFromRequiredWorkflow: `948`
  
  var reviewCustomGatesForRun: `949`
  
  var reviewPendingDeploymentsForRun: `950`
  
  var setAllowedActionsOrganization: `951`
  
  var setAllowedActionsRepository: `952`
  
  var setCustomLabelsForSelfHostedRunnerForOrg: `953`
  
  var setCustomLabelsForSelfHostedRunnerForRepo: `954`
  
  var setGithubActionsDefaultWorkflowPermissionsOrganization: `955`
  
  var setGithubActionsDefaultWorkflowPermissionsRepository: `956`
  
  var setGithubActionsPermissionsOrganization: `957`
  
  var setGithubActionsPermissionsRepository: `958`
  
  var setSelectedReposForOrgSecret: `959`
  
  var setSelectedReposForOrgVariable: `960`
  
  var setSelectedReposToRequiredWorkflow: `961`
  
  var setSelectedRepositoriesEnabledGithubActionsOrganization: `962`
  
  var setWorkflowAccessToRepository: `963`
  
  var updateEnvironmentVariable: `964`
  
  var updateOrgVariable: `965`
  
  var updateRepoVariable: `966`
  
  var updateRequiredWorkflow: `967`
}
object AddCustomLabelsToSelfHostedRunnerForRepo {
  
  inline def apply(
    addCustomLabelsToSelfHostedRunnerForOrg: Parameters,
    addCustomLabelsToSelfHostedRunnerForRepo: Response,
    addSelectedRepoToOrgSecret: ParametersResponse,
    addSelectedRepoToOrgVariable: ResponseExtractOctokitResponse,
    addSelectedRepoToRequiredWorkflow: ParametersResponseExtractOctokitResponse,
    approveWorkflowRun: `841`,
    cancelWorkflowRun: `842`,
    createEnvironmentVariable: `843`,
    createOrUpdateEnvironmentSecret: `844`,
    createOrUpdateOrgSecret: `845`,
    createOrUpdateRepoSecret: `846`,
    createOrgVariable: `847`,
    createRegistrationTokenForOrg: `848`,
    createRegistrationTokenForRepo: `849`,
    createRemoveTokenForOrg: `850`,
    createRemoveTokenForRepo: `851`,
    createRepoVariable: `852`,
    createRequiredWorkflow: `853`,
    createWorkflowDispatch: `854`,
    deleteActionsCacheById: `855`,
    deleteActionsCacheByKey: `856`,
    deleteArtifact: `857`,
    deleteEnvironmentSecret: `858`,
    deleteEnvironmentVariable: `859`,
    deleteOrgSecret: `860`,
    deleteOrgVariable: `861`,
    deleteRepoSecret: `862`,
    deleteRepoVariable: `863`,
    deleteRequiredWorkflow: `864`,
    deleteSelfHostedRunnerFromOrg: `865`,
    deleteSelfHostedRunnerFromRepo: `866`,
    deleteWorkflowRun: `867`,
    deleteWorkflowRunLogs: `868`,
    disableSelectedRepositoryGithubActionsOrganization: `869`,
    disableWorkflow: `870`,
    downloadArtifact: `871`,
    downloadJobLogsForWorkflowRun: `872`,
    downloadWorkflowRunAttemptLogs: `873`,
    downloadWorkflowRunLogs: `874`,
    enableSelectedRepositoryGithubActionsOrganization: `875`,
    enableWorkflow: `876`,
    getActionsCacheList: `877`,
    getActionsCacheUsage: `878`,
    getActionsCacheUsageByRepoForOrg: `879`,
    getActionsCacheUsageForOrg: `880`,
    getAllowedActionsOrganization: `881`,
    getAllowedActionsRepository: `882`,
    getArtifact: `883`,
    getEnvironmentPublicKey: `884`,
    getEnvironmentSecret: `885`,
    getEnvironmentVariable: `886`,
    getGithubActionsDefaultWorkflowPermissionsOrganization: `887`,
    getGithubActionsDefaultWorkflowPermissionsRepository: `888`,
    getGithubActionsPermissionsOrganization: `889`,
    getGithubActionsPermissionsRepository: `890`,
    getJobForWorkflowRun: `891`,
    getOrgPublicKey: `892`,
    getOrgSecret: `893`,
    getOrgVariable: `894`,
    getPendingDeploymentsForRun: `895`,
    getRepoPermissions: `890`,
    getRepoPublicKey: `896`,
    getRepoRequiredWorkflow: `897`,
    getRepoRequiredWorkflowUsage: `898`,
    getRepoSecret: `899`,
    getRepoVariable: `900`,
    getRequiredWorkflow: `901`,
    getReviewsForRun: `902`,
    getSelfHostedRunnerForOrg: `903`,
    getSelfHostedRunnerForRepo: `904`,
    getWorkflow: `905`,
    getWorkflowAccessToRepository: `906`,
    getWorkflowRun: `907`,
    getWorkflowRunAttempt: `908`,
    getWorkflowRunUsage: `909`,
    getWorkflowUsage: `910`,
    listArtifactsForRepo: `911`,
    listEnvironmentSecrets: `912`,
    listEnvironmentVariables: `913`,
    listJobsForWorkflowRun: `914`,
    listJobsForWorkflowRunAttempt: `915`,
    listLabelsForSelfHostedRunnerForOrg: `916`,
    listLabelsForSelfHostedRunnerForRepo: `917`,
    listOrgSecrets: `918`,
    listOrgVariables: `919`,
    listRepoOrganizationSecrets: `920`,
    listRepoOrganizationVariables: `921`,
    listRepoRequiredWorkflows: `922`,
    listRepoSecrets: `923`,
    listRepoVariables: `924`,
    listRepoWorkflows: `925`,
    listRequiredWorkflowRuns: `926`,
    listRequiredWorkflows: `927`,
    listRunnerApplicationsForOrg: `928`,
    listRunnerApplicationsForRepo: `929`,
    listSelectedReposForOrgSecret: `930`,
    listSelectedReposForOrgVariable: `931`,
    listSelectedRepositoriesEnabledGithubActionsOrganization: `932`,
    listSelectedRepositoriesRequiredWorkflow: `933`,
    listSelfHostedRunnersForOrg: `934`,
    listSelfHostedRunnersForRepo: `935`,
    listWorkflowRunArtifacts: `936`,
    listWorkflowRuns: `937`,
    listWorkflowRunsForRepo: `938`,
    reRunJobForWorkflowRun: `939`,
    reRunWorkflow: `940`,
    reRunWorkflowFailedJobs: `941`,
    removeAllCustomLabelsFromSelfHostedRunnerForOrg: `942`,
    removeAllCustomLabelsFromSelfHostedRunnerForRepo: `943`,
    removeCustomLabelFromSelfHostedRunnerForOrg: `944`,
    removeCustomLabelFromSelfHostedRunnerForRepo: `945`,
    removeSelectedRepoFromOrgSecret: `946`,
    removeSelectedRepoFromOrgVariable: `947`,
    removeSelectedRepoFromRequiredWorkflow: `948`,
    reviewCustomGatesForRun: `949`,
    reviewPendingDeploymentsForRun: `950`,
    setAllowedActionsOrganization: `951`,
    setAllowedActionsRepository: `952`,
    setCustomLabelsForSelfHostedRunnerForOrg: `953`,
    setCustomLabelsForSelfHostedRunnerForRepo: `954`,
    setGithubActionsDefaultWorkflowPermissionsOrganization: `955`,
    setGithubActionsDefaultWorkflowPermissionsRepository: `956`,
    setGithubActionsPermissionsOrganization: `957`,
    setGithubActionsPermissionsRepository: `958`,
    setSelectedReposForOrgSecret: `959`,
    setSelectedReposForOrgVariable: `960`,
    setSelectedReposToRequiredWorkflow: `961`,
    setSelectedRepositoriesEnabledGithubActionsOrganization: `962`,
    setWorkflowAccessToRepository: `963`,
    updateEnvironmentVariable: `964`,
    updateOrgVariable: `965`,
    updateRepoVariable: `966`,
    updateRequiredWorkflow: `967`
  ): AddCustomLabelsToSelfHostedRunnerForRepo = {
    val __obj = js.Dynamic.literal(addCustomLabelsToSelfHostedRunnerForOrg = addCustomLabelsToSelfHostedRunnerForOrg.asInstanceOf[js.Any], addCustomLabelsToSelfHostedRunnerForRepo = addCustomLabelsToSelfHostedRunnerForRepo.asInstanceOf[js.Any], addSelectedRepoToOrgSecret = addSelectedRepoToOrgSecret.asInstanceOf[js.Any], addSelectedRepoToOrgVariable = addSelectedRepoToOrgVariable.asInstanceOf[js.Any], addSelectedRepoToRequiredWorkflow = addSelectedRepoToRequiredWorkflow.asInstanceOf[js.Any], approveWorkflowRun = approveWorkflowRun.asInstanceOf[js.Any], cancelWorkflowRun = cancelWorkflowRun.asInstanceOf[js.Any], createEnvironmentVariable = createEnvironmentVariable.asInstanceOf[js.Any], createOrUpdateEnvironmentSecret = createOrUpdateEnvironmentSecret.asInstanceOf[js.Any], createOrUpdateOrgSecret = createOrUpdateOrgSecret.asInstanceOf[js.Any], createOrUpdateRepoSecret = createOrUpdateRepoSecret.asInstanceOf[js.Any], createOrgVariable = createOrgVariable.asInstanceOf[js.Any], createRegistrationTokenForOrg = createRegistrationTokenForOrg.asInstanceOf[js.Any], createRegistrationTokenForRepo = createRegistrationTokenForRepo.asInstanceOf[js.Any], createRemoveTokenForOrg = createRemoveTokenForOrg.asInstanceOf[js.Any], createRemoveTokenForRepo = createRemoveTokenForRepo.asInstanceOf[js.Any], createRepoVariable = createRepoVariable.asInstanceOf[js.Any], createRequiredWorkflow = createRequiredWorkflow.asInstanceOf[js.Any], createWorkflowDispatch = createWorkflowDispatch.asInstanceOf[js.Any], deleteActionsCacheById = deleteActionsCacheById.asInstanceOf[js.Any], deleteActionsCacheByKey = deleteActionsCacheByKey.asInstanceOf[js.Any], deleteArtifact = deleteArtifact.asInstanceOf[js.Any], deleteEnvironmentSecret = deleteEnvironmentSecret.asInstanceOf[js.Any], deleteEnvironmentVariable = deleteEnvironmentVariable.asInstanceOf[js.Any], deleteOrgSecret = deleteOrgSecret.asInstanceOf[js.Any], deleteOrgVariable = deleteOrgVariable.asInstanceOf[js.Any], deleteRepoSecret = deleteRepoSecret.asInstanceOf[js.Any], deleteRepoVariable = deleteRepoVariable.asInstanceOf[js.Any], deleteRequiredWorkflow = deleteRequiredWorkflow.asInstanceOf[js.Any], deleteSelfHostedRunnerFromOrg = deleteSelfHostedRunnerFromOrg.asInstanceOf[js.Any], deleteSelfHostedRunnerFromRepo = deleteSelfHostedRunnerFromRepo.asInstanceOf[js.Any], deleteWorkflowRun = deleteWorkflowRun.asInstanceOf[js.Any], deleteWorkflowRunLogs = deleteWorkflowRunLogs.asInstanceOf[js.Any], disableSelectedRepositoryGithubActionsOrganization = disableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], disableWorkflow = disableWorkflow.asInstanceOf[js.Any], downloadArtifact = downloadArtifact.asInstanceOf[js.Any], downloadJobLogsForWorkflowRun = downloadJobLogsForWorkflowRun.asInstanceOf[js.Any], downloadWorkflowRunAttemptLogs = downloadWorkflowRunAttemptLogs.asInstanceOf[js.Any], downloadWorkflowRunLogs = downloadWorkflowRunLogs.asInstanceOf[js.Any], enableSelectedRepositoryGithubActionsOrganization = enableSelectedRepositoryGithubActionsOrganization.asInstanceOf[js.Any], enableWorkflow = enableWorkflow.asInstanceOf[js.Any], getActionsCacheList = getActionsCacheList.asInstanceOf[js.Any], getActionsCacheUsage = getActionsCacheUsage.asInstanceOf[js.Any], getActionsCacheUsageByRepoForOrg = getActionsCacheUsageByRepoForOrg.asInstanceOf[js.Any], getActionsCacheUsageForOrg = getActionsCacheUsageForOrg.asInstanceOf[js.Any], getAllowedActionsOrganization = getAllowedActionsOrganization.asInstanceOf[js.Any], getAllowedActionsRepository = getAllowedActionsRepository.asInstanceOf[js.Any], getArtifact = getArtifact.asInstanceOf[js.Any], getEnvironmentPublicKey = getEnvironmentPublicKey.asInstanceOf[js.Any], getEnvironmentSecret = getEnvironmentSecret.asInstanceOf[js.Any], getEnvironmentVariable = getEnvironmentVariable.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsOrganization = getGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsDefaultWorkflowPermissionsRepository = getGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], getGithubActionsPermissionsOrganization = getGithubActionsPermissionsOrganization.asInstanceOf[js.Any], getGithubActionsPermissionsRepository = getGithubActionsPermissionsRepository.asInstanceOf[js.Any], getJobForWorkflowRun = getJobForWorkflowRun.asInstanceOf[js.Any], getOrgPublicKey = getOrgPublicKey.asInstanceOf[js.Any], getOrgSecret = getOrgSecret.asInstanceOf[js.Any], getOrgVariable = getOrgVariable.asInstanceOf[js.Any], getPendingDeploymentsForRun = getPendingDeploymentsForRun.asInstanceOf[js.Any], getRepoPermissions = getRepoPermissions.asInstanceOf[js.Any], getRepoPublicKey = getRepoPublicKey.asInstanceOf[js.Any], getRepoRequiredWorkflow = getRepoRequiredWorkflow.asInstanceOf[js.Any], getRepoRequiredWorkflowUsage = getRepoRequiredWorkflowUsage.asInstanceOf[js.Any], getRepoSecret = getRepoSecret.asInstanceOf[js.Any], getRepoVariable = getRepoVariable.asInstanceOf[js.Any], getRequiredWorkflow = getRequiredWorkflow.asInstanceOf[js.Any], getReviewsForRun = getReviewsForRun.asInstanceOf[js.Any], getSelfHostedRunnerForOrg = getSelfHostedRunnerForOrg.asInstanceOf[js.Any], getSelfHostedRunnerForRepo = getSelfHostedRunnerForRepo.asInstanceOf[js.Any], getWorkflow = getWorkflow.asInstanceOf[js.Any], getWorkflowAccessToRepository = getWorkflowAccessToRepository.asInstanceOf[js.Any], getWorkflowRun = getWorkflowRun.asInstanceOf[js.Any], getWorkflowRunAttempt = getWorkflowRunAttempt.asInstanceOf[js.Any], getWorkflowRunUsage = getWorkflowRunUsage.asInstanceOf[js.Any], getWorkflowUsage = getWorkflowUsage.asInstanceOf[js.Any], listArtifactsForRepo = listArtifactsForRepo.asInstanceOf[js.Any], listEnvironmentSecrets = listEnvironmentSecrets.asInstanceOf[js.Any], listEnvironmentVariables = listEnvironmentVariables.asInstanceOf[js.Any], listJobsForWorkflowRun = listJobsForWorkflowRun.asInstanceOf[js.Any], listJobsForWorkflowRunAttempt = listJobsForWorkflowRunAttempt.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForOrg = listLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], listLabelsForSelfHostedRunnerForRepo = listLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], listOrgSecrets = listOrgSecrets.asInstanceOf[js.Any], listOrgVariables = listOrgVariables.asInstanceOf[js.Any], listRepoOrganizationSecrets = listRepoOrganizationSecrets.asInstanceOf[js.Any], listRepoOrganizationVariables = listRepoOrganizationVariables.asInstanceOf[js.Any], listRepoRequiredWorkflows = listRepoRequiredWorkflows.asInstanceOf[js.Any], listRepoSecrets = listRepoSecrets.asInstanceOf[js.Any], listRepoVariables = listRepoVariables.asInstanceOf[js.Any], listRepoWorkflows = listRepoWorkflows.asInstanceOf[js.Any], listRequiredWorkflowRuns = listRequiredWorkflowRuns.asInstanceOf[js.Any], listRequiredWorkflows = listRequiredWorkflows.asInstanceOf[js.Any], listRunnerApplicationsForOrg = listRunnerApplicationsForOrg.asInstanceOf[js.Any], listRunnerApplicationsForRepo = listRunnerApplicationsForRepo.asInstanceOf[js.Any], listSelectedReposForOrgSecret = listSelectedReposForOrgSecret.asInstanceOf[js.Any], listSelectedReposForOrgVariable = listSelectedReposForOrgVariable.asInstanceOf[js.Any], listSelectedRepositoriesEnabledGithubActionsOrganization = listSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], listSelectedRepositoriesRequiredWorkflow = listSelectedRepositoriesRequiredWorkflow.asInstanceOf[js.Any], listSelfHostedRunnersForOrg = listSelfHostedRunnersForOrg.asInstanceOf[js.Any], listSelfHostedRunnersForRepo = listSelfHostedRunnersForRepo.asInstanceOf[js.Any], listWorkflowRunArtifacts = listWorkflowRunArtifacts.asInstanceOf[js.Any], listWorkflowRuns = listWorkflowRuns.asInstanceOf[js.Any], listWorkflowRunsForRepo = listWorkflowRunsForRepo.asInstanceOf[js.Any], reRunJobForWorkflowRun = reRunJobForWorkflowRun.asInstanceOf[js.Any], reRunWorkflow = reRunWorkflow.asInstanceOf[js.Any], reRunWorkflowFailedJobs = reRunWorkflowFailedJobs.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForOrg = removeAllCustomLabelsFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeAllCustomLabelsFromSelfHostedRunnerForRepo = removeAllCustomLabelsFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForOrg = removeCustomLabelFromSelfHostedRunnerForOrg.asInstanceOf[js.Any], removeCustomLabelFromSelfHostedRunnerForRepo = removeCustomLabelFromSelfHostedRunnerForRepo.asInstanceOf[js.Any], removeSelectedRepoFromOrgSecret = removeSelectedRepoFromOrgSecret.asInstanceOf[js.Any], removeSelectedRepoFromOrgVariable = removeSelectedRepoFromOrgVariable.asInstanceOf[js.Any], removeSelectedRepoFromRequiredWorkflow = removeSelectedRepoFromRequiredWorkflow.asInstanceOf[js.Any], reviewCustomGatesForRun = reviewCustomGatesForRun.asInstanceOf[js.Any], reviewPendingDeploymentsForRun = reviewPendingDeploymentsForRun.asInstanceOf[js.Any], setAllowedActionsOrganization = setAllowedActionsOrganization.asInstanceOf[js.Any], setAllowedActionsRepository = setAllowedActionsRepository.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForOrg = setCustomLabelsForSelfHostedRunnerForOrg.asInstanceOf[js.Any], setCustomLabelsForSelfHostedRunnerForRepo = setCustomLabelsForSelfHostedRunnerForRepo.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsOrganization = setGithubActionsDefaultWorkflowPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsDefaultWorkflowPermissionsRepository = setGithubActionsDefaultWorkflowPermissionsRepository.asInstanceOf[js.Any], setGithubActionsPermissionsOrganization = setGithubActionsPermissionsOrganization.asInstanceOf[js.Any], setGithubActionsPermissionsRepository = setGithubActionsPermissionsRepository.asInstanceOf[js.Any], setSelectedReposForOrgSecret = setSelectedReposForOrgSecret.asInstanceOf[js.Any], setSelectedReposForOrgVariable = setSelectedReposForOrgVariable.asInstanceOf[js.Any], setSelectedReposToRequiredWorkflow = setSelectedReposToRequiredWorkflow.asInstanceOf[js.Any], setSelectedRepositoriesEnabledGithubActionsOrganization = setSelectedRepositoriesEnabledGithubActionsOrganization.asInstanceOf[js.Any], setWorkflowAccessToRepository = setWorkflowAccessToRepository.asInstanceOf[js.Any], updateEnvironmentVariable = updateEnvironmentVariable.asInstanceOf[js.Any], updateOrgVariable = updateOrgVariable.asInstanceOf[js.Any], updateRepoVariable = updateRepoVariable.asInstanceOf[js.Any], updateRequiredWorkflow = updateRequiredWorkflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCustomLabelsToSelfHostedRunnerForRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddCustomLabelsToSelfHostedRunnerForRepo] (val x: Self) extends AnyVal {
    
    inline def setAddCustomLabelsToSelfHostedRunnerForOrg(value: Parameters): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setAddCustomLabelsToSelfHostedRunnerForRepo(value: Response): Self = StObject.set(x, "addCustomLabelsToSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgSecret(value: ParametersResponse): Self = StObject.set(x, "addSelectedRepoToOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToOrgVariable(value: ResponseExtractOctokitResponse): Self = StObject.set(x, "addSelectedRepoToOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setAddSelectedRepoToRequiredWorkflow(value: ParametersResponseExtractOctokitResponse): Self = StObject.set(x, "addSelectedRepoToRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setApproveWorkflowRun(value: `841`): Self = StObject.set(x, "approveWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCancelWorkflowRun(value: `842`): Self = StObject.set(x, "cancelWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setCreateEnvironmentVariable(value: `843`): Self = StObject.set(x, "createEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateEnvironmentSecret(value: `844`): Self = StObject.set(x, "createOrUpdateEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateOrgSecret(value: `845`): Self = StObject.set(x, "createOrUpdateOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrUpdateRepoSecret(value: `846`): Self = StObject.set(x, "createOrUpdateRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setCreateOrgVariable(value: `847`): Self = StObject.set(x, "createOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForOrg(value: `848`): Self = StObject.set(x, "createRegistrationTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRegistrationTokenForRepo(value: `849`): Self = StObject.set(x, "createRegistrationTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForOrg(value: `850`): Self = StObject.set(x, "createRemoveTokenForOrg", value.asInstanceOf[js.Any])
    
    inline def setCreateRemoveTokenForRepo(value: `851`): Self = StObject.set(x, "createRemoveTokenForRepo", value.asInstanceOf[js.Any])
    
    inline def setCreateRepoVariable(value: `852`): Self = StObject.set(x, "createRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setCreateRequiredWorkflow(value: `853`): Self = StObject.set(x, "createRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setCreateWorkflowDispatch(value: `854`): Self = StObject.set(x, "createWorkflowDispatch", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheById(value: `855`): Self = StObject.set(x, "deleteActionsCacheById", value.asInstanceOf[js.Any])
    
    inline def setDeleteActionsCacheByKey(value: `856`): Self = StObject.set(x, "deleteActionsCacheByKey", value.asInstanceOf[js.Any])
    
    inline def setDeleteArtifact(value: `857`): Self = StObject.set(x, "deleteArtifact", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentSecret(value: `858`): Self = StObject.set(x, "deleteEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnvironmentVariable(value: `859`): Self = StObject.set(x, "deleteEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgSecret(value: `860`): Self = StObject.set(x, "deleteOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteOrgVariable(value: `861`): Self = StObject.set(x, "deleteOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoSecret(value: `862`): Self = StObject.set(x, "deleteRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setDeleteRepoVariable(value: `863`): Self = StObject.set(x, "deleteRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequiredWorkflow(value: `864`): Self = StObject.set(x, "deleteRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromOrg(value: `865`): Self = StObject.set(x, "deleteSelfHostedRunnerFromOrg", value.asInstanceOf[js.Any])
    
    inline def setDeleteSelfHostedRunnerFromRepo(value: `866`): Self = StObject.set(x, "deleteSelfHostedRunnerFromRepo", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRun(value: `867`): Self = StObject.set(x, "deleteWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDeleteWorkflowRunLogs(value: `868`): Self = StObject.set(x, "deleteWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setDisableSelectedRepositoryGithubActionsOrganization(value: `869`): Self = StObject.set(x, "disableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setDisableWorkflow(value: `870`): Self = StObject.set(x, "disableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setDownloadArtifact(value: `871`): Self = StObject.set(x, "downloadArtifact", value.asInstanceOf[js.Any])
    
    inline def setDownloadJobLogsForWorkflowRun(value: `872`): Self = StObject.set(x, "downloadJobLogsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunAttemptLogs(value: `873`): Self = StObject.set(x, "downloadWorkflowRunAttemptLogs", value.asInstanceOf[js.Any])
    
    inline def setDownloadWorkflowRunLogs(value: `874`): Self = StObject.set(x, "downloadWorkflowRunLogs", value.asInstanceOf[js.Any])
    
    inline def setEnableSelectedRepositoryGithubActionsOrganization(value: `875`): Self = StObject.set(x, "enableSelectedRepositoryGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setEnableWorkflow(value: `876`): Self = StObject.set(x, "enableWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheList(value: `877`): Self = StObject.set(x, "getActionsCacheList", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsage(value: `878`): Self = StObject.set(x, "getActionsCacheUsage", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageByRepoForOrg(value: `879`): Self = StObject.set(x, "getActionsCacheUsageByRepoForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetActionsCacheUsageForOrg(value: `880`): Self = StObject.set(x, "getActionsCacheUsageForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsOrganization(value: `881`): Self = StObject.set(x, "getAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetAllowedActionsRepository(value: `882`): Self = StObject.set(x, "getAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetArtifact(value: `883`): Self = StObject.set(x, "getArtifact", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentPublicKey(value: `884`): Self = StObject.set(x, "getEnvironmentPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentSecret(value: `885`): Self = StObject.set(x, "getEnvironmentSecret", value.asInstanceOf[js.Any])
    
    inline def setGetEnvironmentVariable(value: `886`): Self = StObject.set(x, "getEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsOrganization(value: `887`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsDefaultWorkflowPermissionsRepository(value: `888`): Self = StObject.set(x, "getGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsOrganization(value: `889`): Self = StObject.set(x, "getGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setGetGithubActionsPermissionsRepository(value: `890`): Self = StObject.set(x, "getGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setGetJobForWorkflowRun(value: `891`): Self = StObject.set(x, "getJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetOrgPublicKey(value: `892`): Self = StObject.set(x, "getOrgPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetOrgSecret(value: `893`): Self = StObject.set(x, "getOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setGetOrgVariable(value: `894`): Self = StObject.set(x, "getOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setGetPendingDeploymentsForRun(value: `895`): Self = StObject.set(x, "getPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPermissions(value: `890`): Self = StObject.set(x, "getRepoPermissions", value.asInstanceOf[js.Any])
    
    inline def setGetRepoPublicKey(value: `896`): Self = StObject.set(x, "getRepoPublicKey", value.asInstanceOf[js.Any])
    
    inline def setGetRepoRequiredWorkflow(value: `897`): Self = StObject.set(x, "getRepoRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetRepoRequiredWorkflowUsage(value: `898`): Self = StObject.set(x, "getRepoRequiredWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setGetRepoSecret(value: `899`): Self = StObject.set(x, "getRepoSecret", value.asInstanceOf[js.Any])
    
    inline def setGetRepoVariable(value: `900`): Self = StObject.set(x, "getRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setGetRequiredWorkflow(value: `901`): Self = StObject.set(x, "getRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetReviewsForRun(value: `902`): Self = StObject.set(x, "getReviewsForRun", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForOrg(value: `903`): Self = StObject.set(x, "getSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setGetSelfHostedRunnerForRepo(value: `904`): Self = StObject.set(x, "getSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflow(value: `905`): Self = StObject.set(x, "getWorkflow", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowAccessToRepository(value: `906`): Self = StObject.set(x, "getWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRun(value: `907`): Self = StObject.set(x, "getWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunAttempt(value: `908`): Self = StObject.set(x, "getWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowRunUsage(value: `909`): Self = StObject.set(x, "getWorkflowRunUsage", value.asInstanceOf[js.Any])
    
    inline def setGetWorkflowUsage(value: `910`): Self = StObject.set(x, "getWorkflowUsage", value.asInstanceOf[js.Any])
    
    inline def setListArtifactsForRepo(value: `911`): Self = StObject.set(x, "listArtifactsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentSecrets(value: `912`): Self = StObject.set(x, "listEnvironmentSecrets", value.asInstanceOf[js.Any])
    
    inline def setListEnvironmentVariables(value: `913`): Self = StObject.set(x, "listEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRun(value: `914`): Self = StObject.set(x, "listJobsForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setListJobsForWorkflowRunAttempt(value: `915`): Self = StObject.set(x, "listJobsForWorkflowRunAttempt", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForOrg(value: `916`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setListLabelsForSelfHostedRunnerForRepo(value: `917`): Self = StObject.set(x, "listLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setListOrgSecrets(value: `918`): Self = StObject.set(x, "listOrgSecrets", value.asInstanceOf[js.Any])
    
    inline def setListOrgVariables(value: `919`): Self = StObject.set(x, "listOrgVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoOrganizationSecrets(value: `920`): Self = StObject.set(x, "listRepoOrganizationSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoOrganizationVariables(value: `921`): Self = StObject.set(x, "listRepoOrganizationVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoRequiredWorkflows(value: `922`): Self = StObject.set(x, "listRepoRequiredWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRepoSecrets(value: `923`): Self = StObject.set(x, "listRepoSecrets", value.asInstanceOf[js.Any])
    
    inline def setListRepoVariables(value: `924`): Self = StObject.set(x, "listRepoVariables", value.asInstanceOf[js.Any])
    
    inline def setListRepoWorkflows(value: `925`): Self = StObject.set(x, "listRepoWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRequiredWorkflowRuns(value: `926`): Self = StObject.set(x, "listRequiredWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListRequiredWorkflows(value: `927`): Self = StObject.set(x, "listRequiredWorkflows", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForOrg(value: `928`): Self = StObject.set(x, "listRunnerApplicationsForOrg", value.asInstanceOf[js.Any])
    
    inline def setListRunnerApplicationsForRepo(value: `929`): Self = StObject.set(x, "listRunnerApplicationsForRepo", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgSecret(value: `930`): Self = StObject.set(x, "listSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setListSelectedReposForOrgVariable(value: `931`): Self = StObject.set(x, "listSelectedReposForOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesEnabledGithubActionsOrganization(value: `932`): Self = StObject.set(x, "listSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setListSelectedRepositoriesRequiredWorkflow(value: `933`): Self = StObject.set(x, "listSelectedRepositoriesRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForOrg(value: `934`): Self = StObject.set(x, "listSelfHostedRunnersForOrg", value.asInstanceOf[js.Any])
    
    inline def setListSelfHostedRunnersForRepo(value: `935`): Self = StObject.set(x, "listSelfHostedRunnersForRepo", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunArtifacts(value: `936`): Self = StObject.set(x, "listWorkflowRunArtifacts", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRuns(value: `937`): Self = StObject.set(x, "listWorkflowRuns", value.asInstanceOf[js.Any])
    
    inline def setListWorkflowRunsForRepo(value: `938`): Self = StObject.set(x, "listWorkflowRunsForRepo", value.asInstanceOf[js.Any])
    
    inline def setReRunJobForWorkflowRun(value: `939`): Self = StObject.set(x, "reRunJobForWorkflowRun", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflow(value: `940`): Self = StObject.set(x, "reRunWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReRunWorkflowFailedJobs(value: `941`): Self = StObject.set(x, "reRunWorkflowFailedJobs", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForOrg(value: `942`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllCustomLabelsFromSelfHostedRunnerForRepo(value: `943`): Self = StObject.set(x, "removeAllCustomLabelsFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForOrg(value: `944`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomLabelFromSelfHostedRunnerForRepo(value: `945`): Self = StObject.set(x, "removeCustomLabelFromSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgSecret(value: `946`): Self = StObject.set(x, "removeSelectedRepoFromOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromOrgVariable(value: `947`): Self = StObject.set(x, "removeSelectedRepoFromOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setRemoveSelectedRepoFromRequiredWorkflow(value: `948`): Self = StObject.set(x, "removeSelectedRepoFromRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setReviewCustomGatesForRun(value: `949`): Self = StObject.set(x, "reviewCustomGatesForRun", value.asInstanceOf[js.Any])
    
    inline def setReviewPendingDeploymentsForRun(value: `950`): Self = StObject.set(x, "reviewPendingDeploymentsForRun", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsOrganization(value: `951`): Self = StObject.set(x, "setAllowedActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetAllowedActionsRepository(value: `952`): Self = StObject.set(x, "setAllowedActionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForOrg(value: `953`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForOrg", value.asInstanceOf[js.Any])
    
    inline def setSetCustomLabelsForSelfHostedRunnerForRepo(value: `954`): Self = StObject.set(x, "setCustomLabelsForSelfHostedRunnerForRepo", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsOrganization(value: `955`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsDefaultWorkflowPermissionsRepository(value: `956`): Self = StObject.set(x, "setGithubActionsDefaultWorkflowPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsOrganization(value: `957`): Self = StObject.set(x, "setGithubActionsPermissionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetGithubActionsPermissionsRepository(value: `958`): Self = StObject.set(x, "setGithubActionsPermissionsRepository", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgSecret(value: `959`): Self = StObject.set(x, "setSelectedReposForOrgSecret", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposForOrgVariable(value: `960`): Self = StObject.set(x, "setSelectedReposForOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedReposToRequiredWorkflow(value: `961`): Self = StObject.set(x, "setSelectedReposToRequiredWorkflow", value.asInstanceOf[js.Any])
    
    inline def setSetSelectedRepositoriesEnabledGithubActionsOrganization(value: `962`): Self = StObject.set(x, "setSelectedRepositoriesEnabledGithubActionsOrganization", value.asInstanceOf[js.Any])
    
    inline def setSetWorkflowAccessToRepository(value: `963`): Self = StObject.set(x, "setWorkflowAccessToRepository", value.asInstanceOf[js.Any])
    
    inline def setUpdateEnvironmentVariable(value: `964`): Self = StObject.set(x, "updateEnvironmentVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateOrgVariable(value: `965`): Self = StObject.set(x, "updateOrgVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateRepoVariable(value: `966`): Self = StObject.set(x, "updateRepoVariable", value.asInstanceOf[js.Any])
    
    inline def setUpdateRequiredWorkflow(value: `967`): Self = StObject.set(x, "updateRequiredWorkflow", value.asInstanceOf[js.Any])
  }
}
