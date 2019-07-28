package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsRemoveOutsideCollaboratorParams extends js.Object {
  var org: String
  var username: String
}

object OrgsRemoveOutsideCollaboratorParams {
  @scala.inline
  def apply(org: String, username: String): OrgsRemoveOutsideCollaboratorParams = {
    val __obj = js.Dynamic.literal(org = org, username = username)
  
    __obj.asInstanceOf[OrgsRemoveOutsideCollaboratorParams]
  }
}

