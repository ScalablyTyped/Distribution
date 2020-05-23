package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsListBlockedUsersEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
}

object OrgsListBlockedUsersEndpoint {
  @scala.inline
  def apply(org_ : String): OrgsListBlockedUsersEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListBlockedUsersEndpoint]
  }
}

