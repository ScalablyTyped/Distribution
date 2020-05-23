package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckPublicMembershipEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var username: String
}

object OrgsCheckPublicMembershipEndpoint {
  @scala.inline
  def apply(org_ : String, username: String): OrgsCheckPublicMembershipEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCheckPublicMembershipEndpoint]
  }
}

