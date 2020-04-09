package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityGetFeedsResponseLinks extends js.Object {
  var current_user: ActivityGetFeedsResponseLinksCurrentUser
  var current_user_actor: ActivityGetFeedsResponseLinksCurrentUserActor
  var current_user_organization: ActivityGetFeedsResponseLinksCurrentUserOrganization
  var current_user_organizations: js.Array[ActivityGetFeedsResponseLinksCurrentUserOrganizationsItem]
  var current_user_public: ActivityGetFeedsResponseLinksCurrentUserPublic
  var security_advisories: ActivityGetFeedsResponseLinksSecurityAdvisories
  var timeline: ActivityGetFeedsResponseLinksTimeline
  var user: ActivityGetFeedsResponseLinksUser
}

object ActivityGetFeedsResponseLinks {
  @scala.inline
  def apply(
    current_user: ActivityGetFeedsResponseLinksCurrentUser,
    current_user_actor: ActivityGetFeedsResponseLinksCurrentUserActor,
    current_user_organization: ActivityGetFeedsResponseLinksCurrentUserOrganization,
    current_user_organizations: js.Array[ActivityGetFeedsResponseLinksCurrentUserOrganizationsItem],
    current_user_public: ActivityGetFeedsResponseLinksCurrentUserPublic,
    security_advisories: ActivityGetFeedsResponseLinksSecurityAdvisories,
    timeline: ActivityGetFeedsResponseLinksTimeline,
    user: ActivityGetFeedsResponseLinksUser
  ): ActivityGetFeedsResponseLinks = {
    val __obj = js.Dynamic.literal(current_user = current_user.asInstanceOf[js.Any], current_user_actor = current_user_actor.asInstanceOf[js.Any], current_user_organization = current_user_organization.asInstanceOf[js.Any], current_user_organizations = current_user_organizations.asInstanceOf[js.Any], current_user_public = current_user_public.asInstanceOf[js.Any], security_advisories = security_advisories.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityGetFeedsResponseLinks]
  }
}

