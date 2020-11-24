package typings.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckToken extends js.Object {
  
  var addRepoToInstallation: `620` = js.native
  
  var checkToken: `621` = js.native
  
  var createContentAttachment: `622` = js.native
  
  var createFromManifest: `623` = js.native
  
  var createInstallationAccessToken: `624` = js.native
  
  var deleteAuthorization: `625` = js.native
  
  var deleteInstallation: `626` = js.native
  
  var deleteToken: `627` = js.native
  
  var getAuthenticated: `628` = js.native
  
  var getBySlug: `629` = js.native
  
  var getInstallation: `630` = js.native
  
  var getOrgInstallation: `631` = js.native
  
  var getRepoInstallation: `632` = js.native
  
  var getSubscriptionPlanForAccount: `633` = js.native
  
  var getSubscriptionPlanForAccountStubbed: `634` = js.native
  
  var getUserInstallation: `635` = js.native
  
  var listAccountsForPlan: `636` = js.native
  
  var listAccountsForPlanStubbed: `637` = js.native
  
  var listInstallationReposForAuthenticatedUser: `638` = js.native
  
  var listInstallations: `639` = js.native
  
  var listInstallationsForAuthenticatedUser: `640` = js.native
  
  var listPlans: `641` = js.native
  
  var listPlansStubbed: `642` = js.native
  
  var listReposAccessibleToInstallation: `643` = js.native
  
  var listSubscriptionsForAuthenticatedUser: `644` = js.native
  
  var listSubscriptionsForAuthenticatedUserStubbed: `645` = js.native
  
  var removeRepoFromInstallation: `646` = js.native
  
  var resetToken: `647` = js.native
  
  var revokeInstallationAccessToken: `648` = js.native
  
  var suspendInstallation: `649` = js.native
  
  var unsuspendInstallation: `650` = js.native
}
object CheckToken {
  
  @scala.inline
  def apply(
    addRepoToInstallation: `620`,
    checkToken: `621`,
    createContentAttachment: `622`,
    createFromManifest: `623`,
    createInstallationAccessToken: `624`,
    deleteAuthorization: `625`,
    deleteInstallation: `626`,
    deleteToken: `627`,
    getAuthenticated: `628`,
    getBySlug: `629`,
    getInstallation: `630`,
    getOrgInstallation: `631`,
    getRepoInstallation: `632`,
    getSubscriptionPlanForAccount: `633`,
    getSubscriptionPlanForAccountStubbed: `634`,
    getUserInstallation: `635`,
    listAccountsForPlan: `636`,
    listAccountsForPlanStubbed: `637`,
    listInstallationReposForAuthenticatedUser: `638`,
    listInstallations: `639`,
    listInstallationsForAuthenticatedUser: `640`,
    listPlans: `641`,
    listPlansStubbed: `642`,
    listReposAccessibleToInstallation: `643`,
    listSubscriptionsForAuthenticatedUser: `644`,
    listSubscriptionsForAuthenticatedUserStubbed: `645`,
    removeRepoFromInstallation: `646`,
    resetToken: `647`,
    revokeInstallationAccessToken: `648`,
    suspendInstallation: `649`,
    unsuspendInstallation: `650`
  ): CheckToken = {
    val __obj = js.Dynamic.literal(addRepoToInstallation = addRepoToInstallation.asInstanceOf[js.Any], checkToken = checkToken.asInstanceOf[js.Any], createContentAttachment = createContentAttachment.asInstanceOf[js.Any], createFromManifest = createFromManifest.asInstanceOf[js.Any], createInstallationAccessToken = createInstallationAccessToken.asInstanceOf[js.Any], deleteAuthorization = deleteAuthorization.asInstanceOf[js.Any], deleteInstallation = deleteInstallation.asInstanceOf[js.Any], deleteToken = deleteToken.asInstanceOf[js.Any], getAuthenticated = getAuthenticated.asInstanceOf[js.Any], getBySlug = getBySlug.asInstanceOf[js.Any], getInstallation = getInstallation.asInstanceOf[js.Any], getOrgInstallation = getOrgInstallation.asInstanceOf[js.Any], getRepoInstallation = getRepoInstallation.asInstanceOf[js.Any], getSubscriptionPlanForAccount = getSubscriptionPlanForAccount.asInstanceOf[js.Any], getSubscriptionPlanForAccountStubbed = getSubscriptionPlanForAccountStubbed.asInstanceOf[js.Any], getUserInstallation = getUserInstallation.asInstanceOf[js.Any], listAccountsForPlan = listAccountsForPlan.asInstanceOf[js.Any], listAccountsForPlanStubbed = listAccountsForPlanStubbed.asInstanceOf[js.Any], listInstallationReposForAuthenticatedUser = listInstallationReposForAuthenticatedUser.asInstanceOf[js.Any], listInstallations = listInstallations.asInstanceOf[js.Any], listInstallationsForAuthenticatedUser = listInstallationsForAuthenticatedUser.asInstanceOf[js.Any], listPlans = listPlans.asInstanceOf[js.Any], listPlansStubbed = listPlansStubbed.asInstanceOf[js.Any], listReposAccessibleToInstallation = listReposAccessibleToInstallation.asInstanceOf[js.Any], listSubscriptionsForAuthenticatedUser = listSubscriptionsForAuthenticatedUser.asInstanceOf[js.Any], listSubscriptionsForAuthenticatedUserStubbed = listSubscriptionsForAuthenticatedUserStubbed.asInstanceOf[js.Any], removeRepoFromInstallation = removeRepoFromInstallation.asInstanceOf[js.Any], resetToken = resetToken.asInstanceOf[js.Any], revokeInstallationAccessToken = revokeInstallationAccessToken.asInstanceOf[js.Any], suspendInstallation = suspendInstallation.asInstanceOf[js.Any], unsuspendInstallation = unsuspendInstallation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckToken]
  }
  
  @scala.inline
  implicit class CheckTokenOps[Self <: CheckToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddRepoToInstallation(value: `620`): Self = this.set("addRepoToInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckToken(value: `621`): Self = this.set("checkToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateContentAttachment(value: `622`): Self = this.set("createContentAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateFromManifest(value: `623`): Self = this.set("createFromManifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateInstallationAccessToken(value: `624`): Self = this.set("createInstallationAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAuthorization(value: `625`): Self = this.set("deleteAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteInstallation(value: `626`): Self = this.set("deleteInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteToken(value: `627`): Self = this.set("deleteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetAuthenticated(value: `628`): Self = this.set("getAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBySlug(value: `629`): Self = this.set("getBySlug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInstallation(value: `630`): Self = this.set("getInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetOrgInstallation(value: `631`): Self = this.set("getOrgInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRepoInstallation(value: `632`): Self = this.set("getRepoInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSubscriptionPlanForAccount(value: `633`): Self = this.set("getSubscriptionPlanForAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSubscriptionPlanForAccountStubbed(value: `634`): Self = this.set("getSubscriptionPlanForAccountStubbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUserInstallation(value: `635`): Self = this.set("getUserInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAccountsForPlan(value: `636`): Self = this.set("listAccountsForPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAccountsForPlanStubbed(value: `637`): Self = this.set("listAccountsForPlanStubbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInstallationReposForAuthenticatedUser(value: `638`): Self = this.set("listInstallationReposForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInstallations(value: `639`): Self = this.set("listInstallations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListInstallationsForAuthenticatedUser(value: `640`): Self = this.set("listInstallationsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPlans(value: `641`): Self = this.set("listPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPlansStubbed(value: `642`): Self = this.set("listPlansStubbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListReposAccessibleToInstallation(value: `643`): Self = this.set("listReposAccessibleToInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSubscriptionsForAuthenticatedUser(value: `644`): Self = this.set("listSubscriptionsForAuthenticatedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListSubscriptionsForAuthenticatedUserStubbed(value: `645`): Self = this.set("listSubscriptionsForAuthenticatedUserStubbed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRepoFromInstallation(value: `646`): Self = this.set("removeRepoFromInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetToken(value: `647`): Self = this.set("resetToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokeInstallationAccessToken(value: `648`): Self = this.set("revokeInstallationAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendInstallation(value: `649`): Self = this.set("suspendInstallation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsuspendInstallation(value: `650`): Self = this.set("unsuspendInstallation", value.asInstanceOf[js.Any])
  }
}
