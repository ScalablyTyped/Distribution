package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.collaborators_only
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.contributors_only
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.existing_users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsAddOrUpdateRestrictionsForRepoParams extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests for the given repository. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only
  var owner: String
  var repo: String
}

object InteractionsAddOrUpdateRestrictionsForRepoParams {
  @scala.inline
  def apply(limit: existing_users | contributors_only | collaborators_only, owner: String, repo: String): InteractionsAddOrUpdateRestrictionsForRepoParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForRepoParams]
  }
}

