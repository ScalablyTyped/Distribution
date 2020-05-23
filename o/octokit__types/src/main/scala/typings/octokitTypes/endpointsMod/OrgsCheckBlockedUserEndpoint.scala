package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCheckBlockedUserEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var username: String
}

object OrgsCheckBlockedUserEndpoint {
  @scala.inline
  def apply(org_ : String, username: String): OrgsCheckBlockedUserEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsCheckBlockedUserEndpoint]
  }
}

