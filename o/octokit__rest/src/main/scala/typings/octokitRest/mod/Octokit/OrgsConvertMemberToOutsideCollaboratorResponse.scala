package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsConvertMemberToOutsideCollaboratorResponse extends js.Object {
  var documentation_url: String
  var message: String
}

object OrgsConvertMemberToOutsideCollaboratorResponse {
  @scala.inline
  def apply(documentation_url: String, message: String): OrgsConvertMemberToOutsideCollaboratorResponse = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OrgsConvertMemberToOutsideCollaboratorResponse]
  }
}

