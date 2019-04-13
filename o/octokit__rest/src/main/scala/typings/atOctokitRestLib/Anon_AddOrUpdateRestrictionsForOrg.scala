package typings
package atOctokitRestLib

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
  var removeRestrictionsForOrg_Original: Anon_EndpointParamsInteractionsRemoveRestrictionsForOrgParams = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  @JSName("removeRestrictionsForRepo")
  var removeRestrictionsForRepo_Original: Anon_EndpointParamsInteractionsRemoveRestrictionsForRepoParams = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users in any public repository in the given organization. You must be an organization owner to set these restrictions.
    */
  def addOrUpdateRestrictionsForOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForOrgResponse
    ]
  ] = js.native
  def addOrUpdateRestrictionsForOrg(params: atOctokitRestLib.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForOrgResponse
    ]
  ] = js.native
  /**
    * Temporarily restricts interactions to certain GitHub users within the given repository. You must have owner or admin access to set restrictions.
    */
  def addOrUpdateRestrictionsForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForRepoResponse
    ]
  ] = js.native
  def addOrUpdateRestrictionsForRepo(params: atOctokitRestLib.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[
      atOctokitRestLib.atOctokitRestMod.InteractionsAddOrUpdateRestrictionsForRepoResponse
    ]
  ] = js.native
  /**
    * Shows which group of GitHub users can interact with this organization and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsGetRestrictionsForOrgResponse]
  ] = js.native
  def getRestrictionsForOrg(params: atOctokitRestLib.atOctokitRestMod.InteractionsGetRestrictionsForOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsGetRestrictionsForOrgResponse]
  ] = js.native
  /**
    * Shows which group of GitHub users can interact with this repository and when the restriction expires. If there are no restrictions, you will see an empty response.
    */
  def getRestrictionsForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsGetRestrictionsForRepoResponse]
  ] = js.native
  def getRestrictionsForRepo(params: atOctokitRestLib.atOctokitRestMod.InteractionsGetRestrictionsForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsGetRestrictionsForRepoResponse]
  ] = js.native
  /**
    * Removes all interaction restrictions from public repositories in the given organization. You must be an organization owner to remove restrictions.
    */
  def removeRestrictionsForOrg(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsRemoveRestrictionsForOrgResponse]
  ] = js.native
  def removeRestrictionsForOrg(params: atOctokitRestLib.atOctokitRestMod.InteractionsRemoveRestrictionsForOrgParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsRemoveRestrictionsForOrgResponse]
  ] = js.native
  /**
    * Removes all interaction restrictions from the given repository. You must have owner or admin access to remove restrictions.
    */
  def removeRestrictionsForRepo(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsRemoveRestrictionsForRepoResponse]
  ] = js.native
  def removeRestrictionsForRepo(params: atOctokitRestLib.atOctokitRestMod.InteractionsRemoveRestrictionsForRepoParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.InteractionsRemoveRestrictionsForRepoResponse]
  ] = js.native
}

