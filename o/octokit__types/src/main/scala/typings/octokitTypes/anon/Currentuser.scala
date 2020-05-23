package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currentuser extends js.Object {
  var current_user: Href
  var current_user_actor: Href
  var current_user_organization: Href
  var current_user_organizations: js.Array[Href]
  var current_user_public: Href
  var security_advisories: Href
  var timeline: Href
  var user: Href
}

object Currentuser {
  @scala.inline
  def apply(
    current_user: Href,
    current_user_actor: Href,
    current_user_organization: Href,
    current_user_organizations: js.Array[Href],
    current_user_public: Href,
    security_advisories: Href,
    timeline: Href,
    user: Href
  ): Currentuser = {
    val __obj = js.Dynamic.literal(current_user = current_user.asInstanceOf[js.Any], current_user_actor = current_user_actor.asInstanceOf[js.Any], current_user_organization = current_user_organization.asInstanceOf[js.Any], current_user_organizations = current_user_organizations.asInstanceOf[js.Any], current_user_public = current_user_public.asInstanceOf[js.Any], security_advisories = security_advisories.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentuser]
  }
}

