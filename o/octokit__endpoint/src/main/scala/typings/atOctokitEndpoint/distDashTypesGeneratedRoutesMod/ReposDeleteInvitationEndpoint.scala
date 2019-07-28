package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteInvitationEndpoint extends js.Object {
  var invitation_id: Double
  var owner: String
  var repo: String
}

object ReposDeleteInvitationEndpoint {
  @scala.inline
  def apply(invitation_id: Double, owner: String, repo: String): ReposDeleteInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposDeleteInvitationEndpoint]
  }
}

