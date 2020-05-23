package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsConvertMemberToOutsideCollaboratorEndpoint extends js.Object {
  @JSName("org")
  var org_ : String
  var username: String
}

object OrgsConvertMemberToOutsideCollaboratorEndpoint {
  @scala.inline
  def apply(org_ : String, username: String): OrgsConvertMemberToOutsideCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsConvertMemberToOutsideCollaboratorEndpoint]
  }
}

