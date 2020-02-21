package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowdeletions extends js.Object {
  var allow_deletions: AnonType
  var allow_force_pushes: AnonAllowNull
  var branch: AnonRequired
  var enforce_admins: AnonAllowNullRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var required_linear_history: AnonType
  var required_pull_request_reviews: AnonAllowNullRequired
  @JSName("required_pull_request_reviews.dismiss_stale_reviews")
  var required_pull_request_reviewsDotdismiss_stale_reviews: AnonType
  @JSName("required_pull_request_reviews.dismissal_restrictions")
  var required_pull_request_reviewsDotdismissal_restrictions: AnonType
  @JSName("required_pull_request_reviews.dismissal_restrictions.teams")
  var required_pull_request_reviewsDotdismissal_restrictionsDotteams: AnonType
  @JSName("required_pull_request_reviews.dismissal_restrictions.users")
  var required_pull_request_reviewsDotdismissal_restrictionsDotusers: AnonType
  @JSName("required_pull_request_reviews.require_code_owner_reviews")
  var required_pull_request_reviewsDotrequire_code_owner_reviews: AnonType
  @JSName("required_pull_request_reviews.required_approving_review_count")
  var required_pull_request_reviewsDotrequired_approving_review_count: AnonType
  var required_status_checks: AnonAllowNullRequired
  @JSName("required_status_checks.contexts")
  var required_status_checksDotcontexts: AnonRequired
  @JSName("required_status_checks.strict")
  var required_status_checksDotstrict: AnonRequired
  var restrictions: AnonAllowNullRequired
  @JSName("restrictions.apps")
  var restrictionsDotapps: AnonType
  @JSName("restrictions.teams")
  var restrictionsDotteams: AnonRequired
  @JSName("restrictions.users")
  var restrictionsDotusers: AnonRequired
}

object AnonAllowdeletions {
  @scala.inline
  def apply(
    allow_deletions: AnonType,
    allow_force_pushes: AnonAllowNull,
    branch: AnonRequired,
    enforce_admins: AnonAllowNullRequired,
    owner: AnonRequired,
    repo: AnonRequired,
    required_linear_history: AnonType,
    required_pull_request_reviews: AnonAllowNullRequired,
    required_pull_request_reviewsDotdismiss_stale_reviews: AnonType,
    required_pull_request_reviewsDotdismissal_restrictions: AnonType,
    required_pull_request_reviewsDotdismissal_restrictionsDotteams: AnonType,
    required_pull_request_reviewsDotdismissal_restrictionsDotusers: AnonType,
    required_pull_request_reviewsDotrequire_code_owner_reviews: AnonType,
    required_pull_request_reviewsDotrequired_approving_review_count: AnonType,
    required_status_checks: AnonAllowNullRequired,
    required_status_checksDotcontexts: AnonRequired,
    required_status_checksDotstrict: AnonRequired,
    restrictions: AnonAllowNullRequired,
    restrictionsDotapps: AnonType,
    restrictionsDotteams: AnonRequired,
    restrictionsDotusers: AnonRequired
  ): AnonAllowdeletions = {
    val __obj = js.Dynamic.literal(allow_deletions = allow_deletions.asInstanceOf[js.Any], allow_force_pushes = allow_force_pushes.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], enforce_admins = enforce_admins.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], required_linear_history = required_linear_history.asInstanceOf[js.Any], required_pull_request_reviews = required_pull_request_reviews.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismiss_stale_reviews")(required_pull_request_reviewsDotdismiss_stale_reviews.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions")(required_pull_request_reviewsDotdismissal_restrictions.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions.teams")(required_pull_request_reviewsDotdismissal_restrictionsDotteams.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.dismissal_restrictions.users")(required_pull_request_reviewsDotdismissal_restrictionsDotusers.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.require_code_owner_reviews")(required_pull_request_reviewsDotrequire_code_owner_reviews.asInstanceOf[js.Any])
    __obj.updateDynamic("required_pull_request_reviews.required_approving_review_count")(required_pull_request_reviewsDotrequired_approving_review_count.asInstanceOf[js.Any])
    __obj.updateDynamic("required_status_checks.contexts")(required_status_checksDotcontexts.asInstanceOf[js.Any])
    __obj.updateDynamic("required_status_checks.strict")(required_status_checksDotstrict.asInstanceOf[js.Any])
    __obj.updateDynamic("restrictions.apps")(restrictionsDotapps.asInstanceOf[js.Any])
    __obj.updateDynamic("restrictions.teams")(restrictionsDotteams.asInstanceOf[js.Any])
    __obj.updateDynamic("restrictions.users")(restrictionsDotusers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowdeletions]
  }
}

