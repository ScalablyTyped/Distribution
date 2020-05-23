package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Organization extends js.Object {
  var organization: Avatarurl
  var organization_url: String
  var role: String
  var state: String
  var url: String
  var user: Eventsurl
}

object Organization {
  @scala.inline
  def apply(
    organization: Avatarurl,
    organization_url: String,
    role: String,
    state: String,
    url: String,
    user: Eventsurl
  ): Organization = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], organization_url = organization_url.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Organization]
  }
}

