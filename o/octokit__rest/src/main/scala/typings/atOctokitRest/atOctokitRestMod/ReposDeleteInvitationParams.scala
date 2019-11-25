package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteInvitationParams extends js.Object {
  var invitation_id: Double
  var owner: String
  var repo: String
}

object ReposDeleteInvitationParams {
  @scala.inline
  def apply(invitation_id: Double, owner: String, repo: String): ReposDeleteInvitationParams = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposDeleteInvitationParams]
  }
}

