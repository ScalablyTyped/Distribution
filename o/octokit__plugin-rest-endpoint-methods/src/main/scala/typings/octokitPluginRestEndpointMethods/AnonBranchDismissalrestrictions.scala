package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranchDismissalrestrictions extends js.Object {
  var branch: AnonRequired
  var dismiss_stale_reviews: AnonType
  var dismissal_restrictions: AnonType
  @JSName("dismissal_restrictions.teams")
  var dismissal_restrictionsDotteams: AnonType
  @JSName("dismissal_restrictions.users")
  var dismissal_restrictionsDotusers: AnonType
  var owner: AnonRequired
  var repo: AnonRequired
  var require_code_owner_reviews: AnonType
  var required_approving_review_count: AnonType
}

object AnonBranchDismissalrestrictions {
  @scala.inline
  def apply(
    branch: AnonRequired,
    dismiss_stale_reviews: AnonType,
    dismissal_restrictions: AnonType,
    dismissal_restrictionsDotteams: AnonType,
    dismissal_restrictionsDotusers: AnonType,
    owner: AnonRequired,
    repo: AnonRequired,
    require_code_owner_reviews: AnonType,
    required_approving_review_count: AnonType
  ): AnonBranchDismissalrestrictions = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], dismiss_stale_reviews = dismiss_stale_reviews.asInstanceOf[js.Any], dismissal_restrictions = dismissal_restrictions.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], require_code_owner_reviews = require_code_owner_reviews.asInstanceOf[js.Any], required_approving_review_count = required_approving_review_count.asInstanceOf[js.Any])
    __obj.updateDynamic("dismissal_restrictions.teams")(dismissal_restrictionsDotteams.asInstanceOf[js.Any])
    __obj.updateDynamic("dismissal_restrictions.users")(dismissal_restrictionsDotusers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBranchDismissalrestrictions]
  }
}

