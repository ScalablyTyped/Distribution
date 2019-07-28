package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsConvertMemberToOutsideCollaboratorParams extends js.Object {
  var org: String
  var username: String
}

object OrgsConvertMemberToOutsideCollaboratorParams {
  @scala.inline
  def apply(org: String, username: String): OrgsConvertMemberToOutsideCollaboratorParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsConvertMemberToOutsideCollaboratorParams]
  }
}

