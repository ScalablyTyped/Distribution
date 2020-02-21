package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddRepoToInstallation extends js.Object {
  var addRepoToInstallation: AnonHeaders
  var checkAccountIsAssociatedWithAny: AnonMethodParamsUrlAnonAccountid
  var checkAccountIsAssociatedWithAnyStubbed: AnonMethodParamsUrlAnonAccountid
  var checkAuthorization: AnonDeprecated
  var checkToken: AnonHeadersMethod
  var createContentAttachment: AnonHeadersMethodParams
  var createFromManifest: AnonHeadersMethodParamsUrl
  var createInstallationToken: AnonHeadersMethodParamsUrlAnonAccept
  var deleteAuthorization: AnonHeadersMethod
  var deleteInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonInstallationidAnonRequired
  var deleteToken: AnonHeadersMethod
  var findOrgInstallation: AnonDeprecatedHeaders
  var findRepoInstallation: AnonDeprecatedHeadersMethod
  var findUserInstallation: AnonDeprecatedHeadersMethodParams
  var getAuthenticated: AnonHeadersMethodParamsUrlAnonAcceptString
  var getBySlug: AnonHeadersMethodParamsUrlAnonAcceptAnonAppslug
  var getInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonInstallationidAnonRequired
  var getOrgInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgAnonRequired
  var getRepoInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo
  var getUserInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonUsername
  var listAccountsUserOrOrgOnPlan: AnonMethodParamsUrlAnonDirectionPagePerpage
  var listAccountsUserOrOrgOnPlanStubbed: AnonMethodParamsUrlAnonDirectionPagePerpage
  var listInstallationReposForAuthenticatedUser: AnonHeadersMethodParamsUrlAnonAcceptAnonInstallationidPage
  var listInstallations: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpage
  var listInstallationsForAuthenticatedUser: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpage
  var listMarketplacePurchasesForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage
  var listMarketplacePurchasesForAuthenticatedUserStubbed: AnonMethodParamsUrlAnonPagePerpage
  var listPlans: AnonMethodParamsUrlAnonPagePerpage
  var listPlansStubbed: AnonMethodParamsUrlAnonPagePerpage
  var listRepos: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpage
  var removeRepoFromInstallation: AnonHeaders
  var resetAuthorization: AnonDeprecated
  var resetToken: AnonHeadersMethod
  var revokeAuthorizationForApplication: AnonDeprecated
  var revokeGrantForApplication: AnonDeprecated
  var revokeInstallationToken: AnonHeadersMethodParamsUrlAnonAcceptString
}

object AnonAddRepoToInstallation {
  @scala.inline
  def apply(
    addRepoToInstallation: AnonHeaders,
    checkAccountIsAssociatedWithAny: AnonMethodParamsUrlAnonAccountid,
    checkAccountIsAssociatedWithAnyStubbed: AnonMethodParamsUrlAnonAccountid,
    checkAuthorization: AnonDeprecated,
    checkToken: AnonHeadersMethod,
    createContentAttachment: AnonHeadersMethodParams,
    createFromManifest: AnonHeadersMethodParamsUrl,
    createInstallationToken: AnonHeadersMethodParamsUrlAnonAccept,
    deleteAuthorization: AnonHeadersMethod,
    deleteInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonInstallationidAnonRequired,
    deleteToken: AnonHeadersMethod,
    findOrgInstallation: AnonDeprecatedHeaders,
    findRepoInstallation: AnonDeprecatedHeadersMethod,
    findUserInstallation: AnonDeprecatedHeadersMethodParams,
    getAuthenticated: AnonHeadersMethodParamsUrlAnonAcceptString,
    getBySlug: AnonHeadersMethodParamsUrlAnonAcceptAnonAppslug,
    getInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonInstallationidAnonRequired,
    getOrgInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonOrgAnonRequired,
    getRepoInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonOwnerRepo,
    getUserInstallation: AnonHeadersMethodParamsUrlAnonAcceptAnonUsername,
    listAccountsUserOrOrgOnPlan: AnonMethodParamsUrlAnonDirectionPagePerpage,
    listAccountsUserOrOrgOnPlanStubbed: AnonMethodParamsUrlAnonDirectionPagePerpage,
    listInstallationReposForAuthenticatedUser: AnonHeadersMethodParamsUrlAnonAcceptAnonInstallationidPage,
    listInstallations: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpage,
    listInstallationsForAuthenticatedUser: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpage,
    listMarketplacePurchasesForAuthenticatedUser: AnonMethodParamsUrlAnonPagePerpage,
    listMarketplacePurchasesForAuthenticatedUserStubbed: AnonMethodParamsUrlAnonPagePerpage,
    listPlans: AnonMethodParamsUrlAnonPagePerpage,
    listPlansStubbed: AnonMethodParamsUrlAnonPagePerpage,
    listRepos: AnonHeadersMethodParamsUrlAnonAcceptAnonPagePerpage,
    removeRepoFromInstallation: AnonHeaders,
    resetAuthorization: AnonDeprecated,
    resetToken: AnonHeadersMethod,
    revokeAuthorizationForApplication: AnonDeprecated,
    revokeGrantForApplication: AnonDeprecated,
    revokeInstallationToken: AnonHeadersMethodParamsUrlAnonAcceptString
  ): AnonAddRepoToInstallation = {
    val __obj = js.Dynamic.literal(addRepoToInstallation = addRepoToInstallation.asInstanceOf[js.Any], checkAccountIsAssociatedWithAny = checkAccountIsAssociatedWithAny.asInstanceOf[js.Any], checkAccountIsAssociatedWithAnyStubbed = checkAccountIsAssociatedWithAnyStubbed.asInstanceOf[js.Any], checkAuthorization = checkAuthorization.asInstanceOf[js.Any], checkToken = checkToken.asInstanceOf[js.Any], createContentAttachment = createContentAttachment.asInstanceOf[js.Any], createFromManifest = createFromManifest.asInstanceOf[js.Any], createInstallationToken = createInstallationToken.asInstanceOf[js.Any], deleteAuthorization = deleteAuthorization.asInstanceOf[js.Any], deleteInstallation = deleteInstallation.asInstanceOf[js.Any], deleteToken = deleteToken.asInstanceOf[js.Any], findOrgInstallation = findOrgInstallation.asInstanceOf[js.Any], findRepoInstallation = findRepoInstallation.asInstanceOf[js.Any], findUserInstallation = findUserInstallation.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getBySlug = getBySlug.asInstanceOf[js.Any], getInstallation = getInstallation.asInstanceOf[js.Any], getOrgInstallation = getOrgInstallation.asInstanceOf[js.Any], getRepoInstallation = getRepoInstallation.asInstanceOf[js.Any], getUserInstallation = getUserInstallation.asInstanceOf[js.Any], listAccountsUserOrOrgOnPlan = listAccountsUserOrOrgOnPlan.asInstanceOf[js.Any], listAccountsUserOrOrgOnPlanStubbed = listAccountsUserOrOrgOnPlanStubbed.asInstanceOf[js.Any], listInstallationReposForAuthenticatedUser = listInstallationReposForAuthenticatedUser.asInstanceOf[js.Any], listInstallations = listInstallations.asInstanceOf[js.Any], listInstallationsForAuthenticatedUser = listInstallationsForAuthenticatedUser.asInstanceOf[js.Any], listMarketplacePurchasesForAuthenticatedUser = listMarketplacePurchasesForAuthenticatedUser.asInstanceOf[js.Any], listMarketplacePurchasesForAuthenticatedUserStubbed = listMarketplacePurchasesForAuthenticatedUserStubbed.asInstanceOf[js.Any], listPlans = listPlans.asInstanceOf[js.Any], listPlansStubbed = listPlansStubbed.asInstanceOf[js.Any], listRepos = listRepos.asInstanceOf[js.Any], removeRepoFromInstallation = removeRepoFromInstallation.asInstanceOf[js.Any], resetAuthorization = resetAuthorization.asInstanceOf[js.Any], resetToken = resetToken.asInstanceOf[js.Any], revokeAuthorizationForApplication = revokeAuthorizationForApplication.asInstanceOf[js.Any], revokeGrantForApplication = revokeGrantForApplication.asInstanceOf[js.Any], revokeInstallationToken = revokeInstallationToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAddRepoToInstallation]
  }
}

