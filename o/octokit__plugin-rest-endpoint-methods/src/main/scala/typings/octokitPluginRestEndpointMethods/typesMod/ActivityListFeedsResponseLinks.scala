package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityListFeedsResponseLinks extends js.Object {
  var current_user: ActivityListFeedsResponseLinksCurrentUser
  var current_user_actor: ActivityListFeedsResponseLinksCurrentUserActor
  var current_user_organization: ActivityListFeedsResponseLinksCurrentUserOrganization
  var current_user_organizations: js.Array[ActivityListFeedsResponseLinksCurrentUserOrganizationsItem]
  var current_user_public: ActivityListFeedsResponseLinksCurrentUserPublic
  var security_advisories: ActivityListFeedsResponseLinksSecurityAdvisories
  var timeline: ActivityListFeedsResponseLinksTimeline
  var user: ActivityListFeedsResponseLinksUser
}

object ActivityListFeedsResponseLinks {
  @scala.inline
  def apply(
    current_user: ActivityListFeedsResponseLinksCurrentUser,
    current_user_actor: ActivityListFeedsResponseLinksCurrentUserActor,
    current_user_organization: ActivityListFeedsResponseLinksCurrentUserOrganization,
    current_user_organizations: js.Array[ActivityListFeedsResponseLinksCurrentUserOrganizationsItem],
    current_user_public: ActivityListFeedsResponseLinksCurrentUserPublic,
    security_advisories: ActivityListFeedsResponseLinksSecurityAdvisories,
    timeline: ActivityListFeedsResponseLinksTimeline,
    user: ActivityListFeedsResponseLinksUser
  ): ActivityListFeedsResponseLinks = {
    val __obj = js.Dynamic.literal(current_user = current_user.asInstanceOf[js.Any], current_user_actor = current_user_actor.asInstanceOf[js.Any], current_user_organization = current_user_organization.asInstanceOf[js.Any], current_user_organizations = current_user_organizations.asInstanceOf[js.Any], current_user_public = current_user_public.asInstanceOf[js.Any], security_advisories = security_advisories.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityListFeedsResponseLinks]
  }
}

