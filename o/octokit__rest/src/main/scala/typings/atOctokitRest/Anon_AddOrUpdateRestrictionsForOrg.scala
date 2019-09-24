package typings.atOctokitRest

import typings.atOctokitRest.atOctokitRestMod.AnyResponse
import typings.atOctokitRest.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForOrgParams
import typings.atOctokitRest.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForOrgResponse
import typings.atOctokitRest.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForRepoParams
import typings.atOctokitRest.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.InteractionsGetRestrictionsForOrgParams
import typings.atOctokitRest.atOctokitRestMod.InteractionsGetRestrictionsForOrgResponse
import typings.atOctokitRest.atOctokitRestMod.InteractionsGetRestrictionsForRepoParams
import typings.atOctokitRest.atOctokitRestMod.InteractionsGetRestrictionsForRepoResponse
import typings.atOctokitRest.atOctokitRestMod.InteractionsRemoveRestrictionsForOrgParams
import typings.atOctokitRest.atOctokitRestMod.InteractionsRemoveRestrictionsForRepoParams
import typings.atOctokitRest.atOctokitRestMod.RequestOptions
import typings.atOctokitRest.atOctokitRestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddOrUpdateRestrictionsForOrg extends js.Object {
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  @JSName("addOrUpdateRestrictionsForOrg")
  var addOrUpdateRestrictionsForOrg_Original: Anon_EndpointParamsInteractionsAddOrUpdateRestrictionsForOrgParams = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  @JSName("addOrUpdateRestrictionsForRepo")
  var addOrUpdateRestrictionsForRepo_Original: Anon_EndpointParamsInteractionsAddOrUpdateRestrictionsForRepoParams = js.native
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForOrg")
  var getRestrictionsForOrg_Original: Anon_EndpointParamsInteractionsGetRestrictionsForOrgParams = js.native
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  @JSName("getRestrictionsForRepo")
  var getRestrictionsForRepo_Original: Anon_EndpointParamsInteractionsGetRestrictionsForRepoParams = js.native
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  @JSName("removeRestrictionsForOrg")
  var removeRestrictionsForOrg_Original: Anon_EndpointParamsAnyResponseInteractionsRemoveRestrictionsForOrgParams = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  @JSName("removeRestrictionsForRepo")
  var removeRestrictionsForRepo_Original: Anon_EndpointParamsAnyResponseInteractionsRemoveRestrictionsForRepoParams = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  def addOrUpdateRestrictionsForOrg(): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForOrgResponse]] = js.native
  def addOrUpdateRestrictionsForOrg(params: RequestOptions with InteractionsAddOrUpdateRestrictionsForOrgParams): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForOrgResponse]] = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  def addOrUpdateRestrictionsForRepo(): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForRepoResponse]] = js.native
  def addOrUpdateRestrictionsForRepo(params: RequestOptions with InteractionsAddOrUpdateRestrictionsForRepoParams): js.Promise[Response[InteractionsAddOrUpdateRestrictionsForRepoResponse]] = js.native
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForOrg(): js.Promise[Response[InteractionsGetRestrictionsForOrgResponse]] = js.native
  def getRestrictionsForOrg(params: RequestOptions with InteractionsGetRestrictionsForOrgParams): js.Promise[Response[InteractionsGetRestrictionsForOrgResponse]] = js.native
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForRepo(): js.Promise[Response[InteractionsGetRestrictionsForRepoResponse]] = js.native
  def getRestrictionsForRepo(params: RequestOptions with InteractionsGetRestrictionsForRepoParams): js.Promise[Response[InteractionsGetRestrictionsForRepoResponse]] = js.native
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  def removeRestrictionsForOrg(): js.Promise[AnyResponse] = js.native
  def removeRestrictionsForOrg(params: RequestOptions with InteractionsRemoveRestrictionsForOrgParams): js.Promise[AnyResponse] = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  def removeRestrictionsForRepo(): js.Promise[AnyResponse] = js.native
  def removeRestrictionsForRepo(params: RequestOptions with InteractionsRemoveRestrictionsForRepoParams): js.Promise[AnyResponse] = js.native
}

