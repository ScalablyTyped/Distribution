package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsAddOrUpdateRestrictionsForRepoParams extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests for the given repository. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: atOctokitRestLib.atOctokitRestLibStrings.existing_users | atOctokitRestLib.atOctokitRestLibStrings.contributors_only | atOctokitRestLib.atOctokitRestLibStrings.collaborators_only
  var owner: java.lang.String
  var repo: java.lang.String
}

object InteractionsAddOrUpdateRestrictionsForRepoParams {
  @scala.inline
  def apply(
    limit: atOctokitRestLib.atOctokitRestLibStrings.existing_users | atOctokitRestLib.atOctokitRestLibStrings.contributors_only | atOctokitRestLib.atOctokitRestLibStrings.collaborators_only,
    owner: java.lang.String,
    repo: java.lang.String
  ): InteractionsAddOrUpdateRestrictionsForRepoParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], owner = owner, repo = repo)
  
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForRepoParams]
  }
}

