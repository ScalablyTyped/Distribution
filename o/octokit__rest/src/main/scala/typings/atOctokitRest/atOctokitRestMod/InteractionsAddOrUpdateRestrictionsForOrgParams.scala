package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.collaborators_only
import typings.atOctokitRest.atOctokitRestStrings.contributors_only
import typings.atOctokitRest.atOctokitRestStrings.existing_users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionsAddOrUpdateRestrictionsForOrgParams extends js.Object {
  /**
    * Specifies the group of GitHub users who can comment, open issues, or create pull requests in public repositories for the given organization. Must be one of: `existing_users`, `contributors_only`, or `collaborators_only`.
    */
  var limit: existing_users | contributors_only | collaborators_only
  var org: String
}

object InteractionsAddOrUpdateRestrictionsForOrgParams {
  @scala.inline
  def apply(limit: existing_users | contributors_only | collaborators_only, org: String): InteractionsAddOrUpdateRestrictionsForOrgParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], org = org)
  
    __obj.asInstanceOf[InteractionsAddOrUpdateRestrictionsForOrgParams]
  }
}

