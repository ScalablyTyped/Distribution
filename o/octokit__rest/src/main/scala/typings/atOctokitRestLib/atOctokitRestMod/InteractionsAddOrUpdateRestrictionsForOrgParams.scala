package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsAddOrUpdateRestrictionsForOrgParams extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: atOctokitRestLib.atOctokitRestLibStrings.existing_users | atOctokitRestLib.atOctokitRestLibStrings.contributors_only | atOctokitRestLib.atOctokitRestLibStrings.collaborators_only
  var org: java.lang.String
}

object InteractionsAddOrUpdateRestrictionsForOrgParams {
  @scala.inline
  def apply(
    limit: atOctokitRestLib.atOctokitRestLibStrings.existing_users | atOctokitRestLib.atOctokitRestLibStrings.contributors_only | atOctokitRestLib.atOctokitRestLibStrings.collaborators_only,
    org: java.lang.String
  ): InteractionsAddOrUpdateRestrictionsForOrgParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], org = org)
  
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForOrgParams]
  }
}

